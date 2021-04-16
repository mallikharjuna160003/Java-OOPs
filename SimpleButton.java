import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
public class SimpleButton extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	SimpleButton(){
		ImageIcon icon = new ImageIcon("C:\\Users\\sunka\\Pictures\\Saved Pictures\\point1.jpg");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\sunka\\Pictures\\Saved Pictures\\emoj.png");

        label =new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);
         
		button = new JButton();
		button.setBounds(200,100,300,100);
		button.addActionListener(this);
		button.setText("Click Me!");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,20));
        button.setIconTextGap(-5);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);


	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button){
            System.out.println("PPooo");
            //button.setEnabled(true);
            label.setVisible(true);
		}
	}
	public static void main(String[] args){
       
       new SimpleButton();


	}
}