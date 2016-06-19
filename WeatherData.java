package java_observable;
import java.util.*;

public class WeatherData implements Subject{
    
    private float temprature, humidity;
    private ArrayList<Observer> observers;

    WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void subscribe(Observer o) {
        observers.add(o);
    }

    public void unsubscribe(Observer o) {
        // for(int i=0 , i<observers.length ; i++) {
        //     if(observers[i] == o)
                observers.remove(o);
        // }
    }

    public void notifyObservers() {
        for(Observer observer:observers) {
            observer.update(temprature,humidity);
        }
    }

    public void setValues(float temprature, float humidity) {
        this.temprature = temprature;
        this.humidity = humidity;
        
        notifyObservers();
    }
}