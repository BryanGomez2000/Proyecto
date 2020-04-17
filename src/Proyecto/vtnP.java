package Proyecto;

import javax.swing.JOptionPane;

public class vtnP extends javax.swing.JFrame
{
    public static Multilistas obj = new Multilistas();
     Nodo r =null;
      
    public vtnP()
    {
        initComponents();
    }

    //cerrar todo 
    //pegar metodos en teams
    //subir proyexto modificado en archivos, examen 1
    //paterno materno nombres.rarp
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Agencia = new javax.swing.JMenu();
        RegAgencia = new javax.swing.JMenuItem();
        BajAgencia = new javax.swing.JMenuItem();
        Servicios = new javax.swing.JMenu();
        RegServicios = new javax.swing.JMenuItem();
        BajServicios = new javax.swing.JMenuItem();
        Pasar = new javax.swing.JMenuItem();
        Autos = new javax.swing.JMenu();
        RegAutos = new javax.swing.JMenuItem();
        BajAutos = new javax.swing.JMenuItem();
        BajAutos1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        cerrar1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        cerrar = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Organizacion de Hospital");
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edd/imagenes/cambio-frenos.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        Agencia.setText("Agencia");

        RegAgencia.setText("Registro");
        RegAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegAgenciaActionPerformed(evt);
            }
        });
        Agencia.add(RegAgencia);

        BajAgencia.setText("Baja");
        BajAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajAgenciaActionPerformed(evt);
            }
        });
        Agencia.add(BajAgencia);

        jMenuBar1.add(Agencia);

        Servicios.setText("Servicio");

        RegServicios.setText("Registro");
        RegServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegServiciosActionPerformed(evt);
            }
        });
        Servicios.add(RegServicios);

        BajServicios.setText("Baja");
        BajServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajServiciosActionPerformed(evt);
            }
        });
        Servicios.add(BajServicios);

        Pasar.setText("Pasar coches a otra agencia");
        Pasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasarActionPerformed(evt);
            }
        });
        Servicios.add(Pasar);

        jMenuBar1.add(Servicios);

        Autos.setText("Autos");

        RegAutos.setText("Registro");
        RegAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegAutosActionPerformed(evt);
            }
        });
        Autos.add(RegAutos);

        BajAutos.setText("Baja");
        BajAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajAutosActionPerformed(evt);
            }
        });
        Autos.add(BajAutos);

        BajAutos1.setText("Pasar Carro a otra Agencia");
        BajAutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajAutos1ActionPerformed(evt);
            }
        });
        Autos.add(BajAutos1);

        jMenuBar1.add(Autos);

        jMenu7.setText("Desplegar");

        cerrar1.setText("Desplegar");
        cerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar1ActionPerformed(evt);
            }
        });
        jMenu7.add(cerrar1);

        jMenuBar1.add(jMenu7);

        jMenu6.setText("Cerrar");

        cerrar.setText("cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jMenu6.add(cerrar);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegAgenciaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_RegAgenciaActionPerformed
    {//GEN-HEADEREND:event_RegAgenciaActionPerformed
        new VtnCAgencia().setVisible(true);
        dispose();
    }//GEN-LAST:event_RegAgenciaActionPerformed

    private void BajAgenciaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BajAgenciaActionPerformed
    {//GEN-HEADEREND:event_BajAgenciaActionPerformed
 new VtnBAgencia().setVisible(true);
 dispose();
    }//GEN-LAST:event_BajAgenciaActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed

System.exit(0);

    }//GEN-LAST:event_cerrarActionPerformed

    private void cerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar1ActionPerformed
   
r = ManipulaArchivos.carga("Agencia.txt");
      
        new VtnDes().setVisible(true);
        dispose();

    }//GEN-LAST:event_cerrar1ActionPerformed

    private void RegServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegServiciosActionPerformed
       new VtnCServ().setVisible(true);
        dispose();
    }//GEN-LAST:event_RegServiciosActionPerformed

    private void BajServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajServiciosActionPerformed
       new VtnBServ().setVisible(true);
        dispose();
    }//GEN-LAST:event_BajServiciosActionPerformed

    private void RegAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegAutosActionPerformed
new VtnCCarro().setVisible(true);
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_RegAutosActionPerformed

    private void BajAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajAutosActionPerformed
new VtnBCarro().setVisible(true);
dispose();        
    }//GEN-LAST:event_BajAutosActionPerformed

    private void PasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasarActionPerformed
       new VtnPasarTCaAg().setVisible(true);
       dispose();
    }//GEN-LAST:event_PasarActionPerformed

    private void BajAutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajAutos1ActionPerformed
new VtnPCaS().setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_BajAutos1ActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(vtnP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(vtnP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(vtnP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(vtnP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new vtnP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Agencia;
    private javax.swing.JMenu Autos;
    private javax.swing.JMenuItem BajAgencia;
    private javax.swing.JMenuItem BajAutos;
    private javax.swing.JMenuItem BajAutos1;
    private javax.swing.JMenuItem BajServicios;
    private javax.swing.JMenuItem Pasar;
    private javax.swing.JMenuItem RegAgencia;
    private javax.swing.JMenuItem RegAutos;
    private javax.swing.JMenuItem RegServicios;
    private javax.swing.JMenu Servicios;
    private javax.swing.JMenuItem cerrar;
    private javax.swing.JMenuItem cerrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
