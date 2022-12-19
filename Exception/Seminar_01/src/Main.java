import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(Arrays.toString(getNewArray(firstArray,secondArray)));
        }

        catch (Exception e){
            switch (Integer.parseInt(e.getMessage())){
                case -1 -> System.out.println("One of the elements is equal to 0");
                case -2 -> System.out.println("Different length of arrays");
            }
        }
    }
    static int [] firstArray = {4, 3, 7, 1};
    static int [] secondArray = {2, 6, 4, 8, 4};

    public static int [] getNewArray(int [] array1, int [] array2)throws Exception{
        checkArray(array1);
        checkArray(array2);
        if (array1.length!=array2.length)throw new RuntimeException("-2");

        int [] resultArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = array1[i]/array2[i];
        }
        return resultArray;
    }
    public static void checkArray(int[] array) throws Exception{
        for (int element:array)
             {
                 if(element == 0) throw new RuntimeException("-1");
             }

    }







}