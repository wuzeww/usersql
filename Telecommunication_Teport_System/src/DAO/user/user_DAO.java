package DAO.user;

import DAO.DB_util;
import model.User.BaseUser;
import model.User.NormalUser;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class user_DAO implements BaseUserSQL {
    //下面是示例，你们可以看一下，这类完成后把这句话删掉
    @Override
    public void add(BaseUser baseUser) throws SQLException {
        Connection conn = DB_util.getConnection();
        Statement statement =  conn.createStatement();
        String sql = "select * from test";
        ResultSet resultSet = statement.executeQuery(sql);
        DB_util.close(resultSet,statement,conn);
    }

    @Override
    public void update(BaseUser baseUser) throws SQLException {

    }

    @Override
    public BaseUser findByID(String ID) throws SQLException {
//        NormalUser normalUser = new NormalUser();
//        normalUser.setUserID();
//        normalUser.setPassword();
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
