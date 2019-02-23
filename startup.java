import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class startup extends JPanel{
	
	static JFrame frame;
	//static BufferedImage start_window;
	
	/*
	public void Initialize(JLabel l) {
		l.setIcon(new javax.swing.ImageIcon(getClass().getResource("frontScreen_mockup.gif")));
	}
	*/
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawImage(start_window,  0,  0,  this);
	}
	
	public static void main(String args[]) {
		System.out.println("Hello World\nWhat up");
		int a = 2;
		int b = 3;
		int c = a+b;
		System.out.println("a+b=c="+c);
		
		frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		
		ImageIcon image = new ImageIcon("\\\\cs1\\\\2020\\\\jgallegos20\\\\CS-378H-N-MakeAnything\\\\HW1\\\\frontScreen_mockup.gif");
		Image img = image.getImage();
		BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		Graphics g = bi.createGraphics();
		g.drawImage(img, 22, 0, 786, 656, null);
		ImageIcon newIcon = new ImageIcon(bi);
		
		JLabel label = new JLabel(newIcon);
		label.setVisible(true);
		
		/*
		try {
			start_window = ImageIO.read(new File("\\cs1\\2020\\jgallegos20\\CS-378H-N-MakeAnything\\HW1\\frontScreen_mockup.gif"));
		}
		catch(IOException ex) {
			System.out.println("bad file read");
		}
		*/
		
		//Initialize(label);
		button.setText("button!");
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(button);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 700);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
}