package lt.task.loan_counter.post;

import java.util.List;

public class Post {

    private List<Post_parameters> posts;

    public Post() {
    }

    public Post(List<Post_parameters> posts) {
        this.posts = posts;
    }

    public List<Post_parameters> getPosts() {
        return posts;
    }

    public void setPosts(List<Post_parameters> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Post{" +
                "posts=" + posts +
                '}';
    }
}
