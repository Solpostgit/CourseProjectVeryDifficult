import java.util.Arrays;

public class EmployeeBook {
    public static void main(String[] args) {
        EmployeeBook[] storage = new EmployeeBook[10]; //поле типа EmployeeBook[10]
        storage[0] = new EmployeeBook("Ivanov Ivan Ivanovich", 3, 91000);
        storage[1] = new EmployeeBook("Petrov Petr Petrovich", 2, 100000);
        storage[2] = new EmployeeBook("Sidorov Denis Sergeevich", 4, 95000);
        storage[3] = new EmployeeBook("Ivanova Anna Borisovna", 1, 93000);
        storage[4] = new EmployeeBook("Svetlaya Irina Pavlovna", 5, 90000);
        storage[5] = new EmployeeBook("Borisov Maksim Alekseevich", 3, 97000);
        storage[6] = new EmployeeBook("Alekseev Sergey Nikolaevich", 1, 92000);
        storage[7] = new EmployeeBook("Maksimova Alla Nikolaevna", 2, 94000);
        storage[8] = new EmployeeBook("Nikolaeva Olga Anatolyevna", 4, 91000);
        storage[9] = new EmployeeBook("Denisov Pavel Ivanovich", 5, 98000);

        System.out.println();
        System.out.println(Arrays.toString(storage)); //список сотрудников со всеми имеющимися данными
        System.out.println();
        System.out.println("*** Повышенная сложность ***");
        System.out.println();

        indexSalary(storage, 1.1); //индексация зарплаты на 10%
        System.out.println();
        minSalaryDepartment(storage, 5); //минимальная зарплата в отделе
        System.out.println();
        maxSalaryDepartment(storage, 2); //максимальная зарплата в отделе
        System.out.println();
        sumSalaryDepartment(storage, 1); //сумма зарплат в отделе
        System.out.println();
        midleSalaryDepartment(storage, 4); //средняя зарплата в отделе
        System.out.println();
        indexSalaryDepartment(storage, 5, 1.05); //индексация зарплаты в отделе
        System.out.println();
        listEmployeeDepartment(storage, 1); //список сотрудников в отделе
        System.out.println();
        choiceNumber(storage, 104000); //повышенная сложность 3. зарплата меньше/больше indexSalary
        System.out.println();


    }

    static int count = 1;
    private int id;
    private String fullName;
    private int department;
    private double salary;

    public EmployeeBook(String fullName, int department, double salary) {

        this.id = count;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        count++;
    }


    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID:" + this.id + " " + this.fullName + " " + " Отдел " + this.department + " Зарплата " + this.salary;
    }


    public static void indexSalary(EmployeeBook[] arr, double index) { //индексация зарплат
        double indexSal = 0;
        for (int i = 0; i < arr.length; i++) {
            indexSal = arr[i].getSalary() * index;
            arr[i].setSalary(indexSal);
            System.out.println(arr[i]);
        }
    }

    public static void minSalaryDepartment(EmployeeBook[] arr, int department) {
        int minIndex = 0;
        double minSal = arr[1].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartment() == department) {
                if (arr[i].getSalary() <= minSal) { //сотрудник с мин зарплатой
                    minSal = arr[i].getSalary();
                    minIndex = i;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в " + department + " отделе " + arr[minIndex]);
    }

    public static void maxSalaryDepartment(EmployeeBook[] arr, int department) {
        int maxIndex = 0;
        double maxSal = arr[1].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartment() == department) {
                if (arr[i].getSalary() >= maxSal) { //сотрудник с максимальной зарплатой
                    maxSal = arr[i].getSalary();
                    maxIndex = i;
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в " + department + " отделе " + arr[maxIndex]);
    }

    public static void sumSalaryDepartment(EmployeeBook[] arr, int department) {
        double sumSalaryDep = 0; //сумма зарплат в отделе
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartment() == department) {
                sumSalaryDep = sumSalaryDep + arr[i].getSalary(); //сумма зарплат на отдел
            }
        }
        System.out.println("Сумма затрат на зарплату по " + department + " отделу " + sumSalaryDep);
    }

    public static void midleSalaryDepartment(EmployeeBook[] arr, int department) {
        int indexEmployeeDep = 0; //количество сотрудников в отделе
        double sumSalaryDep = 0; //сумма зарплат в отделе
        double midleSalaryDep = 0; //средняя зарплата в отделе
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartment() == department) {
                indexEmployeeDep++;
                sumSalaryDep = sumSalaryDep + arr[i].getSalary(); //сумма зарплат на отдел
                midleSalaryDep = sumSalaryDep / indexEmployeeDep; //средняя зарплата по отделу
            }
        }
        System.out.println("Средняя зарплата по " + department + " отделу " + midleSalaryDep);
    }

    public static void indexSalaryDepartment(EmployeeBook[] arr, int department, double indexSal) {
        double indexSalDep = 0; //индексированная зарплата
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartment() == department) {
                indexSalDep = arr[i].getSalary() * indexSal; //индексация зарплаты в отделе
                arr[i].setSalary(indexSalDep);
                System.out.println("Индексация зарплаты в " + department + " отделе " + arr[i]);
            }
        }
    }

    public static void listEmployeeDepartment(EmployeeBook[] arr, int department) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartment() == department) {
                System.out.println("ID:" + arr[i].getId() + " " + arr[i].getFullName() + " " + arr[i].getSalary());
                //все сотрудники отдела
            }
        }
    }

    public static void choiceNumber(EmployeeBook[] arr, double indexSalary) {
        System.out.println("Зарплата меньше " + indexSalary);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() < indexSalary) { //зарплата меньше indexSalary
                System.out.println("ID:" + arr[i].getId() + " " + arr[i].getFullName() + " " + arr[i].getSalary());
            }
        }
        System.out.println("Зарплата больше " + indexSalary);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() >= indexSalary) { //зарплата больше indexSalary
                System.out.println("ID:" + arr[i].getId() + " " + arr[i].getFullName() + " " + arr[i].getSalary());
            }
        }
    }


}
