import java.sql.*;

public class Main99 {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost/user?useUnicode=true&serverTimezone=UTC";
        String username = "root";
        String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                //String query = "create table users(id int primary key auto_increment, first_name varchar(25), last_name varchar(25))";
                //String query = "insert into users(first_name, last_name) values('denis', 'denisovich')";
                String query = "insert into users(first_name, last_name) values(?,?)";
                //String query = "select * from users"; //where id = 2
                //String query = "update users set first_name='misha' where first_name='bill'";
                        //Statement statement = connection.createStatement();
                PreparedStatement statement1 = connection.prepareStatement(query);
                statement1.setString(1,"teach me");
                statement1.setString(2,"skills");

                //statement.execute(query);
                statement1.execute();
                //ResultSet resultSet = statement.executeQuery(query);
                //while (resultSet.next()){
                   // System.out.println(resultSet.getInt(1));
                   // System.out.println(resultSet.getString(2));
                   // System.out.println(resultSet.getString(3));
                }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
