package LambdaExpressionWithFunctionalInterface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Lambda Expression");
        MyInter myInter = new MyInterImpl();
        myInter.printHello();

        MyInter myInter1 = new MyInter() {
            @Override
            public void printHello() {
                System.out.println("This is my first anonymous class to implement Function interface");
            }
        };
        myInter1.printHello();

        MyInter myInter2 =() ->{
            System.out.println("implementing Functional interface using lambda expression");
        };
        myInter2.printHello();
        //**********************************************

        DoAddition sumFunction =(a,b)-> a+b;
        System.out.println("Addition using Lambda expression------> " + sumFunction.sum(4,5));

        //+++++++++++++++++++++++++++++++++++++++++++++
        LengthInter lengthInter = (str)->str.length();
        System.out.println("Length of the String is ====   "+ lengthInter.getLength("Ujjawal"));
    }
}

