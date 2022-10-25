package Seminar.Seminar_02;
import lib.mainFunc;

public class task_insert {
    public static void main(String[] args) {
        int [] initial_arr = {-9,3,1,-4, 0, 12,1,-23};
        System.out.println("Initial array => " + mainFunc.ShowArray(initial_arr));
        for (int i = 1; i <initial_arr.length ; i++) {

            if (i == 1) {
                if (initial_arr[i-1] > initial_arr[i]) {
                    int temp  = initial_arr[i-1];
                    initial_arr[i-1] = initial_arr[i];
                    initial_arr[i] = temp;
                    continue;
                }
            }

            for (int j = 0; j < i; j++) {
                if (initial_arr[i] < initial_arr[j]) {
                    int temp_1 = initial_arr[i];
                    for (int k = i; k > j; k--) {
                        initial_arr[k] = initial_arr[k-1];
                    }
                    initial_arr[j]=temp_1;
                    break;
                }

            }

        }
        System.out.println("Sorted array => " + mainFunc.ShowArray(initial_arr));



    }
}
