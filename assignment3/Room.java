package assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    String roomname,position,price;
    ArrayList userlist = new ArrayList();

    public Room(){
        System.out.println("\nThông tin phòng: ");
    }

    public Room(String roomname){
        System.out.println("Thông tin thuê phòng số: " + roomname);
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ArrayList getUserlist() {
        return userlist;
    }

    public void setUserlist(ArrayList userlist) {
        this.userlist = userlist;
    }

    public void display(){
        System.out.println("Room name: " + this.roomname);
        System.out.println("Position: " + this.position);
        System.out.println("Price: " + this.price);
        System.out.println("User list: " + this.userlist);
    }
}
