package java_observable;

public class WeatherStation{
    WeatherStation() {
        
    }
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        CurrentConditionDisplay ccd = new CurrentConditionDisplay(wd);
        StatisticsDisplay sd = new StatisticsDisplay(wd);

        wd.setValues(2.0f,3.0f);
    }
}