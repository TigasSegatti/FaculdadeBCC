/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package l08.View;

import javax.swing.JOptionPane;
import l08.Aluno;
import l08.Professor;
import l08.Professor;
import l08.Titulacao;
import l08.Titulacao;
import l08.Turma;
import l08.Turma;
import l08.Turno;
import l08.Turno;

/**
 *
 * @author tiago_segatti
 */
public class TelaPrincipal extends javax.swing.JFrame {

    protected Turma turma;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        btTurno = new javax.swing.ButtonGroup();
        btTitulacao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrbMatutino = new javax.swing.JRadioButton();
        jrbVespertino = new javax.swing.JRadioButton();
        jrbNoturno = new javax.swing.JRadioButton();
        jtfDisciplina = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfNomeProfessor = new javax.swing.JTextField();
        jtfEmailProfessor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jrbGraducao = new javax.swing.JRadioButton();
        jrbMestrado = new javax.swing.JRadioButton();
        jrbDoutorado = new javax.swing.JRadioButton();
        jbtIncluirAluno = new javax.swing.JButton();
        jbtListarDadosTurma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Turma"));

        jLabel1.setText("Disciplina:");

        jLabel2.setText("Turno:");

        btTurno.add(jrbMatutino);
        jrbMatutino.setText("Matutino");
        jrbMatutino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMatutinoActionPerformed(evt);
            }
        });

        btTurno.add(jrbVespertino);
        jrbVespertino.setText("Vespertino");
        jrbVespertino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbVespertinoActionPerformed(evt);
            }
        });

        btTurno.add(jrbNoturno);
        jrbNoturno.setText("Noturno");
        jrbNoturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoturnoActionPerformed(evt);
            }
        });

        jtfDisciplina.setPreferredSize(new java.awt.Dimension(80, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbMatutino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbVespertino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbNoturno)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jrbMatutino)
                    .addComponent(jrbVespertino)
                    .addComponent(jrbNoturno))
                .addGap(25, 25, 25))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Professor"));

        jLabel3.setText("Nome:");

        jLabel4.setText("Email:");

        jtfNomeProfessor.setPreferredSize(new java.awt.Dimension(80, 25));
        jtfNomeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeProfessorActionPerformed(evt);
            }
        });

        jtfEmailProfessor.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel5.setText("Titulação:");

        btTitulacao.add(jrbGraducao);
        jrbGraducao.setText("Graduação");
        jrbGraducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbGraducaoActionPerformed(evt);
            }
        });

        btTitulacao.add(jrbMestrado);
        jrbMestrado.setText("Mestrado");
        jrbMestrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMestradoActionPerformed(evt);
            }
        });

        btTitulacao.add(jrbDoutorado);
        jrbDoutorado.setText("Doutorado");
        jrbDoutorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDoutoradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfEmailProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbGraducao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbMestrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbDoutorado)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfEmailProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jrbGraducao)
                    .addComponent(jrbMestrado)
                    .addComponent(jrbDoutorado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtIncluirAluno.setText("Incluír Aluno");
        jbtIncluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIncluirAlunoActionPerformed(evt);
            }
        });

        jbtListarDadosTurma.setText("Listar Dados da Turma");
        jbtListarDadosTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtListarDadosTurmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jbtIncluirAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtListarDadosTurma)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtIncluirAluno)
                    .addComponent(jbtListarDadosTurma))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbMatutinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMatutinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbMatutinoActionPerformed

    private void jrbVespertinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbVespertinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbVespertinoActionPerformed

    private void jrbNoturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoturnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbNoturnoActionPerformed

    private void jtfNomeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeProfessorActionPerformed

    private void jrbGraducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbGraducaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbGraducaoActionPerformed

    private void jrbMestradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMestradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbMestradoActionPerformed

    private void jrbDoutoradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDoutoradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbDoutoradoActionPerformed
    private Turno getTurnoSelecionado() {
        if (jrbMatutino.isSelected()) {
            return Turno.MATUTINO; // Assumindo que você tenha um enum Turno
        } else if (jrbVespertino.isSelected()) {
            return Turno.VESPERTINO;
        } else if (jrbNoturno.isSelected()) {
            return Turno.NOTURNO;
        }
        return null; // Ou lance uma exceção se nenhum turno estiver selecionado
    }

    private Titulacao getTitulacaoSelecionada() {

        if (jrbGraducao.isSelected()) {
            return Titulacao.GRADUACAO; // Assumindo que você tenha um enum Titulacao
        } else if (jrbMestrado.isSelected()) {
            return Titulacao.MESTRADO;
        } else if (jrbDoutorado.isSelected()) {
            return Titulacao.DOUTORADO;
        }
        return null; // Ou lance uma exceção se nenhuma titulação estiver selecionada
    }
    private void jbtIncluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtIncluirAlunoActionPerformed
        try {
            if (turma == null) {
                Turma turma = new Turma(jtfDisciplina.getText(), getTurnoSelecionado(), new Professor(jtfNomeProfessor.getText(),
                        jtfEmailProfessor.getText(), Titulacao.GRADUACAO));
            }
            InserirAlunoGUI inserirAluno = new InserirAlunoGUI(this);
            inserirAluno.setVisible(true);

            //  Aluno aluno= new Aluno
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jbtIncluirAlunoActionPerformed

    private void jbtListarDadosTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtListarDadosTurmaActionPerformed
        Relatorio relatorio = new Relatorio(this);
        relatorio.setVisible(true);
    }//GEN-LAST:event_jbtListarDadosTurmaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btTitulacao;
    private javax.swing.ButtonGroup btTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtIncluirAluno;
    private javax.swing.JButton jbtListarDadosTurma;
    private javax.swing.JRadioButton jrbDoutorado;
    private javax.swing.JRadioButton jrbGraducao;
    private javax.swing.JRadioButton jrbMatutino;
    private javax.swing.JRadioButton jrbMestrado;
    private javax.swing.JRadioButton jrbNoturno;
    private javax.swing.JRadioButton jrbVespertino;
    private javax.swing.JTextField jtfDisciplina;
    private javax.swing.JTextField jtfEmailProfessor;
    private javax.swing.JTextField jtfNomeProfessor;
    // End of variables declaration//GEN-END:variables
}