package 해시셋실습;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();

        books.add(new Book(101, "자바의 정석", "남궁성"));
        books.add(new Book(102, "클린코드", "로버크 마틴"));
        books.add(new Book(103, "운영체제", "공룡책"));
        books.add(new Book(103, "리팩터링", "마틴 파울러"));

        for (Book book : books) {
            System.out.println(book);
        }

        // 합집합 : 모든 요소가 포함 된, 단 중복은 제거 됨
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
        //set1.addAll(set2);  // 합집합 :
        //set1.retainAll(set2); // 교집합 : 양쪽에 모두 존재하는 것 만 남음
        set1.removeAll(set2);  // 차집합 : 앞에서 뒤를 빼서 남는 앞의 요소 출력
        System.out.println(set1);


    }
}

class Book {
    int isbn;
    String title;
    String author;

    Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public int hashCode() {
        return isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            if (isbn == book.isbn) return true;
            else return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ISBN : " + isbn + "\n" + "Title : " +
                title + "\n" + "Author : " + author + "\n"
                + "----------------------------------\n";
    }
}