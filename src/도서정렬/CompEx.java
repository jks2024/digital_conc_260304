package 도서정렬;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompEx {
    public static void main(String[] args) {
        // 리스트 생성
        List<Book> books = new ArrayList<>();
        books.add(new Book("사피엔스", "유발하라리", 20000, 2020));
        books.add(new Book("정의라 무엇인가?", "마이크 샌델", 26000, 2010));
        books.add(new Book("자바의 정석",       "남궁성",   32000, 2022));
        books.add(new Book("클린코드",          "로버트 마틴", 26000, 2013));
        books.add(new Book("스프링 부트 실전",   "김영한",   35000, 2023));
        books.add(new Book("이펙티브 자바",      "조슈아 블로크", 36000, 2018));
        books.add(new Book("HTTP 완벽 가이드",  "데이비드 고울리", 58000, 2014));


        // 가격 오름 차순 정렬 후 출력
        System.out.println("======= 가격 오름 차순 =======");
        books.sort(new PriceComparator());
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("\n");

        // 최신 출판 순 정렬 후 출력
        System.out.println("======= 최신 출판 순 =======");
        books.sort(new YearComparator());
        for (Book book : books) {
            System.out.println(book);
        }

    }
}

class Book {
    // 제목, 저자, 가격, 출판연도
    String title;
    String author;
    int price;
    int year;

    // 매개변수가 전부 있는 생성자
    Book(String title, String author, int price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    // toString() 오버라이딩해서 출력
    @Override
    public String toString() {
        return String.format("%-20s | %-8s | %,5d원 | %d년", title, author, price, year);
    }
}

// 가격 오름차순 : Comparator<Book>
class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.price > o2.price) return 1;  // 정렬 조건
        else if (o1.price == o2.price) return 0;  // 두개의 값이 일치
        else return -1;  // 정렬 하지 않는 조건
    }
}

// 출판 연도 내림차순 : Comparator<Book>
class YearComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (o1.year < o2.year) return 1; // 내림 차순 정렬
        else if (o1.year == o2.year) return 0;
        else return -1;
    }
}

