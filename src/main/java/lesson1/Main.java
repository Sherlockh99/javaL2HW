package lesson1;

public class Main {
    public static void main(String[] args) {
        RunJumpable[] runJumpables = new RunJumpable[3];

        runJumpables[0] = new Cat("Мурзилка");
        runJumpables[1] = new Man("Супермен");
        runJumpables[2] = new Robot("Трансформер");

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
