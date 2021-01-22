package pl.camp.it.rest.provider.model;

public class User {
    private int id;
    private String name;
    private String surname;
    private Address address;
    private String login;
    private int age;

    public User(int id, String name, String surname, Address address, String login, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.login = login;
        this.age = age;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                ", login='" + login + '\'' +
                ", age=" + age +
                '}';
    }
}
