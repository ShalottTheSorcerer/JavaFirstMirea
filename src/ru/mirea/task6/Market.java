package ru.mirea.task6;

public class Market implements Priceable{
    private int realPrice;
    private String item;
    private int marketPrice;

    public Market(String item, int realPrice) {
        this.item = item;
        this.realPrice = realPrice;
        this.marketPrice = 5*realPrice;
    }

    @Override
    public void getPrice() {
        System.out.println("The real price of the "+item+" is "+realPrice+"$ while the market price is "+marketPrice+"$");
    }
}
