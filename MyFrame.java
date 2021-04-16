import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
public class MyFrame extends JFrame{
	MyFrame(){
		this.setTitle("JFrame Title goes gere");
		this.setSize(420,420);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image=new ImageIcon("C:\\Users\\sunka\\Pictures\\Saved Pictures\\superlogo.jfif");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(128,23,145));  ///Color.green we can use 
        }
}