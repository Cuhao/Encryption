import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class encryption extends JFrame {

    private JButton jButtonRun=new JButton("Run");
    private JButton jButtonExit=new JButton("Exit");

    JTextField jTextFieldleft =new JTextField("輸入加密或解密字串");
    JTextField jTextFieldright =new JTextField();
    private JTextField jTextField =new JTextField("請輸入數字");
    JScrollPane jScrollPanecenter =new JScrollPane(jTextField);
    private  JRadioButton jRadioButtonEncryption =new JRadioButton("Encrypt");
    private  JRadioButton jRadioButtonDecrypt =new JRadioButton("Decrypt");
    ButtonGroup buttonGroup=new ButtonGroup();
    private JLabel jLabelpassword=new JLabel("password");
    private JLabel jLabelMethod =new JLabel("Method");
    private String methodstr[]={"caesar","Des"};
    JComboBox jComboBox =new JComboBox<String>(methodstr);
   JScrollPane jScrollPaneLeft =new JScrollPane(jTextFieldleft);
   JScrollPane jScrollPaneRight =new JScrollPane(jTextFieldright);
   JPanel jPanel=new JPanel();
   JPanel jPanelradios =new JPanel();
    private Container cp;
    MainFrame frame3;
    public encryption( MainFrame frm3){
        init(frm3);
        frame3=frm3;
    }
    private void init(MainFrame frm3){
        MainFrame frame3;
        this.setBounds(10,10,500,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                MainFrame frm =new MainFrame();
                frm.setVisible(true);
                encryption.this.dispose();
            }
        });
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        cp.add(jScrollPaneLeft,BorderLayout.WEST);
        cp.add(jPanel,BorderLayout.CENTER);
        cp.add(jScrollPaneRight,BorderLayout.EAST);

        jPanel.setLayout(null);    //設置無排版
        jLabelMethod.setBounds(0,0,70,50);
        jComboBox.setBounds(0,50,80,50);
        jLabelpassword.setBounds(0,100,70,50);
        jScrollPanecenter.setBounds(0,150,70,50);
        jRadioButtonEncryption.setBounds(0,200,70,50);
        jRadioButtonDecrypt.setBounds(0,250,70,50);
        jButtonRun.setBounds(0,300,70,50);
        jButtonExit.setBounds(0,350,70,50);

        jPanel.add(jLabelMethod);
        jPanel.add(jComboBox);
        buttonGroup.add(jRadioButtonEncryption);
        buttonGroup.add(jRadioButtonDecrypt);
        jPanelradios.add(jRadioButtonEncryption);
        jPanelradios.add(jRadioButtonDecrypt);

        jPanel.add(jLabelpassword);
        jPanel.add(jScrollPanecenter);
        jPanel.add(jRadioButtonEncryption);
        jPanel.add(jRadioButtonDecrypt);

        jPanel.add(jButtonRun);
        jPanel.add(jButtonExit);

       jTextFieldleft.addFocusListener(new FocusAdapter() {
           @Override
           public void focusGained(FocusEvent e) {
               jTextFieldleft.setText("");
               jTextFieldleft.setForeground(Color.BLACK);
           }
           public void focusLost(FocusEvent e) {
               String temp = jTextFieldleft.getText();
               if (temp.equals("")) {
                   jTextFieldleft.setForeground(Color.GRAY);
                   jTextFieldleft.setText("輸入加密或解密字串");
               }
           }
       });
      jTextField.addFocusListener(new FocusAdapter() {
          @Override
          public void focusGained(FocusEvent e) {
              String temp = jTextField.getText();
              if(temp.equals("請輸入數字")){
                  jTextField.setText("");
                  jTextField.setForeground(Color.BLACK);
              }
          }
          public void focusLost(FocusEvent e){
              String temp = jTextField.getText();
              if(temp.equals("")) {

                  jTextField.setForeground(Color.GRAY);
                  jTextField.setText("請輸入數字");
              }
          }
      });

        jButtonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame frm =new MainFrame();
                frm.setVisible(true);
                encryption.this.dispose();
            }
        });
        jLabelMethod.setHorizontalAlignment(0);//文字置中
        jScrollPanecenter.setPreferredSize(new Dimension(100,50));
        jScrollPaneLeft.setPreferredSize(new Dimension(200,500));
        jScrollPaneRight.setPreferredSize(new Dimension(200,500));//設置jScrollPaneRight大小
        jButtonRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                char c;
                if (jComboBox.getSelectedItem().equals("caesar")) {
                    if (jRadioButtonEncryption.isSelected()) {
                        String X = "";
                        int K = Integer.parseInt(jTextField.getText());
                        char leftText[] = jTextFieldleft.getText().toCharArray();
                        int LeftTextlong = jTextFieldleft.getText().length();

                        for (int i = 0; i < LeftTextlong; ++i) {
                            c = leftText[i];
                            if (c >= 'A' && c <= 'Z') {
                                final int v = c - 'A';
                                c = (char) ((v + K) % 26 + 'A');
                            } else if (c >= 'a' && c <= 'z') {
                                final int v = c - 'a';
                                c = (char) ((v + K) % 26 + 'a');
                            }
                            System.out.print(c);

                            X = X + Character.toString(c);
                        }
                        jTextFieldright.setText(X);

                    }else {
                        if (jRadioButtonDecrypt.isSelected()) {
                            String X = "";
                            int K = Integer.parseInt(jTextField.getText());
                            char leftText[] = jTextFieldleft.getText().toCharArray();
                            int LeftTextlong = jTextFieldleft.getText().length();

                            for (int i = 0; i < LeftTextlong; ++i) {
                                c = leftText[i];
                                if (c >= 'A' && c <= 'Z') {
                                    final int v = c - 'A';
                                    c = (char) ((v - K) % 26 + 'A');
                                } else if (c >= 'a' && c <= 'z') {
                                    final int v = c - 'a';
                                    c = (char) ((v - K) % 26 + 'a');
                                }
                                System.out.println(c); //測試有無用

                                X = X + Character.toString(c);//抓一個一個字
                            }
                            jTextFieldright.setText(X);//輸出X
                        }
                    }
                }
            }
        });
      /*  jRadioButtonEncryption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jRadioButtonEncryption.isSelected()){

                }
            }
        });*/
    }

}

