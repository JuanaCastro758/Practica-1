/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import static clases.Simbolo.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author Chiko malo
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    DefaultListModel textos=new DefaultListModel();
    DefaultListModel textos1=new DefaultListModel();
    private String arregloCadenas[]=new String[10];
    /**
     * Creates new form VentanaPrincipal
     */
    int cod;
    String cadena="";
    public VentanaPrincipal() {
        initComponents();
        textos=new DefaultListModel();
        textos1=new DefaultListModel();
        jList1.setModel(textos);
        jList2.setModel(textos1);
    }
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }
    public void eliminarEspacio(String cadena){
        cod=0;
        String newCadena="";
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)!=' '){
                newCadena=newCadena+cadena.charAt(i);
            }
            if(cadena.charAt(i)==' '){   
                arregloCadenas[cod]=newCadena;
                cod++;
                newCadena="";
            }
        }
    }
    public void tokenNumero(String cadena){
        int punto=0;
        int posPunto=0;
        int totalRecorrido=0;
        boolean letra=false;
        for(int i=0; i<cadena.length(); i++){
            String newCadena=""+cadena.charAt(i);
            if(newCadena.equals(UNO.getCaracter())){ totalRecorrido++;}
            else if(newCadena.equals(DOS.getCaracter())){ totalRecorrido++;}
            else if(newCadena.equals(TRES.getCaracter())){ totalRecorrido++;}
            else if(newCadena.equals(CUATRO.getCaracter())){ totalRecorrido++;}
            else if(newCadena.equals(CINCO.getCaracter())){ totalRecorrido++;}
            else if(newCadena.equals(SEIS.getCaracter())){ totalRecorrido++;}
            else if(newCadena.equals(SIETE.getCaracter())){ totalRecorrido++;}
            else if(newCadena.equals(OCHO.getCaracter())){ totalRecorrido++;}
            else if(newCadena.equals(NUEVE.getCaracter())){ totalRecorrido++;}
            else if(newCadena.equals(PUNTO.getCaracter())){ 
                totalRecorrido++; punto++; posPunto=i;
            }
            else {if(i==0){letra=true;}}
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        prueba = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(90, 20, 320, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Texto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 30, 33, 17);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Verificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(180, 60, 110, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Identificador");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 40, 100, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Número Entero");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 80, 87, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Número Decimal");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 120, 96, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Simbolos");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 160, 52, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Error");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(440, 200, 30, 17);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(540, 30, 260, 30);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(540, 70, 260, 30);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(540, 150, 260, 30);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(540, 110, 260, 30);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(540, 190, 260, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Textos Verificados");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 180, 170, 40);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 220, 370, 230);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        prueba.setViewportView(jList2);

        getContentPane().add(prueba);
        prueba.setBounds(490, 240, 280, 140);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/im1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-530, -90, 1920, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cadena=jTextField1.getText();
        textos.addElement(cadena);
        eliminarEspacio(cadena);
        jTextField1.setText(" ");
        for (int i=0;i<arregloCadenas.length;i++){
            textos1.addElement(arregloCadenas[i]);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JScrollPane prueba;
    // End of variables declaration//GEN-END:variables
}
