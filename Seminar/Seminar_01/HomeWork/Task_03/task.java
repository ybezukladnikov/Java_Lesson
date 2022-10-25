// Написать программу вычисления n-ого треугольного числа
package Seminar.Seminar_01.HomeWork.Task_03;

import My_logger.logging;
import lib.mainFunc;

import java.io.IOException;


public class task {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите целое число: ");

        int a = mainFunc.inputCons();
        String text = "Пользователь ввел => " + a;

        logging.logging_1("/Users/aroslavbezukladnikov/IdeaProjects/Java_Lesson/Seminar/Seminar_01/HomeWork/Task_03/log.xml",text);
        int result = triangle_n(a);
        System.out.printf("Треугольное число для %s =>  %s\n", a, result);
        
    }
/// Основной метод для вычисления треугольного числа. 
/// Основан на рекурсии.
    static int triangle_n(int arg) {
        if (arg==1) {
            return 1;

            
        } else {
            return triangle_n(arg-1)+arg;
            
        }
        
    }
}
