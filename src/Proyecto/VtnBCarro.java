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
public class VtnBCarro extends javax.swing.JFrame
{
Nodo r = ManipulaArchivos.carga("Agencia.txt");
public static Nodo o=new Nodo(null, null);

    /**
     * Creates new form VtnBP
     */
    public VtnBCarro()
    {
        
        initComponents();
        
        Listarcombo();
        Servicio.removeAllItems();
        ListaC2();
        
        
        AutoCompleteDecorator.decorate(Agencia);
    }
private void Listarcombo(){
    
    r=ManipulaArchivos.carga("Agencia.txt");
    Nodo aux=r;
    
    aux=r;
    
    
        while (aux!=null) {
            Agencia.addItem(aux.getEtq());  
            
            aux=aux.getSig();
        }
        
}
private void ListaC2(){
    
    Object n= Agencia.getSelectedItem();
    if (n==null) {
        JOptionPane.showMessageDialog(this, "No hay Servicios que mostrar");
    }else{
        Nodo aux1=Multilistas.busca(r, (String) n);
        aux1=aux1.getAbj();
        while (aux1!=null) {
            
            Servicio.addItem(aux1.getEtq());
            aux1=aux1.getSig();
          
        }
       
       }
    
}
private void ListaC3(){
    
    Object a=Agencia.getSelectedItem();
    Object n= Servicio.getSelectedItem();
   Nodo aux1=Multilistas.busca(r,(String)a);
         aux1=Multilistas.busca(aux1.getAbj(),(String)n);

        if (aux1==null) {
        
    }else{    
    aux1=aux1.getAbj();
            
        while (aux1!=null) {            
            Carro.addItem(aux1.getEtq());
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
        Car = new javax.swing.JLabel();
        Carro = new javax.swing.JComboBox();

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

        Car.setText("Carro :");

        Carro.setEditable(true);
        Carro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CarroItemStateChanged(evt);
            }
        });
        Carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Car, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Carro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
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
                            .addComponent(Agencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Car)
                        .addComponent(Carro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        
        Nodo r = ManipulaArchivos.carga("Agencia.txt");
        Object A= Agencia.getSelectedItem();
       Object S=Servicio.getSelectedItem();
       Object C=Carro.getSelectedItem();
        o= new Nodo(null,(String) S);
        
        
        
        if(A==null||S==null||C==null){
            if (A==null) {
                JOptionPane.showMessageDialog(this, "No hay Agencias que mostrar");
            }
            if (S==null) {
                JOptionPane.showMessageDialog(this, "No hay Servicios que mostrar");
            }if (C==null) {
                JOptionPane.showMessageDialog(this, "No hay Carros que mostrar");
            }
     
}
else{
    String etq[] = new String[3];
        etq[0]=(String) A;
        
        etq[1]=(String) S;
        etq[2]=(String) C;
        if (Multilistas.busca(r,(String)S )!=null ||Multilistas.busca(r,(String)A)!=null) {
            r=Multilistas.elimina(r,o, 0, etq);      
       ManipulaArchivos.guarda(r, "Agencia.txt");      
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
            
            if (this.Agencia.getSelectedIndex()>=0 ) {
                Servicio.removeAllItems(); 
                Carro.removeAllItems(); 
                ListaC2();
                ListaC3();
                
            }
            
            
                    
                
        }
    }//GEN-LAST:event_AgenciaItemStateChanged

    private void CarroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CarroItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CarroItemStateChanged

    private void CarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarroActionPerformed

    private void AgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgenciaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
       
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnBCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Agencia;
    private javax.swing.JLabel Car;
    private javax.swing.JComboBox Carro;
    private javax.swing.JComboBox Servicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
