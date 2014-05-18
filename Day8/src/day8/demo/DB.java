package day8.demo;

import oracle.jdbc.OracleDriver;

import java.sql.*;

/**
 * Created by Administrator on 14-5-18.
 */
public class DB {

//    connect to DB
//    CRUD
    private static final String URL = "jdbc:oracle:thin:@//127.0.0.1:1521/orcl";//数据库连接字符串
    private static final String USER = "scott";
    private static final String PASSWORD = "tiger";
    private static final String SQL = "insert into t_user values(2, 'tester', 'test')";
    private static final String MESSAGE_INSERT = "insert into t_message values(s_message.nextval, ?, ?, sysdate)";
    private static final String MESSAGE_DELETE = "delete from t_message where id=?";
    private static final String MESSAGE_UPDATE = "update t_message set username=? where id=?";
    private static final String MESSAGE_QUERY = "select * from t_message order by time";


    public static void main(String[] args) throws SQLException {

//        1.  数据库的驱动
        new OracleDriver();
//        2.  连接数据库
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
//        3.  预编译语句
        PreparedStatement preparedStatement = connection.prepareStatement(MESSAGE_UPDATE);
        preparedStatement.setString(1, "测试。。。");
        preparedStatement.setInt(2, 1);
//        preparedStatement.setString(1, "张三");
//        preparedStatement.setString(2, "留言信息。。。");
//        4.  执行SQL
        int i = preparedStatement.executeUpdate();

//        ResultSet resultSet = preparedStatement.executeQuery();
//        while (resultSet.next()) {
//            String username = resultSet.getString("username");
//            String content = resultSet.getString("content");
//            System.out.println("username:" + username + ", content:" + content);
//        }

        System.out.println("done:" + i);
    }
}
