package jdbc;


import java.sql.*;
public class jd {

    private static String url = "jdbc:mysql://10.250.110.6:3306/sakila";

    private static String user = "root";
    private static String password = "123456";

    private jd(){}

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Connection getconnection() throws SQLException{
        return DriverManager.getConnection(url,user,password);
    }

    //释放资源，此处是为了保证每个资源最后都没被释放掉
    public static void free(ResultSet rs ,Statement st ,Connection conn) {
        try {
            if(rs != null)
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }finally {
            try {
                if(st != null)
                    try {
                        st.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
            }finally {
                if(conn != null)
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
            }
        }


    }
}

