package Seminar.Seminar_06;

public class Goods {
    int count;
    String name;
    Double price;
    StringBuilder description;

//    public Goods(int count, String name, Double price, StringBuilder description) {
//        this.count = count;
//        this.name = name;
//        this.price = price;
//        this.description = description;
//    }



    public void print(){
        System.out.println(
                String.format(
                        "%d %s %f %s",
                        count,
                        name,
                        price,
                        description));
    }

}
