import Presentacion.Inicio;
import Logica.Matriz;
public class Launcher {

    public static void main(String[] args) {
        
        Inicio miApp = new Inicio();
        Matriz llenate = new Matriz();
        llenate.llenar();
        
        miApp.horadejugar();
    }
    
}
