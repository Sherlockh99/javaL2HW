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
            System.out.printf("The robot %s was able to run %s m. \n",name,dist);
        }else{
            System.out.printf("The robot %s could not run %s m. \n",name,dist);
        }
        return dist<=MAX_RUN;
    }

    @Override
    public boolean jump(double dist) {
        if(dist<=MAX_JUMP){
            System.out.printf("The robot %s was able to jump %s m. \n",name,dist);
        }else{
            System.out.printf("The robot %s could not jump %s m. \n",name,dist);
        }
        return dist<=MAX_JUMP;
    }
}
