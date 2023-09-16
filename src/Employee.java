public class Employee {
    static int count = 1;
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private int salary;

    public Employee(String surname, String name, String patronymic, int department, int salary) {

        this.id = count;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID:" + this.id + " " + this.surname + " " + this.name + " " + this.patronymic + " " + " Отдел " + this.department + " Зарплата " + this.salary;
    }
}
