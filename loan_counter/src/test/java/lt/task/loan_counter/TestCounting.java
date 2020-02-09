package lt.task.loan_counter;

import lt.task.loan_counter.post.Count;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class TestCounting {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void loan_reading() throws IOException {
        File file = tempFolder.newFile("loan.json");
        assertTrue(file.exists());
    }


//    @Test
//    public void counting_cheking() throws IOException {
//    Count cout =  new Count();
//        int incomes = 1000;
//        int familyMemberNo = 1;
//        int age = 45;
//        int debt = 0;
////        assertArrayEquals(144000);
//    }
}
