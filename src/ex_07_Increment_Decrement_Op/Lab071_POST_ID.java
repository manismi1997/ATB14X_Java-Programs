package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {

    public static void main(String[] args) {

        int a=10;
        int b=a++;

        // POST increment  = Print first and then increase.
        System.out.println(a);
        System.out.println(b);

        // ERT ( Exp and Result Table)
        // LNo |  a_post | b
        // 11  |  10 | NA
        // 12  |  11  | 10
        // 14  |  11  | 10

    }
}

