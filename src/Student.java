public class Student {
    private  int stuid;
    private  String phone;

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        String str=String.valueOf(stuid);
        if (str.length()<10)
        {
            System.out.println("学号不足10位请重新输入");
            return;
        }
        this.stuid = stuid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
