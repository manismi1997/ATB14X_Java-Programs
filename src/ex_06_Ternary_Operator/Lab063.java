package ex_06_Ternary_Operator;

public class Lab063 {

    public static void main(String[] args) {
        int Salary=25000;

        String girlfriend = Salary<26000 ? Salary<10000 ? "Don't think about gf" : "Try to get bike" :"girls will like you";

        System.out.println(girlfriend);
    }


}
