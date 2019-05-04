package lab5;

import java.sql.*;

public class DBConnectivity {
    private static final String url = "jdbc:mysql://localhost:3306/autentification?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection con;

    public static void main(String args[]) {

        RequestDAO request;
        try {
            con = DriverManager.getConnection(url, user, password);
            request = new RequestDAO(con);
            System.out.println(request.searchById(2));
            System.out.println(request.searchById(90));

            request.searchByKeyword("Test").forEach(System.out::println);

            RequestDTO requestDTO = createDTO(90,3, "Accepted", "Test for JDBC");
            request.create(requestDTO);

            request.searchByKeyword("Test").forEach(System.out::println);

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException se) {
            }
        }
    }

    private static RequestDTO createDTO(int id, int user_id, String status, String description) {
        RequestDTO dto = new RequestDTO();
        dto.setDescription(description);
        dto.setStatus(status);
        dto.setUserID(user_id);
        dto.setId(id);
        return dto;
    }

}
