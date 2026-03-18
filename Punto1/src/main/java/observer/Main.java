package observer;

public class Main {

    public static void main(String[] args) {
        TransportSystem system = new TransportSystem();
        
        Observer Carolina = new Coordinator("Carolina Niño");
        Observer Samuel = new Comunication("Samuel Perez");
        Observer Roberto = new TechnicalSupervisor("Roberto Mena");
        
        system.addObserver(Carolina);
        system.addObserver(Samuel);
        system.addObserver(Roberto);
                
        system.newVehicleArrived(" Bus electrico");
        system.changeWayVehicle(" Se devia por la 30, porque la caracas esta bloqueada.");
        system.congestReports(" Estacion central");
    }
}
