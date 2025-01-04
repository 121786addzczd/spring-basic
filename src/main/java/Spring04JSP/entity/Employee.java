package Spring04JSP.entity;

public class Employee {

    private int id;
    private String name;
    private String sex;
    private int birthYear;
    private String address;

    // ゲッター
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getAddress() {
        return address;
    }

    // セッター
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
