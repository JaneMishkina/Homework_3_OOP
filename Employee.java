
public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;
    protected int salary; // Ставка заработной платы
    protected int age;
    protected String education;

    public String getEducation() {
        return education;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String surname, String name, int salary, int age, String education) {
        this.surname = surname;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.education = education;
    }

    // public Employee(String name, String surname, int age, String education) {
    //     this.name = name;
    //     this.surname = surname;
    //     this.salary = salary;
    //     this.age = age;
    //     this.education = education;
    // }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract int calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int res = surname.compareTo(o.surname);
        if (res == 0)
            return Double.compare(calculateSalary(), o.calculateSalary());
        else
            return res;
    }

}
