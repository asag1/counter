package lt.task.loan_counter;

import com.fasterxml.jackson.databind.ObjectMapper;
import lt.task.loan_counter.post.Count;
import lt.task.loan_counter.post.Post_parameters;

import java.io.File;
import java.io.IOException;

public class LoanCounterApplication {
    static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/W10/Desktop/Java/Mano JAVA mokslai/darbai/loan_counter/loan_counter/loan.json");
        Post_parameters postIsJsonFailo = mapper.readValue(file, Post_parameters.class);
        System.out.println(postIsJsonFailo.getAge());


    }
}
