package _22_Bean;


import java.time.LocalDateTime;

/* 게시물 엔티티
* 게시물 아이디
* 게시물 제목
* 게시물 내용
* 작성자 아이디
* 작성자 닉네임
* 생성시각
* 수정시각
* */
public class PostEntity {
    private int postId;
    private String postTitle;
    private String postContent;
    private int userId;
    private String userNickName;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public LocalDateTime getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDateTime createDt) {
        this.createDt = createDt;
    }

    public LocalDateTime getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(LocalDateTime updateDt) {
        this.updateDt = updateDt;
    }
}
