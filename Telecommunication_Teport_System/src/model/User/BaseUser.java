package model.User;

public class BaseUser {
    private String UserID;
    private String UserName;

    public static final int NORMAL = 0;
    public static final int CHECKER = 1;
    public static final int ADMIN = 3;
    public static final int DEVELOPER = 4;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return password;
    }

    public int getLevel() {
        return Level;
    }

    private String password;
    private int Level=0;

}
