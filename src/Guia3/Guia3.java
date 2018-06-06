package Guia3;

import Guia5.Guia5_2_Menu;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Guia3 extends javax.swing.JFrame {
    DefaultTableModel modelo=new DefaultTableModel();
    public Guia3() {
        initComponents();
        ElementosCamara(false);
        modelo.setColumnCount(2);
        jTable1.setModel(modelo);
        jTable1.getTableHeader().setVisible(false);
        this.setTitle("Registro");
        this.setLocationRelativeTo(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jLabel1.setText("Puntaje de moviles ");

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEXUS", "PIXIE", "LENOVO", "HUAWEI", "SONY", "APPLE", "SAMSUNG", "ALCATEL", "LG", "OTRA" }));

        jLabel2.setText("Cpu, número de núcleos");

        jLabel8.setText("Cámaras:");

        jLabel3.setText("Tamaño de pantalla");

        jCheckBox1.setText("Principal");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad de RAM");

        jCheckBox2.setText("Secundaria");

        jLabel5.setText("Tiempo de garantía");

        jLabel6.setText("Precio");

        jLabel7.setText("Marca");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel9.setText("MPX de principal:");

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jCheckBox3.setText("Flash");

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(modelo);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);

        Cerrar.setBackground(new java.awt.Color(255, 255, 255));
        Cerrar.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        Cerrar.setText("←");
        Cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(57, 57, 57)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(68, 68, 68)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(59, 59, 59)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(122, 122, 122)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addGap(122, 122, 122)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jCheckBox3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(43, 43, 43)
                                .addComponent(jCheckBox2)))))
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1))
                    .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );

        Cerrar.getAccessibleContext().setAccessibleDescription("Volver al menú principal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if (jTextField1.getText().length()== 2)
            evt.consume();
        if (!Character.isDigit(evt.getKeyChar())) 
            evt.consume();
        if (jTextField1.getText().isEmpty()&&evt.getKeyChar()=='0')
            evt.consume();        
        if(!jTextField1.getText().isEmpty())
            if (jTextField1.getText().charAt(0)=='1'){
                if(evt.getKeyChar()!='0'&&evt.getKeyChar()!='1'&&evt.getKeyChar()!='2')
                    evt.consume();
            } else if (jTextField1.getText().charAt(0)!='1')
                evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        if (jTextField2.getText().length()== 3)
            evt.consume();
        if (!Character.isDigit(evt.getKeyChar())) 
            if (evt.getKeyChar() == '.'){ 
                if (jTextField2.getText().contains(".")) 
                    evt.consume();
                else if (jTextField2.getText().isEmpty())
                    evt.consume();
            }
        if (jTextField2.getText().isEmpty()&&evt.getKeyChar()=='0')
            evt.consume();        
        
        if(!jTextField2.getText().isEmpty())            
            if((KeyEvent.VK_BACKSPACE!=evt.getKeyCode())&&(evt.getKeyChar()!='')){
                if (jTextField2.getText().charAt(0)=='3'||jTextField2.getText().charAt(0)=='4'||jTextField2.getText().charAt(0)=='5'||jTextField2.getText().charAt(0)=='6'){
                    if ((!jTextField2.getText().contains("."))&&evt.getKeyChar()!='.')
                        jTextField2.setText(jTextField2.getText()+".");
                    if(jTextField2.getText().charAt(0)=='6')
                        if(evt.getKeyChar()=='8'&&evt.getKeyChar()=='9')
                            evt.consume();
            } else 
                evt.consume();
            }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        if (jTextField3.getText().length()== 3)
            evt.consume();
        if (!Character.isDigit(evt.getKeyChar())) 
            if (evt.getKeyChar() == '.'){ 
                if (jTextField3.getText().contains(".")) 
                    evt.consume();
                else if (jTextField3.getText().isEmpty())
                    evt.consume();
            }
        if (jTextField3.getText().isEmpty()&&(evt.getKeyChar()=='7'||evt.getKeyChar()=='8'||evt.getKeyChar()=='9'))
            evt.consume();        
        
        if(!jTextField3.getText().isEmpty())            
            if((KeyEvent.VK_BACKSPACE!=evt.getKeyCode())&&(evt.getKeyChar()!='')){
                if (jTextField3.getText().charAt(0)!='7'||jTextField3.getText().charAt(0)!='8'||jTextField3.getText().charAt(0)!='9'){
                    if ((!jTextField3.getText().contains("."))&&evt.getKeyChar()!='.')
                        jTextField3.setText(jTextField3.getText()+".");
                    if(jTextField3.getText().charAt(0)=='0')
                        if(evt.getKeyChar()=='0'||evt.getKeyChar()=='1'||evt.getKeyChar()=='2'||evt.getKeyChar()=='3'||evt.getKeyChar()=='4')
                            evt.consume();
                    if(jTextField3.getText().charAt(0)=='6')
                        if(evt.getKeyChar()!='0')
                            evt.setKeyChar('0');
            } else 
                evt.consume();
            }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        if (jTextField4.getText().length()== 2)
            evt.consume();
        if (!Character.isDigit(evt.getKeyChar())) 
            evt.consume();
        if (jTextField4.getText().isEmpty()&&evt.getKeyChar()=='0')
            evt.consume();        
        if(!jTextField4.getText().isEmpty())
            if (jTextField4.getText().charAt(0)=='2'){
                if(evt.getKeyChar()!='0'&&evt.getKeyChar()!='1'&&evt.getKeyChar()!='2'&&evt.getKeyChar()!='3'&&evt.getKeyChar()!='4')
                    evt.consume();
            } else if (jTextField4.getText().charAt(0)!='1'&&jTextField4.getText().charAt(0)!='2')
                evt.consume();
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        if (!Character.isDigit(evt.getKeyChar())) 
            if (evt.getKeyChar()== '.'){ 
                if (jTextField5.getText().contains(".")) 
                    evt.consume();
                else if (jTextField5.getText().isEmpty())
                    evt.consume();                
            }
        if(jTextField5.getText().length()==2)
            if((jTextField5.getText().charAt(0)=='0')&&(jTextField5.getText().charAt(1)=='0')&&(evt.getKeyChar()=='0'))
                evt.consume();
        if(jTextField5.getText().length()==3)
            if((jTextField5.getText().charAt(0)=='0')&&(jTextField5.getText().charAt(1)=='.')&&(jTextField5.getText().charAt(2)=='0')&&(evt.getKeyChar()=='0'))
                evt.consume();        
        if(jTextField5.getText().length()==4)
            if((jTextField5.getText().charAt(0)=='0')&&(jTextField5.getText().charAt(1)=='0')&&(jTextField5.getText().charAt(2)=='.')&&(jTextField5.getText().charAt(3)=='0')&&(evt.getKeyChar()=='0'))
                evt.consume();
                            
        if (!jTextField5.getText().isEmpty()){
            if(jTextField5.getText().length()==3)
                if(Character.isDigit(jTextField5.getText().charAt(0))&&Character.isDigit(jTextField5.getText().charAt(1))&&Character.isDigit(jTextField5.getText().charAt(2))&&(evt.getKeyChar()!='.'))
                    evt.consume();
            if(jTextField5.getText().length()>=4){
                if(jTextField5.getText().charAt(3)=='.')
                    if (jTextField5.getText().length()== 6)
                        evt.consume();  
            }if(jTextField5.getText().length()>=3){
                if(jTextField5.getText().charAt(2)=='.')
                    if (jTextField5.getText().length()==5)
                        evt.consume();
            }if(jTextField5.getText().length()>=2){
                if(jTextField5.getText().charAt(1)=='.'){
                    if (jTextField5.getText().length()==4)
                        evt.consume();
                }
            }
        } 
        
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected())
            ElementosCamara(true);
        else
            ElementosCamara(false);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        if (jTextField6.getText().length()== 4)
        evt.consume();
        if (!Character.isDigit(evt.getKeyChar()))
            if (evt.getKeyChar()=='.'){
                if (jTextField6.getText().contains("."))
                    evt.consume();
                else if (jTextField6.getText().isEmpty())
                    evt.consume();                
        } else
                evt.consume();

        if(jTextField6.getText().length()>=3)
        if(Character.isDigit(jTextField6.getText().charAt(0))&&Character.isDigit(jTextField6.getText().charAt(1))&&Character.isDigit(jTextField6.getText().charAt(2))&&(evt.getKeyChar()=='.'))
        evt.consume();
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean pruebadeverdad=true;
        
        if(jTextField1.getText().length()==0){
            pruebadeverdad=false;
            JOptionPane.showMessageDialog(this, "Ingrese el número de núcleos");
            jTextField1.requestFocus();
        }
        if(jTextField2.getText().length()==0){
            pruebadeverdad=false;
            JOptionPane.showMessageDialog(this, "Ingrese un tamaño de pantalla");
            jTextField2.requestFocus();
        }
        if(jTextField3.getText().length()==0){
            pruebadeverdad=false;
            JOptionPane.showMessageDialog(this, "Ingrese la cantidad de RAM");
            jTextField3.requestFocus();
        }
        if(jTextField4.getText().length()==0){
            pruebadeverdad=false;
            JOptionPane.showMessageDialog(this, "Ingrese una garantía");
            jTextField4.requestFocus();
        }
        if(jTextField5.getText().length()==0){
            pruebadeverdad=false;
            JOptionPane.showMessageDialog(this, "Ingrese un precio");
            jTextField5.requestFocus();
        }
        if(jCheckBox1.isSelected())
            if(jTextField6.getText().length()==0){
                pruebadeverdad=false;
                JOptionPane.showMessageDialog(this, "Ingrese un número de MPX");
                jTextField6.setText("0.0");
                jTextField6.requestFocus();
        }
            
        if(pruebadeverdad!=false)
        Imprimir();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        Guia5_2_Menu Menu=new Guia5_2_Menu();
        Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void ElementosCamara(boolean OnOff){
        jCheckBox3.setEnabled(OnOff);
        jTextField6.setEnabled(OnOff);
        jLabel9.setEnabled(OnOff);
    }
    
    private void Imprimir(){
        while(modelo.getRowCount()>0)modelo.removeRow(0);
        modelo.addRow(new Object[]{
        "Número de núcleos: "+jTextField1.getText(),"Tamaño de pantalla: "+jTextField2.getText(),
            "Cantidad de RAM:"+jTextField3.getText(),"Tiempo de garantía: "+jTextField4.getText()
        });
        modelo.addRow(new Object[]{
        "Cantidad de RAM: "+jTextField3.getText(),
            "Tiempo de garantía: "+jTextField4.getText()
        });
        modelo.addRow(new Object[]{
        "Su precio es de: "+jTextField5.getText(),
        "Marca: "+jComboBox1.getSelectedItem()
        });
        if(jCheckBox1.isSelected()&&(((Double.parseDouble(jTextField6.getText())!=0)||jTextField6.getText()!=null)||jTextField6.getText()!="")){
            if(jCheckBox3.isSelected())
                modelo.addRow(new Object[]{
                    "Con: "+jTextField6.getText()+"MPX en c.princ","Con flash"});
            else
                modelo.addRow(new Object[]{
                    "Con: "+jTextField6.getText()+"MPX en c.princ"});
         if(jCheckBox2.isSelected())
             modelo.addRow(new Object[]{"Con cámara secundaria"});
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(Guia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guia3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
