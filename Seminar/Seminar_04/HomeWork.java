package Seminar.Seminar_04;

import lib.mainFunc;

public class HomeWork {
    public static void main(String[] args) {
        int [] array = {3,4,-2,1,6,8,4,5};
        QuickSort(array,0,array.length -1);;
        System.out.println("Initial array => " + mainFunc.ShowArray(array));
    }
    static void QuickSort(int [] arr, int minIndex, int maxIndex){
        if(minIndex>=maxIndex) return;
        int pivot = GetPivotIndex(arr, minIndex, maxIndex);
        QuickSort(arr, minIndex, pivot-1);
        QuickSort(arr, pivot+1, maxIndex);
        return;
    }
    static int GetPivotIndex(int [] arr, int minIndex, int maxIndex){
        int pivotIndex = minIndex - 1;

        for (int i = minIndex; i < maxIndex; i++) {
            if (arr[i] < arr[maxIndex]) {
                pivotIndex++;
                Swap(arr, i, pivotIndex);
            }
        }
        pivotIndex++;
        Swap(arr, pivotIndex, maxIndex);
        return pivotIndex;
    }
    static void Swap(int [] arr, int leftValue, int rightValue)
    {
        int temp = arr[leftValue];
        arr[leftValue] =  arr[rightValue];
        arr[rightValue] = temp;
    }
}
