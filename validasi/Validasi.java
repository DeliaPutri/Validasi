/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validasi;

/**
 *
 * @author ASUS
 */
public class Validasi <T> {
    public T[] Data;
    public int top = 0;
    
    //construktor
    public Validasi(int n) {
        Data = (T[]) new Object[n];
    }
    //method empty
    public  boolean isEmpty(){
        return top == 0;
    }
    //method full
    public  boolean isFull(){
        return top == Data.length;
    }
    //method push 
    public void push(T Value) {
        if (!isFull()) {
            Data[top] = Value;
            top ++;
        }else{
            System.out.println("Stack Is Full");
        }
    }
    //method pop 
    public T pop(){
        if (!isEmpty()) {
            top --;
        T r = Data[top];
        return r;
        
        }else{
            return null;
        }
    }
    //method peek
    public T peek(){
        if(!isEmpty()){
            return Data[top-1];
        }else{
            return null;
        }
    }
}
