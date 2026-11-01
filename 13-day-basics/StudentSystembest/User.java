public class User {
    //私有化成员
    //属性：用户名，密码，身份证号码，手机号
    private String Username;
    private String password;
    private String personid;
    private String phonenumber;

    public User() {
    }

    public User(String username, String password, String personid, String phonenumber) {
        Username = username;
        this.password = password;
        this.personid = personid;
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
