package Presentacion;

import Logica.Matriz;
import Logica.Validar;
import javax.swing.JOptionPane;

public class Tablero extends javax.swing.JFrame {
    int i,j,var;
             Matriz estado = new Matriz();
         Validar insertar = new Validar();
    String numero = "";
 
        public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }
    
   
    public Tablero() {
        
        initComponents();
        this.setTitle("Sudoku");
        this.setLocationRelativeTo(null);
    
}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btn47 = new javax.swing.JButton();
        btn48 = new javax.swing.JButton();
        btn49 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btn51 = new javax.swing.JButton();
        btn52 = new javax.swing.JButton();
        btn53 = new javax.swing.JButton();
        btn54 = new javax.swing.JButton();
        btn55 = new javax.swing.JButton();
        btn56 = new javax.swing.JButton();
        btn57 = new javax.swing.JButton();
        btn58 = new javax.swing.JButton();
        btn59 = new javax.swing.JButton();
        btn60 = new javax.swing.JButton();
        btn61 = new javax.swing.JButton();
        btn62 = new javax.swing.JButton();
        btn63 = new javax.swing.JButton();
        btn64 = new javax.swing.JButton();
        btn65 = new javax.swing.JButton();
        btn66 = new javax.swing.JButton();
        btn67 = new javax.swing.JButton();
        btn68 = new javax.swing.JButton();
        btn69 = new javax.swing.JButton();
        btn70 = new javax.swing.JButton();
        btn71 = new javax.swing.JButton();
        btn72 = new javax.swing.JButton();
        btn73 = new javax.swing.JButton();
        btn74 = new javax.swing.JButton();
        btn75 = new javax.swing.JButton();
        btn76 = new javax.swing.JButton();
        btn77 = new javax.swing.JButton();
        btn78 = new javax.swing.JButton();
        btn79 = new javax.swing.JButton();
        btn80 = new javax.swing.JButton();
        btn81 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton63.setText("jButton63");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new java.awt.GridLayout(9, 9));

        btn1.setName(""); // NOI18N
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        jPanel1.add(btn1);

        btn2.setName(""); // NOI18N
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        jPanel1.add(btn2);

        btn3.setName(""); // NOI18N
        jPanel1.add(btn3);

        btn4.setName(""); // NOI18N
        jPanel1.add(btn4);

        btn5.setName(""); // NOI18N
        jPanel1.add(btn5);

        btn6.setName(""); // NOI18N
        jPanel1.add(btn6);

        btn7.setName(""); // NOI18N
        jPanel1.add(btn7);

        btn8.setName(""); // NOI18N
        jPanel1.add(btn8);

        btn9.setName(""); // NOI18N
        jPanel1.add(btn9);

        btn10.setName(""); // NOI18N
        jPanel1.add(btn10);

        btn11.setName(""); // NOI18N
        jPanel1.add(btn11);

        btn12.setName(""); // NOI18N
        jPanel1.add(btn12);

        btn13.setName(""); // NOI18N
        jPanel1.add(btn13);

        btn14.setName(""); // NOI18N
        jPanel1.add(btn14);

        btn15.setName(""); // NOI18N
        jPanel1.add(btn15);

        btn16.setName(""); // NOI18N
        jPanel1.add(btn16);

        btn17.setName(""); // NOI18N
        jPanel1.add(btn17);

        btn18.setName(""); // NOI18N
        jPanel1.add(btn18);

        btn19.setName(""); // NOI18N
        jPanel1.add(btn19);

        btn20.setName(""); // NOI18N
        jPanel1.add(btn20);

        btn21.setName(""); // NOI18N
        jPanel1.add(btn21);

        btn22.setName(""); // NOI18N
        jPanel1.add(btn22);

        btn23.setName(""); // NOI18N
        jPanel1.add(btn23);

        btn24.setName(""); // NOI18N
        jPanel1.add(btn24);

        btn25.setName(""); // NOI18N
        jPanel1.add(btn25);

        btn26.setName(""); // NOI18N
        jPanel1.add(btn26);

        btn27.setName(""); // NOI18N
        jPanel1.add(btn27);

        btn28.setName(""); // NOI18N
        jPanel1.add(btn28);

        btn29.setName(""); // NOI18N
        jPanel1.add(btn29);

        btn30.setName(""); // NOI18N
        jPanel1.add(btn30);

        btn31.setName(""); // NOI18N
        jPanel1.add(btn31);

        btn32.setName(""); // NOI18N
        jPanel1.add(btn32);

        btn33.setName(""); // NOI18N
        jPanel1.add(btn33);

        btn34.setName(""); // NOI18N
        jPanel1.add(btn34);

        btn35.setName(""); // NOI18N
        jPanel1.add(btn35);

        btn36.setName(""); // NOI18N
        jPanel1.add(btn36);

        btn37.setName(""); // NOI18N
        jPanel1.add(btn37);

        btn38.setName(""); // NOI18N
        jPanel1.add(btn38);

        btn39.setName(""); // NOI18N
        jPanel1.add(btn39);

        btn40.setName(""); // NOI18N
        jPanel1.add(btn40);

        btn41.setName(""); // NOI18N
        jPanel1.add(btn41);

        btn42.setName(""); // NOI18N
        jPanel1.add(btn42);

        btn43.setName(""); // NOI18N
        jPanel1.add(btn43);

        btn44.setName(""); // NOI18N
        jPanel1.add(btn44);

        btn45.setName(""); // NOI18N
        jPanel1.add(btn45);

        btn46.setName(""); // NOI18N
        jPanel1.add(btn46);

        btn47.setName(""); // NOI18N
        jPanel1.add(btn47);

        btn48.setName(""); // NOI18N
        jPanel1.add(btn48);

        btn49.setName(""); // NOI18N
        jPanel1.add(btn49);

        btn50.setName(""); // NOI18N
        jPanel1.add(btn50);

        btn51.setName(""); // NOI18N
        jPanel1.add(btn51);

        btn52.setName(""); // NOI18N
        jPanel1.add(btn52);

        btn53.setName(""); // NOI18N
        jPanel1.add(btn53);

        btn54.setName(""); // NOI18N
        jPanel1.add(btn54);

        btn55.setName(""); // NOI18N
        jPanel1.add(btn55);

        btn56.setName(""); // NOI18N
        jPanel1.add(btn56);

        btn57.setName(""); // NOI18N
        jPanel1.add(btn57);

        btn58.setName(""); // NOI18N
        jPanel1.add(btn58);

        btn59.setName(""); // NOI18N
        jPanel1.add(btn59);

        btn60.setName(""); // NOI18N
        jPanel1.add(btn60);

        btn61.setName(""); // NOI18N
        jPanel1.add(btn61);

        btn62.setName(""); // NOI18N
        jPanel1.add(btn62);

        btn63.setName(""); // NOI18N
        jPanel1.add(btn63);

        btn64.setName(""); // NOI18N
        jPanel1.add(btn64);

        btn65.setName(""); // NOI18N
        jPanel1.add(btn65);

        btn66.setName(""); // NOI18N
        jPanel1.add(btn66);

        btn67.setName(""); // NOI18N
        jPanel1.add(btn67);

        btn68.setName(""); // NOI18N
        jPanel1.add(btn68);

        btn69.setName(""); // NOI18N
        jPanel1.add(btn69);

        btn70.setName(""); // NOI18N
        jPanel1.add(btn70);

        btn71.setName(""); // NOI18N
        jPanel1.add(btn71);

        btn72.setName(""); // NOI18N
        jPanel1.add(btn72);

        btn73.setName(""); // NOI18N
        jPanel1.add(btn73);

        btn74.setName(""); // NOI18N
        jPanel1.add(btn74);

        btn75.setName(""); // NOI18N
        jPanel1.add(btn75);

        btn76.setName(""); // NOI18N
        jPanel1.add(btn76);

        btn77.setName(""); // NOI18N
        jPanel1.add(btn77);

        btn78.setName(""); // NOI18N
        jPanel1.add(btn78);

        btn79.setName(""); // NOI18N
        jPanel1.add(btn79);

        btn80.setName(""); // NOI18N
        jPanel1.add(btn80);

        btn81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn81ActionPerformed(evt);
            }
        });
        jPanel1.add(btn81);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked

        insertar.setA(1);
        Metodopane();
        pos(insertar.getA());
        btn1.setLabel(numero);
         
    }//GEN-LAST:event_btn1MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        insertar.setA(2);
        Metodopane();
        pos(insertar.getA());
        btn2.setLabel(numero);
    }//GEN-LAST:event_btn2MouseClicked

    private void btn81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn81ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn81ActionPerformed

    public static void main(String args[]) {
        
    }

    public int Metodopane (){
        
       String cadena = JOptionPane.showInputDialog("Ingrese un digito comprendido entre 1-9");
       numero=cadena;
        if (cadena.equals("1")  || cadena.equals("2") || cadena.equals("3") || cadena.equals("4") || cadena.equals("5") || cadena.equals("6") || cadena.equals("7") || cadena.equals("8") || cadena.equals("9")){
            insertar.setNum(Integer.parseInt(cadena));
        }
        else{
            JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto, intente de nuevo", "Error", JOptionPane.WARNING_MESSAGE);
            return Metodopane();
        }
        return 0;
    }
    
     public void pos (int a){
        
        if (a<=9){
            i=1;
            j=a;
            insertar.restringir(i, j);
        }
        
        if (a<=18 && a>9){
            var=18;
            i=2;
            j=var-a;
            j=9-j;
            insertar.restringir(i, j);
        }

        if (a<=27 && a>18){
            var=27;
            i=3;
            j=var-a;
            j=9-j;
            insertar.restringir(i, j);
        }   
        
        if (a<=36 && a>27){
            var=36;
            i=4;
            j=var-a;
            j=9-j;
            insertar.restringir(i, j);
        } 
       
         if (a<=45 && a>36){
            var=45;
            i=5;
            j=var-a;
            j=9-j;
            insertar.restringir(i, j);
        }        
        
        if (a<=54 && a>45){
            var=54;
            i=6;
            j=var-a;
            j=9-j;
            insertar.restringir(i, j);
        }          
 
        if (a<=63 && a>54){
            var=63;
            i=7;
            j=var-a;
            j=9-j;
            insertar.restringir(i, j);
        } 

        if (a<=72 && a>63){
            var=72;
            i=8;
            j=var-a;
            j=9-j;
            insertar.restringir(i, j);
        } 
 
        if (a<=81 && a>72){
            var=81;
            i=9;
            j=var-a;
            j=9-j;
            insertar.restringir(i, j);
        } 
        
    }    




     
     
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn47;
    private javax.swing.JButton btn48;
    private javax.swing.JButton btn49;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn51;
    private javax.swing.JButton btn52;
    private javax.swing.JButton btn53;
    private javax.swing.JButton btn54;
    private javax.swing.JButton btn55;
    private javax.swing.JButton btn56;
    private javax.swing.JButton btn57;
    private javax.swing.JButton btn58;
    private javax.swing.JButton btn59;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn60;
    private javax.swing.JButton btn61;
    private javax.swing.JButton btn62;
    private javax.swing.JButton btn63;
    private javax.swing.JButton btn64;
    private javax.swing.JButton btn65;
    private javax.swing.JButton btn66;
    private javax.swing.JButton btn67;
    private javax.swing.JButton btn68;
    private javax.swing.JButton btn69;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn70;
    private javax.swing.JButton btn71;
    private javax.swing.JButton btn72;
    private javax.swing.JButton btn73;
    private javax.swing.JButton btn74;
    private javax.swing.JButton btn75;
    private javax.swing.JButton btn76;
    private javax.swing.JButton btn77;
    private javax.swing.JButton btn78;
    private javax.swing.JButton btn79;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn80;
    private javax.swing.JButton btn81;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton63;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
