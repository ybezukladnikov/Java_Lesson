package Seminar.Seminar_06;

public class HomeWork {
    public static void main(String[] args) {
        Goods FirstGood = new Goods();
        FirstGood = new CreateGoods()
                .setName("Ручка")
                .setDescription(new StringBuilder("Синяя"))
                .setPrice(45.3)
                .setСount(1)
                .Create();

        FirstGood.print();







    }
}

