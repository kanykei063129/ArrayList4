import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        List<Student> students1 = new ArrayList<>();
        students1.add( new Student("Khafiz", 18,Gender.M,1000,"Turusbek uulu"));
        students1.add( new Student("Kanykei", 16,Gender.F,12000,"Akjoltoi kyzy"));
        students1.add( new Student("Aizat", 19, Gender.F,3452,"Duisheeva"));
        students1.add( new Student("Madina", 16,Gender.F,7462,"Khalikova"));
        students1.add( new Student("Datka", 22,Gender.F,3265,"Mamatjanova"));
        students1.add( new Student("Ulan", 27,Gender.M,3746,"Kubanychbek uulu"));
        students1.add( new Student("Eldan", 17,Gender.M,365,"Turgunbaev"));
        students1.add( new Student("Bakas",26,Gender.M,1249,"Koichubaev"));
        students1.add( new Student("Davran", 17, Gender.M,123,"Joldoshbaev"));
        students1.add( new Student("Adilet",23,Gender.M,2142,"Islambek uulu"));

        service.create(students1);
        System.out.println("аты А жана Б менен башталган студенттерди чыгарат.");
        System.out.println("=========================================");
        service.filter_A_B();
        System.out.println("=========================================");
        System.out.println("жашы 15тен чон жана акчасы 2000 ден чон студенттерди чыгарат.");
        System.out.println("=========================================");
        service.filterAge_15_Money_2000();
        System.out.println("=========================================");
        System.out.println("эн коп акчасы бар студентти чыгарат.");
        System.out.println("=========================================");
        service.maxMoneyStudent();
        System.out.println("=========================================");
        System.out.println("эн акчасы коп кызды чыгарат.");
        System.out.println("=========================================");
        service.filterMaxMoneyGirl();
        System.out.println("=========================================");
        System.out.println("баардык студенттердин атын эле консолго чыгарат.");
        System.out.println("=========================================");
        service.filterName();
        System.out.println("=========================================");
        System.out.println("баардык студенттердин акчасына 1000 сомдон кошуп чыгарат.");
        System.out.println("=========================================");
        service.filterPrice_1000();
        System.out.println("=========================================");
        System.out.println("биринчи турган студентти чыгарат.");
        System.out.println("=========================================");
        System.out.println(students1.get(0));
        System.out.println("=========================================");
        System.out.println("канча студент бар экендигин чыгарат.");
        System.out.println("=========================================");
        System.out.println(service.getAllNumberStudent());
        System.out.println("=========================================");
        System.out.println("балдарды жана кыздарды болуп группага салат.");
        System.out.println("=========================================");
        System.out.println(service.filterGroup());
    }
}