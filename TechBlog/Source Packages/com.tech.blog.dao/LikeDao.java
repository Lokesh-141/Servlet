package com.tech.blog.dao;
import java.sql.*;
public class LikeDao {
    Connection con;

    public LikeDao(Connection con) {
        this.con = con;
    }
    
    public boolean insertLike(int pid, int luid) {
        boolean f = false;
        try {
            String q = "insert into liked (pid, luid) values (?,?)";
            PreparedStatement p = this.con.prepareStatement(q);
            p.setInt(1, pid);
            p.setInt(2, luid);
            p.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    public int countLikeOnPost(int pid) {
        int count = 0;
        String q = "select count(*) from liked where pid=?";
        try {
            PreparedStatement p = this.con.prepareStatement(q);
            p.setInt(1, pid);
            ResultSet set = p.executeQuery();
            if (set.next()) {
                count = set.getInt("count(*)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
    
    public boolean isLikedByUser(int pid, int luid) {
        boolean f = false;
        try {
            PreparedStatement p = this.con.prepareStatement("select * from liked where pid=? and luid=?");
            p.setInt(1, pid);
            p.setInt(2, luid);
            ResultSet set = p.executeQuery();
            if (set.next()) {
                f = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    public boolean deleteLike(int pid, int luid) {
        boolean f = false;
        try {
            PreparedStatement p = this.con.prepareStatement("delete from liked where pid=? and luid=?");
            p.setInt(1, pid);
            p.setInt(2, luid);
            p.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
