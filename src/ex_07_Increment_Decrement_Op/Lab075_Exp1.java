package ex_07_Increment_Decrement_Op;

public class Lab075_Exp1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);


        // a++ ->  A
        // +
        // ++a -> B

        // ERT
        // LNo |  a | Exp
        //  6  |10  | NA
        //7   |10  |11 + 12 -->23
        //8   |12

    }
}
