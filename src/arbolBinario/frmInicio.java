/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolBinario;


import arbolBinario.SimuladorArbolBinario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Toloza XD
 */
public class frmInicio extends javax.swing.JFrame {

    private SimuladorArbolBinario simulador = new SimuladorArbolBinario();

    /**
     * Creates new form Vista
     */
    public frmInicio() {
        initComponents();
        this.inicializar(false);


    }

    private void inicializar(boolean enable) {
        this.PostOrden.setEnabled(enable);
        this.PreOrden.setEnabled(enable);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        impresion = new javax.swing.JTextArea();
        botonInsertar = new javax.swing.JButton();
        PreOrden = new javax.swing.JButton();
        PostOrden = new javax.swing.JButton();
        txtdato = new javax.swing.JTextField();
        btnEspejo = new javax.swing.JButton();
        btnHojas = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setOpaque(false);

        impresion.setEditable(false);
        impresion.setColumns(20);
        impresion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        impresion.setRows(5);
        impresion.setBorder(null);
        impresion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        impresion.setOpaque(false);
        jScrollPane1.setViewportView(impresion);
        impresion.getAccessibleContext().setAccessibleName("Resultados del Recorrido");
        impresion.getAccessibleContext().setAccessibleDescription("");

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 820, 71));

        botonInsertar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });
        jPanel2.add(botonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 91, 30));

        PreOrden.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        PreOrden.setText("PreOrden");
        PreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreOrdenActionPerformed(evt);
            }
        });
        jPanel2.add(PreOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, 30));

        PostOrden.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        PostOrden.setText("PostOrden");
        PostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostOrdenActionPerformed(evt);
            }
        });
        jPanel2.add(PostOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 110, 30));
        jPanel2.add(txtdato, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 169, 30));

        btnEspejo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnEspejo.setText("Espejo");
        btnEspejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspejoActionPerformed(evt);
            }
        });
        jPanel2.add(btnEspejo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 80, 30));

        btnHojas.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnHojas.setText("Hojas");
        btnHojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHojasActionPerformed(evt);
            }
        });
        jPanel2.add(btnHojas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 80, 30));

        jDesktopPane2.setOpaque(false);

        jInternalFrame2.setUI(null);
        jInternalFrame2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setEnabled(false);
        jInternalFrame2.setFocusCycleRoot(false);
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );

        jDesktopPane2.add(jInternalFrame2);
        jInternalFrame2.setBounds(0, 0, 810, 320);

        jPanel2.add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 26, 810, 320));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        try {
            int dato = Integer.parseInt(txtdato.getText());
            if (this.simulador.insertar(dato)) {
                //JOptionPane.showMessageDialog(null, "El dato fue insertado correctamente", " ...", 1);
                this.inicializar(true);
                
                complementos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el dato", "Intenta de nuevo...", 0);

        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void PreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreOrdenActionPerformed
        // TODO add your handling code here:
        String recorrido = null;
        recorrido = this.simulador.preOrden();
        
        this.impresion.setText("");
        this.impresion.setText(recorrido);
    }//GEN-LAST:event_PreOrdenActionPerformed

    private void PostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostOrdenActionPerformed
        // TODO add your handling code here:
        String recorrido = null;
        recorrido = this.simulador.postOrden();
        
        this.impresion.setText("");
        this.impresion.setText(recorrido);
    }//GEN-LAST:event_PostOrdenActionPerformed

    private void btnEspejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspejoActionPerformed

            ArbolBinario miArbol = new ArbolBinario();
            this.simulador.insertarEspejo(miArbol);
                this.inicializar(true);
                
                complementos();
         
    }//GEN-LAST:event_btnEspejoActionPerformed

    private void btnHojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHojasActionPerformed
        this.impresion.setText("Cantidad de hojas es " + simulador.miArbol.Hoja());
    }//GEN-LAST:event_btnHojasActionPerformed

    public void complementos(){
        this.repintarArbol();
    }
   
    private void repintarArbol() {

        this.jDesktopPane2.removeAll();
        
        Rectangle tamaño  = this.jInternalFrame2.getBounds();
        this.jInternalFrame2 = null;
        this.jInternalFrame2 = new JInternalFrame("", true);
        
        this.jDesktopPane2.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame2.setVisible(true);
        this.jInternalFrame2.setBounds(tamaño);
        this.jInternalFrame2.setEnabled(false);
        this.jInternalFrame2.add(this.simulador.getDibujo(), BorderLayout.CENTER);
    }

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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PostOrden;
    private javax.swing.JButton PreOrden;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton btnEspejo;
    private javax.swing.JButton btnHojas;
    private javax.swing.JTextArea impresion;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtdato;
    // End of variables declaration//GEN-END:variables
}
