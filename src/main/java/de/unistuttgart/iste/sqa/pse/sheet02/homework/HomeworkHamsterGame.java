package de.unistuttgart.iste.sqa.pse.sheet02.homework;

/**
 * Describe the class HomeworkHamsterGame here.
 *
 * @author (Farida Akrab)
 */
public class HomeworkHamsterGame extends InternalHomeworkHamsterGame {

	/*
	 * Confused Paule! Help Paule to walk through the territory and to bring all the
	 * grains into his cave. In the process Paule should collect all grains on the
	 * field and deposit them in his cave.
	 */
	@Override
	protected void hamsterRun() {
		// EXERCISE 2:
		// Help Paule to walk through the territory and to bring all the grains
		// into his cave.

		// Walk to the first grain
		paule.move();
		paule.move();
		paule.move();
		paule.move();
		paule.move();

		// Pick up the first grain
		paule.pickGrain();

		// Turn in the direction of the second grain
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();
		

		// Move to the second grain
		paule.move();
		paule.move();

		// Turn in the direction of the second grain
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		//Move to second grain
		paule.move();
		paule.move();
		paule.move();

		//Pick up second grain
		paule.pickGrain();

		//Turn in the direction of third grain
		paule.turnLeft();
		paule.move();
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		//move in the direction of third grain
		paule.move();
		paule.move();

		//Pick up third grain
		paule.pickGrain();

		//Turn in the direction of the fourth grain
		paule.turnLeft();
		paule.turnLeft();

		//move in the direction of the fourth grain
		paule.move();
		paule.move();
		paule.move();

		//turn in the direction of the fourth grain
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		//move in the direction of the fourth grain
		paule.move();
		paule.move();

		//turn in the direction of the fourth grain
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		//move in the direction of the fourth grain
		paule.move();
		paule.move();
		paule.move();

		//pick up fourth and fifth and sixth grain
		paule.pickGrain();
		paule.pickGrain();
		paule.pickGrain();

		//turn in the direction of hohle
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		//move in the direction of hohle
		paule.move();
		paule.move();
		paule.move();

		//turn in the direction of hohle
		paule.turnLeft();

		//move in the direction of hohle
		paule.move();
		paule.move();
		paule.move();

		//Turn in the direction of hohle
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		//move in the direction of hohle
		paule.move();
		paule.move();

		//Turn in the direction of hohle 
		paule.turnLeft();
		paule.turnLeft();
		paule.turnLeft();

		//move in the direction of hohle
		paule.move();
		paule.move();
		paule.move();

		//Put grain in hohle
		paule.putGrain();
		paule.putGrain();
		paule.putGrain();
		paule.putGrain();
		paule.putGrain();
		paule.putGrain();

		//write "Wuhu,I did it!"
		paule.write("wuhu, I did it !");
	}
}
