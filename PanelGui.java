import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BorderLayout;
public class PanelGui{
	public static void main(String[] args){
       //JPanel-GUI component that functions as a container to hold other components
		ImageIcon icon=new ImageIcon("C:\\Users\\sunka\\Pictures\\Saved Pictures\\bull.jpg");
		JLabel label=new JLabel();
		label.setText("Hai");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setFont(new Font("Verdana",Font.PLAIN,20));
		label.setBounds(100,100,200,200);
		JPanel redpanel=new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0,0,250,250);
		redpanel.setLayout(null);

        JPanel bluepanel=new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(250,0,250,250);
		bluepanel.setLayout(null);

        JPanel greenpanel=new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0,250,500,250);
        greenpanel.add(label);
        greenpanel.setLayout(new BorderLayout());

		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
		

	}
}