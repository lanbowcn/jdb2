package jdbc;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class jddemo {
    public static void main(String[] args) throws SQLException{
        Connection conn = null;
        Statement st = null;
        ResultSet rs =null;

        try {
            //建立连接
            conn = jd.getconnection();

            //创建语句
            st = conn.createStatement();

            //执行语句
            rs = st.executeQuery("select * from actor");

            //处理结果
            while(rs.next()) {
                System.out.println(rs.getString("id")+"---"+rs.getString("department_name"));
            }
        }finally {
            //释放资源
            jd.free(rs, st, conn);
        }
    }
}
