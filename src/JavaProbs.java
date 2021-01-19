import java.util.Scanner;

public class JavaProbs {
    private int a; private int b;

    public JavaProbs(){
        a = 0;
        b = 0;
    }

    public JavaProbs(int a,int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int nextEdge(int a, int b){
        return a+b-1;
    }

    @Override
    public String toString() {
        return "JavaProbs{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

}
