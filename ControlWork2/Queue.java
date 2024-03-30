package ControlWork2;

public class Queue<T> {
    Object[] arr;
    int front;
    int back;
    int capacity;
    public Queue(int size){
        arr = new Object[size];
        back = 0;
        front = 0;
        capacity = 0;
    }

    public boolean is_Empty(){
        if (capacity < 0){
            return true;
        }
        return false;
    }
    public void Push(T elem){
        if (capacity == arr.length + 1){
            throw new IllegalArgumentException("error");
        }
        arr[front] = elem;
        front = (front + 1) % arr.length;
        capacity++;

    }
    public T pop(){
        if (is_Empty()){
            throw new IllegalArgumentException("error");
        }
        capacity--;
        return (T) arr[back++];
    }
    public int size(){
        return capacity;
    }
    public void clear(){
        back = 0;
        front = 0;
        capacity = 0;
    }


}
