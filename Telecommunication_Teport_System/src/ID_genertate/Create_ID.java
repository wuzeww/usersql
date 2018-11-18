package ID_genertate;

import DAO.DB_util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class Create_ID {

    public static final String Expenditure = "Expenditure";
    public static final String Message = "Message";
    public static final String prestore = "prestore";
    public static final String sell = "sell";
    public static final String Settle = "Settle";
    public static String get_ID(String type) throws SQLException {

        Get_ID get_id = new Get_ID();
        return get_id.get_ID(type);
    }

}

class Get_ID {
    String get_ID(String type) throws SQLException {

        int int_id;
        synchronized (this) {
            String id = get_present_ID(type);
            int_id = Integer.parseInt(id);
            int_id++;
            change_present_ID(type , int_id+"");
        }

        return int_id+"";
    }
    private String get_present_ID(String type) throws SQLException {
        Connection connection = DB_util.getConnection();
        String sql = "select ? from id_table";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,type);
        ResultSet resultSet = preparedStatement.executeQuery();
        String id = resultSet.getString(1);
        DB_util.close(resultSet,preparedStatement,connection);
        return id;
    }

    private void change_present_ID(String type, String new_id) throws SQLException {
        Connection connection = DB_util.getConnection();
        String sql = "update id_table set ? = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, type);
        preparedStatement.setString(2, new_id);
        preparedStatement.executeUpdate();

        DB_util.close(null, preparedStatement, connection);
    }
}

