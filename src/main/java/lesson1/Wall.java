package lesson1;

public class Wall implements Obstacle {
    private double sizeObstacle;

    public Wall(double sizeObstacle){
        this.sizeObstacle = sizeObstacle;
    }

    @Override
    public boolean action(RunJumpable runJumpable) {
        return runJumpable.jump(sizeObstacle);
    }
}
