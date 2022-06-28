/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static view.LoginTela.id;

/**
 *
 * @author Outro eu
 */
public class RelatorioMovimentacao extends javax.swing.JFrame {

    DefaultTableModel defTable;

    Color LIGHT_GREEN = new Color(179, 208, 102);
    Color HARD_GREEN = new Color(68, 128, 64);
    Color GREEN_BLUE = new Color(19, 96, 80);
    Color MY_YELLOW = new Color(253, 235, 91);
    Color MY_RED = new Color(255, 89, 49);

    /**
     * Creates new form RelatorioMovimentacao
     */
    public RelatorioMovimentacao() {
        initComponents();
        
        getContentPane().setBackground(GREEN_BLUE);
        lblData.setVisible(false);
        lblCategoria.setVisible(false);
        txtData.setVisible(false);
        txtCategoria.setVisible(false);
        defTable = (DefaultTableModel) tblProdutos.getModel();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbFiltro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        lblData = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setTitle("MOVIMENTAÇÃO");
        getContentPane().setLayout(null);

        cmbFiltro.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geral", "Entradas", "Saidas", "Data", "Categoria" }));
        cmbFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFiltroItemStateChanged(evt);
            }
        });
        cmbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltroActionPerformed(evt);
            }
        });
        getContentPane().add(cmbFiltro);
        cmbFiltro.setBounds(110, 30, 130, 40);

        tblProdutos.setAutoCreateRowSorter(true);
        tblProdutos.setBackground(new java.awt.Color(179, 208, 102));
        tblProdutos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Valor", "Categoria", "Data", "Tipo Mov."
            }
        ));
        tblProdutos.setCellSelectionEnabled(true);
        tblProdutos.setGridColor(new java.awt.Color(255, 255, 204));
        jScrollPane1.setViewportView(tblProdutos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 770, 160);

        lblData.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data:");
        getContentPane().add(lblData);
        lblData.setBounds(30, 110, 70, 20);

        lblCategoria.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setText("Categoria:");
        lblCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblCategoriaKeyPressed(evt);
            }
        });
        getContentPane().add(lblCategoria);
        lblCategoria.setBounds(30, 110, 80, 16);

        txtCategoria.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyPressed(evt);
            }
        });
        getContentPane().add(txtCategoria);
        txtCategoria.setBounds(110, 100, 140, 30);

        btnBuscar.setBackground(new java.awt.Color(179, 208, 102));
        btnBuscar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(260, 40, 110, 30);

        jSeparator1.setForeground(new java.awt.Color(179, 208, 102));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 80, 210, 20);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filtrar por:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 80, 16);

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDataKeyPressed(evt);
            }
        });
        getContentPane().add(txtData);
        txtData.setBounds(110, 100, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bag-money.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, -30, 370, 350);

        setSize(new java.awt.Dimension(809, 432));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFiltroItemStateChanged
        String tipo;
        tipo = cmbFiltro.getSelectedItem().toString();
        if (tipo.equalsIgnoreCase("Geral")) {
            txtCategoria.setVisible(false);
            lblCategoria.setVisible(false);
            txtData.setVisible(false);
            lblData.setVisible(false);
            defTable.setRowCount(0);
        } else if (tipo.equalsIgnoreCase("Entradas")) {
            txtData.setVisible(false);
            lblData.setVisible(false);
            txtCategoria.setVisible(false);
            lblCategoria.setVisible(false);
            defTable.setRowCount(0);
        } else if (tipo.equalsIgnoreCase("Saídas")) {
            txtData.setVisible(false);
            lblData.setVisible(false);
            txtCategoria.setVisible(false);
            lblCategoria.setVisible(false);
            defTable.setRowCount(0);
        } else if (tipo.equalsIgnoreCase("Data")) {
            txtData.setVisible(true);
            lblData.setVisible(true);
            txtCategoria.setVisible(false);
            lblCategoria.setVisible(false);
            
            txtData.requestFocus();
            defTable.setRowCount(0);
        } else if (tipo.equalsIgnoreCase("Categoria")) {
            txtData.setVisible(false);
            lblData.setVisible(false);
            txtCategoria.setVisible(true);
            lblCategoria.setVisible(true);
            
            txtCategoria.requestFocus();
            defTable.setRowCount(0);
        }
    }//GEN-LAST:event_cmbFiltroItemStateChanged

    private void cmbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiltroActionPerformed
        
    }//GEN-LAST:event_cmbFiltroActionPerformed

    private void lblCategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblCategoriaKeyPressed

    }//GEN-LAST:event_lblCategoriaKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String tipoFiltro;
        tipoFiltro = cmbFiltro.getSelectedItem().toString();
        //2 - Conectar com o Banco de dados
        try {
            Connection conexao;
            PreparedStatement st;
            ResultSet resultado;

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/moneycontrol", "root", "12345");
            //Verifica o conteúdo do comboBox de tipo de relatório
            if (tipoFiltro.equalsIgnoreCase("Geral")) {
                st = conexao.prepareStatement("SELECT * FROM entrada WHERE fk_id_usuario = ?");
                st.setInt(1, id);
                resultado = st.executeQuery();
                
                defTable.setRowCount(0);
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("valor_entrada"), resultado.getString("categoria_entrada"), resultado.getString("data_entrada"), "Entrada"};
                    defTable.addRow(linha);
                }
                
                st = conexao.prepareStatement("SELECT * FROM saida WHERE fk_id_usuario = ?");
                st.setInt(1, id);
                resultado = st.executeQuery();

                while (resultado.next()) {
                    Object[] linha = {resultado.getString("valor_saida"), resultado.getString("categoria_saida"), resultado.getString("data_saida"), "Saída"};
                    defTable.addRow(linha);
                }
            } else if (tipoFiltro.equalsIgnoreCase("Entradas")) {
                st = conexao.prepareStatement("SELECT * FROM entrada WHERE fk_id_usuario = ?");
                st.setInt(1, id);
                resultado = st.executeQuery();
                
                defTable.setRowCount(0);
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("valor_entrada"), resultado.getString("categoria_entrada"), resultado.getString("data_entrada"), "Entrada"};
                    defTable.addRow(linha);
                }
            } else if (tipoFiltro.equalsIgnoreCase("Saidas")) {
                st = conexao.prepareStatement("SELECT * FROM saida WHERE fk_id_usuario = ?");
                st.setInt(1, id);
                resultado = st.executeQuery();

                defTable.setRowCount(0);
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("valor_saida"), resultado.getString("categoria_saida"), resultado.getString("data_saida"), "Saída"};
                    defTable.addRow(linha);
                }
            } else if (tipoFiltro.equalsIgnoreCase("Data")) {
                st = conexao.prepareStatement("SELECT * FROM entrada WHERE data_entrada LIKE ? AND fk_id_usuario = ?");
                st.setString(1, "%" + txtData.getText() + "%");
                st.setInt(2, id);
                resultado = st.executeQuery();
                
                defTable.setRowCount(0);
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("valor_entrada"), resultado.getString("categoria_entrada"), resultado.getString("data_entrada"), "Entrada"};
                    defTable.addRow(linha);
                }
                
                st = conexao.prepareStatement("SELECT * FROM saida WHERE data_saida LIKE ? AND fk_id_usuario = ?");
                st.setString(1, "%" + txtData.getText() + "%");
                st.setInt(2, id);
                resultado = st.executeQuery();
                
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("valor_saida"), resultado.getString("categoria_saida"), resultado.getString("data_saida"), "Saída"};
                    defTable.addRow(linha);
                }
                
                txtData.setText("");
            } else if (tipoFiltro.equalsIgnoreCase("Categoria")) {
                st = conexao.prepareStatement("SELECT * FROM entrada WHERE categoria_entrada LIKE ? AND fk_id_usuario = ?");
                st.setString(1, "%" + txtCategoria.getText() + "%");
                st.setInt(2, id);
                resultado = st.executeQuery();
                
                defTable.setRowCount(0);
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("valor_entrada"), resultado.getString("categoria_entrada"), resultado.getString("data_entrada"), "Entrada"};
                    defTable.addRow(linha);
                }
                
                st = conexao.prepareStatement("SELECT * FROM saida WHERE categoria_saida LIKE ? AND fk_id_usuario = ?");
                st.setString(1, "%" + txtCategoria.getText() + "%");
                st.setInt(2, id);
                resultado = st.executeQuery();
                
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("valor_saida"), resultado.getString("categoria_saida"), resultado.getString("data_saida"), "Saída"};
                    defTable.addRow(linha);
                }
                
                txtCategoria.setText("");
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto" + ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_txtCategoriaKeyPressed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed

    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void txtDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_txtDataKeyPressed

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
            java.util.logging.Logger.getLogger(RelatorioMovimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioMovimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioMovimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioMovimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioMovimentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblData;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JFormattedTextField txtData;
    // End of variables declaration//GEN-END:variables
}