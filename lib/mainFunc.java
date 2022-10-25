package lib;

import java.util.Arrays;
import java.util.Scanner;

public class mainFunc {

    public static int inputCons(){
        
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                int a = scanner.nextInt();
                return a;
            } catch (Exception e) {
                System.out.println("Вы ввели не число. Попробуйте снова");
            }
        }
    }

    public static String ShowArray(int [] arr){
        String arrayToString = Arrays.toString(arr);
        return arrayToString;

    }

    public static boolean isNumeric(String string) { 
        int intValue; 
        
        try { 
        intValue = Integer.parseInt(string); 
        return true; 
        } catch (NumberFormatException e) { 
            return false;  
        } 
        
        } 

        //    BufferedReader fr = new BufferedReader  (new FileReader(file));
    //    String res_r;
    //    res_r = fr.readLine();
    //    String strArr[] = res_r.split(" ");
    //     int numArr[] = new int[strArr.length];
    //     for (int i = 0; i < strArr.length; i++) {
    //         numArr[i] = Integer.parseInt(strArr[i]);
    //         System.out.println(numArr[i]);
    //     }
    
    
}
