package lesson5;

public class timeToGo extends Thread{

    private float[] arr;
    private int c;

    public timeToGo(float[] arr, int c){
        this.arr = arr;
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            int j = i + c;
            arr[i] = (float)(arr[i] * Math.sin(0.2f + j  / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
        }
    }

}
