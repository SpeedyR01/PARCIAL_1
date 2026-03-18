package observer;

public class TechnicalSupervisor implements Observer{
    private String name;
    
    public TechnicalSupervisor(String name){
        this.name = name;
    }
    
    @Override
    public void update(String event){
        System.out.println(name + "(Supervisor Tecnico) recibe alerta: " + event);
    }
}
