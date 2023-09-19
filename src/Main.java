import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Ivanov Ivan Ivanovich", 3, 91000);
        employeeBook.addEmployee("Petrov Petr Petrovich", 2, 100000);
        employeeBook.addEmployee("Sidorov Denis Sergeevich", 4, 95000);
        employeeBook.addEmployee("Ivanova Anna Borisovna", 1, 93000);
        employeeBook.addEmployee("Svetlaya Irina Pavlovna", 5, 90000);
        employeeBook.addEmployee("Borisov Maksim Alekseevich", 3, 97000);
        employeeBook.addEmployee("Alekseev Sergey Nikolaevich", 1, 92000);
        employeeBook.addEmployee("Maksimova Alla Nikolaevna", 2, 94000);
        employeeBook.addEmployee("Nikolaeva Olga Anatolyevna", 4, 91000);


        System.out.println("Размер книги сотрудников: " + employeeBook.getCurrentSize());
        // Распечатываем размер книги сотрудников
        System.out.println();
        employeeBook.findEmployee("Svetlaya Irina Pavlovna");
        // Ищем сотрудника Svetlaya Irina Pavlovna
        System.out.println();

        employeeBook.removeEmployee("Svetlaya Irina Pavlovna");
        // Удаляем контакт Svetlaya Irina Pavlovna
        employeeBook.findEmployee("Svetlaya Irina Pavlovna");
        // Ищем контакт Svetlaya Irina Pavlovna
        employeeBook.changeEmployee("Sidorov Denis Sergeevich", 5, 98000);
        //Меняем отдел и зарплату сотрудника

        //Напечатаем список отделов и их сотрудников
        //не реализован вывод сотрудников по отделам

        employeeBook.printAllEmployees();
        // Снова распечатываем все контакты
        System.out.println("Размер книги сотрудников: " + employeeBook.getCurrentSize());
        // Снова распечатываем размер телефонной книги
    }
}