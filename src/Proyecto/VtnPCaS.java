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
public class VtnPCaS extends javax.swing.JFrame
{
Nodo r = ManipulaArchivos.carga("Agencia.txt");
public static Nodo o=new Nodo(null, null);

    /**
     * Creates new form VtnBP
     */
    public VtnPCaS()
    {
        
        initComponents();
        
        Listarcombo();
        Servicio.removeAllItems();
        ListaC2();
        Listarcombo1();
        Servicio1.removeAllItems();
        ListaC22();
        
        
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
private void Listarcombo1(){
    
    r=ManipulaArchivos.carga("Agencia.txt");
    Nodo aux=r;
    
    aux=r;
    
    
        while (aux!=null) {
            Agencia1.addItem(aux.getEtq());  
            
            aux=aux.getSig();
        }
        
}
private void ListaC22(){
    
    Object n= Agencia1.getSelectedItem();
    if (n==null) {
        JOptionPane.showMessageDialog(this, "No hay Servicios que mostrar");
    }else{
        Nodo aux1=Multilistas.busca(r, (String) n);
        aux1=aux1.getAbj();
        while (aux1!=null) {
            
            Servicio1.addItem(aux1.getEtq());
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
        Agencia1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        Servicio1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

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

        Agencia1.setEditable(true);
        Agencia1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Agencia1ItemStateChanged(evt);
            }
        });
        Agencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agencia1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Agencia: ");

        Servicio1.setEditable(true);
        Servicio1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Servicio1ItemStateChanged(evt);
            }
        });
        Servicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Servicio1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Servicio :");

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Carro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Agencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Agencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Servicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Agencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Agencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Servicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Car)
                                .addComponent(Carro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(146, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
     
        Object A= Agencia.getSelectedItem();
       Object S=Servicio.getSelectedItem();
       Object Ca=Carro.getSelectedItem();
       Object A2=Agencia1.getSelectedItem();
       Object S2=Servicio1.getSelectedItem();
        
        
        if(A==null||S==null||A2==null||S2==null){
     JOptionPane.showMessageDialog(this, "No hay Servicios que mostrar");
}
else{
            
            if (!S.equals(S2)) {
                JOptionPane.showMessageDialog(this, "Es el mismo servicio, por favor coriije");
            }else{
            String[]etq= new String[3];
            String[]eta= new String[3];
            
            Nodo A1=Multilistas.busca(r, (String)A);
            Nodo C=Multilistas.busca(A1.getAbj(), (String)S);           
            Nodo Ce=Multilistas.busca(C, (String)Ca);
            
            /*String car=((Carro)Ce.getObj()).getAuto();
            String D=((Carro)Ce.getObj()).getFecha();
            String sn=((Carro)Ce.getObj()).getTer();
             Object c1=new Carro(D, car,sn );*/
             
                if (S.equals(S2)&& A.equals(A2)) {
                     JOptionPane.showMessageDialog(this, "esta en el mismo lugar,cambia de lugar");
                }else{
             etq[0]=(String)A;//elimina
            etq[1]=(String)S;
            etq[2]=(String)Ca;           
            r =Multilistas.elimina(r, Ce, 0, etq);  //
            o= new Nodo(null, (String)Ca);
            eta[0]=(String)A2;
              eta[1]=(String)S2;
              eta[2]=(String)Ca;
            r=Multilistas.insertar(r, o, 0, eta);
            JOptionPane.showMessageDialog(this, "Dato insertado Correctamente");
             ManipulaArchivos.guarda(r, "Agencia.txt");     
             
            dispose();
        new vtnP().setVisible(true);
            
 }   
 }   
          
       
    }//GEN-LAST:event_jButton2ActionPerformed
    }                                        
private String[] insert(Nodo r,Nodo Ag,Nodo Ser,Nodo C,String etq[],String S){
    Nodo aux=C;
    while (aux!=null) {        
        System.out.println(aux.getEtq());
        aux=aux.getSig();
    }
    while (Ag!=null) {
                
                Ser=Ag.getAbj();
                 while (Ser!=null) {
                    
                    System.out.println("Servicio: "+Ser.getEtq());
                    if (Ser.getEtq().equals((String)S)) {
                                etq[0]=Ag.getEtq();
                                etq[1]=Ser.getEtq();
                    
                    
                }        
                    Ser=Ser.getSig();
                               
                }               
               Ag=Ag.getSig();
            }
    return etq;
}
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

    private void Agencia1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Agencia1ItemStateChanged
if (evt.getStateChange()==ItemEvent.SELECTED) {
            
            if (this.Agencia1.getSelectedIndex()>=0 ) {
                Servicio1.removeAllItems(); 
               
                ListaC22();
               
                
            }
            
            
                    
                
        }       
    }//GEN-LAST:event_Agencia1ItemStateChanged

    private void Agencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agencia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Agencia1ActionPerformed

    private void Servicio1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Servicio1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Servicio1ItemStateChanged

    private void Servicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Servicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Servicio1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
       
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnPCaS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Agencia;
    private javax.swing.JComboBox Agencia1;
    private javax.swing.JLabel Car;
    private javax.swing.JComboBox Carro;
    private javax.swing.JComboBox Servicio;
    private javax.swing.JComboBox Servicio1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
