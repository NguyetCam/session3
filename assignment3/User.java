package assignment3;

public class User {
    String name,email,tel;
    int age;
    double budget;
    Room Room;

    public User(){
        System.out.println("\nChào mừng đến với khách sạn FPT - Aptech");
    }

    public User(double budget){
        System.out.println("Cảm ơn quý khách đã sử dụng dịch vụ của khách sạn FPT - Aptech");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void checkbudget(){
        float roomprice = Float.parseFloat(this.Room.price);
        if(this.budget<roomprice){
            System.out.println("Khách hàng " + this.name + " không đủ tiền thuê phòng");
        }else {
            System.out.println("Khách hàng " + this.name + " đủ tiền thuê phòng");
        }
    }
}
