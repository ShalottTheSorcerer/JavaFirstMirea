package ru.mirea.task31;

import ru.mirea.task30.*;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import java.io.*;

public class MDFormat {
    public static String Header(String str, String substring, int level)
    {
        String header = "#".repeat(level) + " " + substring;
        str = str.replace(substring, header);
        return str;
    }
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);
        System.setOut(printStream);
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        junit.run(Testing.class);
        System.out.flush();
        System.setOut(System.out);
        String testResult = stream.toString();
        testResult = "# Test result" + testResult;
        testResult = testResult.replace(".E", "");
        testResult = Header(testResult, "FAILURES!", 2);
        testResult = Header(testResult, "Time:", 2);
        testResult = testResult.trim();
        PrintWriter writer = new PrintWriter("test_result.md");
        writer.println(testResult);
        writer.close();
    }
}
