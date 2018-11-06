package DAO.user;

import model.User.BaseUser;

import java.sql.SQLException;
import java.util.ArrayList;

public class user_DAO implements BaseUserSQL {
    @Override
    public void add(BaseUser baseUser) throws SQLException {

    }

    @Override
    public void update(BaseUser baseUser) throws SQLException {

    }

    @Override
    public BaseUser findByID(BaseUser baseUser) throws SQLException {
        return null;
    }

    @Override
    public void delete(String UserID) throws SQLException {

    }

    @Override
    public ArrayList<BaseUser> find_condition() throws SQLException {
        return null;
    }
}
