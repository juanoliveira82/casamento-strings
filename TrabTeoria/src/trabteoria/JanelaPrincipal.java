package trabteoria;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author Juan Carlos Cardoso de Oliveira
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    public JanelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpOpcoes = new javax.swing.ButtonGroup();
        rbPrefixo = new javax.swing.JRadioButton();
        rbContem = new javax.swing.JRadioButton();
        rbSufixo = new javax.swing.JRadioButton();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPalavra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casamento de Strings");
        setResizable(false);

        btnGrpOpcoes.add(rbPrefixo);
        rbPrefixo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rbPrefixo.setSelected(true);
        rbPrefixo.setText("Prefixo");

        btnGrpOpcoes.add(rbContem);
        rbContem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rbContem.setText("Contém");

        btnGrpOpcoes.add(rbSufixo);
        rbSufixo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rbSufixo.setText("Sufixo");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitle.setText("Casamento de Strings");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Palavra:");

        txtPalavra.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Busca:");

        txtBusca.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnVerificar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        lblResultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbPrefixo)
                                    .addComponent(rbContem)
                                    .addComponent(rbSufixo)
                                    .addComponent(btnVerificar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblTitle)))
                        .addGap(0, 132, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBusca)
                            .addComponent(txtPalavra))))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rbPrefixo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbContem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbSufixo)
                .addGap(18, 18, 18)
                .addComponent(btnVerificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        char[] palavra = txtPalavra.getText().toCharArray();
        char[] checar = txtBusca.getText().toCharArray();
        if(rbPrefixo.isSelected()){
            for(int i=0; i<checar.length; i++){
                if(checar[i]==palavra[i]){
                    System.out.println(checar[i] +"="+ palavra[i]);
                } else {
                    lblResultado.setText("Não é prefixo");
                    break;
                }
                if(i+1 == checar.length){
                    lblResultado.setText(txtBusca.getText()+" é prefixo de "+txtPalavra.getText());
                }
            }
        } else if(rbSufixo.isSelected()){
            
            
            
            
            
            // JUAN = 3
            // JU = 1
            
            
            
            for(int i=checar.length+1; i>0; i--){
                for(int j=palavra.length+1; i>0; i--){
                    
                    
                
                    if(checar[i]==palavra[i]){
                        System.out.println(checar[i] +"="+ palavra[i]);
                    } else {
                        lblResultado.setText("Não é sufixo");
                        break;
                    }
                    if(i+1 == checar.length){
                        lblResultado.setText(checar+" é sufixo de "+palavra);
                    }
                }
            }
            
            
            
            
            
            
            
            
            
            
        } else if(rbContem.isSelected()){
            
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (IllegalAccessException e) {
            // TODO
        } catch (ClassNotFoundException e) {
            // TODO
        } catch (InstantiationException e) {
            // TODO
        } catch (UnsupportedLookAndFeelException e) {
            // TODO
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpOpcoes;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rbContem;
    private javax.swing.JRadioButton rbPrefixo;
    private javax.swing.JRadioButton rbSufixo;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtPalavra;
    // End of variables declaration//GEN-END:variables
}
