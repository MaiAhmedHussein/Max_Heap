package SortingTechniques;

public class BubbleSort {
    public void sort(int []array){
        boolean isSorted;
        for(int i=0;i<array.length;i++){
            isSorted=true;
            for(int j=1;j<array.length;j++){
                if(array[j-1]>array[j]){
                    swap(array,j,j-1);
                    isSorted=false;
                }
            }
            if(isSorted)
                return;
        }
    }
    private void swap(int[] array ,int index1,int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}
