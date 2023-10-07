package java3.Panels;

import java4.Cadastros.Cadastro_Pets_JIFF;

public class Painel_Pets_JIFF extends javax.swing.JInternalFrame {

    public Painel_Pets_JIFF() {
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

        DesktopPaneControl_Pets = new javax.swing.JDesktopPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        TABLE_PETS___ = new javax.swing.JTable();
        BOTAO_NOVO_PET___ = new javax.swing.JButton();
        BOTAO_ALTERAR_PET___ = new javax.swing.JButton();
        BOTAO_DELETAR_PET___ = new javax.swing.JButton();
        BOTAO_SAIR_PET___ = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        DesktopPaneControl_Pets.setBackground(new java.awt.Color(161, 121, 82));
        DesktopPaneControl_Pets.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "  PETS  ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gill Sans Ultra Bold", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        TABLE_PETS___.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(TABLE_PETS___);

        DesktopPaneControl_Pets.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPaneControl_PetsLayout = new javax.swing.GroupLayout(DesktopPaneControl_Pets);
        DesktopPaneControl_Pets.setLayout(DesktopPaneControl_PetsLayout);
        DesktopPaneControl_PetsLayout.setHorizontalGroup(
            DesktopPaneControl_PetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopPaneControl_PetsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        DesktopPaneControl_PetsLayout.setVerticalGroup(
            DesktopPaneControl_PetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopPaneControl_PetsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        BOTAO_NOVO_PET___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_NOVO_PET___.setText("Novo");
        BOTAO_NOVO_PET___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_NOVO_PET___ActionPerformed(evt);
            }
        });

        BOTAO_ALTERAR_PET___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_ALTERAR_PET___.setText("Alterar");
        BOTAO_ALTERAR_PET___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_ALTERAR_PET___ActionPerformed(evt);
            }
        });

        BOTAO_DELETAR_PET___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_DELETAR_PET___.setText("Deletar");
        BOTAO_DELETAR_PET___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_DELETAR_PET___ActionPerformed(evt);
            }
        });

        BOTAO_SAIR_PET___.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BOTAO_SAIR_PET___.setText("Sair");
        BOTAO_SAIR_PET___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_SAIR_PET___ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BOTAO_NOVO_PET___, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTAO_DELETAR_PET___, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTAO_ALTERAR_PET___, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTAO_SAIR_PET___, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DesktopPaneControl_Pets)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopPaneControl_Pets)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(BOTAO_NOVO_PET___)
                .addGap(18, 18, 18)
                .addComponent(BOTAO_ALTERAR_PET___)
                .addGap(18, 18, 18)
                .addComponent(BOTAO_DELETAR_PET___)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(BOTAO_SAIR_PET___)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTAO_NOVO_PET___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_NOVO_PET___ActionPerformed
        Cadastro_Pets_JIFF obj = new Cadastro_Pets_JIFF();
        DesktopPaneControl_Pets.add(obj).setVisible(true);
    }//GEN-LAST:event_BOTAO_NOVO_PET___ActionPerformed

    private void BOTAO_ALTERAR_PET___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_ALTERAR_PET___ActionPerformed
        
    }//GEN-LAST:event_BOTAO_ALTERAR_PET___ActionPerformed

    private void BOTAO_DELETAR_PET___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_DELETAR_PET___ActionPerformed
        
    }//GEN-LAST:event_BOTAO_DELETAR_PET___ActionPerformed

    private void BOTAO_SAIR_PET___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_SAIR_PET___ActionPerformed
        this.dispose();
    }//GEN-LAST:event_BOTAO_SAIR_PET___ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAO_ALTERAR_PET___;
    private javax.swing.JButton BOTAO_DELETAR_PET___;
    private javax.swing.JButton BOTAO_NOVO_PET___;
    private javax.swing.JButton BOTAO_SAIR_PET___;
    private javax.swing.JDesktopPane DesktopPaneControl_Pets;
    private javax.swing.JTable TABLE_PETS___;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
