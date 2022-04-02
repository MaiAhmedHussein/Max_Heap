package SortingTechniques;

public class QuickSort {
    public void sort(int []array){
        sort(array,0, array.length-1);
    }
    private void sort(int[] array,int start,int end){
        //our base case empty or one element
        if(start>=end)
            return;
        //partition using pivot= last element
        int boundary=partition(array,start,end);
        //sort left
        sort(array,start,boundary-1);
        //sort right
        sort(array,boundary+1,end);

    }
    //return index of pivot after its move
    private int partition(int []array, int start ,int end){
        int pivot =array[end];
        //2 pointers
        //boundary points to the left part i(it will point to the left element in the left part)
        //if found element smaller than partition will put increment boundary and do swap
        int boundary=start -1;
        for(int i=start;i<=end;i++)
            if(array[i]<=pivot)
                swap(array,i,++boundary);
        return boundary;
    }
    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
