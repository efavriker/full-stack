package lesson8.hw7_8;

public class Weather {
    private double temperature;
    private double moist;
    private boolean cloudy;
    private double rain;

    public Weather(double rain, boolean cloudy, double moist, double temperature) {
        this.rain = rain;
        this.cloudy = cloudy;
        this.moist = moist;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return STR."Weather{temperature=\{temperature}, moist=\{moist}, cloudy=\{cloudy}, rain=\{rain}}";
    }
    public void changeChanceOfRain(double rainChance){
        if (rainChance > 100 || rainChance < 0 ) {
            System.out.println("Please change the chance between zero to hundred");
        }
        else {
            this.rain = rainChance;
        }

    }
    public void printTempFahrenheit(double rain){
        double change = rain * 1.8 + 32;
        System.out.println(STR."the rain chance in fahrenheit is: \{change}");
    }
}
