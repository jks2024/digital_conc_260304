package 시스템출력실습;

public class SystemOutEx {
    public static void main(String[] args) {
        System.out.println("=".repeat(32));
        System.out.println("\t\tJAVA CAFE 영수증");
        System.out.println("=".repeat(32));
        System.out.printf("%-16s %3s %,6d원\n", "아케리카노", "2잔", 9000);
        System.out.printf("%-16s %3s %,6d원\n", "카페라떼", "1잔", 5500);
        System.out.printf("%-16s %3s %,6d원\n", "치즈케이크", "1조각", 6800);

        System.out.println("-".repeat(32));
        System.out.println("\t\t구구단 3단");
        System.out.println("-".repeat(32));
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %2d\n", i, 3, i * 3);
        }

    }
}
