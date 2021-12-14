package ru.mirea.task30;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Testing {
    @Test
    public void validate() {
        ArrayList<String> testData = new ArrayList<>(Arrays.asList("255.255.0.110", "255.10.30.50", "2554.255.100.110"));
        ArrayList<Boolean> expected = new ArrayList<>(Arrays.asList(true, true, false));
        ArrayList<Boolean> actual = new ArrayList<>();
        Address item = new Address();
        for (String value : testData) {
            actual.add(item.check(value));
        }
        org.junit.Assert.assertEquals(expected, actual);
    }
}
