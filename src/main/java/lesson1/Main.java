package lesson1;

import lesson1.beings.*;
import lesson1.sport.Obstacle;
import lesson1.sport.Treadmill;
import lesson1.sport.Wall;

/**
 * 1. Create three classes Man, Cat, Robot that do not inherit from the same class.
 * These classes must be able to run and jump.
 *
 * 2. Create two classes: a treadmill and a wall, when passing through which,
 * participants must perform the appropriate actions (run or jump),
 * the result of the execution is printed to the console (successfully ran, could not run, etc.).
 *
 * 3. Create two arrays: with participants and obstacles,
 * and have all participants go through this set of obstacles.
 *
 * 4. * Obstacles have a length (for a track) or a height (for a wall),
 * and participants have restrictions on running and jumping.
 * If the participant could not pass one of the obstacles,
 * then he does not go further along the list of obstacles.
 */

public class Main {
    public static void main(String[] args) {
        RunJumpable[] runJumpables = new RunJumpable[3];

        runJumpables[0] = new Cat("Murzilka");
        runJumpables[1] = new Man("Batman");
        runJumpables[2] = new Robot("Transformer");

        Obstacle[] obstacles = new Obstacle[3];
        obstacles[0] = new Treadmill(89);
        obstacles[1] = new Wall(1.5);
        obstacles[2] = new Treadmill(900);

        for (int i = 0; i < runJumpables.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if(!obstacles[j].action(runJumpables[i])){
                    break;
                };
            }
        }
    }
}
