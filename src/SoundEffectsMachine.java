import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	public static void main(String[] args) {
		new SoundEffectsMachine().createUI();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton buttonjr = new JButton();
	JButton buttonthethird = new JButton();

	public void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(buttonjr);
		panel.add(buttonthethird);
		frame.pack();
		button.setText("sound effect 1");
		buttonjr.setText("sound effect 2");
		buttonthethird.setText("sound effect 3");
		frame.pack();
		button.addActionListener(this);
		buttonjr.addActionListener(this);
		buttonthethird.addActionListener(this);
	
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			playSound("soundeffect.wav");
		} else if (e.getSource() == buttonjr) {
			playSound("soundeffect2.wav");
		} else if (e.getSource() == buttonthethird) {
			playSound("soundeffect3.wav");
		}
	
	}
}
