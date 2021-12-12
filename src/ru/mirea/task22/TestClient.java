package ru.mirea.task22;

public class TestClient {
    public static void main(String args[]) {
        Chair firstChair = new Victorian();
        Chair secondChair = new Magick();
        Client new_client = new Client();
        new_client.Sit(firstChair);
        new_client.Sit(secondChair);
    }
}
