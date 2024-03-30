package ControlWork2;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>(1000);
        q.Push(10);
        q.Push(2);
        q.Push(321);

        System.out.println("Удаленный элемент: " + q.pop());

        q.Push(123123);
        q.Push(4444);
        q.pop();
        q.pop();


        q.Push(999);
        q.Push(230);

        System.out.println("Размер: " + q.size());

        q.clear();

        System.out.println("размер: " + q.size());;
    }
}
