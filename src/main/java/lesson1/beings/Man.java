package lesson1.beings;

public class Man implements RunJumpable {
    private String name;
    private final double MAX_JUMP = 1.5;
    private final double MAX_RUN = 3500.0;


    public Man(String name){
        this.name = name;
    }

    @Override
    public boolean run(double dist) {
        if(dist<=MAX_RUN){
            System.out.printf("Человек %s смог пробежать %s м. \n",name,dist);
        }else{
            System.out.printf("Человек %s не смог пробежать %s м. \n",name,dist);
        }
        return dist<=MAX_RUN;
    }

    @Override
    public boolean jump(double dist) {
        if(dist<=MAX_JUMP){
            System.out.printf("Человек %s смог перепрыгнуть %s м. \n",name,dist);
        }else{
            System.out.printf("Человек %s не смог перепрыгнуть %s м. \n",name,dist);
        }
        return dist<=MAX_JUMP;
    }
}
