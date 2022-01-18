package com.mani.pradeep.Interface;

public  class Child implements Mother,Father{
    @Override
    public void cooking() {
    System.out.println("Inherited from Mother");
    }

    @Override
    public void driving() {
        System.out.println("Inherited from Father");
    }

    public static void main(String[] args) {
        Child child =new Child();
        child.cooking();
        child.driving();
    }
}
