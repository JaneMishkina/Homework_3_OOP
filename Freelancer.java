/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания.
 *  *20*8
 */
public class Freelancer extends Employee{
    private int salaryPerHour;
    private int hours;
    private int days;

    public Freelancer(String surname, String name, int salaryPerHour, int hours, int days, int age, String education) {
        super(name, surname, salaryPerHour*days*hours, age, education);
        this.salaryPerHour = salaryPerHour;
        this.hours = hours;
        this.days = days;
    }

    @Override
    public int calculateSalary() {
        return this.salaryPerHour * this.hours * this.days;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; ЗП (ставка %d, часы %d, дни %d): %d (руб.); возраст: %d; %s образование",
                surname, name, salaryPerHour, hours, days, calculateSalary(), age, education);
    }
}

//      public Freelancer(String surname, String name, int salaryPerHour, int hours, int days, int age, String edu) {
//         super(name, surname, rate * (double) hours, age);
//         this.rate = rate;
//         this.hours = hours;
//     }

//     @Override
//     public double calculateSalary() {
//         return this.rate * (double) this.hours;
//     }

//     @Override
//     public String toString() {
//         return String.format("%s %s; Фрилансер; Возраст: %d; ЗП (ставка %.2f, часы %d): %.2f (руб.)",
//                 surname, name, age, rate, hours, calculateSalary());
//     }
//     public int getHours() {
//         return hours;
//     }

//     public void setHours(int hours) {
//         this.hours = hours;
//     }
//     private int hours;
//     public int getDays() {
//         return days;
//     }

//     public void setDays(int days) {
//         this.days = days;
//     }
//     private int days;
//     public int getSalaryPerHour() {
//         return salaryPerHour;
//     }

//     public void setSalaryPerHour(int salaryPerHour) {
//         this.salaryPerHour = salaryPerHour;
//     }
//     private int salaryPerHour;

   

//     /**
//      * @param name
//      * @param surname
//      * @param age2
//      */
//     public Freelancer(String surname, String name, int salary, int age, String education) {
//         super(surname, name, salary, age, education);
//         // this.salaryPerHour=salaryPerHour;

//     }

//     @Override
//     public int calculateSalary() {
//         return salaryPerHour*hours*days;
//     }
//     @Override
//     public String toString() {
//         return String.format("%s %s; Фрилансер; Зарабатывает в месяц: %d (руб.); возраст: %d; %s образование ",
//                 surname, name, salary, age, education);
//     }
// }
