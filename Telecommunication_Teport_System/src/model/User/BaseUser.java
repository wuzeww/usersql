package model.User;

public class BaseUser {
    private String UserID;
    private String UserName;

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
