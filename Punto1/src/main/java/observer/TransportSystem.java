package observer;

import java.util.*;

public class TransportSystem implements Subject{
    private List<Observer> observers= new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(String event) {
        for (Observer o : observers){
            o.update(event);
        }
    }
    
    public void newVehicleArrived(String vehicle){
        notifyObserver("Nuevo vehiculo añadido: " + vehicle);
    }
    
    public void changeWayVehicle(String route){
        notifyObserver("Cambio de ruta: " + route);
    }
    
    public void congestReports(String report){
        notifyObserver("Se reportan congestiones o interrupciones en el servicio" + report);
    }
}
