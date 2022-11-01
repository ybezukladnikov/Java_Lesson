package Seminar.Seminar_03;


import lib.mainFunc;

public class storageHW {

    static int position = 0;
    static int [][] storage = new int[10][2];

    static void clear(){
        position = 0;

        for (int i = 0; i < storage.length; i++) {
            for (int j = 0; j < storage[i].length; j++) {
                storage[i][j] = 0;
            }

        }
    }

    static void shift(){
        for (int i = 0; i <= position; i++) {
            storage[i][0] = storage[i+1][0];
            storage[i][1] = storage[i+1][1];

        }
        storage[position][0] = 0;
        storage[position][1] = 0;

        position --;
    }

    static void add(int item1,int item2){
        if (position >= storage.length)
            return;
        storage[position][0] = item1;
        storage[position][1] = item2;
        position++;

    }

    static int [] remove(){
        int [] arr = new int[2];
        arr[0] = storage[0][0];
        arr[1] = storage[0][1];

        shift();
        return arr;
    }

    static void print()
    {
        for (int i = 0; i < storage.length; i++) {
            for (int j = 0; j < storage[i].length; j++) {
                System.out.print(storage[i][j]+" ");


            }
            System.out.println();
        }
//        System.out.println("Initial array => " + mainFunc.ShowArray(storage));

   }


    public static void main(String[] args) {

        print();
        add(3,4);
        add(-2,9);
        print();
        System.out.println("Удалил => " + mainFunc.ShowArray(remove()));
        print();

//        print();
//        add(29);
//        print();
//        add(87);
//        print();
//        System.out.println(remove());
//        print();
//        System.out.println(remove());
//        print();
    }




}
