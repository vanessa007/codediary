import javax.swing.*;
import java.awt.*;

public class FourIconsOnFourLabels extends JFrame {
	
	private ImageIcon icon1 = new ImageIcon("image/1.gif");
	private ImageIcon icon2 = new ImageIcon("/Users/Vanessa/Desktop/2.gif");
	private ImageIcon icon3 = new ImageIcon("desktop/3.gif");
	private ImageIcon icon4 = new ImageIcon("desktop/4.gif");
	
	public FourIconsOnFourLabels() {
		setLayout(new GridLayout(2, 2, 10, 10));
		add(new JLabel(icon1));
		add(new JLabel(icon2));
		add(new JLabel(icon3));
		add(new JLabel(icon4));
	}
	
	public static void main(String[] args) {
		FourIconsOnFourLabels frame = new FourIconsOnFourLabels();
		frame.setTitle("Four icons on four labels");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
