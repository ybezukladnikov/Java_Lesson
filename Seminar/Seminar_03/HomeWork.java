package Seminar.Seminar_03;

public class HomeWork {

    static int [][] map = {
        {0,0,0,0,0,0,0,0},
        {0,-1,0,0,0,-1,0,0},
        {0,-1,0,0,0,-1,0,0},
        {0,-1,0,-1,-1,0,0,0},
        {0,-1,0,0,-1,0,0,0},
        {0,-1,-1,-1,0,0,0,0},
        {0,0,0,-1,0,0,0,0},
        {1,0,0,0,0,0,0,0}
};
    static int FirstInd = 0;
    static int SecondInd = 0;



    static void PrintMap(int [][]arg){
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[i].length; j++) {

                if (arg[i][j] == 1) {
                    FirstInd = i;
                    SecondInd = j;

                }
                if (arg[i][j] == 0) {
                    System.out.printf("░");
                    
                } else if (arg[i][j] == -1) {
                    System.out.printf("█");
                    
                }

            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        PrintMap(map);
//        inClass.add(3);
//        inClass.print();




    }
}
