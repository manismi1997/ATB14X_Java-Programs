package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] mani_args) {

        String user_input=mani_args[0];

        System.out.println(user_input);

        System.out.println(user_input instanceof String);

        //To change string to  integer
       int a=Integer.parseInt(user_input);

       String s=a>60 ?"UR senior citizen" :"Ur are adult" ;

        System.out.println(s);
    }
}
