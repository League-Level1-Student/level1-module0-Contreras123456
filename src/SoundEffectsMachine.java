import java.applet.AudioClip;
import java.awt.event.ActionEvent;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine {
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
		playSound("soundeffect1.wav");
	}

	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	    	 sound.play();
		}  	   	
	}


