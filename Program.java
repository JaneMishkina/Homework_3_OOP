
//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

// import javax.sound.sampled.Line;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        String[] educations = new String[] {"высшее", "неоконченное высшее", "среднее-специальное", "среднее"};
        int age = random.nextInt(18, 90);
        int res = random.nextInt(0, 2);
        if (res==0){
            int salary = random.nextInt(20000, 80000);
            return new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age, educations[random.nextInt(educations.length)]);
        }
        else {
            return new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], 600, random.nextInt(1, 12), random.nextInt(10, 31), age, educations[random.nextInt(educations.length)]);
        }
        }
    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *  Придумать несколько Comparator'ов для сортировки сотрудников
     *  по фамилии + имени или по возрасту и уровню ЗП.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[20];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }
        // Arrays.sort(employees);
        Arrays.sort(employees, new SalaryComparator());

        // Arrays.sort(employees, new AgeComporator());

        // Arrays.sort(employees, new SurnameAgeComporator());

        for(Employee employee : employees){
            System.out.println(employee);
        }

    }

}
