
public class PQ {
    int size=0;
    int [] heap=new int[1000];

    public void swap(int arr[],int ind1, int ind2) {
        int temp;
        temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    public void heapifyBottomUp(int s){
        while (s>0 && heap[(s-1)/2] < heap[s]){
            swap(heap,(s-1)/2,s);
            s=(s-1)/2;
        }
    }

    public void insert(int no) {
        heap[size] = no;
        heapifyBottomUp(size);
        size++;
    }

    public int Heap_Extract_Max(){
        int temp = heap[0];
        heap[0] = heap[size-1];
        size--;
        Heap obj = new Heap();
        obj.max_Heapify(heap,0,size);
        return temp;
    }
}
