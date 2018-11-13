package DAO.user;

import model.User.BaseUser;

import java.sql.SQLException;
import java.util.ArrayList;

public interface BaseUserSQL {
    public void add(BaseUser baseUser) throws SQLException;
    public void update(BaseUser baseUser)throws SQLException;
    public BaseUser findByID(String ID)throws SQLException;
    public void delete(String UserID)throws SQLException;
    public ArrayList<BaseUser> find_condition()throws SQLException;
}
