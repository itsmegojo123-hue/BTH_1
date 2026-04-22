
package Bai1;

import javax.swing.*;
import java.awt.event.*;
public class SoNgayTrong1Thang{
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Số ngày trong tháng");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Nhập tháng
        JLabel lblThang = new JLabel("Tháng:");
        lblThang.setBounds(30, 30, 100, 25);
        JTextField txtThang = new JTextField();
        txtThang.setBounds(130, 30, 150, 25);

        // Nhập năm
        JLabel lblNam = new JLabel("Năm:");
        lblNam.setBounds(30, 70, 100, 25);
        JTextField txtNam = new JTextField();
        txtNam.setBounds(130, 70, 150, 25);

        // Kết quả
        JLabel lblKQ = new JLabel("Kết quả: ");
        lblKQ.setBounds(30, 150, 250, 25);

        // Button
        JButton btnTinh = new JButton("Xem số ngày");
        btnTinh.setBounds(90, 110, 150, 30);

        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int thang = Integer.parseInt(txtThang.getText());
                    int nam = Integer.parseInt(txtNam.getText());
                    int soNgay;

                    switch (thang) {
                        case 1: case 3: case 5: case 7:
                        case 8: case 10: case 12:
                            soNgay = 31;
                            break;
                        case 4: case 6: case 9: case 11:
                            soNgay = 30;
                            break;
                        case 2:
                            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0))
                                soNgay = 29;
                            else
                                soNgay = 28;
                            break;
                        default:
                            lblKQ.setText("Tháng không hợp lệ!");
                            return;
                    }

                    lblKQ.setText("Tháng " + thang + " có " + soNgay + " ngày");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!");
                }
            }
        });

        frame.add(lblThang);
        frame.add(txtThang);
        frame.add(lblNam);
        frame.add(txtNam);
        frame.add(btnTinh);
        frame.add(lblKQ);

        frame.setVisible(true);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

