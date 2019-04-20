import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = new Random().nextInt(5);
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You feel like you're Sans");
		}
		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You'll watch Avengers End Game when it comes out");
		}
		else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "PewDiePie will be ahead of T Series");
		}
		else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You'll get a battle royale in Fortnite");
		}
		else if (rand == 0) {
			JOptionPane.showMessageDialog(null, "Shaggy will destroy you using 1% of his power");
		}
		// TODO Auto-generated method stub
		
	}
}