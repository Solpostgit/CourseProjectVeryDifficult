import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees; // объявил массив объектов класса Employee
    private int size;

    public EmployeeBook() {

        this.employees = new Employee[10];
    }

    public void addEmployee(String fullName, int department, double salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить контакт, закончилось место");
        }
        Employee newEmployee = new Employee(fullName, department, salary);
        employees[size++] = newEmployee;
    }

    // Реализуем метод removeEmployee (удалить сотрудника)
    // Метод сдвигает массив влево на ячейку, удаляя ячейку под номером i
    public void removeEmployee(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                System.out.println(employees[i].getFullName() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }

    // Реализуем метод findEmployee (найти сотрудника)
    public void findEmployee(String fullName) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getFullName().equals(fullName)) {
                System.out.println(employee.getFullName() + " " + employee.getDepartment() + " " + employee.getSalary());
                return;
            }
        }
        System.out.println(fullName + " не найден");
    }

    // Реализуем метод changeEmployee (изменить отдел и зарплату сотрудника)
    public void changeEmployee(String fullName, int changeDepartment, double changeSalary) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getFullName().equals(fullName)) {
                System.out.println(employee.getFullName() + " " + employee.getDepartment() + " " + employee.getSalary());
                employee.setDepartment(changeDepartment);
                employee.setSalary(changeSalary);
                System.out.println(employee.getFullName() + " " + employee.getDepartment() + " " + employee.getSalary());
                return;
            }
        }
        System.out.println(fullName + " не найден");
    }


    // Реализуем метод printAllEmployee (распечатать всех сотрудников )
    public void printAllEmployees() {
        for (int i = 1; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getFullName() + " " + employee.getDepartment() + " " + employee.getSalary());
        }
    }


    // Реализуем метод getCurrentSize (получить текущий размер)
    public int getCurrentSize() {
        return size;
    }
/* //не смог реализовать перенос статического метода в класс EmployeeBook, и сделать его нестатическим
    public void minSalaryDepartment(Employee[] employees, int department) {
        int minIndex = 0;
        double minSal = employees[1].getSalary();
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() <= minSal) { //сотрудник с мин зарплатой
                    minSal = employees[i].getSalary();
                    minIndex = i;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в " + department + " отделе " + employees[minIndex]);
    }

 */
}



