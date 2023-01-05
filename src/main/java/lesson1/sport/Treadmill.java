package lesson1.sport;

import lesson1.beings.RunJumpable;
import lesson1.sport.Obstacle;

public class Treadmill implements Obstacle {
    private double sizeObstacle;

    public Treadmill(double sizeObstacle){
        this.sizeObstacle = sizeObstacle;
    }

    @Override
    public boolean action(RunJumpable runJumpable) {
        return runJumpable.run(sizeObstacle);
    }
}
