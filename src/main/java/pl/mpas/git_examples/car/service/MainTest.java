package pl.mpas.git_examples.car.service;

public class MainTest {
    public static void main(String[] args) {
        LambdaConverter my= new LambdaConverter() {
            @Override
            public int convertStringToInt(String string) {
                return string.length();
            }
        };
        LambdaConverter my2 = One -> One.length();
        MyInter add = (one,two)-> one+two;
        MyInter sub = (one,two)-> one-two;


    }
}
