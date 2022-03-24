package sesson3lab1;

import java.util.Scanner;

public class person {
    String name,gender,bdate,address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public person(){
        System.out.println("Nhập thông tin: ");
    }

    public person(String studentid){
        System.out.println("Sinh viên " + studentid);
    }

    public void insert(){
        Scanner sc = new Scanner(System.in);
        setName(sc.nextLine());
        setGender(sc.nextLine());
        setBdate(sc.nextLine());
        setAddress(sc.nextLine());
    }

    public void display(){
        System.out.println("Tên: " + getName());
        System.out.println("Giới tính: " + getGender());
        System.out.println("Ngày sinh: " + getBdate());
        System.out.println("Địa chỉ: " + getAddress());
    }
}
