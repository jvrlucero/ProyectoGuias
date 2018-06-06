package Guia1;
import Guia5.Guia5_2_Menu;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Guia1 extends javax.swing.JFrame {
    public Guia1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Cerrar = new javax.swing.JButton();
        jTextFieldSerie1 = new javax.swing.JTextField();
        jTextFieldSerie2 = new javax.swing.JTextField();
        jTextFieldSerie3 = new javax.swing.JTextField();
        jTextFieldSerie4 = new javax.swing.JTextField();
        jTextFieldSerie5 = new javax.swing.JTextField();
        jTextFieldSerie6 = new javax.swing.JTextField();
        jTextFieldSerie7 = new javax.swing.JTextField();
        jTextFieldSerie8 = new javax.swing.JTextField();
        jTextFieldSerie9 = new javax.swing.JTextField();
        jTextFieldSerie10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Calcular el área,y la diagonal de una figura de 4 lados(cuadrado o rectángulo)");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jButton1.setText("=");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("x");

        jLabel2.setText("Area");

        jLabel4.setText("Calcular la circunferencia de un círculo dado. Se debe proporcionar el diámetro o el radio");

        jLabel5.setText("Calcular el volumen de una esfera. Se debeproporcionar el radio o el diámetro.");

        jTextField3.setText("Diámetro");
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.setText("Radio");
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Perímetro");

        jTextField5.setText("Diámetro");
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jTextField6.setText("Radio");
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Volumen");

        jLabel8.setText("Calcular el volumen de un cubo. Se debe de proporcionar la diagonal");

        jTextField7.setText("Diagonal");
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });

        jButton4.setText("Calcular");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setText(" ");

        jLabel10.setText("Calcular el promedio de una muestra numérica de 10 datos (99.99)");

        Cerrar.setBackground(new java.awt.Color(255, 0, 0));
        Cerrar.setFont(new java.awt.Font("Lucida Sans", 0, 11)); // NOI18N
        Cerrar.setText("X");
        Cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        jTextFieldSerie1.setText("00.00");
        jTextFieldSerie1.setMaximumSize(new java.awt.Dimension(34, 20));
        jTextFieldSerie1.setMinimumSize(new java.awt.Dimension(34, 20));
        jTextFieldSerie1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSerie1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSerie1FocusLost(evt);
            }
        });
        jTextFieldSerie1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSerie1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSerie1KeyTyped(evt);
            }
        });

        jTextFieldSerie2.setText("00.00");
        jTextFieldSerie2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSerie2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSerie2FocusLost(evt);
            }
        });
        jTextFieldSerie2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSerie2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSerie2KeyTyped(evt);
            }
        });

        jTextFieldSerie3.setText("00.00");
        jTextFieldSerie3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSerie3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSerie3FocusLost(evt);
            }
        });
        jTextFieldSerie3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSerie3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSerie3KeyTyped(evt);
            }
        });

        jTextFieldSerie4.setText("00.00");
        jTextFieldSerie4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSerie4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSerie4FocusLost(evt);
            }
        });
        jTextFieldSerie4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSerie4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSerie4KeyTyped(evt);
            }
        });

        jTextFieldSerie5.setText("00.00");
        jTextFieldSerie5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSerie5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSerie5FocusLost(evt);
            }
        });
        jTextFieldSerie5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSerie5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSerie5KeyTyped(evt);
            }
        });

        jTextFieldSerie6.setText("00.00");
        jTextFieldSerie6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSerie6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSerie6FocusLost(evt);
            }
        });
        jTextFieldSerie6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSerie6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSerie6KeyTyped(evt);
            }
        });

        jTextFieldSerie7.setText("00.00");
        jTextFieldSerie7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSerie7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSerie7FocusLost(evt);
            }
        });
        jTextFieldSerie7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSerie7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSerie7KeyTyped(evt);
            }
        });

        jTextFieldSerie8.setText("00.00");
        jTextFieldSerie8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSerie8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSerie8FocusLost(evt);
            }
        });
        jTextFieldSerie8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSerie8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSerie8KeyTyped(evt);
            }
        });

        jTextFieldSerie9.setText("00.00");
        jTextFieldSerie9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSerie9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSerie9FocusLost(evt);
            }
        });
        jTextFieldSerie9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSerie9KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSerie9KeyTyped(evt);
            }
        });

        jTextFieldSerie10.setText("00.00");
        jTextFieldSerie10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSerie10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSerie10FocusLost(evt);
            }
        });
        jTextFieldSerie10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSerie10KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSerie10KeyTyped(evt);
            }
        });

        jLabel11.setText("El promedio de los datos es:");

        jLabel12.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldSerie1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSerie2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSerie3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSerie4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSerie5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSerie6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSerie7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSerie8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSerie9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSerie10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSerie1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldSerie2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldSerie3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldSerie4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldSerie5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldSerie6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldSerie7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldSerie8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldSerie9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldSerie10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Cerrar.getAccessibleContext().setAccessibleDescription("Cierra esta ventana y vuelve al menú principal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        Guia5_2_Menu Menu=new Guia5_2_Menu();
        Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField1.getText().equals(jTextField2.getText())){
            if(jTextField2.getText().equals("")||jTextField2.getText().equals(null))
            JOptionPane.showMessageDialog(this, "Ingrese datos");
            else if(jTextField1.getText().equals(""))                
                jLabel2.setText(""+(Double.parseDouble(jTextField2.getText())*Double.parseDouble(jTextField2.getText())));
            else
                jLabel2.setText(""+(Double.parseDouble(jTextField1.getText())*Double.parseDouble(jTextField1.getText())));
        } else if(jTextField2.getText().equals(""))
            jLabel2.setText(""+(Double.parseDouble(jTextField1.getText())*Double.parseDouble(jTextField1.getText())));
        else if(jTextField1.getText().equals(""))
            jLabel2.setText(""+(Double.parseDouble(jTextField2.getText())*Double.parseDouble(jTextField2.getText())));
        else 
            jLabel2.setText(""+(Double.parseDouble(jTextField1.getText())*Double.parseDouble(jTextField2.getText())));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComprobarEntrada(java.awt.event.KeyEvent evt,String Texto){
        if (evt.getKeyChar() == '.') {
            if (Texto.contains(".")) {
                evt.consume();
            }
        } else if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }
    
    private boolean ComprobarSiEsUnNumero(String texto) {
        try {
            Double.parseDouble(texto);
            return true;
        } catch (Exception e) {            
            if(texto.equals("."))
                return true;           
            else 
            return false;
        }
    }
    
    private String ComprobarSiEstaEnRango(java.awt.event.KeyEvent evt,String texto, int n) {
        try {
            if(Double.parseDouble(texto)>100){
            JOptionPane.showMessageDialog(this, "El número es mayor a 100");
            texto= "";
            } else if(texto.equals(""))
                JOptionPane.showMessageDialog(this, "No ha ingresado datos en la celda "+n);
            else
                DarFormato(texto);
        } catch (Exception e) { 
        }
        return texto;
    }
     
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if(ComprobarSiEsUnNumero(jTextField1.getText())==false)
            jTextField1.setText("");
        ComprobarEntrada(evt,jTextField1.getText());  
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        if(ComprobarSiEsUnNumero(jTextField2.getText())==false)
            jTextField2.setText("");
        ComprobarEntrada(evt,jTextField2.getText());
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        if(ComprobarSiEsUnNumero(jTextField3.getText())==false)
            jTextField3.setText("");
        ComprobarEntrada(evt,jTextField3.getText());
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        if(ComprobarSiEsUnNumero(jTextField4.getText())==false)
            jTextField4.setText("");
        ComprobarEntrada(evt,jTextField4.getText());
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        if(ComprobarSiEsUnNumero(jTextField5.getText())==false)
            jTextField5.setText("");
        ComprobarEntrada(evt,jTextField5.getText());
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        if(ComprobarSiEsUnNumero(jTextField6.getText())==false)
            jTextField6.setText("");
        ComprobarEntrada(evt,jTextField6.getText());
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        if(ComprobarSiEsUnNumero(jTextField7.getText())==false)
            jTextField7.setText("");
        ComprobarEntrada(evt,jTextField7.getText());
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(ComprobarSiEsUnNumero(jTextField3.getText())==true&&ComprobarSiEsUnNumero(jTextField4.getText())==true){
            if(Integer.parseInt(jTextField3.getText())==(2*Integer.parseInt(jTextField4.getText())))
                jLabel6.setText(""+(2*Math.PI*Double.parseDouble(jTextField4.getText())));
            else
                JOptionPane.showMessageDialog(this, "El radio no corresponde a ese diametro ingresado");
        } else if(ComprobarSiEsUnNumero(jTextField4.getText())==true)            
                jLabel6.setText(""+(2*Math.PI*Double.parseDouble(jTextField4.getText())));
        else if(ComprobarSiEsUnNumero(jTextField3.getText())==true)            
                jLabel6.setText(""+(Math.PI*Double.parseDouble(jTextField3.getText())));
        else
                JOptionPane.showMessageDialog(this, "No ha ingresado ningún dato");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(ComprobarSiEsUnNumero(jTextField5.getText())==true&&ComprobarSiEsUnNumero(jTextField6.getText())==true){
            if(Integer.parseInt(jTextField5.getText())==(2*Integer.parseInt(jTextField6.getText())))
                jLabel7.setText(((4/3)*Math.PI*Math.pow(Double.parseDouble(jTextField6.getText()),3))+" unidades cúbicas");
            else
                JOptionPane.showMessageDialog(this, "El radio no corresponde a ese diametro ingresado");
        } else if(ComprobarSiEsUnNumero(jTextField5.getText())==true)            
                jLabel7.setText(((4/3)*Math.PI*Math.pow(0.5*Double.parseDouble(jTextField5.getText()),3))+" unidades cúbicas");
        else if(ComprobarSiEsUnNumero(jTextField6.getText())==true)                        
                jLabel7.setText(((4/3)*Math.PI*Math.pow(Double.parseDouble(jTextField6.getText()),3))+" unidades cúbicas");
        else
                JOptionPane.showMessageDialog(this, "No ha ingresado ningún dato");
    }//GEN-LAST:event_jButton3ActionPerformed

    private String DarFormato(String numero) {
        DecimalFormat dec = new DecimalFormat("#.##");
        try {
            return dec.format(Double.parseDouble(numero));
        } catch (Exception e) {
            return "00.00";
        }
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(ComprobarSiEsUnNumero(jTextField7.getText())==true)
            jLabel9.setText(Math.pow((Double.parseDouble(jTextField7.getText())/Math.pow(3,0.5)),3)+" unidades cúbicas");
        else
            JOptionPane.showMessageDialog(this, "No ha ingresado ningún dato");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldSerie1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie1KeyTyped
        if(ComprobarSiEsUnNumero(jTextFieldSerie1.getText())==false)
            jTextFieldSerie1.setText("");             
        ComprobarEntrada(evt,jTextFieldSerie1.getText());
    }//GEN-LAST:event_jTextFieldSerie1KeyTyped

    private void jTextFieldSerie1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie1KeyReleased
        jTextFieldSerie1.setText(ComprobarSiEstaEnRango(evt,jTextFieldSerie1.getText(),1));
    }//GEN-LAST:event_jTextFieldSerie1KeyReleased

    private void jTextFieldSerie1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie1FocusLost
        if(ComprobarSiEsUnNumero(jTextFieldSerie1.getText())==false||jTextFieldSerie1.getText().equals("."))
            jTextFieldSerie1.setText("00.00");
        else
            jTextFieldSerie1.setText(DarFormato(jTextFieldSerie1.getText()));
        Promedio();
    }//GEN-LAST:event_jTextFieldSerie1FocusLost

    private void jTextFieldSerie2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie2FocusLost
        if(ComprobarSiEsUnNumero(jTextFieldSerie2.getText())==false||jTextFieldSerie2.getText().equals("."))
            jTextFieldSerie2.setText("00.00");
        else
            jTextFieldSerie2.setText(DarFormato(jTextFieldSerie2.getText()));
        Promedio();
    }//GEN-LAST:event_jTextFieldSerie2FocusLost

    private void jTextFieldSerie2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie2KeyReleased
        jTextFieldSerie2.setText(ComprobarSiEstaEnRango(evt,jTextFieldSerie2.getText(),2));
    }//GEN-LAST:event_jTextFieldSerie2KeyReleased

    private void jTextFieldSerie2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie2KeyTyped
        if(ComprobarSiEsUnNumero(jTextFieldSerie2.getText())==false)
            jTextFieldSerie2.setText("");             
        ComprobarEntrada(evt,jTextFieldSerie2.getText());
    }//GEN-LAST:event_jTextFieldSerie2KeyTyped

    private void jTextFieldSerie3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie3FocusLost
        if(ComprobarSiEsUnNumero(jTextFieldSerie3.getText())==false||jTextFieldSerie3.getText().equals("."))
            jTextFieldSerie3.setText("00.00");
        else
            jTextFieldSerie3.setText(DarFormato(jTextFieldSerie3.getText()));
        Promedio();
    }//GEN-LAST:event_jTextFieldSerie3FocusLost

    private void jTextFieldSerie3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie3KeyReleased
        jTextFieldSerie3.setText(ComprobarSiEstaEnRango(evt,jTextFieldSerie3.getText(),3));
    }//GEN-LAST:event_jTextFieldSerie3KeyReleased

    private void jTextFieldSerie3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie3KeyTyped
        if(ComprobarSiEsUnNumero(jTextFieldSerie3.getText())==false)
            jTextFieldSerie3.setText("");             
        ComprobarEntrada(evt,jTextFieldSerie3.getText());
    }//GEN-LAST:event_jTextFieldSerie3KeyTyped

    private void jTextFieldSerie4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie4FocusLost
        if(ComprobarSiEsUnNumero(jTextFieldSerie4.getText())==false||jTextFieldSerie4.getText().equals("."))
            jTextFieldSerie4.setText("00.00");
        else
            jTextFieldSerie4.setText(DarFormato(jTextFieldSerie4.getText()));
        Promedio();
    }//GEN-LAST:event_jTextFieldSerie4FocusLost

    private void jTextFieldSerie4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie4KeyReleased
        jTextFieldSerie4.setText(ComprobarSiEstaEnRango(evt,jTextFieldSerie4.getText(),4));
    }//GEN-LAST:event_jTextFieldSerie4KeyReleased

    private void jTextFieldSerie4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie4KeyTyped
        if(ComprobarSiEsUnNumero(jTextFieldSerie4.getText())==false)
            jTextFieldSerie4.setText("");             
        ComprobarEntrada(evt,jTextFieldSerie4.getText());
    }//GEN-LAST:event_jTextFieldSerie4KeyTyped

    private void jTextFieldSerie5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie5FocusLost
        if(ComprobarSiEsUnNumero(jTextFieldSerie5.getText())==false||jTextFieldSerie5.getText().equals("."))
            jTextFieldSerie5.setText("00.00");
        else
            jTextFieldSerie5.setText(DarFormato(jTextFieldSerie5.getText()));
        Promedio();
    }//GEN-LAST:event_jTextFieldSerie5FocusLost

    private void jTextFieldSerie5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie5KeyReleased
        jTextFieldSerie5.setText(ComprobarSiEstaEnRango(evt,jTextFieldSerie5.getText(),5));
    }//GEN-LAST:event_jTextFieldSerie5KeyReleased

    private void jTextFieldSerie5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie5KeyTyped
        if(ComprobarSiEsUnNumero(jTextFieldSerie5.getText())==false)
            jTextFieldSerie5.setText("");             
        ComprobarEntrada(evt,jTextFieldSerie5.getText());
    }//GEN-LAST:event_jTextFieldSerie5KeyTyped

    private void jTextFieldSerie6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie6FocusLost
        if(ComprobarSiEsUnNumero(jTextFieldSerie6.getText())==false||jTextFieldSerie6.getText().equals("."))
            jTextFieldSerie6.setText("00.00");
        else
            jTextFieldSerie6.setText(DarFormato(jTextFieldSerie6.getText()));
        Promedio();
    }//GEN-LAST:event_jTextFieldSerie6FocusLost

    private void jTextFieldSerie6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie6KeyReleased
        jTextFieldSerie6.setText(ComprobarSiEstaEnRango(evt,jTextFieldSerie6.getText(),6));
    }//GEN-LAST:event_jTextFieldSerie6KeyReleased

    private void jTextFieldSerie6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie6KeyTyped
        if(ComprobarSiEsUnNumero(jTextFieldSerie6.getText())==false)
            jTextFieldSerie6.setText("");             
        ComprobarEntrada(evt,jTextFieldSerie6.getText());
    }//GEN-LAST:event_jTextFieldSerie6KeyTyped

    private void jTextFieldSerie7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie7FocusLost
        if(ComprobarSiEsUnNumero(jTextFieldSerie7.getText())==false||jTextFieldSerie7.getText().equals("."))
            jTextFieldSerie7.setText("00.00");
        else
            jTextFieldSerie7.setText(DarFormato(jTextFieldSerie7.getText()));
        Promedio();
    }//GEN-LAST:event_jTextFieldSerie7FocusLost

    private void jTextFieldSerie7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie7KeyReleased
        jTextFieldSerie7.setText(ComprobarSiEstaEnRango(evt,jTextFieldSerie7.getText(),7));
    }//GEN-LAST:event_jTextFieldSerie7KeyReleased

    private void jTextFieldSerie7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie7KeyTyped
        if(ComprobarSiEsUnNumero(jTextFieldSerie7.getText())==false)
            jTextFieldSerie7.setText("");             
        ComprobarEntrada(evt,jTextFieldSerie7.getText());
    }//GEN-LAST:event_jTextFieldSerie7KeyTyped

    private void jTextFieldSerie8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie8FocusLost
        if(ComprobarSiEsUnNumero(jTextFieldSerie8.getText())==false||jTextFieldSerie8.getText().equals("."))
            jTextFieldSerie8.setText("00.00");
        else
            jTextFieldSerie8.setText(DarFormato(jTextFieldSerie8.getText()));
        Promedio();
    }//GEN-LAST:event_jTextFieldSerie8FocusLost

    private void jTextFieldSerie8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie8KeyReleased
        jTextFieldSerie8.setText(ComprobarSiEstaEnRango(evt,jTextFieldSerie8.getText(),8));
    }//GEN-LAST:event_jTextFieldSerie8KeyReleased

    private void jTextFieldSerie8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie8KeyTyped
        if(ComprobarSiEsUnNumero(jTextFieldSerie8.getText())==false)
            jTextFieldSerie8.setText("");             
        ComprobarEntrada(evt,jTextFieldSerie8.getText());
    }//GEN-LAST:event_jTextFieldSerie8KeyTyped

    private void jTextFieldSerie9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie9FocusLost
        if(ComprobarSiEsUnNumero(jTextFieldSerie9.getText())==false||jTextFieldSerie9.getText().equals("."))
            jTextFieldSerie9.setText("00.00");
        else
            jTextFieldSerie9.setText(DarFormato(jTextFieldSerie9.getText()));
        Promedio();
    }//GEN-LAST:event_jTextFieldSerie9FocusLost

    private void jTextFieldSerie9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie9KeyReleased
        jTextFieldSerie9.setText(ComprobarSiEstaEnRango(evt,jTextFieldSerie9.getText(),9));
    }//GEN-LAST:event_jTextFieldSerie9KeyReleased

    private void jTextFieldSerie9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie9KeyTyped
        if(ComprobarSiEsUnNumero(jTextFieldSerie9.getText())==false)
            jTextFieldSerie9.setText("");             
        ComprobarEntrada(evt,jTextFieldSerie9.getText());
    }//GEN-LAST:event_jTextFieldSerie9KeyTyped

    private void jTextFieldSerie10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie10FocusLost
        if(ComprobarSiEsUnNumero(jTextFieldSerie10.getText())==false||jTextFieldSerie10.getText().equals("."))
            jTextFieldSerie10.setText("00.00");
        else
            jTextFieldSerie10.setText(DarFormato(jTextFieldSerie10.getText()));
        Promedio();
    }//GEN-LAST:event_jTextFieldSerie10FocusLost

    private void jTextFieldSerie10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie10KeyReleased
        jTextFieldSerie10.setText(ComprobarSiEstaEnRango(evt,jTextFieldSerie10.getText(),10));
    }//GEN-LAST:event_jTextFieldSerie10KeyReleased

    private void jTextFieldSerie10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerie10KeyTyped
        if(ComprobarSiEsUnNumero(jTextFieldSerie10.getText())==false)
            jTextFieldSerie10.setText("");             
        ComprobarEntrada(evt,jTextFieldSerie10.getText());
    }//GEN-LAST:event_jTextFieldSerie10KeyTyped

    private void jTextFieldSerie1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie1FocusGained
        jTextFieldSerie1.setText("");
    }//GEN-LAST:event_jTextFieldSerie1FocusGained

    private void jTextFieldSerie2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie2FocusGained
        jTextFieldSerie2.setText("");
    }//GEN-LAST:event_jTextFieldSerie2FocusGained

    private void jTextFieldSerie3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie3FocusGained
        jTextFieldSerie3.setText("");
    }//GEN-LAST:event_jTextFieldSerie3FocusGained

    private void jTextFieldSerie4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie4FocusGained
        jTextFieldSerie4.setText("");
    }//GEN-LAST:event_jTextFieldSerie4FocusGained

    private void jTextFieldSerie5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie5FocusGained
        jTextFieldSerie5.setText("");
    }//GEN-LAST:event_jTextFieldSerie5FocusGained

    private void jTextFieldSerie6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie6FocusGained
        jTextFieldSerie6.setText("");
    }//GEN-LAST:event_jTextFieldSerie6FocusGained

    private void jTextFieldSerie7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie7FocusGained
        jTextFieldSerie7.setText("");
    }//GEN-LAST:event_jTextFieldSerie7FocusGained

    private void jTextFieldSerie8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie8FocusGained
        jTextFieldSerie8.setText("");
    }//GEN-LAST:event_jTextFieldSerie8FocusGained

    private void jTextFieldSerie9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie9FocusGained
        jTextFieldSerie9.setText("");
    }//GEN-LAST:event_jTextFieldSerie9FocusGained

    private void jTextFieldSerie10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSerie10FocusGained
        jTextFieldSerie10.setText("");
    }//GEN-LAST:event_jTextFieldSerie10FocusGained

    private void Promedio(){
        double tabla[]=new double[10];
        double prom=0;
        tabla[0]=Double.parseDouble(jTextFieldSerie1.getText());
        tabla[1]=Double.parseDouble(jTextFieldSerie2.getText());
        tabla[2]=Double.parseDouble(jTextFieldSerie3.getText());
        tabla[3]=Double.parseDouble(jTextFieldSerie4.getText());
        tabla[4]=Double.parseDouble(jTextFieldSerie5.getText());
        tabla[5]=Double.parseDouble(jTextFieldSerie6.getText());
        tabla[6]=Double.parseDouble(jTextFieldSerie7.getText());
        tabla[7]=Double.parseDouble(jTextFieldSerie8.getText());
        tabla[8]=Double.parseDouble(jTextFieldSerie9.getText());
        tabla[9]=Double.parseDouble(jTextFieldSerie10.getText());
        for(int x=0; x < tabla.length; x++)
            if(tabla[x]<=100)
                prom+=tabla[x];
        prom/=10;
        jLabel12.setText(""+prom);
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
            java.util.logging.Logger.getLogger(Guia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guia1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextFieldSerie1;
    private javax.swing.JTextField jTextFieldSerie10;
    private javax.swing.JTextField jTextFieldSerie2;
    private javax.swing.JTextField jTextFieldSerie3;
    private javax.swing.JTextField jTextFieldSerie4;
    private javax.swing.JTextField jTextFieldSerie5;
    private javax.swing.JTextField jTextFieldSerie6;
    private javax.swing.JTextField jTextFieldSerie7;
    private javax.swing.JTextField jTextFieldSerie8;
    private javax.swing.JTextField jTextFieldSerie9;
    // End of variables declaration//GEN-END:variables
}
