package sesson3lab1;

import java.util.Scanner;

public class GiaoVien extends person{
    String lopgiangday,subjects;
    float salary;
    int teachingsubs;

    public String getLopgiangday() {
        return lopgiangday;
    }

    public void setLopgiangday(String lopgiangday) {
        this.lopgiangday = lopgiangday;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getTeachingsubs() {
        return teachingsubs;
    }

    public void setTeachingsubs(int teachingsubs) {
        this.teachingsubs = teachingsubs;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public void insert(){
        super.insert();
        Scanner sc = new Scanner(System.in);
        setLopgiangday(sc.nextLine());
        setSalary(sc.nextFloat());
        setTeachingsubs(sc.nextInt());
        sc.nextLine();
        setSubjects(sc.nextLine());
    }

    public void display(){
        super.display();
        System.out.println("Danh sách lớp giảng dạy: " + getLopgiangday());
        System.out.println("Lương: " + getSalary());
        System.out.println("Số môn giảng dạy: " + getTeachingsubs());
        System.out.println("Tên môn giảng dạy: " + getSubjects());
    }
}
