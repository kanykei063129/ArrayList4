public class Student {
    private String name;
    private int age;
    private Gender gender;
    private int money;
    private String fullName;

    public Student(String name, int age, Gender gender, int money, String fullName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.money = money;
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", money=" + money +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
