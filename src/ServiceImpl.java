import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ServiceImpl implements Service {
    private List<Student> students = new ArrayList<>();

    @Override
    public String create(List<Student> students) {
        this.students.addAll(students);
        return null;
    }

    public void filter_A_B() {
        for (Student s : students) {
            if (s.getName().startsWith("A") || s.getName().startsWith("B")) {
                System.out.println(s);
            }
        }
    }

    public void filterAge_15_Money_2000() {
        for (Student s : students) {
            if (s.getAge() >= 15 & s.getMoney() >= 2000) {
                System.out.println(s);
            }
        }
    }

    public void maxMoneyStudent() {
            students.stream().max(Comparator.comparing(Student::getMoney)).ifPresent(System.out::println);
        }

    public void filterMaxMoneyGirl() {
        System.out.println(students.stream().filter(x -> x.getGender().equals(Gender.F)).max(Comparator.comparing(Student::getMoney)));
    }

    public void filterName() {
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }

    public void filterPrice_1000() {
        for (Student s : students) {
            System.out.println(s.getMoney() + 1000);
        }
    }

    public long getAllNumberStudent() {
        return students.size();
    }

    public Map<Gender, List<Student>> filterGroup() {
        List<Student>boys = students.stream().filter(s -> s.getGender().equals(Gender.M)).toList();
        List<Student> girls = students.stream().filter(s -> s.getGender().equals(Gender.F)).toList();
        System.out.println("boys\n"+boys);
        System.out.println("gris\n"+girls);
        return null;
    }
}
