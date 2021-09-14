//import java.util.Date;
//
//public class WeatherReading {
//
//    double latitude;
//    double longitude;
//    Date recordedAt;
//    private double kelvinToCelsius;
//    double tempInCelsius;
//
//
//
//    public static double kelvinToCelsius(double kelvin, double celsius) {
//        celsius = -273.15;
//        return kelvin + celsius;
//    }
//
//    public int getTempInCelsius()
//
//    public static void main(String[] args) {
//
//    }
//
////    ================================= WARM UP
////
////    Create a class called, WeatherReading, with the following members:
////
////    private instance variables:
////
////    double latitude
////    double longitude
////    Date (from java.util.Date) recordedAt
////    double tempInCelsius
////
////    public static method:
////
////    kelvinToCelsius - takes in a double and returns a double, converting temp from Kelvin to Celsius
////
////    public instance methods:
////
////    getters and setters
////
////    for the setter for tempInCelsius, pass the input into the kelvinToCelsius method and assign the output to this.tempInCelsius
////
////    add a constructor that sets all fields
////
////    when setting the tempInCelsius pass the input into the kelvinToCelsius method and assign the output to this.tempInCelsius
////
////    Add the following main method to test it out:
//
////    public static void main(String[] args) {
////
////        double latitude = -98.4936;
////        double longitude = 29.4241;
////        Date recordedAt = new Date();
////        double tempInKelvin = 300;
////        WeatherReading wr = new WeatherReading(latitude, longitude, recordedAt, tempInKelvin);
////        System.out.println(wr.getTempInCelsius());
//
//    }
//}
