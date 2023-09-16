public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10]; //поле типа Employee[10]

        Employee employee1 = new Employee("Ivanov", "Ivan", "Ivanovich", 3, 91000);
        Employee employee2 = new Employee("Petrov", "Petr", "Petrovich", 2, 100000);
        Employee employee3 = new Employee("Sidorov", "Denis", "Sergeevich", 4, 95000);
        Employee employee4 = new Employee("Ivanova", "Anna", "Borisovna", 1, 93000);
        Employee employee5 = new Employee("Svetlaya", "Irina", "Pavlovna", 5, 90000);
        Employee employee6 = new Employee("Borisov", "Maksim", "Alekseevich", 3, 97000);
        Employee employee7 = new Employee("Alekseev", "Sergey", "Nikolaevich", 1, 92000);
        Employee employee8 = new Employee("Maksimova", "Alla", "Nikolaevna", 2, 94000);
        Employee employee9 = new Employee("Nikolaeva", "Olga", "Anatolyevna", 4, 91000);
        Employee employee10 = new Employee("Denisov", "Pavel", "Ivanovich", 3, 98000);

        employees[0] = employee1;
        System.out.println(employees[0]);
    }
}