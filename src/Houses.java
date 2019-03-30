import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Robot squidward = new Robot();
		squidward.penDown();
		squidward.setSpeed(10);
		squidward.moveTo(50, 550);
		for (int i = 0; i < 9; i++) {
			Random rand = new Random();
			if (i % 3 == 0) {
				drawHouse(squidward, "small", new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
			} else if (i % 2 == 0) {
				drawHouse(squidward, "medium", new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
			} else {
				drawHouse(squidward, "large", new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
			}
		}
	}

	static void drawHouse(Robot r, String height, Color elmo) {

		r.setPenColor(elmo);

		if (height.equals("small")) {
			r.move(70);
			drawPointyRoof(r);
			r.move(70);

		} else if (height.equals("medium")) {
			r.move(120);
			drawPointyRoof(r);
			r.move(120);

		} else if (height.equals("large")) {
			r.move(250);
			drawFlatRoof(r);
			r.move(250);

		} else {
			r.move(100);
			r.turn(90);
			r.move(50);
			r.turn(90);
			r.move(100);
		}

		r.turn(-90);
		r.setPenColor(Color.GREEN);
		r.move(50);
		r.turn(-90);
		r.setPenColor(Color.BLACK);
	}

	static void drawPointyRoof(Robot r) {
		r.turn(50);
		r.move(40);
		r.turn(80);
		r.move(40);
		r.turn(50);
	}

	static void drawFlatRoof(Robot r) {
		r.turn(90);
		r.move(50);
		r.turn(90);
	}
}
