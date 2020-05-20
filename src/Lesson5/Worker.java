package Lesson5;

public class Worker {
    private String lastName;
    private String firstName;
    private String middleName;
    private int age;

    private String email;
    private String phoneNumber;

    private String position;
    private int salary;

    public Worker(String lastName, String firstName, String middleName, int age, String email, String phoneNumber, String position, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.printf("Сотрудник: %s %s %s  Возраст: %d лет%n" +
                "Email: %s  Телефон: %s%n" +
                "Должность: %s  Оклад: %d%n%n",
                lastName, firstName, middleName, age,
                email, phoneNumber,
                position, salary);
    }

    public String getLastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
