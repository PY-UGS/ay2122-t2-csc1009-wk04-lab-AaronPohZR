package CSC1009.wk04_lab;

public class StackOfIntegers {

    private int [] elements;
    private int size;
    public static final int MAX_CAPACITY = 16;

    public StackOfIntegers(){
        this (MAX_CAPACITY);
    }

    public StackOfIntegers(int value){
        elements = new int [value];
    }

    public boolean empty(){
        return this.size == 0;

    }


    public int peek(){
        return this.elements[this.size - 1];

    }

    public int push(int value){
        return this.elements[++this.size] = value;

    }

    public int pop(){
        return this.elements[this.size--];

    }

    public int getSize(){
        return this.size;
    }


}
