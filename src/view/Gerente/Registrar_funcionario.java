package view.Gerente;

import dao.GerenteDAO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import view.PopUp.PopUp_Erro_login;
import model.Funcionario;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Registrar_funcionario extends javax.swing.JPanel {

    public Registrar_funcionario() {
        initComponents();
    }
    
    public void limpar(){
         usuario.setText(null);
        data_nasc.setText(null);
        email.setText(null);
        cpf.setText(null);
        rg.setText(null);
        pis.setText(null);
        rg.setText(null);
        estado.setText(null);
        cidade.setText(null);
        senha.setText(null);
        c_senha.setText(null);
        senha.setText(null);
        nome_completo.setText(null);
        telefone.setText(null);
        imagem.setIcon(null);
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        part_2 = new javax.swing.JPanel();
        enviar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        cidade = new javax.swing.JTextField();
        titulo_cidade = new javax.swing.JLabel();
        cpf = new javax.swing.JFormattedTextField();
        titulo_cpf = new javax.swing.JLabel();
        rg = new javax.swing.JFormattedTextField();
        titulo_rg = new javax.swing.JLabel();
        pis = new javax.swing.JFormattedTextField();
        titulo_pis = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        titulo_estado = new javax.swing.JLabel();
        telefone = new javax.swing.JFormattedTextField();
        titulo_telefone = new javax.swing.JLabel();
        data_nasc = new javax.swing.JFormattedTextField();
        titulo_data_nasc = new javax.swing.JLabel();
        titulo_nome1 = new javax.swing.JLabel();
        nome_completo = new javax.swing.JTextField();
        esquerd_panel = new javax.swing.JPanel();
        titul0 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        usuario_text = new javax.swing.JLabel();
        titulo_senha = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        titulo_senha1 = new javax.swing.JLabel();
        c_senha = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        titulo_email = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();
        enviar_img = new javax.swing.JButton();
        proximo = new javax.swing.JButton();
        limpar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(682, 600));

        Principal.setBackground(new java.awt.Color(0, 0, 0));
        Principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrincipalMouseEntered(evt);
            }
        });
        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        part_2.setBackground(new java.awt.Color(0, 0, 0));
        part_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                part_2MouseEntered(evt);
            }
        });
        part_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enviar.setBackground(new java.awt.Color(0, 255, 255));
        enviar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enviar.setForeground(new java.awt.Color(255, 255, 255));
        enviar.setText("Enviar");
        enviar.setBorder(null);
        enviar.setContentAreaFilled(false);
        enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar.setOpaque(true);
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        part_2.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 120, 40));

        voltar.setBackground(new java.awt.Color(0, 255, 255));
        voltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        voltar.setForeground(new java.awt.Color(255, 255, 255));
        voltar.setText("Voltar");
        voltar.setBorder(null);
        voltar.setContentAreaFilled(false);
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar.setOpaque(true);
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        part_2.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 120, 40));

        cidade.setBackground(new java.awt.Color(0, 255, 255));
        cidade.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        cidade.setForeground(new java.awt.Color(255, 0, 0));
        cidade.setToolTipText("Insira sua cidade");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShadowColor(new java.awt.Color(0, 255, 255));
        dropShadowBorder1.setShadowOpacity(1.0F);
        dropShadowBorder1.setShadowSize(10);
        cidade.setBorder(dropShadowBorder1);
        cidade.setCaretColor(new java.awt.Color(255, 0, 0));
        cidade.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        cidade.setOpaque(false);
        part_2.add(cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 246, 51));

        titulo_cidade.setBackground(new java.awt.Color(0, 255, 255));
        titulo_cidade.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_cidade.setForeground(new java.awt.Color(255, 255, 255));
        titulo_cidade.setText("Cidade:");
        part_2.add(titulo_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        cpf.setBackground(new java.awt.Color(0, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShadowColor(new java.awt.Color(0, 255, 255));
        dropShadowBorder2.setShadowOpacity(1.0F);
        dropShadowBorder2.setShadowSize(10);
        cpf.setBorder(dropShadowBorder2);
        cpf.setForeground(new java.awt.Color(255, 0, 0));
        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setToolTipText("Insira seu CPF");
        cpf.setCaretColor(new java.awt.Color(255, 0, 0));
        cpf.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        cpf.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        cpf.setOpaque(false);
        part_2.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 180, 51));

        titulo_cpf.setBackground(new java.awt.Color(0, 255, 255));
        titulo_cpf.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_cpf.setForeground(new java.awt.Color(255, 255, 255));
        titulo_cpf.setText("CPF:");
        part_2.add(titulo_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        rg.setBackground(new java.awt.Color(0, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShadowColor(new java.awt.Color(0, 255, 255));
        dropShadowBorder3.setShadowOpacity(1.0F);
        dropShadowBorder3.setShadowSize(10);
        rg.setBorder(dropShadowBorder3);
        rg.setForeground(new java.awt.Color(255, 0, 0));
        try {
            rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########.#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rg.setToolTipText("Insira seu RG");
        rg.setCaretColor(new java.awt.Color(255, 0, 0));
        rg.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        rg.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        rg.setOpaque(false);
        part_2.add(rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 180, 51));

        titulo_rg.setBackground(new java.awt.Color(0, 255, 255));
        titulo_rg.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_rg.setForeground(new java.awt.Color(255, 255, 255));
        titulo_rg.setText("RG:");
        part_2.add(titulo_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        pis.setBackground(new java.awt.Color(0, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder4 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder4.setShadowColor(new java.awt.Color(0, 255, 255));
        dropShadowBorder4.setShadowOpacity(1.0F);
        dropShadowBorder4.setShadowSize(10);
        pis.setBorder(dropShadowBorder4);
        pis.setForeground(new java.awt.Color(255, 0, 0));
        try {
            pis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.#####.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pis.setToolTipText("Insira o seu PIS");
        pis.setCaretColor(new java.awt.Color(255, 0, 0));
        pis.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        pis.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        pis.setOpaque(false);
        pis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pisActionPerformed(evt);
            }
        });
        part_2.add(pis, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 180, 51));

        titulo_pis.setBackground(new java.awt.Color(0, 255, 255));
        titulo_pis.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_pis.setForeground(new java.awt.Color(255, 255, 255));
        titulo_pis.setText("Nº PIS:");
        part_2.add(titulo_pis, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 70, -1));

        estado.setBackground(new java.awt.Color(0, 255, 255));
        estado.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(255, 0, 0));
        estado.setToolTipText("Insira seu Estado");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder5 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder5.setShadowColor(new java.awt.Color(0, 255, 255));
        dropShadowBorder5.setShadowOpacity(1.0F);
        dropShadowBorder5.setShadowSize(10);
        estado.setBorder(dropShadowBorder5);
        estado.setCaretColor(new java.awt.Color(255, 0, 0));
        estado.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        estado.setOpaque(false);
        part_2.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 246, 51));

        titulo_estado.setBackground(new java.awt.Color(0, 255, 255));
        titulo_estado.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_estado.setForeground(new java.awt.Color(255, 255, 255));
        titulo_estado.setText("Estado:");
        part_2.add(titulo_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        telefone.setBackground(new java.awt.Color(0, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder6 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder6.setShadowColor(new java.awt.Color(0, 255, 255));
        dropShadowBorder6.setShadowOpacity(1.0F);
        dropShadowBorder6.setShadowSize(10);
        telefone.setBorder(dropShadowBorder6);
        telefone.setForeground(new java.awt.Color(255, 0, 0));
        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+##(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone.setToolTipText("Insira seu telefone");
        telefone.setCaretColor(new java.awt.Color(255, 0, 0));
        telefone.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        telefone.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        telefone.setOpaque(false);
        part_2.add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 180, 51));

        titulo_telefone.setBackground(new java.awt.Color(0, 255, 255));
        titulo_telefone.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_telefone.setForeground(new java.awt.Color(255, 255, 255));
        titulo_telefone.setText("Telefone:");
        part_2.add(titulo_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        data_nasc.setBackground(new java.awt.Color(0, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder7 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder7.setShadowColor(new java.awt.Color(0, 255, 255));
        dropShadowBorder7.setShadowOpacity(1.0F);
        dropShadowBorder7.setShadowSize(10);
        data_nasc.setBorder(dropShadowBorder7);
        data_nasc.setForeground(new java.awt.Color(255, 0, 0));
        try {
            data_nasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data_nasc.setToolTipText("Insira sua data de nascimento");
        data_nasc.setCaretColor(new java.awt.Color(255, 0, 0));
        data_nasc.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        data_nasc.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        data_nasc.setOpaque(false);
        part_2.add(data_nasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 120, 51));

        titulo_data_nasc.setBackground(new java.awt.Color(0, 255, 255));
        titulo_data_nasc.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_data_nasc.setForeground(new java.awt.Color(255, 255, 255));
        titulo_data_nasc.setText("Data de Nascimento:");
        part_2.add(titulo_data_nasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        titulo_nome1.setBackground(new java.awt.Color(0, 255, 255));
        titulo_nome1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        titulo_nome1.setForeground(new java.awt.Color(255, 255, 255));
        titulo_nome1.setText("Nome completo:");
        part_2.add(titulo_nome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        nome_completo.setBackground(new java.awt.Color(0, 255, 255));
        nome_completo.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        nome_completo.setForeground(new java.awt.Color(255, 0, 0));
        nome_completo.setToolTipText("Insira seu nome completo");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder8 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder8.setShadowColor(new java.awt.Color(0, 255, 255));
        dropShadowBorder8.setShadowOpacity(1.0F);
        dropShadowBorder8.setShadowSize(10);
        nome_completo.setBorder(dropShadowBorder8);
        nome_completo.setCaretColor(new java.awt.Color(255, 0, 0));
        nome_completo.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        nome_completo.setOpaque(false);
        part_2.add(nome_completo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 246, 51));

        Principal.add(part_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-680, 0, 680, 600));

        esquerd_panel.setBackground(new java.awt.Color(0, 255, 255));
        esquerd_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                esquerd_panelMouseEntered(evt);
            }
        });

        titul0.setBackground(new java.awt.Color(0, 0, 0));
        titul0.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        titul0.setForeground(new java.awt.Color(255, 255, 255));
        titul0.setText("Registro de Funcionário");
        titul0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titul0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titul0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titul0MouseExited(evt);
            }
        });

        javax.swing.GroupLayout esquerd_panelLayout = new javax.swing.GroupLayout(esquerd_panel);
        esquerd_panel.setLayout(esquerd_panelLayout);
        esquerd_panelLayout.setHorizontalGroup(
            esquerd_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esquerd_panelLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(titul0)
                .addContainerGap(219, Short.MAX_VALUE))
        );
        esquerd_panelLayout.setVerticalGroup(
            esquerd_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esquerd_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titul0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Principal.add(esquerd_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 60));

        usuario.setBackground(new java.awt.Color(0, 255, 255));
        usuario.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 0, 0));
        usuario.setToolTipText("Crie seu usuário");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder9 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder9.setShadowColor(new java.awt.Color(0, 255, 255));
        dropShadowBorder9.setShadowOpacity(1.0F);
        dropShadowBorder9.setShadowSize(10);
        usuario.setBorder(dropShadowBorder9);
        usuario.setCaretColor(new java.awt.Color(255, 0, 0));
        usuario.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        usuario.setOpaque(false);
        Principal.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 246, 51));

        usuario_text.setBackground(new java.awt.Color(0, 255, 255));
        usuario_text.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        usuario_text.setForeground(new java.awt.Color(255, 255, 255));
        usuario_text.setText("Usuário:");
        Principal.add(usuario_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        titulo_senha.setBackground(new java.awt.Color(255, 255, 255));
        titulo_senha.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        titulo_senha.setForeground(new java.awt.Color(255, 255, 255));
        titulo_senha.setText("Senha:");
        Principal.add(titulo_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        senha.setBackground(new java.awt.Color(0, 255, 255));
        senha.setFont(new java.awt.Font("Yu Gothic UI", 1, 10)); // NOI18N
        senha.setForeground(new java.awt.Color(255, 0, 0));
        senha.setToolTipText("Insira sua senha");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder10 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder10.setShadowColor(new java.awt.Color(0, 255, 255));
        dropShadowBorder10.setShadowOpacity(1.0F);
        dropShadowBorder10.setShadowSize(10);
        senha.setBorder(dropShadowBorder10);
        senha.setCaretColor(new java.awt.Color(255, 0, 0));
        senha.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        senha.setOpaque(false);
        Principal.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 246, 51));

        titulo_senha1.setBackground(new java.awt.Color(255, 255, 255));
        titulo_senha1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        titulo_senha1.setForeground(new java.awt.Color(255, 255, 255));
        titulo_senha1.setText("Confirme sua Senha:");
        Principal.add(titulo_senha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        c_senha.setBackground(new java.awt.Color(0, 255, 255));
        c_senha.setFont(new java.awt.Font("Yu Gothic UI", 1, 10)); // NOI18N
        c_senha.setForeground(new java.awt.Color(255, 0, 0));
        c_senha.setToolTipText("Repita sua senha");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder11 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder11.setShadowColor(new java.awt.Color(0, 255, 255));
        dropShadowBorder11.setShadowOpacity(1.0F);
        dropShadowBorder11.setShadowSize(10);
        c_senha.setBorder(dropShadowBorder11);
        c_senha.setCaretColor(new java.awt.Color(255, 0, 0));
        c_senha.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        c_senha.setOpaque(false);
        Principal.add(c_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 246, 51));

        email.setBackground(new java.awt.Color(0, 255, 255));
        email.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(255, 0, 0));
        email.setToolTipText("Insira aqui seu Email");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder12 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder12.setShadowColor(new java.awt.Color(0, 255, 255));
        dropShadowBorder12.setShadowOpacity(1.0F);
        dropShadowBorder12.setShadowSize(10);
        email.setBorder(dropShadowBorder12);
        email.setCaretColor(new java.awt.Color(255, 0, 0));
        email.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        email.setOpaque(false);
        Principal.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 246, 51));

        titulo_email.setBackground(new java.awt.Color(0, 255, 255));
        titulo_email.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        titulo_email.setForeground(new java.awt.Color(255, 255, 255));
        titulo_email.setText("Email:");
        Principal.add(titulo_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        imagem.setBackground(new java.awt.Color(255, 255, 255));
        imagem.setForeground(new java.awt.Color(255, 255, 255));
        imagem.setOpaque(true);
        Principal.add(imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 100, 150, 150));

        enviar_img.setBackground(new java.awt.Color(0, 255, 255));
        enviar_img.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enviar_img.setForeground(new java.awt.Color(255, 255, 255));
        enviar_img.setText("Selecionar imagem");
        enviar_img.setBorder(null);
        enviar_img.setBorderPainted(false);
        enviar_img.setContentAreaFilled(false);
        enviar_img.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar_img.setOpaque(true);
        enviar_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_imgActionPerformed(evt);
            }
        });
        Principal.add(enviar_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 260, 190, 40));

        proximo.setBackground(new java.awt.Color(0, 255, 255));
        proximo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        proximo.setForeground(new java.awt.Color(255, 255, 255));
        proximo.setText("Próximo");
        proximo.setBorder(null);
        proximo.setContentAreaFilled(false);
        proximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proximo.setOpaque(true);
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });
        Principal.add(proximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 120, 40));

        limpar.setBackground(new java.awt.Color(0, 255, 255));
        limpar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        limpar.setForeground(new java.awt.Color(255, 255, 255));
        limpar.setText("Limpar");
        limpar.setBorder(null);
        limpar.setContentAreaFilled(false);
        limpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpar.setOpaque(true);
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        Principal.add(limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void titul0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titul0MouseEntered

       
    }//GEN-LAST:event_titul0MouseEntered

    private void titul0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titul0MouseExited

              
    }//GEN-LAST:event_titul0MouseExited

    private void esquerd_panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esquerd_panelMouseEntered
 
    }//GEN-LAST:event_esquerd_panelMouseEntered

    private void titul0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titul0MouseClicked
     
      
    }//GEN-LAST:event_titul0MouseClicked

    private void PrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrincipalMouseEntered
                           int position = esquerd_panel.getY();
             Animacion.Animacion.subir(position,-60, 1, 5, esquerd_panel); 
               if(position != 0){
                      esquerd_panel.setVisible(false);
                            titul0.setVisible(false);}
    }//GEN-LAST:event_PrincipalMouseEntered

    private void part_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_part_2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_part_2MouseEntered

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
            //_________________________________Código de Envio_____________________________________
        
//    
//    try {
//    BufferedImage img = ImageIO.read(new File("E:\\Projeto\\Concessionaria - Copia\\src\\Imagens\\icons8-delete-24 (1).png"));
//    ImageIcon icon = new ImageIcon(img);
//    JLabel label = new JLabel(icon);
//    JOptionPane.showMessageDialog(null, label, "Imagem", JOptionPane.PLAIN_MESSAGE);
//} catch (IOException e) {
//    e.printStackTrace();
//}
    
    
    if(usuario.getText().isEmpty() || data_nasc.getText().isEmpty() ||
       estado.getText().isEmpty() || cidade.getText().isEmpty() || email.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Digite todos os campos.", " Vilet's Muscles Informa...", JOptionPane.PLAIN_MESSAGE); 
        
    } else if(!email.getText().contains("@") || !email.getText().contains(".com")){
        JOptionPane.showMessageDialog(null, "Digite um email válido", " Vilet's Muscles Informa...", JOptionPane.ERROR_MESSAGE); 
        
    } else{
    Funcionario novo = new Funcionario();
    dao.GerenteDAO dao = new GerenteDAO();
    
    //Image m1 = (Image) imagem.getIcon();
    //transformar byte em img
    //new ImageIcon(imageByte).getImage();
    
    try {
         BufferedImage img = new BufferedImage(imagem.getWidth(), imagem.getHeight(), BufferedImage.TYPE_INT_RGB);
         ByteArrayOutputStream b = new ByteArrayOutputStream();
         ImageIO.write(img, "png", b);
         
         byte[] imgInByte = b.toByteArray();
            byte[] photos = imgInByte;
            
    novo.setNome(nome_completo.getText());
    novo.setDatNascimento(data_nasc.getText());
    novo.setEmail(email.getText());
    novo.setCPF(cpf.getText());
    novo.setRG(rg.getText());
    novo.setNumeroPIS(pis.getText());
    novo.setTelefone(telefone.getText());
    novo.setEstado(estado.getText());
    novo.setCidade(cidade.getText());
    novo.setLogin(usuario.getText());
    novo.setFoto(photos);
    novo.setSenha(new String (senha.getPassword()));
    
    dao.CadastrarFuncionario(novo);
    limpar();
    
     } catch (IOException ex) {
            System.err.println(ex);
     }
          }
    }//GEN-LAST:event_enviarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
                  int position = part_2.getX();

              Animacion.Animacion.mover_izquierda(position,-680, 1, 50, part_2);
              proximo.setVisible(true);
              limpar.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void enviar_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_imgActionPerformed
        JFileChooser choose= new JFileChooser();
        choose.setDialogTitle("Selecionar Imagem");
        choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
       FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagen","JPEG","png","jpg");
        
        choose.setFileFilter(filtro);
        
        int Return = choose.showOpenDialog(this);
        if(Return == JFileChooser.APPROVE_OPTION){
            File file = choose.getSelectedFile();
            ImageIcon image = new ImageIcon(file.getPath());
            
        imagem.setIcon(new javax.swing.ImageIcon(image.getImage().getScaledInstance(150,150, 150)));
    
        }
    }//GEN-LAST:event_enviar_imgActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        String k = new String (senha.getPassword());
        String k2 = new String (c_senha.getPassword());
        
        if(usuario.getText().isEmpty() || new String (senha.getPassword()).isEmpty() 
                || new String (c_senha.getPassword()).isEmpty() || email.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite todos os campos.", " Vilet's Muscles Informa...", JOptionPane.ERROR_MESSAGE); 
            
        }else if(!k.equals(k2)){
            JOptionPane.showMessageDialog(null, "As senhas não equivalem!", " Vilet's Muscles Informa...", JOptionPane.ERROR_MESSAGE); 
            //view.PopUp.PopUp_Erro_login pp = new PopUp_Erro_login();
            //pp.setVisible(true);
            //pp.setLocation();
         
        } else if(!email.getText().contains("@") || !email.getText().contains(".com")){
            JOptionPane.showMessageDialog(null, "Digite um email válido", " Vilet's Muscles Informa...", JOptionPane.ERROR_MESSAGE); 
         
        }else{
            int position = part_2.getX();
  
            Animacion.Animacion.mover_derecha(position,0, 1, 50, part_2);
              proximo.setVisible(false);
              limpar.setVisible(false);
        }
        
    }//GEN-LAST:event_proximoActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
       this.limpar();
    }//GEN-LAST:event_limparActionPerformed

    private void pisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    public static javax.swing.JPasswordField c_senha;
    private javax.swing.JTextField cidade;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JFormattedTextField data_nasc;
    private javax.swing.JTextField email;
    private javax.swing.JButton enviar;
    private javax.swing.JButton enviar_img;
    private javax.swing.JPanel esquerd_panel;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel imagem;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField nome_completo;
    private javax.swing.JPanel part_2;
    private javax.swing.JFormattedTextField pis;
    private javax.swing.JButton proximo;
    private javax.swing.JFormattedTextField rg;
    public static javax.swing.JPasswordField senha;
    private javax.swing.JFormattedTextField telefone;
    private javax.swing.JLabel titul0;
    private javax.swing.JLabel titulo_cidade;
    private javax.swing.JLabel titulo_cpf;
    private javax.swing.JLabel titulo_data_nasc;
    private javax.swing.JLabel titulo_email;
    private javax.swing.JLabel titulo_estado;
    private javax.swing.JLabel titulo_nome1;
    private javax.swing.JLabel titulo_pis;
    private javax.swing.JLabel titulo_rg;
    private javax.swing.JLabel titulo_senha;
    private javax.swing.JLabel titulo_senha1;
    private javax.swing.JLabel titulo_telefone;
    private javax.swing.JTextField usuario;
    private javax.swing.JLabel usuario_text;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

}
