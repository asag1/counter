package lt.task.loan_counter;

import lt.task.loan_counter.post.Count;

import java.io.IOException;

public class LoanCounterApplication {

    public static void main(String[] args) throws IOException {
        Count loanResult = new Count();
        loanResult.loanCount();

    }
}
