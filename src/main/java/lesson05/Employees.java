package lesson05;

public class Employees {
    private String name;
    private String position;
    private String email;
    private int money;
    private int number;
    private int age;

    public int getAge() {
        return age;
    }

    public Employees(String name, String position, String email, int money, int number, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.money = money;
        this.number = number;
        this.age = age;
    }

    public void info(){
        System.out.println(name + " " + position + " " + email + " " + money + " " + number + " " + age);
    }
}
