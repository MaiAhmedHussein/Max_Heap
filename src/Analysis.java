import SortingTechniques.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Analysis {
    public static int[] generate_DataSet(int size) {
        Random generate = new Random(); // creating Random object
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = generate.nextInt(); // storing random integers in an array
        }
        return a;
    }

    public void analysis(int size) {
        int[] arr = generate_DataSet(size);


        Heap heap = new Heap();
        BubbleSort bubble = new BubbleSort();
        InsertionSort insertion = new InsertionSort();
        SelectionSort selection = new SelectionSort();
        MergeSort merge = new MergeSort();
        SelectionSort select = new SelectionSort();
        QuickSort quick =new QuickSort();
    //////////////////////////////////////////////////////////////////////////////////////////////////////
        int[] array = Arrays.copyOf(arr, arr.length);
        long startheap = System.nanoTime();
        heap.HEAPSORT(array);
        long endheap = System.nanoTime();
        System.out.println("execution time for  heap Sort: " + (endheap - startheap) + " nanosecond\n");
        System.out.println("------------------------------------------------------------------");

        //////////////////////////////////////////////////////////////////////
        array = Arrays.copyOf(arr, arr.length);
        long startMerge = System.nanoTime();
        merge.sort(array);
        long endMerge = System.nanoTime();
        System.out.println("execution time for  Merge Sort: " + (endMerge - startMerge) + " nanosecond\n");
        System.out.println("------------------------------------------------------------------");

        //////////////////////////////////////////////////////////////////////////////////
        array = Arrays.copyOf(arr, arr.length);
        long startQuick = System.nanoTime();
        quick.sort(array);
        long endQuick = System.nanoTime();
        System.out.println("execution time for  Quick Sort: " + (endQuick - startQuick) + " nanosecond\n");
        System.out.println("------------------------------------------------------------------");

        //////////////////////////////////////////////////////////////////////////////////

        array = Arrays.copyOf(arr, arr.length);
        long startBubble = System.nanoTime();
        bubble.sort(array);
        long endBubble = System.nanoTime();
        System.out.println("execution time for  bubbleSort: " + (endBubble - startBubble) + " nanosecond\n");
        System.out.println("------------------------------------------------------------------");
        ////////////////////////////////////////////////////////////////////////////////////////////////

        array = Arrays.copyOf(arr, arr.length);
        long startInsertion = System.nanoTime();
        insertion.sort(array);
        long endInsertion = System.nanoTime();
        System.out.println("execution time for  Insertion Sort: " + (endInsertion - startInsertion) + " nanosecond\n");
        System.out.println("------------------------------------------------------------------");
        /////////////////////////////////////////////////////////////////////////////////////////////////

        array = Arrays.copyOf(arr, arr.length);
        long startSelection = System.nanoTime();
        selection.sort(array);
        long endSelection = System.nanoTime();
        System.out.println("execution time for  Selection Sort: " + (endSelection - startSelection) + " nanosecond\n");
        System.out.println("------------------------------------------------------------------");


    }
}
