import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OOXX extends JFrame {
    Container cp;
    JLabel jLabel=new JLabel("Game");
    JPanel jPanel =new JPanel(new GridLayout(3,3,3,3));
    JPanel jPane2 =new JPanel(new BorderLayout(3,3));
    JButton jbn01 = new JButton();
    JButton jbn02 = new JButton();
    JButton jbn03 = new JButton();
    JButton jbn04 = new JButton();
    JButton jbn05 = new JButton();
    JButton jbn06 = new JButton();
    JButton jbn07 = new JButton();
    JButton jbn08 = new JButton();
    JButton jbn09 = new JButton();
    private int x=0;
    MainFrame frame2;
    public OOXX (MainFrame frm){
   init(frm);
   frame2=frm;

    }

    private void init(MainFrame frm){
        this.setBounds(10,10,500,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                MainFrame frm =new MainFrame();
                frm.setVisible(true);
               OOXX.this.dispose();
            }
        });
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,5));
        cp.add(jPane2,BorderLayout.NORTH);
        cp.add(jPanel,BorderLayout.CENTER);
        jPane2.setSize(this.getWidth(),100);
        jLabel.setFont(new Font(null,Font.BOLD,40));
        jPane2.add(jLabel);
        jLabel.setOpaque(true);
        jLabel.setBackground(new Color(255,255,0) );
        jbn01.setFont(new Font(null,Font.BOLD,50));
        jbn02.setFont(new Font(null,Font.BOLD,50));
        jbn03.setFont(new Font(null,Font.BOLD,50));
        jbn04.setFont(new Font(null,Font.BOLD,50));
        jbn05.setFont(new Font(null,Font.BOLD,50));
        jbn06.setFont(new Font(null,Font.BOLD,50));
        jbn07.setFont(new Font(null,Font.BOLD,50));
        jbn08.setFont(new Font(null,Font.BOLD,50));
        jbn09.setFont(new Font(null,Font.BOLD,50));
        jPanel.add(jbn01);
        jPanel.add(jbn02);
        jPanel.add(jbn03);
        jPanel.add(jbn04);
        jPanel.add(jbn05);
        jPanel.add(jbn06);
        jPanel.add(jbn07);
        jPanel.add(jbn08);
        jPanel.add(jbn09);
        jbn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn =(JButton)e.getSource();
                if (x%2==0){
                    jbn01.setText("O");
                }else {
                    jbn01.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                checkVictory();
            }
        });
        jbn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn =(JButton)e.getSource();
                if (x%2==0){
                    jbn02.setText("O");
                }else {
                    jbn02.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                checkVictory();
            }
        });
        jbn03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn =(JButton)e.getSource();
                if (x%2==0){
                    jbn03.setText("O");
                }else {
                    jbn03.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                checkVictory();
            }
        });
        jbn04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn =(JButton)e.getSource();
                if (x%2==0){
                    jbn04.setText("O");
                }else {
                    jbn04.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                checkVictory();
            }
        });
        jbn05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn =(JButton)e.getSource();
                if (x%2==0){
                    jbn05.setText("O");
                }else {
                    jbn05.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                checkVictory();
            }
        });
        jbn06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn =(JButton)e.getSource();
                if (x%2==0){
                    jbn06.setText("O");
                }else {
                    jbn06.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                checkVictory();
            }
        });
        jbn07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn =(JButton)e.getSource();
                if (x%2==0){
                    jbn07.setText("O");
                }else {
                    jbn07.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                checkVictory();
            }
        });
        jbn08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn =(JButton)e.getSource();
                if (x%2==0){
                    jbn08.setText("O");
                }else {
                    jbn08.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                checkVictory();
            }
        });
        jbn09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tembtn =(JButton)e.getSource();
                if (x%2==0){
                    jbn09.setText("O");
                }else {
                    jbn09.setText("X");
                }
                x++;
                tembtn.setEnabled(false);
                checkVictory();
            }
        });
    }
    private void checkVictory() {
        if (jbn01.getText().equals(jbn02) && jbn02.getText().equals(jbn03) && !jbn01.getText().equals("")) {
            jLabel.setText("PLAYER1 WIN");
            if (jbn01.getText().equals("O")) {
                jLabel.setText("PLAYER1 WIN");
            } else {
                jLabel.setText("PLAYER2 WIN");
            }
        } else {
            if (jbn04.getText().equals(jbn05) && jbn05.getText().equals(jbn06) && !jbn04.getText().equals("")) {
                if (jbn04.getText().equals("O")) {
                    jLabel.setText("PLAYER1 WIN");
                } else {
                    jLabel.setText("PLAYER2 WIN");
                }
            } else {
                if (jbn07.getText().equals(jbn08) && jbn08.getText().equals(jbn09) && !jbn07.getText().equals("")) {
                    if (jbn07.getText().equals("O")) {
                        jLabel.setText("PLAYER1 WIN");
                    } else {
                        jLabel.setText("PLAYER2 WIN");
                    }
                } else {
                    if (jbn01.getText().equals(jbn05) && jbn05.getText().equals(jbn09) && !jbn01.getText().equals("")) {
                        if (jbn01.getText().equals("O")) {
                            jLabel.setText("PLAYER1 WIN");
                        } else {
                            jLabel.setText("PLAYER2 WIN");
                        }
                    } else {
                        if (jbn03.getText().equals(jbn05) && jbn05.getText().equals(jbn07) && !jbn03.getText().equals("")) {
                            if (jbn03.getText().equals("O")) {
                                jLabel.setText("PLAYER1 WIN");
                            } else {
                                jLabel.setText("PLAYER2 WIN");
                            }
                        }
                    }
                }
            }
        }
    }
}