package Logica;

public class Matriz {
    
    public int [][] Espacio = new int [10][10];
    private int [][] Fabrica = new int [10][10];
   
    
    public void llenar (){
        Tablero1();
        for (int p=1; p<10; p++) {
        for (int q=1; q<10; q++) {
           Espacio[p][q] = Fabrica[p][q];
           System.out.print(Fabrica[p][q]);  
}
            System.out.println("");
}       
    }
      
    public int[][] getFabrica() {
        return Fabrica;
    }

    public void setFabrica(int[][] Fabrica) {
        this.Fabrica = Fabrica;
    }    
    public int[][] getEspacio() {
        return Espacio;
    }

    public void setEspacio(int[][] Espacio) {
        this.Espacio = Espacio;
    }   
    
    public void Tablero1 (){
        
     Fabrica [1][1] = 6 ;
     Fabrica [1][5] = 9 ;
     Fabrica [1][8] = 5 ;
     Fabrica [2][1] = 8 ;
     Fabrica [2][2] = 3 ;
     Fabrica [2][3] = 4 ;
     Fabrica [2][6] = 5 ;
     Fabrica [3][1] = 5 ;
     Fabrica [3][2] = 9 ;
     Fabrica [3][3] = 1 ;
     Fabrica [3][4] = 2 ;
     Fabrica [3][5] = 8 ;
     Fabrica [3][8] = 6 ;
     Fabrica [4][4] = 4 ;
     Fabrica [4][5] = 3 ;
     Fabrica [4][9] = 2 ;
     Fabrica [5][3] = 9 ;
     Fabrica [5][4] = 7 ;
     Fabrica [5][6] = 1 ;
     Fabrica [5][7] = 5 ;
     Fabrica [5][8] = 4 ;
     Fabrica [5][9] = 8 ;
     Fabrica [6][3] = 8 ;
     Fabrica [6][4] = 5 ;
     Fabrica [6][7] = 6 ;
     Fabrica [6][8] = 7 ;
     Fabrica [7][1] = 1 ;
     Fabrica [7][4] = 9 ;
     Fabrica [7][5] = 7 ;
     Fabrica [7][7] = 4 ;
     Fabrica [7][9] = 5 ;
     Fabrica [8][3] = 3 ;
     Fabrica [8][8] = 1 ;
     Fabrica [8][9] = 6 ;
     Fabrica [9][1] = 6 ;
     Fabrica [9][2] = 4 ;
     Fabrica [9][5] = 5 ;
     Fabrica [9][7] = 2 ;
     Fabrica [9][8] = 8 ;
            
    }
    
    public void Tablero2 (){
        
        
    }
    
    public void Tablero3 (){
        
        
    }
    
}
