package model.Teport;

public class Base_teport {
    private String ID;
    private String Time;
    private int Status;

    public static final int UN_CHECKED = 0;
    public static final int CHECKED = 1;
    public static final int UN_PASSED = 2;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
