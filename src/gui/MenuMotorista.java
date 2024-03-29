/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import gui.Login;
import gui.CadastroUsuario;
import gui.TabelaDePagamento;
import gui.CadastroVeiculo;
import model.Usuario;
/**
 *
 * @author User
 */
public class MenuMotorista extends javax.swing.JFrame {

    /**
     * Creates new form MenuMotorista
     */
    public MenuMotorista() {
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Menu do Motorista");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Button5 = new javax.swing.JPanel();
        Indicator5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Button7 = new javax.swing.JPanel();
        Indicator7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        Button9 = new javax.swing.JPanel();
        Indicator9 = new javax.swing.JPanel();
        Button10 = new javax.swing.JPanel();
        Indicator10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn_close = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 39, -1, -1));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 57, -1, -1));

        jPanel14.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        jPanel13.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 40));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-usuário-homem-com-círculo-96.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 100, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button5.setBackground(new java.awt.Color(255, 255, 255));
        Button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button5MouseExited(evt);
            }
        });

        Indicator5.setBackground(new java.awt.Color(204, 0, 204));
        Indicator5.setOpaque(false);

        javax.swing.GroupLayout Indicator5Layout = new javax.swing.GroupLayout(Indicator5);
        Indicator5.setLayout(Indicator5Layout);
        Indicator5Layout.setHorizontalGroup(
            Indicator5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator5Layout.setVerticalGroup(
            Indicator5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-página-inicial-36.png"))); // NOI18N
        jLabel6.setText("Home");
        jLabel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel6KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Button5Layout = new javax.swing.GroupLayout(Button5);
        Button5.setLayout(Button5Layout);
        Button5Layout.setHorizontalGroup(
            Button5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button5Layout.createSequentialGroup()
                .addComponent(Indicator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(0, 111, Short.MAX_VALUE))
        );
        Button5Layout.setVerticalGroup(
            Button5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(Button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 160, 232, -1));

        Button7.setBackground(new java.awt.Color(255, 255, 255));
        Button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button7MouseExited(evt);
            }
        });

        Indicator7.setBackground(new java.awt.Color(204, 0, 204));
        Indicator7.setOpaque(false);

        javax.swing.GroupLayout Indicator7Layout = new javax.swing.GroupLayout(Indicator7);
        Indicator7.setLayout(Indicator7Layout);
        Indicator7Layout.setHorizontalGroup(
            Indicator7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator7Layout.setVerticalGroup(
            Indicator7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button7Layout = new javax.swing.GroupLayout(Button7);
        Button7.setLayout(Button7Layout);
        Button7Layout.setHorizontalGroup(
            Button7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button7Layout.createSequentialGroup()
                .addComponent(Indicator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        Button7Layout.setVerticalGroup(
            Button7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(Button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 232, -1));
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 39, -1, -1));
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 57, -1, -1));

        jPanel15.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        jPanel16.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 40));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-usuário-homem-com-círculo-96.png"))); // NOI18N
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 100, 90));

        Button9.setBackground(new java.awt.Color(255, 255, 255));
        Button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button9MouseExited(evt);
            }
        });

        Indicator9.setBackground(new java.awt.Color(204, 0, 204));
        Indicator9.setOpaque(false);

        javax.swing.GroupLayout Indicator9Layout = new javax.swing.GroupLayout(Indicator9);
        Indicator9.setLayout(Indicator9Layout);
        Indicator9Layout.setHorizontalGroup(
            Indicator9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator9Layout.setVerticalGroup(
            Indicator9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button9Layout = new javax.swing.GroupLayout(Button9);
        Button9.setLayout(Button9Layout);
        Button9Layout.setHorizontalGroup(
            Button9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button9Layout.createSequentialGroup()
                .addComponent(Indicator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        Button9Layout.setVerticalGroup(
            Button9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(Button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 232, -1));

        Button10.setBackground(new java.awt.Color(255, 255, 255));
        Button10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button10MouseExited(evt);
            }
        });

        Indicator10.setBackground(new java.awt.Color(204, 0, 204));
        Indicator10.setOpaque(false);

        javax.swing.GroupLayout Indicator10Layout = new javax.swing.GroupLayout(Indicator10);
        Indicator10.setLayout(Indicator10Layout);
        Indicator10Layout.setHorizontalGroup(
            Indicator10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator10Layout.setVerticalGroup(
            Indicator10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button10Layout = new javax.swing.GroupLayout(Button10);
        Button10.setLayout(Button10Layout);
        Button10Layout.setHorizontalGroup(
            Button10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button10Layout.createSequentialGroup()
                .addComponent(Indicator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        Button10Layout.setVerticalGroup(
            Button10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(Button10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 232, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-relatório-gráfico-36.png"))); // NOI18N
        jLabel10.setText("Tabela de Alunos");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 200, 40));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 204, 204));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-transporte-terrestre-36.png"))); // NOI18N
        jLabel31.setText("Cadastro de Veículos");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-document-writer-36.png"))); // NOI18N
        jLabel8.setText("Cadastro de clientes");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 850));

        jPanel2.setBackground(new java.awt.Color(247, 247, 247));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("BEM VINDO DE VOLTA ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 23, 220, 37);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 204));
        jLabel16.setText("E-mails recentes");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(770, 170, 100, 16);

        jPanel8.setBackground(new java.awt.Color(0, 204, 204));

        btn_close.setBackground(new java.awt.Color(96, 83, 150));
        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("X");
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        jLabelMin.setBackground(new java.awt.Color(204, 204, 204));
        jLabelMin.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMin))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8);
        jPanel8.setBounds(890, 0, 190, 41);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(96, 83, 150));
        jPanel2.add(jLabel13);
        jLabel13.setBounds(30, 66, 270, 30);

        jPanel6.setBackground(new java.awt.Color(247, 247, 247));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 204));
        jLabel14.setText("Oscar");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 255, 255));
        jLabel15.setText("<html> Olá usuário, qualquer duvida entre em contato ! </html>");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 204, 204));
        jLabel17.setText("Omar");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 255, 255));
        jLabel18.setText("<html> Temos uma novidade importante sobre nosso sistema. Vem dar uma olhada!</html>");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(770, 200, 310, 350);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/logo sem fundo (aumentada, sem letra)_1.png"))); // NOI18N
        jPanel2.add(jLabel26);
        jLabel26.setBounds(70, 150, 690, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1081, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

    }//GEN-LAST:event_jPanel2MousePressed

    private void Button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseClicked

    }//GEN-LAST:event_Button5MouseClicked

    private void Button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5MouseEntered

    private void Button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5MouseExited

    private void Button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseClicked

    }//GEN-LAST:event_Button7MouseClicked

    private void Button7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button7MouseEntered

    private void Button7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button7MouseExited

    private void Button9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button9MouseClicked

    private void Button9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button9MouseEntered

    private void Button9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button9MouseExited

    private void Button10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button10MouseClicked

    private void Button10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button10MouseEntered

    private void Button10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button10MouseExited

    private void jLabel6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel6KeyPressed
      MenuMotorista menumotora = new MenuMotorista();
    menumotora.show();
    }//GEN-LAST:event_jLabel6KeyPressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        CadastroUsuario cadastrouser = new CadastroUsuario();
        cadastrouser.show();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
      TabelaDePagamento tp = new TabelaDePagamento();
        tp.show();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
   CadastroVeiculo cadastroveic = new CadastroVeiculo();
        cadastroveic.show();
    }//GEN-LAST:event_jLabel31MouseClicked

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
            java.util.logging.Logger.getLogger(MenuMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMotorista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Button10;
    private javax.swing.JPanel Button5;
    private javax.swing.JPanel Button7;
    private javax.swing.JPanel Button9;
    private javax.swing.JPanel Indicator10;
    private javax.swing.JPanel Indicator5;
    private javax.swing.JPanel Indicator7;
    private javax.swing.JPanel Indicator9;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
