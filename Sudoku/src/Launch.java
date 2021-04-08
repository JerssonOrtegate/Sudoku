
import presentacion.Modelo;

public class Launch {
    
    private Modelo miApp;
    
    public Launch() {
        miApp = new Modelo();
        miApp.iniciar();
    }
    
    public static void main(String[] args){
        new Launch();
    }
}
