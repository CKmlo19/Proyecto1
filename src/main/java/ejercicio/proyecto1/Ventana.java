/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio.proyecto1;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author luisc
 */
public class Ventana extends javax.swing.JFrame {
    ArrayList<ThreadPersonaje> zombies;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        zombies = new ArrayList<ThreadPersonaje>();
        initComponents();
        crearTablero(); // funcion que crea el tablero
        Component c1 = getComponenteTablero(24, 24);
        addComponenteTablero(c1);
        //generarZombies(2);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        pnlPanelJuego = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        pnlPanelJuego.setBackground(new java.awt.Color(255, 255, 255));
        pnlPanelJuego.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPanelJuego.setLayout(new java.awt.GridLayout());

        btnInicio.setText("Iniciar Juego");
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnInicio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(pnlPanelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnInicio)
                .addGap(42, 42, 42)
                .addComponent(pnlPanelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
         for (int i = 0; i < zombies.size(); i++) {
            ThreadPersonaje get = zombies.get(i);
            get.start();
            
        }
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        // TODO add your handling code here:
        for (int i = 0; i < zombies.size(); i++) {
            ThreadPersonaje get = zombies.get(i);
            get.start();
            
        }
    }//GEN-LAST:event_btnInicioMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    
    private void crearTablero()
    {
        pnlPanelJuego.setLayout(new java.awt.GridLayout(25,25)); // crea las cuadriculas
        for (int i = 0; i < 625; i++) { // 625 ya que son 25x25 paneles, en un grid layout se acomoda automaticamente
            JPanel panel = new JPanel();
            panel.setBackground(Color.LIGHT_GRAY);
            panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panel.setLayout(new java.awt.BorderLayout(1,1));
            pnlPanelJuego.add(panel);
        }
    }
    // esta funcion agrega un componente dentro del JPanel de la posicion dada
    private Component getComponenteTablero(int filaDeseada, int columnaDeseada){
        // Obtiene la posicion de la matriz, *25 ya que son 25 cuadriculas,  inicio es (0,0)
        int posicionPanel = filaDeseada * 25 + columnaDeseada;  
        Component componente = pnlPanelJuego.getComponent(posicionPanel); // inidica cual componente es
        return componente;
        
    }
    // Esta funcion agrega un componente al tablero
    private void addComponenteTablero(Component componente){
        JPanel panel2 = (JPanel) componente; //Al componente, que es un JPanel se le debe hacer un casting
        JLabel label = new JLabel("100%");
        label.setBackground(Color.red);
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setOpaque(true);
        panel2.add(label);
    }
    

    
    public void moverPersonaje(JLabel label){
        int x = (new Random()).nextInt(25);
        int y = (new Random()).nextInt(25);
       // int posicion = getPosicionTablero(x, y);
    }
     public void generarZombies(int size){
        
        for (int i = 0; i < size; i++) {
            //crea el label
            JLabel label =  new JLabel("100%");
            label.setBackground(Color.red);
            label.setForeground(new java.awt.Color(255, 255, 255));
            label.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
            label.setForeground(new java.awt.Color(255, 255, 255));
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            label.setOpaque(true);
            
            // crear el zombie aleatoriamente, del tipo que corresponda
            Zombie zombie = new Zombie("Zombie", 100, 2, 3, 1, 0, "de contacto", 100);
            zombie.setLabel(label);
            
            // Crear el thread
            ThreadPersonaje tp =  new ThreadPersonaje(zombie, this);
            zombies.add(tp);
            
            pnlPanelJuego.add(label);
            //setAparicion(label);
            //label.setSize(30, 20);
            
            //label.setVisible(false);
        }
        
    }
     
     public void setAparicion(JLabel label){
        int colOrRow = (new Random()).nextInt(2);//0: col  1: filas
            int dir = (new Random()).nextInt(2);//0: primera  1: segunda
            if (colOrRow == 0){
                if (dir == 0)
                    label.setLocation((new Random()).nextInt(600), 0);
                else
                    label.setLocation((new Random()).nextInt(600), 580);
            }else{
                if (dir == 0)
                    label.setLocation(0, (new Random()).nextInt(600));
                else
                    label.setLocation(580, (new Random()).nextInt(600));
            }

            //label.setVisible(true);
    }

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel pnlPanelJuego;
    // End of variables declaration//GEN-END:variables
}
