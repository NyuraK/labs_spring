package lab5;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class RequestDAO {

    private Connection conn;

    public RequestDAO(Connection con) {
        this.conn = con;
    }

    public RequestDTO searchById(int id) throws SQLException {
        String sql = "select * from requests where request_id=" + id;
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        if (!result.isBeforeFirst()) return null;
        RequestDTO res = new RequestDTO();
        while (result.next()) {
            res = toDTO(result);
        }
        return res;
    }

    private RequestDTO toDTO(ResultSet result) throws SQLException {
        RequestDTO dto = new RequestDTO();
        dto.setId(result.getInt("request_id"));
        dto.setDescription(result.getString("description"));
        dto.setUserID(result.getInt("user_id"));
        dto.setStatus(result.getString("status"));
        return dto;
    }

    public List<RequestDTO> searchByKeyword(String keyword) throws SQLException {
        String sql = "select * from requests where description like ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, keyword);
        ResultSet result = stmt.executeQuery();
        List<RequestDTO> list = new ArrayList<>();
        while (result.next()) {
            RequestDTO res = toDTO(result);
            list.add(res);
        }
        return list;
    }


    public void create(RequestDTO dto) throws SQLException {
        java.util.Date today = new java.util.Date();
        String sql = "insert into requests " +
                "(request_id, begin_date, description, end_date, status, type_of_request_id, user_id) " +
                "values (?,?,?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, dto.getId());
        stmt.setDate(2, new Date(today.getTime()));
        stmt.setString(3, dto.getDescription());
        stmt.setDate(4, new Date(today.getTime()));
        stmt.setString(5, dto.getStatus());
        stmt.setInt(6, 3);
        stmt.setInt(7, dto.getUserID());
        stmt.executeUpdate();
//        conn.commit();
    }

    public void close() throws SQLException {
        conn.close();
    }
}
