import java.util.Objects;

public class Employee {
    /*
    - **Базовая сложность**
        1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника.
        Отделы для простоты должны быть названы от 1 до 5.
        2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
        3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
        4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
        5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
        6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id,
         который нужно получить из счетчика).

     */
    private String name;
    private String surname;
    private String derivativeSurname;
    private Integer salary;
    private int departmentNumber;
    private static int counter;
    private int id;

    public Employee(String name, String surname, String derivativeSurname, int salary, int departmentNumber) {
        this.name = name;
        this.surname = surname;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
        this.derivativeSurname = derivativeSurname;
        this.id = ++ counter;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDerivativeSurname() {
        return derivativeSurname;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int settSalary() {
        return salary;
    }

    public String getFulName() {

        return name + ", " + surname + ", " + derivativeSurname;
    }

    @Override
    public String toString() {
        return "Имя - " + name + ", " + "Фамилия - " + derivativeSurname + ", " + "Отчество -" + '\'' +
                surname + ", " + "Зарплата :" + salary + ", " + "Отдел №-" + departmentNumber + ", ID № - " + getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && departmentNumber == employee.departmentNumber && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(derivativeSurname, employee.derivativeSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, derivativeSurname, salary, departmentNumber);
    }
}
