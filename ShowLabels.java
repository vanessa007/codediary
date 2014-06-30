import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ShowLabels extends JFrame {
	public ShowLabels() {
		JLabel l1 = new JLabel("Department of Science");
		l1.setBorder(new LineBorder(Color.BLACK, 1));
		add(l1);
		JLabel l2 = new JLabel("School of Computing");
		l2.setBorder(new LineBorder(Color.BLACK, 1));
		add(l2);
		JLabel l3 = new JLabel("Armstrong Atlantic State University");
		l3.setBorder(new LineBorder(Color.BLACK, 1));
		add(l3);
		JLabel l4 = new JLabel("Tel (912) 921 6440");
		l4.setBorder(new LineBorder(Color.BLACK, 1));
		add(l4);
	}
	
	public static void main(String[] args) {
		ShowLabels myLabel = new ShowLabels();
		myLabel.setLayout(new GridLayout(4, 1, 5, 5));
		myLabel.setSize(300, 200);
		myLabel.setTitle("Show labels");
		myLabel.setVisible(true);
		myLabel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


