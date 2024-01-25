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
    private int salary;
    private int departmentNumber;
    private int id;

    // статическую переменную-счетчик, которая будет отвечать за id.

    public Employee(String name, String surname, String derivativeSurname, int salary, int departmentNumber, int id) {
        this.name = name;
        this.surname = surname;
        this.derivativeSurname = derivativeSurname;
        this.salary = salary;
        this.derivativeSurname = derivativeSurname;
        this.id = id;
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


}