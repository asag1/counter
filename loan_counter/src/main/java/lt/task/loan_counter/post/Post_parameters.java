package lt.task.loan_counter.post;

public class Post_parameters {

    int incomes;
    int familyMemberNo;
    int age;
    int debt;

    public Post_parameters() {
    }

    public Post_parameters(int incomes, int familyMemberNo, int age, int debt) {
        this.incomes = incomes;
        this.familyMemberNo = familyMemberNo;
        this.age = age;
        this.debt = debt;
    }

    public int getIncomes() {
        return incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public int getFamilyMemberNo() {
        return familyMemberNo;
    }

    public void setFamilyMemberNo(int familyMemberNo) {
        this.familyMemberNo = familyMemberNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "Post_parameters{" +
                "incomes=" + incomes +
                ", familyMemberNo=" + familyMemberNo +
                ", age=" + age +
                ", debt=" + debt +
                '}';
    }
}
