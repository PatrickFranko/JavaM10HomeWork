package filetojson;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int age;
    private String nameColum;
    private String ageColum;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getAgeColum(){
        return ageColum;
    }
    public void setAgeColum(String ageColum){
        this.ageColum = ageColum;
    }

    public String getNameColum(){
        return nameColum;
    }
    public void setNameColum(String nameColum){
        this.nameColum = nameColum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
