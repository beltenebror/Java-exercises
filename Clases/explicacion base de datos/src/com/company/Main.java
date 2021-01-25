package com.company;

        import java.sql.*;
        import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;

public class Main
{

    public static void main(String[] args)
    {
        Connection conn;
        try
        {
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\lasup\\OneDrive\\Escritorio\\cine.db");

            Statement st = conn.createStatement();
            String sql ="INSERT INTO actores(nombre, fechaNacimiento)  VALUES ('Arnold Schwarzenegger', '1947-07-30');";
            st.execute(sql); //cualquier cosa que no devuelva informacion funciona con esto

            String   sq12 = "SELECT * FROM actores;";
            ResultSet rs = st.executeQuery(sq12);
            //cada vez que ponemos rs.next se lee un regustro nuevo
            rs.next();

            //De cada regustro podemos ir leyendoo los campos
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            LocalDate fecha = LocalDate.parse(rs.getString("fechaNacimiento"));

            System.out.println("id= "+id+"    nombre= "+nombre+ "   fecha nacimiento= " +
                    fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));



            conn.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
