package Seminar.Seminar_03;


import lib.mainFunc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class HomeWork {

    static int[][] map = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, -1, 0, 0},
            {0, -1, 0, -1, 0, -1, 0, 0},
            {0, -1, -1, -1, -1, -1, 0, 0},
            {0, -1, 0, -1, 0, -1, 0, 0},
            {0, -1, 0, -1, 0, -1, -1, 0},
            {0, -1, 0, 0, 0, -1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}
    };


    static int FirstInd = 0;
    static int SecondInd = 0;

    //Первый выход:
    static int IFirstExit = 5;
    static int JFirstExit = 0;

    //Второй выход:
    static int ISecondExit = 0;
    static int JSecondExit = 7;
    static int IFinishWay;
    static int JFinishWay;


    static int countEx = 0;


    static ArrayList<Integer> row = new ArrayList<Integer>();
    static ArrayList<Integer> col = new ArrayList<Integer>();

    static void FindEnter(int[][] arg) {
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[i].length; j++) {

                if (arg[i][j] == 1) {
                    FirstInd = i;
                    SecondInd = j;

                }
            }
        }
    }

    static void PrintMap(int[][] arg) {
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[i].length; j++) {
                System.out.print("\t" + arg[i][j]);

            }
            System.out.println();
        }
    }

    static void GrathicMap(int[][] arg) {
        System.out.println(" " + "0 1 2 3 4 5 6 7");
        for (int i = 0; i < arg.length; i++) {
            System.out.print(i);
            for (int j = 0; j < arg[i].length; j++) {

                boolean Flag = false;

                for (int k = 0; k < row.size(); k++) {
                    if (row.get(k) == i && col.get(k) == j) {
                        Flag = true;
                    }
                }

                if (Flag) {
                    System.out.printf("╳╳");

                } else if (i==FirstInd && j == SecondInd) {
                    System.out.printf("@!");
                } else if (i==IFirstExit && j == JFirstExit) {
                    System.out.printf("11");
                }

                else if (i==ISecondExit && j == JSecondExit) {
                    System.out.printf("22");
                }


                else if (arg[i][j] != -1) {
                    System.out.printf("░░");

                } else if (arg[i][j] == -1) {
                    System.out.printf("██");

                }
            }
            System.out.println();
        }
    }

    static void GrathicMapStart(int[][] arg) {
        System.out.println(" " + "0 1 2 3 4 5 6 7");

        for (int i = 0; i < arg.length; i++) {
            System.out.print(i);
            for (int j = 0; j < arg[i].length; j++) {

                if (arg[i][j] != -1) {
                    System.out.printf("░░");

                } else if (arg[i][j] == -1) {
                    System.out.printf("██");

                }


            }
            System.out.println();

        }
    }

    static void MakeStep(int old_i, int old_j, int new_i, int new_j) {
        try {
            if (map[new_i][new_j] == 0) {
                map[new_i][new_j] = map[old_i][old_j] + 1;
                storageHW.add(new_i, new_j);
            }
        } catch (Exception e) {
            countEx++;
        }

    }

    static boolean FindWay(int old_i, int old_j, int new_i, int new_j) {
        try {
            if (map[old_i][old_j] - 1 == map[new_i][new_j]) {
                return true;

            }
        } catch (Exception e) {
            return false;
        }
        return false;

    }

    static boolean CheckFinish() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 0) {
                    return true;
                }

            }
        }
        return false;
    }



    public static void main(String[] args) {

        GrathicMapStart(map);
        System.out.println("Введите значение строки для точки входа");
        FirstInd = mainFunc.inputCons();
        System.out.println("Введите значение столбца для точки входа");
        SecondInd = mainFunc.inputCons();
        map[FirstInd][SecondInd] = 1;



//        FindEnter(map);
//        PrintMap(map);
        storageHW.add(FirstInd, SecondInd);

        while (CheckFinish()) {
            int[] tempArray = storageHW.remove();
            int old_i = tempArray[0];
            int old_j = tempArray[1];

            MakeStep(old_i, old_j, old_i - 1, old_j);
            MakeStep(old_i, old_j, old_i, old_j + 1);
            MakeStep(old_i, old_j, old_i + 1, old_j);
            MakeStep(old_i, old_j, old_i, old_j - 1);

        }
        if (map[IFirstExit][JFirstExit] > map[ISecondExit][JSecondExit]) {
//            row.add(ISecondExit);
//            col.add(JSecondExit);
            IFinishWay = ISecondExit;
            JFinishWay = JSecondExit;
            System.out.println("Выход 22 ближе всего");

        } else {
//            row.add(IFirstExit);
//            col.add(JFirstExit);
            IFinishWay = IFirstExit;
            JFinishWay = JFirstExit;
            System.out.println("Выход 11 ближе всего");
        }
//
        while (map[IFinishWay][JFinishWay]!=1) {
            if (FindWay(IFinishWay, JFinishWay, IFinishWay - 1, JFinishWay)) {
                IFinishWay--;
                row.add(IFinishWay);
                col.add(JFinishWay);
            } else if (FindWay(IFinishWay, JFinishWay, IFinishWay, JFinishWay + 1)) {
                JFinishWay++;
                row.add(IFinishWay);
                col.add(JFinishWay);

            } else if (FindWay(IFinishWay, JFinishWay, IFinishWay + 1, JFinishWay)) {
                IFinishWay++;
                row.add(IFinishWay);
                col.add(JFinishWay);
            } else {
                JFinishWay--;
                row.add(IFinishWay);
                col.add(JFinishWay);
            }
        }
        row.remove(row.size()-1);
        col.remove(col.size()-1);

        System.out.println("Кратчайший путь найден. Обозначен ХХ");
        GrathicMap(map);
//        PrintMap(map);

//        System.out.println(row);
//        System.out.println(col);









//        PrintMap(map);
//        System.out.println("Количество неверных ходов => " + countEx);
//        System.out.println(row);
//        System.out.println(col);


    }
}
