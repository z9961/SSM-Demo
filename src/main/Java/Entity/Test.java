package Entity;


public class Test {

    Integer id;
    String tname;
    Integer pid;

    public Test(Integer id, String tname, Integer pid) {
        this.id = id;
        this.tname = tname;
        this.pid = pid;
    }

    public Test() {
    }

    public Test(int id, String tname) {
        this.id = id;
        this.tname = tname;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String gettname() {
        return tname;
    }

    public void settname(String tname) {
        this.tname = tname;
    }
}