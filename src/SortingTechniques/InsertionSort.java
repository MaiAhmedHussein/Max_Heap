package SortingTechniques;

public class InsertionSort {
    public void sort(int array[]){
        for(int i=1;i< array.length;i++){
            int current =array[i];
            int j=i-1;
            while(j>=0 && array[j]>current){
                //shift item to the right
                //shift (copy) to right instead of swap
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }
    }
}
