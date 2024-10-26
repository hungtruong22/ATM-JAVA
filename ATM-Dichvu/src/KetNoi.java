
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class KetNoi {
    public static Connection cn;
    public static void MoKetNoi() {
        try {
          //b1: Xac dinh HQTCSDL
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //b2: Ket noi
        String url = "jdbc:sqlserver://DESKTOP-RQV86U4:1433;databaseName=ATM;user=sa;password=truongminhhung";
        cn = DriverManager.getConnection(url);
        System.err.println("Da ket noi");
        } catch (Exception t1) {
            System.out.print(t1.getMessage());
        }
    }

    public static ResultSet LayBang(String tb) {
        try {
            Statement cmd = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            return cmd.executeQuery("select * from " + tb);
        } catch (Exception t2) {
            System.out.print(t2.getMessage());
            return null;
        }
    }
}
