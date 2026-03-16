package 회원관리시스템;

public class Member {
    private static int count = 0;
    private int id;
    private String name;
    private String userId;
    private String password;
    private int age;

    public Member(String name, String userId, String password, int age) {
        this.name = name;
        this.userId = userId;
        this.password = password;
        this.age = age;
        count++;
        this.id = count;
    }
}
