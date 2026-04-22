
package Bai1;
import javax.swing.*;
import java.awt.event.*;

public class DienTichHinhChuNhat {
    
  
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

    public static void main(String[] args) {
        // Tạo frame
        JFrame frame = new JFrame("Tính diện tích hình chữ nhật");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Label + input chiều dài
        JLabel lblDai = new JLabel("Chiều dài:");
        lblDai.setBounds(30, 30, 100, 25);
        JTextField txtDai = new JTextField();
        txtDai.setBounds(130, 30, 150, 25);

        // Label + input chiều rộng
        JLabel lblRong = new JLabel("Chiều rộng:");
        lblRong.setBounds(30, 70, 100, 25);
        JTextField txtRong = new JTextField();
        txtRong.setBounds(130, 70, 150, 25);

        // Label kết quả
        JLabel lblKQ = new JLabel("Diện tích: ");
        lblKQ.setBounds(30, 150, 250, 25);

        // Button tính
        JButton btnTinh = new JButton("Tính");
        btnTinh.setBounds(100, 110, 120, 30);

        // Xử lý sự kiện
        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double dai = Double.parseDouble(txtDai.getText());
                    double rong = Double.parseDouble(txtRong.getText());
                    double dienTich = dai * rong;
                    lblKQ.setText("Diện tích: " + dienTich);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!");
                }
            }
        });

        // Thêm vào frame
        frame.add(lblDai);
        frame.add(txtDai);
        frame.add(lblRong);
        frame.add(txtRong);
        frame.add(btnTinh);
        frame.add(lblKQ);

        // Hiển thị
        frame.setVisible(true);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

