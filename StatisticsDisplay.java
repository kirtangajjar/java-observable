package java_observable;

public class StatisticsDisplay implements Observer {
    private float temprature,humidity;

    StatisticsDisplay(Subject s) {
        s.subscribe(this);
    }

    public void update(float temprature, float humidity) {
        this.temprature = temprature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Statistics - Temprature: " + temprature + " Humidity: " + humidity);
    }
}