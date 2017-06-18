package recursion;

/**
 * Created by 111 on 6/18/2017.
 */
public class Recursion {
    public int fibonacci_Sequence(int index){
        if (index==1||index==2) return 1;
        else return fibonacci_Sequence(index-1)+fibonacci_Sequence(index-2);
    }

    public int factorial(int index){
        if (index==1) return 1;
        return index*factorial(index-1);
    }

}
