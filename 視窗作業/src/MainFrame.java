import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JMenuBar jMenuBar =new JMenuBar();
    private JMenu jMenuExit =new JMenu("EXIT");
    private JMenu jMenuGame=new JMenu("Game");
    private JMenu jMenucryption=new JMenu("Eryption");
    private JMenuItem jMenuItemEXIT =new JMenuItem("EXIT");
    private JMenuItem jMenuItemGame=new JMenuItem("Game");
    private JMenuItem jMenuItemencryption=new JMenuItem("Encryption");
    private Container cp;
    public MainFrame(){init();}
    private void init(){
        this.setBounds(10,10,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
          cp.add(jMenuBar,BorderLayout.NORTH);
          jMenuBar.add(jMenucryption);
          jMenucryption.add(jMenuItemencryption);
          jMenuBar.add(jMenuGame);
          jMenuGame.add(jMenuItemGame);
        jMenuBar.add(jMenuExit);
        jMenuExit.add(jMenuItemEXIT);

        jMenuItemEXIT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(EXIT_ON_CLOSE);
            }
        });
        jMenuItemGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OOXX frm2=new OOXX(MainFrame.this);
                frm2.setVisible(true);
                MainFrame.this.dispose();
            }
        });
        jMenuItemencryption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                encryption encryption =new encryption(MainFrame.this);
                encryption.setVisible(true);
                MainFrame.this.dispose();
            }
        });
    }
}
