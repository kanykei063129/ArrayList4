import java.util.List;
import java.util.Map;

public interface Service {
    public String create(List<Student> students);
    public void filter_A_B();
    public void filterAge_15_Money_2000();
    public void maxMoneyStudent();
    public void filterMaxMoneyGirl();
    public void filterName();
    public void filterPrice_1000();
    public long getAllNumberStudent();
    public Map<Gender, List<Student>> filterGroup();
}
