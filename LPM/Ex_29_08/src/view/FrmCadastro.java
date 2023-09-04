package view;
import control.AtletaControl;
import exception.StringVaziaException;
import exception.NegativoException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Atleta;

public class FrmCadastro extends javax.swing.JFrame {

    private AtletaControl ac;
    
    public FrmCadastro() {
        ac = new AtletaControl();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        pnlMain = new javax.swing.JPanel();
        pnlBuscar = new javax.swing.JPanel();
        rbCod = new javax.swing.JRadioButton();
        rbNome = new javax.swing.JRadioButton();
        rbPeso = new javax.swing.JRadioButton();
        rbAltura = new javax.swing.JRadioButton();
        rbIdade = new javax.swing.JRadioButton();
        btnBuscar = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        pnlEst = new javax.swing.JPanel();
        btnMostrarMedia = new javax.swing.JButton();
        btnMostrarAlto = new javax.swing.JButton();
        btnMostrarMmIdade = new javax.swing.JButton();
        lblEst = new javax.swing.JLabel();
        lblMedia = new javax.swing.JLabel();
        lblAlto = new javax.swing.JLabel();
        lblMmIdade = new javax.swing.JLabel();
        pnlCadastro = new javax.swing.JPanel();
        txtAltura = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        lblCod = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        lblCadastro = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtExcluir = new javax.swing.JTextField();
        lblExcluir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        pnlBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        rbCod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbCod.setText("Código");
        rbCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCodActionPerformed(evt);
            }
        });

        rbNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbNome.setText("Nome");
        rbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNomeActionPerformed(evt);
            }
        });

        rbPeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbPeso.setText("Peso");
        rbPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPesoActionPerformed(evt);
            }
        });

        rbAltura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbAltura.setText("Altura");
        rbAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlturaActionPerformed(evt);
            }
        });

        rbIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbIdade.setText("Idade");
        rbIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIdadeActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBuscar.setText("Buscar atletas");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Selecione um mêtodo de busca:");

        txtBusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlBuscarLayout = new javax.swing.GroupLayout(pnlBuscar);
        pnlBuscar.setLayout(pnlBuscarLayout);
        pnlBuscarLayout.setHorizontalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBuscarLayout.createSequentialGroup()
                                .addComponent(rbCod)
                                .addGap(18, 18, 18)
                                .addComponent(rbNome)
                                .addGap(18, 18, 18)
                                .addComponent(rbPeso)
                                .addGap(18, 18, 18)
                                .addComponent(rbAltura)
                                .addGap(18, 18, 18)
                                .addComponent(rbIdade))
                            .addComponent(jLabel4)
                            .addGroup(pnlBuscarLayout.createSequentialGroup()
                                .addComponent(lblBuscar)
                                .addGap(142, 142, 142)
                                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBuscarLayout.setVerticalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCod)
                    .addComponent(rbNome)
                    .addComponent(rbPeso)
                    .addComponent(rbAltura)
                    .addComponent(rbIdade))
                .addGap(31, 31, 31)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18))
        );

        pnlEst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnMostrarMedia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMostrarMedia.setText("Mostrar");
        btnMostrarMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarMediaActionPerformed(evt);
            }
        });

        btnMostrarAlto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMostrarAlto.setText("Mostrar");
        btnMostrarAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAltoActionPerformed(evt);
            }
        });

        btnMostrarMmIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMostrarMmIdade.setText("Mostrar");
        btnMostrarMmIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarMmIdadeActionPerformed(evt);
            }
        });

        lblEst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEst.setText("Estatísticas");

        lblMedia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMedia.setText("Média do peso dos atletas:");

        lblAlto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAlto.setText("Atleta mais alto:");

        lblMmIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMmIdade.setText("Quantidade de atletas maiores e menores de idade:");

        javax.swing.GroupLayout pnlEstLayout = new javax.swing.GroupLayout(pnlEst);
        pnlEst.setLayout(pnlEstLayout);
        pnlEstLayout.setHorizontalGroup(
            pnlEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEstLayout.createSequentialGroup()
                        .addComponent(lblMedia)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarMedia))
                    .addGroup(pnlEstLayout.createSequentialGroup()
                        .addComponent(lblAlto)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarAlto))
                    .addGroup(pnlEstLayout.createSequentialGroup()
                        .addComponent(lblMmIdade)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarMmIdade))
                    .addComponent(lblEst))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        pnlEstLayout.setVerticalGroup(
            pnlEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEst)
                .addGap(44, 44, 44)
                .addGroup(pnlEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedia)
                    .addComponent(btnMostrarMedia))
                .addGap(28, 28, 28)
                .addGroup(pnlEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlto)
                    .addComponent(btnMostrarAlto))
                .addGap(24, 24, 24)
                .addGroup(pnlEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMmIdade)
                    .addComponent(btnMostrarMmIdade))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        txtAltura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });

        txtIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblCod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCod.setText("Código:");

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblPeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPeso.setText("Peso:");

        lblAltura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAltura.setText("Altura:");

        lblIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIdade.setText("Idade:");

        txtCod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCadastro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCadastro.setText("Cadastro de atletas");

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        txtExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblExcluir.setText("Insira um código para excluir um atleta:");

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblCod)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCadastroLayout.createSequentialGroup()
                                                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblPeso, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblAltura, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblIdade, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(7, 7, 7)))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNome)
                                            .addComponent(txtCod)
                                            .addComponent(txtPeso)
                                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                                        .addComponent(lblCadastro)
                                        .addGap(15, 15, 15)))
                                .addGap(11, 11, 11))
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addComponent(lblExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addComponent(lblCadastro)
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCod)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeso)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAltura)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar)
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExcluir)
                    .addComponent(txtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pnlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(pnlEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try
        {
           String cod = txtCod.getText();
           int codInt = Integer.parseInt(cod);
           String nome = txtNome.getText();           
           if(cod.equals("")||nome.equals(""))
           {
            throw new StringVaziaException();
           }
           double peso = Double.parseDouble(txtPeso.getText()); 
           double altura = Double.parseDouble(txtAltura.getText());
           int idade = Integer.parseInt(txtIdade.getText());
           if(peso<0||altura<0||idade<0||codInt<0)
           {
            throw new NegativoException();
           }
           ac.cadastrar(cod,nome,peso,altura,idade);
           JOptionPane.showMessageDialog(null, "Atleta cadastrado");           
           return;
        }
        catch(StringVaziaException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Valor inválido");
        }
        catch(NegativoException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Atleta não cadastrado");
  
         
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnMostrarMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMediaActionPerformed
        double media = ac.mediaPesos();
        if(ac.getlistaAtleta().size()==0)
        {
            JOptionPane.showMessageDialog(null,"Não há atletas cadastrados!");
        }
        else{
            JOptionPane.showMessageDialog(null,"A média dos pesos dos atletas é " + media);
        }   
    }//GEN-LAST:event_btnMostrarMediaActionPerformed

    private void btnMostrarAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAltoActionPerformed
      if(ac.getlistaAtleta().size()==0)
      {
        JOptionPane.showMessageDialog(null,"Não há atletas cadastrados!");
      }
      else
      {
        int index = ac.maisAlto();
        Atleta a = ac.getlistaAtleta().get(index);
        JOptionPane.showMessageDialog(null,"O atleta mais alto é o " + a.getNome() + " com " + a.getAltura() + " de altura.");       
      }
    }//GEN-LAST:event_btnMostrarAltoActionPerformed

    private void btnMostrarMmIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMmIdadeActionPerformed
        int maiores = ac.maiorDeIdade();
        int menores = ac.menorDeIdade();
        if(ac.getlistaAtleta().size()==0)
        {
            JOptionPane.showMessageDialog(null,"Não há atletas cadastrados!");       
        }
        else
            JOptionPane.showMessageDialog(null, "Quantidade de maiores de idade: " + maiores + "\nQuantidade de menores de idade: " + menores);
    }//GEN-LAST:event_btnMostrarMmIdadeActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(ac.getlistaAtleta().size()==0)
        {
            JOptionPane.showMessageDialog(null,"Não há atletas cadastrados!");       
        }
        else
        {
            if(rbCod.isSelected())
           {
               try
               {
                    String msg = "";
                    ArrayList<Atleta> lista =  ac.buscar(txtBusca.getText(), 1);
                    if(txtBusca.getText().equals(""))
                    {
                        throw new StringVaziaException();
                    }
                    if(lista.size()==0)
                    {
                     JOptionPane.showMessageDialog(null,"Atleta não encontrado"); 
                    }
                    else
                    {
                         for(Atleta a: lista)
                         {
                              msg+=a.mostrar();
                              msg+="\n";
                         }
                         JOptionPane.showMessageDialog(null, msg);           
                    }                     
               }
               catch(StringVaziaException ex)
               {
                   JOptionPane.showMessageDialog(null,ex.getMessage()); 
               }
            
           }

           if(rbNome.isSelected())
           {
               try
               {
                    String msg = "";
                    ArrayList<Atleta> lista =  ac.buscar(txtBusca.getText(), 2);
                    if(txtBusca.getText().equals(""))
                    {
                        throw new StringVaziaException();
                    }
                    if(lista.size()==0)
                    {
                     JOptionPane.showMessageDialog(null,"Atleta não encontrado"); 
                    }
                    else
                    {
                         for(Atleta a: lista)
                         {
                              msg+=a.mostrar();
                              msg+="\n";
                         }
                         JOptionPane.showMessageDialog(null, msg);           
                    }               
               }
               catch(StringVaziaException ex)
               {
                   JOptionPane.showMessageDialog(null,ex.getMessage()); 
               }

           }

           if(rbPeso.isSelected())
           {
               try
               {
                    String msg = "";
                    ArrayList<Atleta> lista =  ac.buscar(txtBusca.getText(), 3);
                    if(lista.size()==0)
                    {
                     JOptionPane.showMessageDialog(null,"Atleta não encontrado");  
                    }
                    else
                    {
                         for(Atleta a: lista)
                         {
                              msg+=a.mostrar();
                              msg+="\n";
                         }
                         JOptionPane.showMessageDialog(null, msg);           
                    }                
               }
               catch(NumberFormatException ex)
               {
                   JOptionPane.showMessageDialog(null,"Valor inválido!"); 
               }
           }        

           if(rbAltura.isSelected())
           {
               try
               {
                    String msg = "";
                    ArrayList<Atleta> lista =  ac.buscar(txtBusca.getText(), 4);
                    if(lista.size()==0)
                    {
                     JOptionPane.showMessageDialog(null,"Atleta não encontrado"); 
                    }
                    else
                    {
                         for(Atleta a: lista)
                         {
                              msg+=a.mostrar();
                              msg+="\n";
                         }
                         JOptionPane.showMessageDialog(null, msg);           
                    }
               }
               catch(NumberFormatException ex)
               {
                   JOptionPane.showMessageDialog(null,"Valor inválido!"); 
               }
           }    

           if(rbIdade.isSelected())
           {
               try
               {
                   String msg = "";
                   ArrayList<Atleta> lista =  ac.buscar(txtBusca.getText(), 5);
                   if(lista.size()==0)
                   {
                    JOptionPane.showMessageDialog(null,"Atleta não encontrado");  
                   }
                   else
                   {
                        for(Atleta a: lista)
                        {
                             msg+=a.mostrar();
                             msg+="\n";
                        }
                        JOptionPane.showMessageDialog(null, msg);           
                   }                  
               }
               catch(NumberFormatException ex)
               {
                   JOptionPane.showMessageDialog(null,"Valor inválido!"); 
               }
           }               
        }   
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtCod.setText("");
        txtNome.setText("");
        txtPeso.setText("");
        txtAltura.setText("");
        txtIdade.setText("");
        txtBusca.setText("");
        txtExcluir.setText("");
        rbCod.setSelected(false);
        rbNome.setSelected(false);
        rbPeso.setSelected(false);
        rbAltura.setSelected(false);
        rbIdade.setSelected(false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void rbCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCodActionPerformed
        rbNome.setSelected(false);
        rbPeso.setSelected(false);
        rbAltura.setSelected(false);
        rbIdade.setSelected(false);
    }//GEN-LAST:event_rbCodActionPerformed

    private void rbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomeActionPerformed
        rbCod.setSelected(false);
        rbPeso.setSelected(false);
        rbAltura.setSelected(false);
        rbIdade.setSelected(false);
    }//GEN-LAST:event_rbNomeActionPerformed

    private void rbPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPesoActionPerformed
        rbCod.setSelected(false);
        rbNome.setSelected(false);
        rbAltura.setSelected(false);
        rbIdade.setSelected(false);
    }//GEN-LAST:event_rbPesoActionPerformed

    private void rbAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlturaActionPerformed
        rbCod.setSelected(false);
        rbNome.setSelected(false);
        rbPeso.setSelected(false);
        rbIdade.setSelected(false);
    }//GEN-LAST:event_rbAlturaActionPerformed

    private void rbIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIdadeActionPerformed
        rbCod.setSelected(false);
        rbNome.setSelected(false);
        rbPeso.setSelected(false);
        rbAltura.setSelected(false);
    }//GEN-LAST:event_rbIdadeActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(ac.getlistaAtleta().size()==0)
        {
            JOptionPane.showMessageDialog(null,"Não há atletas cadastrados!");       
        }
        else
        {
            try
            {
                if(txtExcluir.getText().equals(""))
                    throw new StringVaziaException();            
                ac.excluir(txtExcluir.getText());   
            }
            catch(StringVaziaException ex)
            {
               JOptionPane.showMessageDialog(null,ex.getMessage());  
            }
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMostrarAlto;
    private javax.swing.JButton btnMostrarMedia;
    private javax.swing.JButton btnMostrarMmIdade;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAlto;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblEst;
    private javax.swing.JLabel lblExcluir;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblMedia;
    private javax.swing.JLabel lblMmIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlEst;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JRadioButton rbAltura;
    private javax.swing.JRadioButton rbCod;
    private javax.swing.JRadioButton rbIdade;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JRadioButton rbPeso;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtExcluir;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
