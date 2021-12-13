package lesson1;

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
