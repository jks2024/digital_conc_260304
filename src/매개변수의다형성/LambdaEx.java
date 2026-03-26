package 매개변수의다형성;
// 람다(Lambda) : 간단한 익명의 함수를 생성하기 위한 방법, 람다 표현식은 주로 함수형 프로그래밍 스타일로 지원
// (매개변수목록) -> {실행문};
// 자바는 함수를 지원하지 않기 때문에 람다식을 사용하기 위해서는 함수형 인터페이스 필요


//class MyCalculator {
//    int sum(int x, int y) {
//        return x + y;
//    }
//}

@FunctionalInterface
interface MyCalculator {
    int sum(int x, int y);
}

//class MyCalculatorImpl implements MyCalculator {
//    @Override
//    public int sum(int x, int y) {
//        return x + y;
//    }
//}


public class LambdaEx {
    public static void main(String[] args) {
       MyCalculator calc = (x, y) -> x + y;
       System.out.println(calc.sum(10, 20));

    }
}
