package lesson5;

/**
 * 1. You need to write two methods that do the following:
 * 1) Create a one-dimensional long array
 * 2) Fill this array with ones;
 * 3) Track the execution time
 * 4) Pass through the entire array and calculate a new value for each cell using the formula:
 * arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2)) ;
 * 5) The end time of the System.currentTimeMillis() method is checked;
 * 6) The running time is displayed in the console: System.out.println(System.currentTimeMillis() - a);
 *
 * The difference between the first method and the second:
 * The first one simply runs through the array and calculates the values.
 * The second splits the array into two arrays, calculates new values in two threads,
 * and then glues these arrays back into one.
 *
 */

public class Main {
    static final int SIZE = 10000000;
    static final int H = SIZE / 2;

    public static void main(String[] args) {
        timeToGo();
        timeToGoR();
    }

    public static void timeToGo(){
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void timeToGoR(){
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long start = System.currentTimeMillis();
        float[] arr1 = new float[H];
        float[] arr2 = new float[H];

        System.arraycopy(arr,0,arr1,0,H);
        System.arraycopy(arr,H,arr2,0,H);

        timeToGo timeToGo1 = new timeToGo(arr1,0);
        timeToGo timeToGo2 = new timeToGo(arr2,H);

        timeToGo1.start();
        timeToGo2.start();


        try {
            timeToGo1.join();
            timeToGo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, arr, 0, H);
        System.arraycopy(arr2, 0, arr, H, H);

        System.out.println(System.currentTimeMillis() - start);

    }
}