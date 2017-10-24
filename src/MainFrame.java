import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame {
    public LoginFrame loginFrame=new LoginFrame();
    public JMenuBar jmb=new JMenuBar();
    public JMenu jmF=new JMenu("File");
    public MainFrame(LoginFrame login){
        init();
        loginFrame=login;
    }
    public void init(){
        this.setBounds(300,300,500,400);
        this.setLocationRelativeTo(null);
        this.setJMenuBar(jmb);
        jmb.add(jmF);



        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                loginFrame.setVisible(true);
            }
        });
    }


}
