package Seminar.Seminar_01.HomeWork.Task_01;

import java.util.Scanner;

public class mainFunc {

    static int inputCons(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;

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
