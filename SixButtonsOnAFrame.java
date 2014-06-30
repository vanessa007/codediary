import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class SixButtonsOnAFrame extends JFrame{
	public SixButtonsOnAFrame() {
		setLayout(new FlowLayout());
		
		for (int i = 0; i < 6; i++) {
			add(new JButton("Button" + (i + 1)));
		}
	}
	
	public static void main(String[] args) {
		SixButtonsOnAFrame frame = new SixButtonsOnAFrame();
		frame.setTitle("SixButtonsOnAFrame");
		frame.setSize(300, 100);
		frame.setVisible(true);
	}
	
}
