package Seminar.Seminar_01.HomeWork.Task_02;

public class task_02 {
    static int pow(int a, int b){
        int res = a*b;
        return res;
    }

    static int sum(int a, int b){
        int res = a+b;
        return res;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 7;

        int c = 2;
        int d = 3;
        
        int temp = (a+d)*c;
        boolean flag = false;


        while ((b-temp)>=d) {
            a = a + d;
            temp = (a+d)*c;
            flag = true;

        }

        if (flag) {
            a = a * c;
            
        } else {
            a=a
            
        }

        if (flag) {
            a = a * c;
        }

        while (true) {
            if (a==b) {
                System.out.println(a);
                break;
            }
            if (a>b) {
                System.out.println("Преобразовать нельзя");
                break;
            }
            a= a + d;
            
        }



        





        // while (a!=b) {
        //     a = sum(a,d);
        //     System.out.println("sum");
            
        // }
    }


}
