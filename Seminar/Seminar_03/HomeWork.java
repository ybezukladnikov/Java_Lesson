package Seminar.Seminar_03;


import java.util.ArrayDeque;
import java.util.Deque;

public class HomeWork {

    static int[][] map = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, -1, 0, 0},
            {0, -1, 0, -1, 0, -1, 0, 0},
            {0, -1, -1, -1, -1, -1, 0, 0},
            {1, -1, 0, -1, 0, -1, 0, 0},
            {0, -1, 0, -1, 0, -1, -1, 0},
            {0, -1, 0, 0, 0, -1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}
    };
    static int FirstInd = 0;
    static int SecondInd = 0;

    //Первый выход:
    static int IFirstExit = 6;
    static int JFirstExit = 7;

    //Второй выход:
    static int ISecondExit = 1;
    static int JSecondExit = 7;
    static int IFinishWay;
    static int JFinishWay;


    static int countEx = 0;

    static Deque<Integer> row = new ArrayDeque<>();
    static Deque<Integer> col = new ArrayDeque<>();

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
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[i].length; j++) {

                if (arg[i][j] != -1) {
                    System.out.printf("░");

                } else if (arg[i][j] == -1) {
                    System.out.printf("█");

                } else {
                    System.out.printf("@");
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
        GrathicMap(map);
        FindEnter(map);
        PrintMap(map);
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
            row.addFirst(ISecondExit);
            col.addFirst(JSecondExit);
            IFinishWay = ISecondExit;
            JFinishWay = JSecondExit;

        } else {
            row.addFirst(IFirstExit);
            col.addFirst(JFirstExit);
            IFinishWay = IFirstExit;
            JFinishWay = JFirstExit;
        }
//
        while (map[IFinishWay][JFinishWay]!=1) {
            if (FindWay(IFinishWay, JFinishWay, IFinishWay - 1, JFinishWay)) {
                IFinishWay--;
                row.addFirst(IFinishWay);
                col.addFirst(JFinishWay);
            } else if (FindWay(IFinishWay, JFinishWay, IFinishWay, JFinishWay + 1)) {
                JFinishWay++;
                row.addFirst(IFinishWay);
                col.addFirst(JFinishWay);

            } else if (FindWay(IFinishWay, JFinishWay, IFinishWay + 1, JFinishWay)) {
                IFinishWay++;
                row.addFirst(IFinishWay);
                col.addFirst(JFinishWay);
            } else {
                JFinishWay--;
                row.addFirst(IFinishWay);
                col.addFirst(JFinishWay);
            }
        }


        System.out.println();
        PrintMap(map);
        System.out.println("Количество неверных ходов => " + countEx);
        System.out.println(row);
        System.out.println(col);


    }
}
