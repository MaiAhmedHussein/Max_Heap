import SortingTechniques.BubbleSort;
import SortingTechniques.InsertionSort;
import SortingTechniques.MergeSort;
import SortingTechniques.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Heap maxHeap = new Heap();
        Analysis an=new Analysis();
        PQ ob = new PQ();
        BubbleSort bubble=new BubbleSort();
        InsertionSort insertion =new InsertionSort();
        SelectionSort selection=new SelectionSort();
        MergeSort merge =new MergeSort();

        System.out.println("1-Build Max Heap");
        System.out.println("2-Max Heap Insert");
        System.out.println("3-HeapExtract Max");
        System.out.println("4-Heap Sort");
        System.out.println("5-Bubble Sort");
        System.out.println("6-Merge Sort");
        System.out.println("7-Selection Sort");
        System.out.println("8-Insertion Sort");
        System.out.println("9-Quick Sort");
        System.out.println("10-Compare between different Sort algorithms");
        System.out.println("11-EXIT");

        int op;
        boolean flag = true;

        Scanner sc=new Scanner(System.in);
        while(flag) {

            System.out.println("--------------------------------");
            System.out.println("Enter number of what you need:");
            op = sc.nextInt();

            switch (op) {
                case 1: {
                    System.out.println("Enter the array to be built: ");
                    String str = sc.next();
                    String[] s=str.split(" ");
                    int[] arr = new int[s.length];
                    for (int i = 0; i < s.length; i++) {
                        arr[i] = Integer.valueOf(s[i]);
                    }

                    maxHeap.Build_Max_Heap(arr);
                    System.out.println("Array after being built:");
                    for (int i = 0; i < arr.length; ++i) {
                        System.out.print(" " + arr[i]);
                    }
                }
                    break;
                case 2:{
                    System.out.println("Enter the numbers to be inserted, leaving space between each 2 numbers:");
                    String str = sc.next();
                    String[] s=str.split(" ");
                    for (int i = 0; i < s.length; i++) {
                        ob.insert( Integer.valueOf(s[i]));
                    }

                    System.out.println("Array after insertion:");
                    for (int i = 0; i < ob.size; ++i) {
                        System.out.print(" " + ob.heap[i]);
                    }
                }
                 break;

                case 3:{
                    if(ob.size>0) {
                        System.out.println("The Heap Max: " + ob.Heap_Extract_Max());
                    }else{
                        System.out.println("The array is empty!!");
                    }
                }
                break;

                case 4:{
                    System.out.println("Enter the array to be heap sorted: ");
                    String str = sc.next();
                    String[] s=str.split(" ");
                    int[] arr = new int[s.length];
                    for (int i = 0; i < s.length; i++) {
                        arr[i] = Integer.valueOf(s[i]);
                    }

                    maxHeap.HEAPSORT(arr);

                    System.out.println("Array after heap sorting:");
                    for (int i = 0; i < arr.length; ++i) {
                        System.out.print(" " + arr[i]);
                    }
                }
                break;
                case 5:{
                    System.out.println("Enter the array to be bubble sorted: ");
                    String str = sc.next();
                    String[] s=str.split(" ");
                    int[] arr = new int[s.length];
                    for (int i = 0; i < s.length; i++) {
                        arr[i] = Integer.valueOf(s[i]);
                    }

                    bubble.sort(arr);

                    System.out.println("Array after bubble sorting:");
                    for (int i = 0; i < arr.length; ++i) {
                        System.out.print(" " + arr[i]);
                    }
                }
                break;

                case 6:{
                    System.out.println("Enter the array to be insertion sorted: ");
                    String str = sc.next();
                    String[] s=str.split(" ");
                    int[] arr = new int[s.length];
                    for (int i = 0; i < s.length; i++) {
                        arr[i] = Integer.valueOf(s[i]);
                    }

                    insertion.sort(arr);

                    System.out.println("Array after insertion sorting:");
                    for (int i = 0; i < arr.length; ++i) {
                        System.out.print(" " + arr[i]);
                    }
                }
                break;

                case 7:{
                    System.out.println("Enter the array to be merge sorted: ");
                    String str = sc.next();
                    String[] s=str.split(" ");
                    int[] arr = new int[s.length];
                    for (int i = 0; i < s.length; i++) {
                        arr[i] = Integer.valueOf(s[i]);
                    }

                    merge.sort(arr);

                    System.out.println("Array after merge sorting:");
                    for (int i = 0; i < arr.length; ++i) {
                        System.out.print(" " + arr[i]);
                    }
                }
                break;
                case 8:{
                    System.out.println("Enter the array to be selection sorted: ");
                    String str = sc.next();
                    String[] s=str.split(" ");
                    int[] arr = new int[s.length];
                    for (int i = 0; i < s.length; i++) {
                        arr[i] = Integer.valueOf(s[i]);
                    }

                    selection.sort(arr);

                    System.out.println("Array after selection sorting:");
                    for (int i = 0; i < arr.length; ++i) {
                        System.out.print(" " + arr[i]);
                    }
                }
                break;

                case 10:{
                    System.out.println("Enter preferred array size to be compared:");
                    int arrSize = sc.nextInt();
                    an.analysis(arrSize);
                }
                break;

                case 11:{
                    flag=false;
                    break;
                }
            }
        }

    }
}
