package com.company;

import java.security.InvalidParameterException;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class CineDB
{
    //Atributos
    Connection conn;


    //Constructor
    public CineDB(String url)
    {
        try
        {
            this.conn = DriverManager.getConnection(url);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    //Metodos
    public int insertaPelicula(String titulo, int anno, boolean tieneOscar, double valoracion)
    {
        int devolver=-1;
        try
        {
            Statement st = conn.createStatement();

            // Para consultas SQL que no devuelven datos
            String sql = "INSERT INTO  peliculas (titulo, anno, tieneOscar, valoracion) VALUES "+
                    "( '"+ titulo +"', " + anno + " , " + tieneOscar +", " + valoracion +");";

//            System.out.println(sql);
            st.execute(sql);

            String sql2 = "SELECT last_insert_rowid();";
            // Para leer primero sacamos un ResultSet
            ResultSet rs = st.executeQuery(sql2);
            rs.next();
            devolver = rs.getInt(1);

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return devolver;
    }


    public int insertaActor(String nombre, LocalDate fechaNacimiento)
    {
        int devolver=-1;
        try
        {
            Statement st = conn.createStatement();

            String sql =
                    "INSERT INTO actores (nombre, fechaNacimiento) VALUES " +
                            "('"+nombre+"', '"+fechaNacimiento+"');";


//            System.out.println(sql);
            st.execute(sql);

            String sql2 = "SELECT last_insert_rowid();";//deveulve id ultima linea

            ResultSet rs = st.executeQuery(sql2);
            rs.next();
            devolver = rs.getInt(1);

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return devolver;
    }


    public void asociaActorPelicula(int idActor, int idPelicula, boolean principal)
    {
        try
        {
            Statement st = conn.createStatement();

            String sql =
                    "INSERT INTO actoresPeliculas (idActor, idPelicula, principal) VALUES " +
                            "("+idActor+", "+idPelicula+","+principal+");";


//            System.out.println(sql);
            st.execute(sql);

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }


    public int buscaActor(String nombre)
    {
        int devolver=-1;
        try
        {
            Statement st = conn.createStatement();

            String sql = "SELECT * FROM actores WHERE nombre = '"+nombre+"';";

            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                devolver=rs.getInt("id");
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return devolver;
    }

    public int buscaPelicula(String titulo)
    {
        int devolver = -1;
        try
        {
            Statement st = conn.createStatement();

            String sql = "SELECT * FROM peliculas WHERE titulo = '"+titulo+"';";

            ResultSet rs = st.executeQuery(sql);

            if(rs.next())
            {
                devolver=rs.getInt("id");
            }


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return devolver;
    }

    public Pelicula datosPelicula(int idPelicula)
    {
        String titulo;
        int anno;
        boolean tieneOoscar;
        Double valoracion;
        Pelicula pelicula = null;
        try
        {
            Statement st = conn.createStatement();

            String sql = "SELECT * FROM peliculas WHERE id = " + idPelicula + ";";

            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {

                titulo = rs.getString("titulo");
                anno = rs.getInt("anno");
                tieneOoscar = rs.getBoolean("tieneOscar");
                valoracion = rs.getDouble("valoracion");
                pelicula = new Pelicula(idPelicula,titulo,anno,tieneOoscar,valoracion);
            }


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return pelicula;
    }

    public Actor datosActor(int idActor)
    {
        String nombre;
        LocalDate fechaNacimiento;
        Actor actor = null;
        try
        {
            Statement st = conn.createStatement();

            String sql = "SELECT * FROM actores WHERE id = " + idActor + ";";

            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                nombre = rs.getString("nombre");
                fechaNacimiento = LocalDate.parse(rs.getString("fechaNacimiento"));
                actor = new Actor(idActor,nombre,fechaNacimiento);
            }


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return actor;
    }

    public List<Pelicula> listadoPeliculas()
    {
        List<Pelicula> ListaPeliculas = new LinkedList<>();
        int id;
        String titulo;
        int anno;
        boolean tieneOoscar;
        Double valoracion;
        Pelicula pelicula = null;
        try
        {
            Statement st = conn.createStatement();

            String sql = "SELECT * FROM peliculas ;";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                id = rs.getInt("id");
                titulo = rs.getString("titulo");
                anno = rs.getInt("anno");
                tieneOoscar = rs.getBoolean("tieneOscar");
                valoracion = rs.getDouble("valoracion");
                pelicula = new Pelicula(id,titulo,anno,tieneOoscar,valoracion);
                ListaPeliculas.add(pelicula);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }


        return ListaPeliculas;
    }

    public List<Actor> listadoActores()
    {
        int id;
        String nombre;
        LocalDate fechaNacimiento;
        Actor actor = null;
        List<Actor> listaActores = new LinkedList<>();
        try
        {
            Statement st = conn.createStatement();

            String sql = "SELECT * FROM actores;";

            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                id = rs.getInt("id");
                nombre = rs.getString("nombre");
                fechaNacimiento = LocalDate.parse(rs.getString("fechaNacimiento"));
                actor = new Actor(id,nombre,fechaNacimiento);
                listaActores.add(actor);
            }


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return listaActores;
    }

    public List<Pelicula> listadoPeliculasPorActores(int idActor)
    {
        List<Pelicula> ListaPeliculas = new LinkedList<>();

        int id;
        String titulo;
        int anno;
        boolean tieneOoscar;
        Double valoracion;
        Pelicula pelicula = null;
        try
        {
            Statement st = conn.createStatement();

            String sql = "SELECT * FROM peliculas JOIN actoresPeliculas ON peliculas.id = " +
                    "actoresPeliculas.idPelicula WHERE actoresPeliculas.idActor ="+idActor+";";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next())
            {
                id = rs.getInt("id");
                titulo = rs.getString("titulo");
                anno = rs.getInt("anno");
                tieneOoscar = rs.getBoolean("tieneOscar");
                valoracion = rs.getDouble("valoracion");
                pelicula = new Pelicula(id,titulo,anno,tieneOoscar,valoracion);
                ListaPeliculas.add(pelicula);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }


        return ListaPeliculas;
    }

    public List<ActorPelicula> listadoActoresPorPelicula(int idPelicula)
    {
         int id;
         String nombre;
         LocalDate fechaNacimiento;
         boolean principal;
        List<ActorPelicula> listaActores = new LinkedList<>();
        try
        {
            Statement st = conn.createStatement();

            String sql = "SELECT * FROM actores JOIN actoresPeliculas ON actores.id =" +
                    " actoresPeliculas.idActor WHERE actoresPeliculas.idPelicula ="+ idPelicula +";";

            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                id = rs.getInt("id");
                nombre = rs.getString("nombre");
                fechaNacimiento = LocalDate.parse(rs.getString("fechaNacimiento"));
                principal=rs.getBoolean("principal");
                ActorPelicula asd = new ActorPelicula(id,nombre,fechaNacimiento,principal);
                listaActores.add(asd);
            }


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return listaActores;
    }






}
