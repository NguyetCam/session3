package sesson3lab1;

import java.util.Scanner;

public class student extends person{
    String id,email;
    int score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void insert(){
        super.insert();
        Scanner sc = new Scanner(System.in);
        setId(sc.nextLine());
        setScore(sc.nextInt());
        sc.nextLine();
        setEmail(sc.nextLine());
    }

    public void display() {
        super.display();
        System.out.println("Mã SV: " + getId());
        System.out.println("Điểm thi: " + getScore());
        System.out.println("Email: " + getEmail());
    }

    public boolean scholarcheck(){
        if(getScore()<8) return false;
        return true;
    }
}
