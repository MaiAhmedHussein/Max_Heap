import SortingTechniques.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Analysis {
    public static int [] generate_DataSet(int size){
        Random generate = new Random(); // creating Random object
        int [] a=new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = generate.nextInt(); // storing random integers in an array
        }
        return a;
    }
    public void analysis(int size) {
        int []array =new int [size];
        array=generate_DataSet(size);
        BubbleSort bubble=new BubbleSort();
        System.out.println(Arrays.toString(array));
        long start = System.nanoTime();
        for (int i = 0; i <array.length; i++) {
          bubble.sort(array);
        }
        long end = System.nanoTime();
        System.out.println("execution time for  bubbleSort: " + (end - start) + " nanosecond\n");
        System.out.println("array after bubble sort : " +Arrays.toString(array));
    }
}
