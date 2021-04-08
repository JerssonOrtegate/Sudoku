package presentacion;

public class Modelo {
 
    private Vista vistaPrincipal;
    
    public void iniciar() {
        vistaPrincipal = new Vista();
        vistaPrincipal.setSize(300, 300);
        vistaPrincipal.setTitle("Sudoku");
        vistaPrincipal.setLocationRelativeTo(null);
        vistaPrincipal.setResizable(false);
        vistaPrincipal.setVisible(true);        
    }
}
