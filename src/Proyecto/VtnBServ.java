/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author ALYEN
 */
public class VtnBServ extends javax.swing.JFrame
{
Nodo r = ManipulaArchivos.carga("Agencia.txt");
public static Nodo o=new Nodo(null, null);

    /**
     * Creates new form VtnBP
     */
    public VtnBServ()
    {
        
        initComponents();
        
        Listarcombo();
        Servicio.removeAllItems();
        ListaC2();
        
        AutoCompleteDecorator.decorate(Agencia);
    }
private void Listarcombo(){
    
  
    Nodo r1=ManipulaArchivos.carga("Agencia.txt");
Nodo aux=r1;
        while (aux!=null) {
            Agencia.addItem(aux.getEtq());
            aux=aux.getSig();
        }
        
}
private void ListaC2(){
    
    Object n = Agencia.getSelectedItem();
        Nodo aux1=Multilistas.busca(r,(String)n);
        
        
        
        if (aux1==null||aux1.getAbj()==null) {
        Servicio.removeAllItems();
    }else{
    aux1=aux1.getAbj();
        while (aux1!=null) {
            
            Servicio.addItem(aux1.getEtq());
            aux1=aux1.getSig();
        }
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

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Agencia = new javax.swing.JComboBox();
        Servicio = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Baja de Pacientes");
        setUndecorated(true);

        jLabel1.setText("Agencia: ");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edd/imagenes/c1.png"))); // NOI18N
        jButton2.setText("Aceptar");
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/edd/imagenes/c1.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/edd/imagenes/g1.png"))); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edd/imagenes/c2.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/edd/imagenes/c2.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/edd/imagenes/g2.png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Agencia.setEditable(true);
        Agencia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                AgenciaItemStateChanged(evt);
            }
        });
        Agencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgenciaActionPerformed(evt);
            }
        });

        Servicio.setEditable(true);
        Servicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ServicioItemStateChanged(evt);
            }
        });
        Servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicioActionPerformed(evt);
            }
        });

        jLabel2.setText("Servicio :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Agencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        
       
        Object A= Agencia.getSelectedItem();
       Object S=Servicio.getSelectedItem();
        o= new Nodo(null,(String) S);
        
        
        
        if(A==null||S==null){
     JOptionPane.showMessageDialog(this, "No hay Servicios que mostrar");
}
else{
    String etq[] = new String[2];
        etq[0]=(String) A;
        
        etq[1]=(String) S;
        Nodo aux=null;
        //
        Nodo[]r1=new Nodo[2];
        //
        if (Multilistas.busca(r,(String)S )!=null ||Multilistas.busca(r,(String)A)!=null) {
           //r1=Multilistas.elimina(r,o, 0, etq);  
           aux=Multilistas.elimina(r,o, 0, etq);
           
       ManipulaArchivos.guarda(aux,"Agencia.txt");      
       
            JOptionPane.showMessageDialog(this,"Dato Eliminado" );     
        
        }else{
            JOptionPane.showMessageDialog(this,"Dato No encontrado" );   
        }
        dispose();
        new vtnP().setVisible(true);
}
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
        new vtnP().setVisible(true);

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServicioActionPerformed

    private void ServicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ServicioItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ServicioItemStateChanged

    private void AgenciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_AgenciaItemStateChanged

        if (evt.getStateChange()==ItemEvent.SELECTED) {
            
            if (this.Agencia.getSelectedIndex()>=0) {
                Servicio.removeAllItems();
                ListaC2();
                
            }
        }
    }//GEN-LAST:event_AgenciaItemStateChanged

    private void AgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgenciaActionPerformed

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
            java.util.logging.Logger.getLogger(VtnBServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnBServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnBServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnBServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnBServ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Agencia;
    private javax.swing.JComboBox Servicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
