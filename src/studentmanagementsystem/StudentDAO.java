package studentmanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

    public void addStudent(Student student) {

        String sql = "INSERT INTO students(name, department, email, marks) VALUES (?, ?, ?, ?)";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setString(2, student.getDepartment());
            ps.setString(3, student.getEmail());
            ps.setInt(4, student.getMarks());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student Added Successfully!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}