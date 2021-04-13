package Logica;

import javax.swing.JOptionPane;
import Presentacion.Tablero;
public class Validar {
    
    Tablero posicion = new Tablero();  
    Matriz estado = new Matriz();
    private int a,i,j;
    private int num;


    public int getA() {
        return a;
    }

    public int getNum() {
        return num;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }
    
     
   
 public void restringir (int p , int q) {
     p = posicion.getI();
     q = posicion.getJ();  
     
            if (estado.getFabrica()[p][q] != 0){
                JOptionPane.showMessageDialog(null, "Este recuadro no puede ser modificado", "Valor de fabrica", JOptionPane.WARNING_MESSAGE); 
             } 
            else {
               estado.getEspacio()[i][j]= num;
            }
 }

   
    
}
