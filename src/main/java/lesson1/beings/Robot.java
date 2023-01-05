package lesson1.beings;

public class Robot implements RunJumpable {
    private String name;
    private final double MAX_JUMP = 0.5;
    private final double MAX_RUN = 5500.0;


    public Robot(String name){
        this.name = name;
    }

    @Override
    public boolean run(double dist) {
        if(dist<=MAX_RUN){
            System.out.printf("Робот %s смог пробежать %s м. \n",name,dist);
        }else{
            System.out.printf("Робот %s не смог пробежать %s м. \n",name,dist);
        }
        return dist<=MAX_RUN;
    }

    @Override
    public boolean jump(double dist) {
        if(dist<=MAX_JUMP){
            System.out.printf("Робот %s смог перепрыгнуть %s м. \n",name,dist);
        }else{
            System.out.printf("Робот %s не смог перепрыгнуть %s м. \n",name,dist);
        }
        return dist<=MAX_JUMP;
    }
}
