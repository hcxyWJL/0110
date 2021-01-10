public class Student extends Users {

    public Student(String major, String phone) {
        this.major = major;
        this.phone = phone;
    }

    private  String major;
    private  String phone;

    public String getMajor() {
        return major;
    }

    public String getPhone() {
        return phone;
    }
}
