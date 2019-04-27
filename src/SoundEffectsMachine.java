import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine {
	public static void main(String[] args) {
		new SoundEffectsMachine().createUI();
	}
	public void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JButton buttonjr = new JButton();
		JButton buttonthethird = new JButton();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(buttonjr);
		panel.add(buttonthethird);
		frame.pack();
	}

}
