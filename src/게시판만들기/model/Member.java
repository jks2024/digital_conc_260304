package 게시판만들기.model;

public class Member {
    private static int idCounter = 1;
    private final int    memberId;
    private final String name;
    private final String email;
    private final String password;

    public Member(String name, String email, String password) {
        this.memberId = idCounter++;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s (%s)", memberId, name, email);
    }
}
