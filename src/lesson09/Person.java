package lesson09;

/*
Задача №1
Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь
метод - getName, метод возвращает имя с префиксом “Mr. ” если пол указан как
мужской и префикс “Mrs. ” если женский.
 */
public class Person {
    private String name;
    private int age;
    private String gender;/*male, female*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String gender) {
        return (gender.equals("male") ? "Mr. " : "Mrs. ") + name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
