package ru.mirea.task22;

public class Client {
    private Chair new_chair;

    public void setNew_chair(Chair new_chair) {
        this.new_chair = new_chair;
    }

    public void Sit(Chair chair) {
        if (new_chair == null) {
            setNew_chair(chair);
            System.out.println("The client is sitting on the "+chair.getType()+" chair now.");
        } else {
            System.out.println("The client was just sitting on the "+new_chair.getType()+" chair, but now they are sitting on the "+chair.getType()+" chair.");
            setNew_chair(chair);
        }
    }
}
