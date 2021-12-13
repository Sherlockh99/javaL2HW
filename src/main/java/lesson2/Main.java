package lesson2;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[][] arrString = new String[4][4];
        for (int i = 0; i < arrString.length; i++) {
            for (int j = 0; j < arrString[i].length; j++) {
                arrString[i][j] = Integer.toString(i+j);
            }
        }

        arrString[1][2] = "ddd";
        printArray(arrString);
        try {
            int sum = Array4x4(arrString);
            System.out.println(sum);
        }catch (MySizeArrayException e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }
        System.out.println("END");
    }

    public static int Array4x4(String[][] arrays) throws MySizeArrayException, MyArrayDataException {
        if(arrays.length>4){
            throw new MySizeArrayException("Неверно указан размер массива");
        }

        for (int i = 0; i <arrays.length; i++) {
            if(arrays[i].length>4){
                throw new MySizeArrayException("Неверно указан размер массива");
            }
        }

        int sum = 0;
        for (int i = 0; i <arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                try{
                    sum = sum + Integer.parseInt(arrays[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Некорректно указано число в ячейке [" + (i+1)+"]["+(j+1)+"]");
                }
            }
        }
        return sum;
    }

    public static void printArray(String[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            printArray(arr[i]);
        }
    }

}
