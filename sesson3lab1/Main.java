package sesson3lab1;

public class Main {
    public static void main(String[] args){
        student st1 = new student();
        st1.insert();
        st1.display();
        if(st1.scholarcheck()) {
            System.out.println("Sinh viên đạt học bổng");
        }else {
            System.out.println("Sinh viên không có học bổng");
        }

        GiaoVien gv1 = new GiaoVien();
        gv1.insert();

        gv1.display();
    }
}
