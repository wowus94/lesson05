package lesson05;

public class Lesson05 {
    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Ivanov1", "director1", "ivanov1@mail.ru", 10000, 89991111, 20);
        employees[1] = new Employees("Ivanov2", "director2", "ivanov2@mail.ru", 20000, 89991112, 30);
        employees[2] = new Employees("Ivanov3", "director3", "ivanov3@mail.ru", 30000, 89991113, 40);
        employees[3] = new Employees("Ivanov4", "director4", "ivanov4@mail.ru", 40000, 89991114, 45);
        employees[4] = new Employees("Ivanov5", "director5", "ivanov5@mail.ru", 50000, 89991115, 50);

        for (int i=0; i< employees.length; i++) {
            if ( employees[i].getAge() > 40) {
                employees[i].info();
            }
        }
    }
}
