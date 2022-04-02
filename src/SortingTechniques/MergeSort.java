package SortingTechniques;

public class MergeSort {
    public void sort(int []array){
        //base case array with single item
        if(array.length<2)
            return;
        //divide this array into half
        int middle= array.length/2;
        int left[]=new int[middle];
        int right[]=new int[array.length-middle];
        for(int i=0;i<middle;i++)
            left[i]=array[i];
        for(int i=middle;i<array.length;i++)
            right[i-middle]=array[i];
        //sort each half
        sort(left);
        sort(right);
        //merge the result
        merge(left,right,array);
    }
    private void merge(int[]left ,int []right, int[]result){
        //need three pointers
        int l=0,r=0,res=0;
        while(l< left.length&& r< right.length){
            if(left[l]<=right[r])
                result[res++]=left[l++];
            else
                result[res++]=right[r++];
        }
        while(l< left.length)
            result[res++]=left[l++];
        while(r<right.length)
            result[res++]=right[r++];
    }
}
