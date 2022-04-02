package SortingTechniques;

public class SelectionSort {
    public void sort(int[] array) {
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minIndex = findMin(array, i);
            swap(array, i, minIndex);

        }

    }

    private int findMin(int[] array, int i) {
        //find the min value in the unsorted part
        int minIndex = i;
        for (int j = i; j < array.length; j++) {
            if (array[j] < array[minIndex])
                minIndex = j;
        }
        return minIndex;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
