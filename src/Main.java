public class Main {
    public static void main(String[] args) {
        /*

        7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
    1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    2. Посчитать сумму затрат на зарплаты в месяц.
    3. Найти сотрудника с минимальной зарплатой.
    4. Найти сотрудника с максимальной зарплатой.
    5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
         */


        Employee employee = new Employee("Ivan", "Ivanovich", "Ivanov", 300000, 2, Employee.id);
        employee = new Employee("Ivan", "Ivanovich", "Ivanov", 300000, 2, Employee.id);
        employee = new Employee("Ivan", "Ivanovich", "Ivanov", 300000, 2, Employee.id);
        employee = new Employee("Ivan", "Ivanovich", "Ivanov", 300000, 2, Employee.id);
        employee = new Employee("Ivan", "Ivanovich", "Ivanov", 300000, 2, Employee.id);
        System.out.println(employee);


    }
}
