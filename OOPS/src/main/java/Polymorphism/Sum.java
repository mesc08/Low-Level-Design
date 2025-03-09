package Polymorphism;
public class Sum {

    public int doSum(int a, int b){
        return a + b;
    }

    public int doSum(int a, int b, int c){
        return a + b + c;
    }

    public int doSum(String a, String b){
        return Integer.parseInt(a + b);
    }
}
