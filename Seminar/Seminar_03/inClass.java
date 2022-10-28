package Seminar.Seminar_03;


import lib.mainFunc;

public class inClass {

    static int position = 0;
    static int [] storage = new int[11];

    static void clear(){
        position = 0;
        int size = storage.length;
        for (int i = 0; i < size; i++) {
            storage[i] = 0;
        }
    }

    static void shift(){
        for (int i = 0; i <= position; i++) {
            storage[i] = storage[i+1];
        }
        storage[position] = 0;
        position --;
    }

    static void add(int item){
        if (position >= storage.length)
            return;
        storage[position++] = item;
    }

    static int remove(){
        int el = storage[0];
        shift();
        return el;
    }

    static void print(){
        System.out.println("Initial array => " + mainFunc.ShowArray(storage));
    }


    public static void main(String[] args) {

        print();
        add(3);
        print();
        add(29);
        print();
        add(87);
        print();
        System.out.println(remove());
        print();
        System.out.println(remove());
        print();
    }




}
