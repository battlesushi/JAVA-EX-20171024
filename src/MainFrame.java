import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame {
    private LoginFrame loginFrame=new LoginFrame();
    private JMenuBar jmb=new JMenuBar();
    private JMenu jmF=new JMenu("File");
    private JMenuItem jMenuItemExit=new JMenuItem("Exit");
    private JMenuItem jMenuItemLoto=new JMenuItem("Loto");
    private JDesktopPane jdp=new JDesktopPane();//用不到cp的話
    private JInternalFrame jInternalFrame=new JInternalFrame();

    public MainFrame(LoginFrame login){
        init();
        loginFrame=login;
    }
    public void init(){
        this.setBounds(300,300,500,400);
        this.setLocationRelativeTo(null);
        this.setJMenuBar(jmb);
        this.setContentPane(jdp);//用不到cp的話
        jmb.add(jmF);
        jmF.add(jMenuItemExit);
        jmF.add(jMenuItemLoto);
        jInternalFrame.setBounds(0,0,200,80);
        jMenuItemLoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jdp.add(jInternalFrame);
                jInternalFrame.setVisible(true);
            }
        });
        jMenuItemExit.setAccelerator(KeyStroke.getKeyStroke('X', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        jMenuItemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                loginFrame.setVisible(true);
            }
        });
    }


}
