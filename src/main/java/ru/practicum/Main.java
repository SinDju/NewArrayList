package ru.practicum;

public class Main {
    public static void main(String[] args) {
     NewArrayList<Integer> number = new NewArrayList<Integer>();
     number.add(1);
     number.add(4);
     number.add(10);
     number.add(3);
     number.add(5);
        System.out.println(number);
        number.sortBubble();
        System.out.println(number);
    }
}
