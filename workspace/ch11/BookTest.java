package ch11;

// 하나의 소스코드(.java) 내에 여러개의 클라슬 정의할 수 있음
// 단, public class는 하나에만 지점 가능하고 파일명과 동일한 클래스에만 지정 가능함
class Book {
    String title; // 필드
    String author; // 필드

    // 생성자 작성
    Book() { // book1 에 작용
        this.title = "제목미상";
        this.author = "작가미상";
    }

    // 생성자 작성
    Book (String title, String author){ // book2 에 작용
        this.title = title;
        this.author = author;
    }

}

public class BookTest {
    public static void main() {
        Book book1 = new Book();
//        book1.title = "자바 기초";
//        book1.author = "자바의신";

        Book book2 = new Book("자바를 자바라!", "용쌤");
        Book book3 = new Book("자바를 죽여라!", "신쌤");
        Book book4 = new Book("자바를 지켜라!", "이쌤");
        Book book5 = new Book("자바를 외워라!", "박쌤");

        System.out.println("제목: " + book1.title + ", 작가: " + book1.author);
        System.out.println("제목: " + book2.title + ", 작가: " + book2.author);
        System.out.println("제목: " + book3.title + ", 작가: " + book3.author);
        System.out.println("제목: " + book4.title + ", 작가: " + book4.author);
        System.out.println("제목: " + book5.title + ", 작가: " + book5.author);
    }
}


