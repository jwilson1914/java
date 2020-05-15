
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class passCheck{
	public static void main(String args[]) {
	JFrame f=new JFrame("Java Application");
	f.getContentPane().setBackground(new Color(70,130,190));
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel lab1;
	JTextField t2;
	lab1=new JLabel("Password Strength");
	lab1.setForeground(new Color (255,255,255));
	lab1.setBounds(100,100,200,30);
	lab1.setHorizontalAlignment(JLabel.CENTER);
	lab1.setBorder(new LineBorder(new Color(255,0,0),2,true));
	
	//JText field and styling
	t2=new JTextField("");
	lab1.setLabelFor(t2);
	Font g1 = new Font("Arial",Font.BOLD,20);
	t2.setFont(new Font("Ubuntu",Font.ITALIC,18));
	t2.setToolTipText("Your passwordd\r\n");
	t2.setBounds(100,150,200,30);
	t2.setForeground(Color.BLACK);
	//action Listener for updating Jlabel
	t2.addKeyListener(new KeyAdapter() {
	public void keyReleased(KeyEvent e) {
		// regular expression for pattern matching
		String pasword = t2.getText();
		lab1.setText("Invalid Password");
		String passwd = t2.getText();
		if(passwd.length()>7)
			if(passwd.matches("(?=.*[A-Z]).*"))

				if(passwd.matches("(?=.*[a-z]).*"))

				if(passwd.matches("(?=.*[0-9]).*"))

				lab1.setText("Valid Password");
	}
	 public void keyTyped(KeyEvent e) {
	 }
	 public void keyPressed(KeyEvent e) {
	 }
	});
	//Add coponents to fame and set frame options
	f.getContentPane().add(lab1);
	f.getContentPane().add(t2);
	f.setSize(400,400);
	f.setResizable(false);
	f.getContentPane().setLayout(null);
	f.setVisible(true);
}
}
	

