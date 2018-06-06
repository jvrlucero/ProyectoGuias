package Guia4;

import Guia3.*;
import Guia5.Guia5_2_Menu;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Guia4 extends javax.swing.JFrame {
    DefaultTableModel modelo=new DefaultTableModel();
    public Guia4() {
        initComponents();
        ElementosCamaraP(false);
        ElementosCamaraS(false);
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
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        Cerrar2 = new javax.swing.JButton();

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

        jLabel1.setText("Opciones para su SmartPhone");

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEXUS", "PIXIE", "LENOVO", "GOOGLE", "HUAWEI", "SONY", "APPLE", "SAMSUNG", "ALCATEL", "LG", "OTRA" }));

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
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

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

        jLabel10.setText("Carga de la batería");

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jLabel11.setText("GPU, tarjeta gráfica");

        jLabel12.setText("Memoria integrada");

        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2GB", "4GB", "8GB", "16GB", "32GB", " " }));

        jLabel13.setText(" ");

        jLabel14.setText("MPX en secundaria");

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });

        Cerrar2.setBackground(new java.awt.Color(255, 255, 255));
        Cerrar2.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        Cerrar2.setText("←");
        Cerrar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cerrar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(32, 32, 32)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(10, 10, 10)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(157, 157, 157)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addGap(34, 34, 34)
                                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(31, 31, 31)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                        .addComponent(jTextField3))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(4, 4, 4)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCheckBox1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jCheckBox3)))))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cerrar2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1))
                    .addComponent(Cerrar2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel9))
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        Cerrar2.getAccessibleContext().setAccessibleName("←");
        Cerrar2.getAccessibleContext().setAccessibleDescription("Volver al menú principal");

        getAccessibleContext().setAccessibleName("←");
        getAccessibleContext().setAccessibleDescription("Volver al menú principal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String AnalisisDeInversion;
    int puntos=0;
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

    private void BateriaPantalla(){
        if((Double.parseDouble(jTextField2.getText())>=4.0)&&(Double.parseDouble(jTextField2.getText())<5.0)){
            if(Integer.parseInt(jTextField7.getText())<=1200)
                puntos+=3;
            else if((Integer.parseInt(jTextField7.getText())>1200)&&(Integer.parseInt(jTextField7.getText())<=2400))
                puntos+=4;
            else if((Integer.parseInt(jTextField7.getText())>2400)&&(Integer.parseInt(jTextField7.getText())<3100))
                puntos+=5;
            else if(Integer.parseInt(jTextField7.getText())>=3100)
                puntos+=6;            
        } else if(Double.parseDouble(jTextField2.getText())>=5.0){
            if(Integer.parseInt(jTextField7.getText())<=1200)
                puntos+=1;
            else if((Integer.parseInt(jTextField7.getText())>1200)&&(Integer.parseInt(jTextField7.getText())<=2400))
                puntos+=2;
            else if((Integer.parseInt(jTextField7.getText())>2400)&&(Integer.parseInt(jTextField7.getText())<3100))
                puntos+=3;
            else if(Integer.parseInt(jTextField7.getText())>=3100)
                puntos+=4;            
        } else if(Double.parseDouble(jTextField2.getText())<4.0){
            if(Integer.parseInt(jTextField7.getText())<=1200)
                puntos+=0;
            else if((Integer.parseInt(jTextField7.getText())>1200)&&(Integer.parseInt(jTextField7.getText())<=2400))
                puntos+=1;
            else if((Integer.parseInt(jTextField7.getText())>2400)&&(Integer.parseInt(jTextField7.getText())<3100))
                puntos+=2;
            else if(Integer.parseInt(jTextField7.getText())>=3100)
                puntos+=3; 
        }
    }
    
    private void refDeMarca(){
        if(jComboBox1.getSelectedItem().equals("NEXUS")||jComboBox1.getSelectedItem().equals("LENOVO")||jComboBox1.getSelectedItem().equals("APPLE")||jComboBox1.getSelectedItem().equals("GOOGLE")||jComboBox1.getSelectedItem().equals("HUAWEI")||jComboBox1.getSelectedItem().equals("SONY"))
            puntos+=4;
        else if(jComboBox1.getSelectedItem().equals("SAMSUNG")||jComboBox1.getSelectedItem().equals("ALCATEL")||jComboBox1.getSelectedItem().equals("LG"))
            puntos+=3;
        else
            puntos+=2;
    }
    
    private void rangoPrecio(){
        if(Integer.parseInt(jTextField5.getText())<100)
            puntos+=2;
        else if((Integer.parseInt(jTextField5.getText())>=100)&&(Integer.parseInt(jTextField5.getText())<350))
            puntos+=3;
        else
            puntos+=4;
    }
    
    private void garantia(){
        if(Integer.parseInt(jTextField4.getText())<=3)
            puntos+=1;
        else if((Integer.parseInt(jTextField4.getText())>3)&&(Integer.parseInt(jTextField4.getText())<6))
            puntos+=2;
        else if(Integer.parseInt(jTextField4.getText())>=6)
            puntos+=4;
    }
    
    private void Cpu(){
        if(Integer.parseInt(jTextField1.getText())<=2)
            puntos+=0;
        else if((Integer.parseInt(jTextField1.getText())>2)&&(Integer.parseInt(jTextField1.getText())<=4))
            puntos+=1;
        else if((Integer.parseInt(jTextField1.getText())>4)&&(Integer.parseInt(jTextField1.getText())<=6))
            puntos+=2;
        else if(Integer.parseInt(jTextField1.getText())>6)
            puntos+=3;
    }
    
    private void Ram(){
        if(Double.parseDouble(jTextField3.getText())<=1.0)
            puntos+=0;
        else if((Double.parseDouble(jTextField3.getText())>1.0)&&(Double.parseDouble(jTextField3.getText())<2.0))
            puntos+=2;
        else if((Double.parseDouble(jTextField3.getText())>=2.0)&&(Double.parseDouble(jTextField3.getText())<4.0))
            puntos+=4;
        else if(Double.parseDouble(jTextField3.getText())>=4.0)
            puntos+=6;
    } 
    
    private void pixelaje(){
       if(!jCheckBox3.isSelected())
           puntos-=1;
       if(jCheckBox1.isSelected()){
           if(Double.parseDouble(jTextField3.getText())<=5.0){
               if(Double.parseDouble(jTextField3.getText())<2.0)
                   puntos+=1;
               else
                   puntos+=2;
           } else if((Double.parseDouble(jTextField3.getText())>5.0)&&(Double.parseDouble(jTextField3.getText())<=8.0)){
               if(jCheckBox2.isSelected()){
                   if(Double.parseDouble(jTextField8.getText())<1.0)
                       puntos+=1;
                   else if((Double.parseDouble(jTextField8.getText())>=1.0)&&(Double.parseDouble(jTextField8.getText())<=3.0))
                       puntos+=2;
                   else
                       puntos+=3;                   
               }
           } else
               if(jCheckBox2.isSelected()){
                   if(Double.parseDouble(jTextField8.getText())<1.0)
                       puntos+=1;
                   else if((Double.parseDouble(jTextField8.getText())>=1.0)&&(Double.parseDouble(jTextField8.getText())<=5.0))
                       puntos+=2;
                   else
                       puntos+=3;                   
               }
       }
    } 
        
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
            ElementosCamaraP(true);
        else
            ElementosCamaraP(false);
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
                JOptionPane.showMessageDialog(this, "Ingrese un número de MPX para camara principal");
                jTextField6.setText("0.0");
                jTextField6.requestFocus();
            }
        if(jCheckBox2.isSelected())
            if(jTextField8.getText().length()==0){
                pruebadeverdad=false;
                JOptionPane.showMessageDialog(this, "Ingrese un número de MPX para camara secundaria");
                jTextField8.requestFocus();
            }
            
        if(pruebadeverdad!=false)
        Imprimir();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        if (jTextField7.getText().length()== 4)
        evt.consume();
        if (!Character.isDigit(evt.getKeyChar()))
            evt.consume();
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        if (jTextField9.getText().length()== 2)
            evt.consume();
        if (!Character.isDigit(evt.getKeyChar())) 
            evt.consume();
        if (jTextField9.getText().isEmpty()&&evt.getKeyChar()=='0')
            evt.consume();        
        if(!jTextField9.getText().isEmpty())
            if (jTextField9.getText().charAt(0)=='1'){
                if(evt.getKeyChar()!='0'&&evt.getKeyChar()!='1'&&evt.getKeyChar()!='2')
                    evt.consume();
            } else if (jTextField9.getText().charAt(0)!='1')
                evt.consume();
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        if (jTextField8.getText().length()== 4)
        evt.consume();
        if (!Character.isDigit(evt.getKeyChar()))
            if (evt.getKeyChar()=='.'){
                if (jTextField8.getText().contains("."))
                    evt.consume();
                else if (jTextField8.getText().isEmpty())
                    evt.consume();                
        } else
                evt.consume();

        if(jTextField8.getText().length()>=3)
        if(Character.isDigit(jTextField8.getText().charAt(0))&&Character.isDigit(jTextField8.getText().charAt(1))&&Character.isDigit(jTextField8.getText().charAt(2))&&(evt.getKeyChar()=='.'))
        evt.consume();
    }//GEN-LAST:event_jTextField8KeyTyped

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox1.isSelected())
            ElementosCamaraS(true);
        else
            ElementosCamaraS(false);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void Cerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cerrar2ActionPerformed
        Guia5_2_Menu Menu=new Guia5_2_Menu();
        Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Cerrar2ActionPerformed

    private void ElementosCamaraP(boolean OnOff){
        jCheckBox3.setEnabled(OnOff);
        jTextField6.setEnabled(OnOff);
        jLabel9.setEnabled(OnOff);
    }
    private void ElementosCamaraS(boolean OnOff){
        jTextField8.setEnabled(OnOff);
        jLabel14.setEnabled(OnOff);
    }
    private void CalculaPuntaje(){
        Ram();
        Cpu();
        garantia();
        refDeMarca();
        BateriaPantalla();
        pixelaje();
    }
    private void ProcesarPuntaje(){
        AnalisisDeInversion="";
        if(puntos<=7)
            AnalisisDeInversion="No es buena inversión.";
        else if(puntos>7&&puntos<=14)
            AnalisisDeInversion="Es una inversión de riesgo";
        else if(puntos>14&&puntos<=21)
            AnalisisDeInversion="La inversión es viable";
        else
            AnalisisDeInversion="Es una buena inversión.";
    }
    private void Imprimir(){
        puntos=0;
        CalculaPuntaje();
        ProcesarPuntaje();
        jLabel13.setText(AnalisisDeInversion);
        while(modelo.getRowCount()>0)modelo.removeRow(0);
        modelo.addRow(new Object[]{
        "Número de núcleos: "+jTextField1.getText(),"Tamaño de pantalla: "+jTextField2.getText()
        });
        modelo.addRow(new Object[]{
        "Cantidad de RAM: "+jTextField3.getText(),
            "Memoria integrada de: "+jComboBox2.getSelectedItem()
        });
        modelo.addRow(new Object[]{
        "Su precio es de: "+jTextField5.getText(),
            "Tiempo de garantía: "+jTextField4.getText(),
        });
        if(jCheckBox1.isSelected()&&(((Double.parseDouble(jTextField6.getText())!=0)||jTextField6.getText()!=null)||jTextField6.getText()!="")){
            if(jCheckBox3.isSelected())
                modelo.addRow(new Object[]{
                    "Con: "+jTextField6.getText()+"MPX en c.princ","Con flash"});
            else
                modelo.addRow(new Object[]{
                    "Con: "+jTextField6.getText()+"MPX en c.princ"});
         if(jCheckBox2.isSelected())
             modelo.addRow(new Object[]{"Con cámara secundaria","De "+jTextField8.getText()+"MPX"});
         
        if(jTextField9.getText().length()!=0)
            modelo.addRow(new Object[]{
                "GPU de: "+jTextField9.getText(),
                "Marca: "+jComboBox1.getSelectedItem()});
        else
        modelo.addRow(new Object[]{
        "Marca: "+jComboBox1.getSelectedItem()
        });
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
            java.util.logging.Logger.getLogger(Guia4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guia4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guia4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guia4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guia4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Cerrar1;
    private javax.swing.JButton Cerrar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
