package lt.task.loan_counter.post;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Count {

    private int minMoneyForPerson = 400;
    private int maxPersonAge = 65;
    @JsonProperty("loan")
    private List<Post_parameters> posts;
    ObjectMapper mapper = new ObjectMapper();

    public Count() {
    }

    public List<Post_parameters> getPosts() {
        return posts;
    }

    public void setPosts(List<Post_parameters> posts) {
        this.posts = posts;
    }

    public String loanCount() throws IOException {
        File file = new File("C:/Users/W10/Desktop/Java/Mano JAVA mokslai/darbai/loan_counter/loan_counter/loan.json");
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Count personParametres = mapper.readValue(file, Count.class);
        this.posts = personParametres.getPosts();
        for (int i = 0; i < posts.size(); i++){
            System.out.println(personParametres.getPosts().get(i).getAge());
        }

        for (int i = 0; i < posts.size(); i++) {
            if (18 < (int) personParametres.getPosts().get(i).getAge() && (int) personParametres.getPosts().get(i).getAge() < 65) {
                int freeMoney = (int) personParametres.getPosts().get(i).getIncomes() - (int) personParametres.getPosts().get(i).getDebt() - (int) personParametres.getPosts().get(i).getFamilyMemberNo() * minMoneyForPerson;
                if (freeMoney > 0) {
                    int loan = freeMoney * 12 * (maxPersonAge - (int) personParametres.getPosts().get(i).getAge());
                    if (loan > 500) {
                        return ("max loan" + loan);
                    } else return ("cant get loan");
                }
                return ("cant get loan");
            }
        }
        return ("cant get loan");
    }
}
