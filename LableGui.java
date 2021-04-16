import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
public class LableGui{

	public static void main(String[] args){
//JLabel = a HUI display area for a string of text,an image or both
		ImageIcon image = new ImageIcon("C:\\Users\\sunka\\Pictures\\Saved Pictures\\bull.jpg");
		Border border=BorderFactory.createLineBorder(Color.green,3);
		JLabel label =new JLabel();//create a label
        label.setText("Bro, do you even code?");//set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT,CENTER,RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP);//set text TOP,CENTER
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("Verdana",Font.PLAIN,20));//set font of text
        label.setIconTextGap(100);
        label.setBackground(Color.black);
        label.setOpaque(true);//display bg color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label
        //label.setBounds(100,100,250,250);//set x,y positionn within frame as well as dimensions

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        
        //frame.setResizable(false);
        frame.add(label);
        frame.pack();

	}
}