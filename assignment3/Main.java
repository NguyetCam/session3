package assignment3;

public class Main {
    public static void main(String[] args){
        //Nhập thông tin người dùng
        User user1 = new User();
        user1.name = "Nguyệt Cầm";
        user1.age = 22;
        user1.tel = "0359903359";
        user1.email = "vuchaunguyetcam@gmail.com";
        user1.budget = 3500.8;

        User user2 = new User();
        user2.name = "Hà Linh";
        user2.age = 20;
        user2.tel = "012345678";
        user2.email = "dohalinh@gmail.com";
        user2.budget = 700.2;

        User user3 = new User();
        user3.name = "Phú Cường";
        user3.age = 20;
        user3.tel = "023456789";
        user3.email = "cuongle@gmail.com";
        user3.budget = 100.9;

        User user4 = new User();
        user4.name = "Đức Duy";
        user4.age = 22;
        user4.tel = "034567890";
        user4.email = "leducduy@gmail.com";
        user4.budget = 1500.3;

        //Nhập thông tin phòng
        Room room1 = new Room();
        room1.roomname = "A01";
        room1.position = "first floor, balcony";
        room1.price = "1500.5";
        room1.userlist.add(user1.name);
        room1.userlist.add(user2.name);
        System.out.println("\nThông tin phòng: " + room1.roomname);
        room1.display();

        Room room2 = new Room();
        room2.roomname = "A02";
        room2.position = "first floor, corner";
        room2.price = "1200.7";
        room2.userlist.add(user3.name);
        room2.userlist.add(user4.name);
        System.out.println("\nThông tin phòng: " + room2.roomname);
        room2.display();

        //Gán phòng cho người dùng và kiểm tra ngân sách
        System.out.println("\nKiểm tra ngân sách khách hàng:");
        user1.Room = room1;
        user1.checkbudget();
        user2.Room = room1;
        user2.checkbudget();
        user3.Room = room2;
        user3.checkbudget();
        user4.Room = room2;
        user4.checkbudget();

        //Xóa người dùng khỏi phòng
        System.out.println("\nThông tin phòng sau khi xóa người dùng đã trả phòng: ");
        room1.userlist.remove(1);
        room2.userlist.remove(0);
        room1.display();
        room2.display();
    }
}
