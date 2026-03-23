package 게시판만들기.model;

public class Post {
    private static int idCounter = 1;

    private final int postId;
    private final int memberId;
    private final String memberName;
    private final String title;
    private final String content;

    public Post(int memberId, String memberName, String title, String content) {
        this.postId = idCounter++;
        this.memberId = memberId;
        this.memberName = memberName;
        this.title = title;
        this.content = content;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getPostId() {
        return postId;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
    public String getMemberName() {
        return memberName;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s (작성자: %s)", postId, title, memberName);
    }
}
