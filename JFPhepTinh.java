package th6;

/**
 *
 * @author Ngoc Tram
 */
public class JFPhepTinh extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFPhepTinh.class.getName());

    public JFPhepTinh() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelA = new javax.swing.JLabel();
        jLabelB = new javax.swing.JLabel();
        jTextFieldA = new javax.swing.JTextField();
        jTextFieldB = new javax.swing.JTextField();
        jButtonCong = new javax.swing.JButton();
        jButtonTru = new javax.swing.JButton();
        jButtonNhan = new javax.swing.JButton();
        jButtonChia = new javax.swing.JButton();
        jTextFieldKetQua = new javax.swing.JTextField();
        jLabelKetQua = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelA.setText("a");

        jLabelB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelB.setText("b");

        jTextFieldA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAActionPerformed(evt);
            }
        });

        jTextFieldB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBActionPerformed(evt);
            }
        });

        jButtonCong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCong.setText("+");
        jButtonCong.setBorder(null);
        jButtonCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCongActionPerformed(evt);
            }
        });

        jButtonTru.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonTru.setText("-");
        jButtonTru.setBorder(null);
        jButtonTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTruActionPerformed(evt);
            }
        });

        jButtonNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonNhan.setText("*");
        jButtonNhan.setBorder(null);
        jButtonNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNhanActionPerformed(evt);
            }
        });

        jButtonChia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonChia.setText("/");
        jButtonChia.setBorder(null);
        jButtonChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChiaActionPerformed(evt);
            }
        });

        jTextFieldKetQua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldKetQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKetQuaActionPerformed(evt);
            }
        });

        jLabelKetQua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelKetQua.setText("Kết quả");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonTru, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonChia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelB, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                    .addComponent(jLabelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldB, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelKetQua)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTru, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKetQua))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAActionPerformed

    private void jTextFieldBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBActionPerformed

    private void jButtonCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCongActionPerformed
        try {
            double a = Double.parseDouble(jTextFieldA.getText());
            double b = Double.parseDouble(jTextFieldB.getText());
            double kq = a + b;
            jTextFieldKetQua.setText(String.valueOf(kq));
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Nhập số hợp lệ!");
        }
    }//GEN-LAST:event_jButtonCongActionPerformed

    private void jButtonTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTruActionPerformed
        try {
            double a = Double.parseDouble(jTextFieldA.getText());
            double b = Double.parseDouble(jTextFieldB.getText());
            double kq = a - b;
            jTextFieldKetQua.setText(String.valueOf(kq));
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Nhập số hợp lệ!");
        }
    }//GEN-LAST:event_jButtonTruActionPerformed

    private void jTextFieldKetQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKetQuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKetQuaActionPerformed

    private void jButtonNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNhanActionPerformed
        try {
            double a = Double.parseDouble(jTextFieldA.getText());
            double b = Double.parseDouble(jTextFieldB.getText());
            double kq = a * b;
            jTextFieldKetQua.setText(String.valueOf(kq));
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Nhập số hợp lệ!");
        }
    }//GEN-LAST:event_jButtonNhanActionPerformed

    private void jButtonChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChiaActionPerformed
        try {
        double a = Double.parseDouble(jTextFieldA.getText());
        double b = Double.parseDouble(jTextFieldB.getText());

        if (b == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Không thể chia cho 0!");
            return;
        }

        double kq = a / b;
        jTextFieldKetQua.setText(String.valueOf(kq));
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Nhập số hợp lệ!");
    }
    }//GEN-LAST:event_jButtonChiaActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JFPhepTinh().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChia;
    private javax.swing.JButton jButtonCong;
    private javax.swing.JButton jButtonNhan;
    private javax.swing.JButton jButtonTru;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelKetQua;
    private javax.swing.JTextField jTextFieldA;
    private javax.swing.JTextField jTextFieldB;
    private javax.swing.JTextField jTextFieldKetQua;
    // End of variables declaration//GEN-END:variables
}
