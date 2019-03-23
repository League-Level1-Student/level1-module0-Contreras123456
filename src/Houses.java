import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Robot squidward = new Robot();
		squidward.penDown();
		squidward.setSpeed(10);
		squidward.moveTo(50, 550);
		for (int i = 0; i < 10; i++) {
			drawHouse(squidward);
		}
	}

	static void drawHouse(Robot r) {

		r.move(100);
		r.turn(90);
		r.move(50);
		r.turn(90);
		r.move(100);
		r.turn(-90);
		r.setPenColor(Color.GREEN);
		r.move(50);
		r.turn(-90);
		r.setPenColor(Color.BLACK);
	}
}
