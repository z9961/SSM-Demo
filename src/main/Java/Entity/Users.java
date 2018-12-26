package Entity;

import java.util.List;

public class Users {

    public Users(String uphone, String uname, String upwd, Integer utype, Integer uflag) {
        this.uphone = uphone;
        this.uname = uname;
        this.upwd = upwd;
        this.utype = utype;
        this.uflag = uflag;
    }

    @Override
    public String toString() {
        return "Users{" +
                "addressesByUphone=" + addressesByUphone +
                ", uphone='" + uphone + '\'' +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", utype=" + utype +
                ", uflag=" + uflag +
                '}';
    }

    public Users(List<UsersAddress> addressesByUphone, String uphone, String uname, String upwd, Integer utype, Integer uflag) {
        this.addressesByUphone = addressesByUphone;
        this.uphone = uphone;
        this.uname = uname;
        this.upwd = upwd;
        this.utype = utype;
        this.uflag = uflag;
    }

    public List<UsersAddress> getAddressesByUphone() {
        return addressesByUphone;
    }

    public void setAddressesByUphone(List<UsersAddress> addressesByUphone) {
        this.addressesByUphone = addressesByUphone;
    }

    private List<UsersAddress> addressesByUphone;

    private String uphone;

    private String uname;

    private String upwd;

    private Integer utype;

    private Integer uflag;

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public Integer getUtype() {
        return utype;
    }

    public void setUtype(Integer utype) {
        this.utype = utype;
    }

    public Integer getUflag() {
        return uflag;
    }

    public void setUflag(Integer uflag) {
        this.uflag = uflag;
    }
}