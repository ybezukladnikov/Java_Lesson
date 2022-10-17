/* 
1.	+Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество 
выполняемых действий к минимуму. 
Пример 1: а = 3, b = 2, ответ: 9 
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
Пример 4: а = 0, b = 0, ответ: не определено
Пример 5
входные данные находятся в файле input.txt в виде
b 3
a 10
Результат нужно сохранить в файле output.txt
1000

*/

package Seminar.Seminar_01.HomeWork.Task_01;


import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Task_01 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) 
     throws Exception 
    {

      
        File file_r = new File("/Users/yaroslav/Desktop/GeekBrains/Java_Lesson/Seminar/Seminar_01/HomeWork/Task_01/input.txt");
        File file_w = new File("/Users/yaroslav/Desktop/GeekBrains/Java_Lesson/Seminar/Seminar_01/HomeWork/Task_01/output.txt");


       BufferedReader fr = new BufferedReader  (new FileReader(file_r));
       String res_r;
       int numArr[] = new int[2];
       int j =0;
       while((res_r = fr.readLine())!= null){
        String strArr[] = res_r.split(" ");
        
        for (int i = 0; i < strArr.length; i++) {
            if(mainFunc.isNumeric(strArr[i])) { 

            numArr[j] = Integer.parseInt(strArr[i]);
            j++;
            
        }
       }
    }  
       fr.close();

        FileWriter f_obj = new FileWriter(file_w, false);
        double result = Math.pow(numArr[1], numArr[0]);
        f_obj.write(Double.toString(result));
        f_obj.close();
    }
}


       
        

        
    

