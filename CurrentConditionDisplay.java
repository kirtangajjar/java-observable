package java_observable;

public class CurrentConditionDisplay implements Observer {
    private float temprature,humidity;

    CurrentConditionDisplay(Subject s) {
        s.subscribe(this);
    }

    public void update(float temprature, float humidity) {
        this.temprature = temprature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions - Temprature: " + temprature + " Humidity: " + humidity);
    }
}