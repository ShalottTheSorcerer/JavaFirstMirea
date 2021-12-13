package ru.mirea.task28;

public class Car {
    public String brand;
    private int year;
    private String color;
    private AutoMusicCollection collection = new AutoMusicCollection(28, "country");
    public Car (int year, String color) {
        this.year = year;
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void Out() {
        System.out.println("This is the "+color+" "+brand+" which was made in "+year);
        System.out.println("The music collection contains "+collection.recordsNumber+" records in the "+collection.genre+" genre\n");
    }
    private class AutoMusicCollection {
        private int recordsNumber;
        private String genre;
        private AutoMusicCollection(int recordsNumber, String genre) {
            this.recordsNumber = recordsNumber;
            this.genre = genre;
        }
    }
    public static class Jeep extends Car {
        public Jeep(int year, String color) {
            super(year, color);
            setBrand("Jeep");
        }
    }
    public static class Toyota extends Car {
        public Toyota(int year, String color) {
            super(year, color);
            setBrand("Toyota");
        }
    }
    private class ToyCar extends Car {

        public ToyCar(String brand, int year, String color) {
            super(year, color);
            setBrand(brand);
        }


        @Override
        public void Out() {
            System.out.println("This is the toy version of "+color+" "+brand+" which was made in "+year);
            System.out.println("This is a toy, it doesn't have any music!\n");
        }

    }
    private interface InformationContainer {
        int getYear();
        String getBrand();
        String getColor();
    }
    public InformationContainer getInformationContainer() {
        class carInformationContainer implements InformationContainer {
            final int year = Car.this.year;
            final String brand = Car.this.brand;
            final String color = Car.this.color;
            public int getYear() {
                return this.year;
            }
            @Override
            public String getColor() {
                return this.color;
            }
            @Override
            public String getBrand() {
                return this.brand;
            }
        }
        return new carInformationContainer();
    }
    public static void main(String[] args) {
        Car.Toyota firstCar = new Car.Toyota(1994, "black");
        Car.Jeep secondCar = new Car.Jeep(2005, "red");
        Car thirdCar = new Car(1889, "black").new ToyCar("Jaguar",1889, "black");
        firstCar.Out();
        secondCar.Out();
        thirdCar.Out();
        InformationContainer info = thirdCar.getInformationContainer();
        System.out.println("Information about the car:");
        System.out.println("Year: "+info.getYear());
        System.out.println("Color: "+info.getColor());
        System.out.println("Brand: "+info.getBrand());
    }
}
