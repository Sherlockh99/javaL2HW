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
            System.out.printf("The man %s was able to run %s m. \n",name,dist);
        }else{
            System.out.printf("The man %s could not run %s m. \n",name,dist);
        }
        return dist<=MAX_RUN;
    }

    @Override
    public boolean jump(double dist) {
        if(dist<=MAX_JUMP){
            System.out.printf("The man %s was able to jump %s m. \n",name,dist);
        }else{
            System.out.printf("The man %s could not jump %s m. \n",name,dist);
        }
        return dist<=MAX_JUMP;
    }
}
