package view.Funcionario;

import dao.FuncionarioDAO;
import model.Funcionario;
import model.Troca;
import java.awt.*;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class Prin_funcionario extends javax.swing.JFrame {

      private int  xMouse;
      private int yMouse;
      private int Design=0;

      
    public Prin_funcionario() {
        initComponents();
        seticon();
                Home ho = new Home();
        Troca tro = new Troca(Principal, ho);
      
    }
    
    ImageIcon byteImg(byte[] i){
        InputStream is = new ByteArrayInputStream(i); 
        Image img = new ImageIcon(i).getImage().getScaledInstance(150, 150, 150);
        ImageIcon icon = new ImageIcon(img);
        return icon;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sub_menu = new javax.swing.JPanel();
        texto = new javax.swing.JLabel();
        todos_reservados = new javax.swing.JLabel();
        copia__não = new javax.swing.JLabel();
        login_func = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        Cadastrar = new javax.swing.JButton();
        Catalogo = new javax.swing.JButton();
        Pagamento = new javax.swing.JButton();
        gerar_boleto = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        degrade = new keeptoo.KGradientPanel();
        twitter = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();
        instagram = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jldata = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        Principal = new javax.swing.JPanel();
        topo = new javax.swing.JPanel();
        fechar_X = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        topo1 = new javax.swing.JPanel();
        BoMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        setName("Back_prin_frame"); // NOI18N
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Sub_menu.setBackground(new java.awt.Color(255, 124, 100));
        Sub_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto.setBackground(new java.awt.Color(255, 124, 100));
        texto.setFont(new java.awt.Font("Yu Gothic UI", 1, 10)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 255, 255));
        texto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-direito-de-cópia-10.png"))); // NOI18N
        texto.setText("2019 Vilet's Team .");
        texto.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                textoComponentShown(evt);
            }
        });
        Sub_menu.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 110, -1));

        todos_reservados.setBackground(new java.awt.Color(255, 124, 100));
        todos_reservados.setFont(new java.awt.Font("Yu Gothic UI", 1, 10)); // NOI18N
        todos_reservados.setForeground(new java.awt.Color(255, 255, 255));
        todos_reservados.setText("Todos os direitos reservados ");
        todos_reservados.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                todos_reservadosComponentShown(evt);
            }
        });
        Sub_menu.add(todos_reservados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        copia__não.setBackground(new java.awt.Color(255, 124, 100));
        copia__não.setFont(new java.awt.Font("Yu Gothic UI", 1, 10)); // NOI18N
        copia__não.setForeground(new java.awt.Color(255, 255, 255));
        copia__não.setText("Copia não comédia");
        copia__não.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                copia__nãoComponentShown(evt);
            }
        });
        Sub_menu.add(copia__não, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        login_func.setBackground(new java.awt.Color(255, 124, 100));
        login_func.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        login_func.setForeground(new java.awt.Color(255, 255, 255));
        login_func.setText("Fulano Logado");
        login_func.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                login_funcComponentShown(evt);
            }
        });
        Sub_menu.add(login_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        Menu.setBackground(new java.awt.Color(255, 124, 100));
        Menu.setOpaque(false);

        Cadastrar.setBackground(new java.awt.Color(51, 51, 51));
        Cadastrar.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        Cadastrar.setForeground(new java.awt.Color(102, 102, 102));
        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-client-management-filled-24.png"))); // NOI18N
        Cadastrar.setToolTipText("Cadastrar cliente");
        Cadastrar.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        Cadastrar.setContentAreaFilled(false);
        Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CadastrarMouseExited(evt);
            }
        });
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Catalogo.setBackground(new java.awt.Color(51, 51, 51));
        Catalogo.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        Catalogo.setForeground(new java.awt.Color(102, 102, 102));
        Catalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-car-filled-24.png"))); // NOI18N
        Catalogo.setToolTipText("Catálogo");
        Catalogo.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        Catalogo.setContentAreaFilled(false);
        Catalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Catalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CatalogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CatalogoMouseExited(evt);
            }
        });
        Catalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatalogoActionPerformed(evt);
            }
        });

        Pagamento.setBackground(new java.awt.Color(51, 51, 51));
        Pagamento.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        Pagamento.setForeground(new java.awt.Color(102, 102, 102));
        Pagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-calculator-filled-24.png"))); // NOI18N
        Pagamento.setToolTipText("Formas de pagamento");
        Pagamento.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        Pagamento.setContentAreaFilled(false);
        Pagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PagamentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PagamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PagamentoMouseExited(evt);
            }
        });

        gerar_boleto.setBackground(new java.awt.Color(51, 51, 51));
        gerar_boleto.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        gerar_boleto.setForeground(new java.awt.Color(102, 102, 102));
        gerar_boleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-boleto-bankario-24.png"))); // NOI18N
        gerar_boleto.setToolTipText("Gerar boleto");
        gerar_boleto.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        gerar_boleto.setContentAreaFilled(false);
        gerar_boleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gerar_boleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gerar_boletoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gerar_boletoMouseExited(evt);
            }
        });

        logout.setBackground(new java.awt.Color(51, 51, 51));
        logout.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        logout.setForeground(new java.awt.Color(102, 102, 102));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-shutdown-24.png"))); // NOI18N
        logout.setToolTipText("Logout");
        logout.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        logout.setContentAreaFilled(false);
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Catalogo, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(Pagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(gerar_boleto, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Catalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gerar_boleto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
        );

        Sub_menu.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 50, 330));

        degrade.setEndColor(new java.awt.Color(250, 0, 0));
        degrade.setStartColor(new java.awt.Color(0, 0, 0));

        twitter.setBackground(new java.awt.Color(255, 124, 100));
        twitter.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        twitter.setForeground(new java.awt.Color(255, 124, 100));
        twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-twitter-filled-24.png"))); // NOI18N
        twitter.setToolTipText("Follow us on twitter");
        twitter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterMouseClicked(evt);
            }
        });
        twitter.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                twitterComponentShown(evt);
            }
        });
        degrade.add(twitter);
        twitter.setBounds(120, 510, 24, 24);

        facebook.setBackground(new java.awt.Color(255, 124, 100));
        facebook.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        facebook.setForeground(new java.awt.Color(255, 124, 100));
        facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-facebook-filled-24.png"))); // NOI18N
        facebook.setToolTipText("See Facebook page");
        facebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebookMouseClicked(evt);
            }
        });
        facebook.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                facebookComponentShown(evt);
            }
        });
        degrade.add(facebook);
        facebook.setBounds(60, 510, 24, 24);

        instagram.setBackground(new java.awt.Color(255, 124, 100));
        instagram.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        instagram.setForeground(new java.awt.Color(255, 124, 100));
        instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-instagram-filled-24_.png"))); // NOI18N
        instagram.setToolTipText("Folow us on Instagram ");
        instagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        instagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instagramMouseClicked(evt);
            }
        });
        instagram.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                instagramComponentShown(evt);
            }
        });
        degrade.add(instagram);
        instagram.setBounds(90, 510, 24, 24);

        email.setBackground(new java.awt.Color(255, 124, 100));
        email.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("viletsTeam@gmail.com");
        email.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                emailComponentShown(evt);
            }
        });
        degrade.add(email);
        email.setBounds(30, 530, 150, 20);

        jldata.setBackground(new java.awt.Color(255, 124, 100));
        jldata.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jldata.setForeground(new java.awt.Color(255, 255, 255));
        jldata.setText("dd/MM/yyyy");
        jldata.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jldataComponentShown(evt);
            }
        });
        degrade.add(jldata);
        jldata.setBounds(80, 170, 80, 19);

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-usuário-de-gênero-neutro-96 (1).png"))); // NOI18N
        imagem.setText("jLabel1");
        degrade.add(imagem);
        imagem.setBounds(70, 20, 101, 96);

        cpf.setBackground(new java.awt.Color(255, 124, 100));
        cpf.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        cpf.setForeground(new java.awt.Color(255, 255, 255));
        cpf.setText("CPF: ");
        cpf.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                cpfComponentShown(evt);
            }
        });
        degrade.add(cpf);
        cpf.setBounds(40, 150, 170, 19);

        Sub_menu.add(degrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 600));

        Principal.setBackground(new java.awt.Color(0, 0, 0));
        Principal.setLayout(new javax.swing.BoxLayout(Principal, javax.swing.BoxLayout.LINE_AXIS));

        topo.setBackground(new java.awt.Color(0, 0, 0));
        topo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topoMouseDragged(evt);
            }
        });
        topo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topoMousePressed(evt);
            }
        });
        topo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fechar_X.setBackground(new java.awt.Color(255, 0, 0));
        fechar_X.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fechar_X.setForeground(new java.awt.Color(102, 102, 102));
        fechar_X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechar_X.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-delete-24 (1) - Copia.png"))); // NOI18N
        fechar_X.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fechar_X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechar_XMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fechar_XMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fechar_XMouseExited(evt);
            }
        });
        topo.add(fechar_X, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 34, 30));

        minimizar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        minimizar.setForeground(new java.awt.Color(102, 102, 102));
        minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-compress-filled-24 - Copia.png"))); // NOI18N
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizarMouseExited(evt);
            }
        });
        topo.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 34, 30));

        topo1.setBackground(new java.awt.Color(0, 0, 0));
        topo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topo1MouseDragged(evt);
            }
        });
        topo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topo1MousePressed(evt);
            }
        });
        topo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-menu-24 (1) - Copia.png"))); // NOI18N
        BoMenu.setToolTipText("Menu");
        BoMenu.setBorder(null);
        BoMenu.setContentAreaFilled(false);
        BoMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BoMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BoMenu.setVerifyInputWhenFocusTarget(false);
        BoMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BoMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BoMenuMouseExited(evt);
            }
        });
        BoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoMenuActionPerformed(evt);
            }
        });
        topo1.add(BoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, 30));

        topo.add(topo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 231, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Sub_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(topo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sub_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
           int position = BoMenu.getX();
        if(position==5){
     Date data= new Date();
        SimpleDateFormat form= new SimpleDateFormat("dd/MM/yyy");
        jldata.setText(form.format(data));
        
     //Hora
    /* Timer timer = new Timer(1000, (ActionListener) new hora());
     timer.start();}*/
        }else{}
        
        FuncionarioDAO dao = new FuncionarioDAO();
        Funcionario func = dao.PropetyFuncionario(System.getProperty("login"));
        Funcionario cpf_func = dao.PropetyFuncionario(System.getProperty("cpf"));
        
//        String[] nome = func.getNome().split(" ");
        String nome = func.getNome();
       String cpf =func.getCPF();
        
        //pegar o primeiro e segundo nome.
        
        login_func.setText(nome);
        Prin_funcionario.cpf.setText("CPF: "+cpf);
        imagem.setIcon(byteImg(func.getFoto()));
        
        //img.
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jldataComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jldataComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jldataComponentShown

    private void facebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebookMouseClicked
        try {
            Runtime.getRuntime().exec("cmd.exe /C start " + "https://www.facebook.com/Vilets-Team-2265673113688326/?modal=admin_todo_tour");
        }catch (IOException ex) {
            System.out.println(ex.getMessage()); }
    }//GEN-LAST:event_facebookMouseClicked

    private void facebookComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_facebookComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_facebookComponentShown

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        try {
            Runtime.getRuntime().exec("cmd.exe /C start " + "https://twitter.com/");
        }catch (IOException ex) {
            System.out.println(ex.getMessage()); }
    }//GEN-LAST:event_twitterMouseClicked

    private void twitterComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_twitterComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_twitterComponentShown

    private void textoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_textoComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_textoComponentShown

    private void todos_reservadosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_todos_reservadosComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_todos_reservadosComponentShown

    private void instagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagramMouseClicked
        try {
            Runtime.getRuntime().exec("cmd.exe /C start " + "https://www.instagram.com/?hl=pt-br");
        }catch (IOException ex) {
            System.out.println(ex.getMessage()); }
    }//GEN-LAST:event_instagramMouseClicked

    private void instagramComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_instagramComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_instagramComponentShown

    private void copia__nãoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_copia__nãoComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_copia__nãoComponentShown

    private void login_funcComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_login_funcComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_login_funcComponentShown

    private void CadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarMouseClicked
        Registrar in = new Registrar();
        Troca tro = new Troca(Principal, in);
    }//GEN-LAST:event_CadastrarMouseClicked

    private void CadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarMouseEntered
        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-client-management-filled-24.gif")));
    }//GEN-LAST:event_CadastrarMouseEntered

    private void CadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastrarMouseExited
        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-client-management-filled-24.png")));
    }//GEN-LAST:event_CadastrarMouseExited

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastrarActionPerformed

    private void CatalogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatalogoMouseEntered
        Catalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-car-filled-24.gif")));
    }//GEN-LAST:event_CatalogoMouseEntered

    private void CatalogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatalogoMouseExited
        Catalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-car-filled-24.png")));
    }//GEN-LAST:event_CatalogoMouseExited

    private void CatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatalogoActionPerformed
        Catalogo in = new Catalogo();
        Troca tro = new Troca(Principal, in);
    }//GEN-LAST:event_CatalogoActionPerformed

    private void PagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagamentoMouseClicked
          Tabela in = new Tabela();
        Troca tro = new Troca(Principal, in);
    }//GEN-LAST:event_PagamentoMouseClicked

    private void PagamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagamentoMouseEntered
      Pagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-calculator-filled-24.gif")));
    }//GEN-LAST:event_PagamentoMouseEntered

    private void PagamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagamentoMouseExited
      Pagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-calculator-filled-24.png")));
    }//GEN-LAST:event_PagamentoMouseExited

    private void gerar_boletoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerar_boletoMouseEntered
        gerar_boleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-boleto-bankario-24.gif")));
    }//GEN-LAST:event_gerar_boletoMouseEntered

    private void gerar_boletoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerar_boletoMouseExited
       gerar_boleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-boleto-bankario-24.png")));
    }//GEN-LAST:event_gerar_boletoMouseExited

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
       logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-shutdown-24.gif")));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
      logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-shutdown-24.png")));
    }//GEN-LAST:event_logoutMouseExited

    private void fechar_XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechar_XMouseClicked
        this.dispose();
    }//GEN-LAST:event_fechar_XMouseClicked

    private void fechar_XMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechar_XMouseEntered
        fechar_X.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-multiply-filled-24 (1).png")));
    }//GEN-LAST:event_fechar_XMouseEntered

    private void fechar_XMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechar_XMouseExited
        fechar_X.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-delete-24 (1) - Copia.png")));
    }//GEN-LAST:event_fechar_XMouseExited

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setState(Prin_funcionario.ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseEntered
        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-compress-filled-24.png")));
    }//GEN-LAST:event_minimizarMouseEntered

    private void minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseExited
        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-compress-filled-24 - Copia.png")));
    }//GEN-LAST:event_minimizarMouseExited

    private void BoMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoMenuMouseEntered
        BoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-menu-24 (1).png")));
    }//GEN-LAST:event_BoMenuMouseEntered

    private void BoMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoMenuMouseExited
        BoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-menu-24 (1) - Copia.png" )));
    }//GEN-LAST:event_BoMenuMouseExited

    private void BoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoMenuActionPerformed
        int position = BoMenu.getX();
        if(position> 5){
            Animacion.Animacion.mover_izquierda(position,5, 20, 4, BoMenu);
            Animacion.Animacion.mover_izquierda(0,-50, 20, 4, Menu);

        }
        else{
            Animacion.Animacion.mover_derecha(position,45, 20, 4, BoMenu);
            Animacion.Animacion.mover_derecha(-51,0, 20, 4, Menu);

        }
    }//GEN-LAST:event_BoMenuActionPerformed

    private void topo1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topo1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_topo1MouseDragged

    private void topo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topo1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_topo1MousePressed

    private void topoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topoMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_topoMouseDragged

    private void topoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_topoMousePressed

    private void emailComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_emailComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_emailComponentShown

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
               this.dispose();
               view.login.Login log = new view.login.Login();
               log.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void cpfComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cpfComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfComponentShown

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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Prin_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prin_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prin_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prin_funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prin_funcionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoMenu;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Catalogo;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton Pagamento;
    private javax.swing.JPanel Principal;
    public static javax.swing.JPanel Sub_menu;
    public javax.swing.JLabel copia__não;
    public static javax.swing.JLabel cpf;
    private keeptoo.KGradientPanel degrade;
    public javax.swing.JLabel email;
    public javax.swing.JLabel facebook;
    private javax.swing.JLabel fechar_X;
    private javax.swing.JButton gerar_boleto;
    private javax.swing.JLabel imagem;
    public javax.swing.JLabel instagram;
    public javax.swing.JLabel jldata;
    public static javax.swing.JLabel login_func;
    private javax.swing.JButton logout;
    private javax.swing.JLabel minimizar;
    public javax.swing.JLabel texto;
    public javax.swing.JLabel todos_reservados;
    private javax.swing.JPanel topo;
    private javax.swing.JPanel topo1;
    public javax.swing.JLabel twitter;
    // End of variables declaration//GEN-END:variables

/*    class hora implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                Calendar now = Calendar.getInstance();
                
                int position = BoMenu.getX();
                if(position > 5){
                    jlhora.setText(String.format("00:00"));                        

        }else{
    jlhora.setText(String.format("%1$tH:%1tM",now));}}}*/
   private void seticon(){
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/Nova_logo.png")));
     
}
   
}
