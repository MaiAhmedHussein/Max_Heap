public class Heap {


    public void Build_Max_Heap(int arr[]){
        for (int i= arr.length/2-1;i>=0;i--){
            max_Heapify(arr,i,arr.length);
        }
    }

    public void HEAPSORT(int []arr){

        Build_Max_Heap(arr);

        for (int l=arr.length-1; l>0 ; l--){
            int temp=arr[0];
            arr[0]=arr[l];
            arr[l]=temp;
            max_Heapify(arr,0,l);
        }
    }


    public void swap(int arr[],int ind1, int ind2) {
        int temp;
        temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }


    public void max_Heapify(int arr[], int ind, int arrSize) {
        if (ind > (arrSize / 2) && ind <= arrSize) {
            return ;
        }
        int max;
        int left = 2*ind;
        int right = 2*ind +1;
        if(left<=arrSize-1 && arr[left]>arr[ind]){
            max=left;
        }else {
            max=ind;
        }
        if(right<=arrSize-1 && arr[right]>arr[max]){
            max=right;
        }
        if(max!=ind){
            swap(arr,ind,max);
            max_Heapify(arr,max,arrSize);
        }
    }


}
