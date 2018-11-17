package DAO.user;

import DAO.DB_util;
import model.User.BaseUser;

import java.sql.*;
import java.util.ArrayList;

public class user_DAO implements BaseUserSQL {

    public static void main(String[] args) throws SQLException {
        user_DAO user_dao = new user_DAO();
        BaseUser baseUser = user_dao.findByID("001");
        System.out.println(baseUser.getUserName()+baseUser.getPassword());
    }
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
        BaseUser baseUser = new BaseUser();
        Connection conn = DB_util.getConnection();
        String sql = "select * from user " +
                "where User_id = ? ";
        PreparedStatement preparedStatement =  conn.prepareStatement(sql);
        preparedStatement.setString(1, ID );
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next())
        {
            baseUser.setUserID(resultSet.getString("User_id"));
            baseUser.setPassword(resultSet.getString("Pass_word"));
            baseUser.setUserName(resultSet.getString("UserName"));
            baseUser.setLevel(Integer.parseInt(resultSet.getString("User_Type")));
        }
        DB_util.close(resultSet,preparedStatement,conn);

        return baseUser;
    }


    @Override
    public void delete(String UserID) throws SQLException {

    }

    @Override
    public ArrayList<BaseUser> find_condition() throws SQLException {
        return null;
    }
}
