import javax.swing.*;
import java.awt.*;

public class FourIconsOnFourLabels extends JFrame {
	
	private ImageIcon icon1 = new ImageIcon("1.png");
	private ImageIcon icon2 = new ImageIcon("2.png");
	private ImageIcon icon3 = new ImageIcon("3.png");
	private ImageIcon icon4 = new ImageIcon("4.png");
	
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
