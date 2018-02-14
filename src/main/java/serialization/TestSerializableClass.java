package serialization;

import java.io.Serializable;

public class TestSerializableClass implements Serializable {

     private String name;
     private int age;
     private User user;

    public TestSerializableClass() {

    }


    public TestSerializableClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "TestSerializableClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", user=" + user +
                '}';
    }
}
