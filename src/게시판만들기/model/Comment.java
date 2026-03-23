package 게시판만들기.model;

public class Comment {
    private static int idCounter = 1;

    private final int commentId;
    private final int postId;
    private final int memberId;
    private final String memberName;
    private final String content;
    public Comment(int postId, int memberId, String memberName, String content) {
        this.commentId = idCounter++;
        this.postId = postId;
        this.memberId = memberId;
        this.memberName = memberName;
        this.content = content;
    }
    public static int getIdCounter() {
        return idCounter;
    }
    public int getCommentId() {
        return commentId;
    }
    public int getPostId() {
        return postId;
    }
    public int getMemberId() {
        return memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public String getContent() {
        return content;
    }
    @Override
    public String toString() {
        return "Comment [commentId=" + commentId + ", postId=" + postId + ", " +
                "memberId=" + memberId + ", memberName=" + memberName + ", " +
                "content=" + content + "]";
    }
}
