/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String alia = "https://i.ytimg.com/vi/y98De45A94Y/maxresdefault.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component sans;
		// 3. use the "createImage()" method below to initialize your Component
		sans = createImage(alia);
		// 4. add the image to the quiz window
		quizWindow.add(sans);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String shaggy = JOptionPane.showInputDialog("how much percent can shaggy defeat goku?");
		// 7. print "CORRECT" if the user gave the right answer
		if (shaggy.equals(".5") || shaggy.equals("0.5")) {
			JOptionPane.showMessageDialog(null, "Correct");

		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(sans);
		// 10. find another image and create it (might take more than one line of code)
		String sub2pewdiepie = "https://res.cloudinary.com/teepublic/image/private/s--z-Ksw1qS--/t_Preview/b_rgb:36538b,c_limit,f_jpg,h_630,q_90,w_630/v1492165319/production/designs/1449680_1.jpg";
		Component thatshot;
		thatshot = createImage(sub2pewdiepie);
		// 11. add the second image to the quiz window
		quizWindow.add(thatshot);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String pie = JOptionPane.showInputDialog("what is the most cringiest video on youtube?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (pie.equals("youtuberewind")) {
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
