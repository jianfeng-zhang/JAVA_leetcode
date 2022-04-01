package Java语法._15学生管理系统;

import java.util.Objects;

public class Student {
    //学号
    private String sit;
    private String name;
    private String age;
    //地址
    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(sit, student.sit) && Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sit, name, age, address);
    }

    public Student() {
    }

    public Student(String sit, String name, String age, String address) {
        this.sit = sit;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getSit() {
        return sit;
    }

    public void setSit(String sit) {
        this.sit = sit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
