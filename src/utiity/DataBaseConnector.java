package utiity;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
 
 
public class DataBaseConnector {
 
    protected static String dbusername;
    protected static String dbpassword;
 
    //Should be defined as jdbc:mysql://host:port/database name
    protected static String milo_sqllite3= "jdbc:jtds:sqlserver://milo_sqllite3:11001:milo_sqllite3;instance=sqlexpress";
 
 
    public static String executeSQLQuery(String testEnv, String sqlQuery) {
        String connectionUrl="milo_sqllite3";
        Connection connection;
        String resultValue = "";
        ResultSet rs;
 
 
        //To connect with MILO Database
        if(testEnv.equalsIgnoreCase("MILO")){
            connectionUrl = milo_sqllite3;
            dbusername = "";
            dbpassword = "";
        }
        //To connect with MILO Database
        else if(testEnv.equalsIgnoreCase("MILO")) {
            connectionUrl = milo_sqllite3;
            dbusername = "";
            dbpassword = "";
        }
 
        //To connect with MILO Database
        else if(testEnv.equalsIgnoreCase("MILO")) {
            connectionUrl = milo_sqllite3;
            dbusername = "";
            dbpassword = "";
        }
        try {
         Class.forName("com.mysql.jdbc.Driver").newInstance();
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            Class.forName("org.gjt.mm.mysql.Driver");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                } catch (IllegalAccessException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
 
        try {
            connection = DriverManager.getConnection(connectionUrl,dbusername,dbpassword);
            if(connection!=null) {
                System.out.println("Connected to the database...");
            }else {
                System.out.println("Database connection failed to "+testEnv+" Environment");
            }
            Statement stmt = connection.createStatement();
            rs=stmt.executeQuery(sqlQuery);
 
            try {
                while(rs.next()){
                    resultValue = rs.getString(1).toString();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            catch (NullPointerException err) {
                System.out.println("No Records obtained for this specific query");
                err.printStackTrace();
            }
            connection.close();
 
        }catch(SQLException sqlEx) {
            System.out.println( "SQL Exception:" +sqlEx.getStackTrace());
        }
        return resultValue;
 
 
    }
 
 
    public static ArrayList<String> executeSQLQuery_List(String testEnv, String sqlQuery) {
        String connectionUrl="";
        Connection connection;
        ArrayList<String> resultValue = new ArrayList<String>();
        ResultSet resultSet;
 
        //To connect with milo_sqllite3 Database
        if(testEnv.equalsIgnoreCase("milo_sqllite3")){
            connectionUrl = milo_sqllite3;
            dbusername = "";
            dbpassword = "";
 
            try {
                 Class.forName("com.mysql.jdbc.Driver").newInstance();
                Class.forName("net.sourceforge.jtds.jdbc.Driver");
                Class.forName("org.gjt.mm.mysql.Driver");
            }catch(ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        } catch (IllegalAccessException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        }
 
            try {
                connection = DriverManager.getConnection(connectionUrl,dbusername,dbpassword);
                if(connection!=null) {
                    System.out.println("Connected to the database");
                }else {
                    System.out.println("Failed to connect to "+testEnv+" database");
                }
                Statement statement = connection.createStatement();
                resultSet=statement.executeQuery(sqlQuery);
 
                try {
                    while(resultSet.next()){
                        int columnCount = resultSet.getMetaData().getColumnCount();
                        StringBuilder stringBuilder = new StringBuilder();
                        for(int iCounter=1;iCounter<=columnCount; iCounter++){
                            stringBuilder.append(resultSet.getString(iCounter).trim()+" ");
                        }
                        String reqValue = stringBuilder.substring(0, stringBuilder.length()-1);
                        resultValue.add(reqValue);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                catch (NullPointerException ex) {
                    System.out.println("No Records found for this specific query" +ex.getStackTrace());
                }
                finally {
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (SQLException ex) {
                            System.out.println( "SQL Exception:" +ex.getStackTrace());
                        }
                    }
                }
 
            }catch(SQLException sqlEx) {
                System.out.println( "SQL Exception:" +sqlEx.getStackTrace());
            }
            return resultValue;
        }
 
        //To connect with milo_sqllite3 Database
        else if(testEnv.equalsIgnoreCase("milo_sqllite3")) {
            connectionUrl = milo_sqllite3;
            dbusername = "";
            dbpassword = "";
        }
 
        //To connect with milo_sqllite3 Database
        else if(testEnv.equalsIgnoreCase("milo_sqllite3")) {
            connectionUrl = milo_sqllite3;
            dbusername = "";
            dbpassword = "";        }
 
        try {
         Class.forName("com.mysql.jdbc.Driver").newInstance();
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            Class.forName("org.gjt.mm.mysql.Driver");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                } catch (IllegalAccessException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
 
        try {
            connection = DriverManager.getConnection(connectionUrl,dbusername,dbpassword);
            if(connection!=null) {
                System.out.println("Connected to the database");
            }else {
                System.out.println("Failed to connect to "+testEnv+" database");
            }
            Statement statement = connection.createStatement();
            resultSet=statement.executeQuery(sqlQuery);
 
            try {
                while(resultSet.next()){
                    int columnCount = resultSet.getMetaData().getColumnCount();
                    StringBuilder stringBuilder = new StringBuilder();
                    for(int iCounter=1;iCounter<=columnCount; iCounter++){
                        stringBuilder.append(resultSet.getString(iCounter).trim()+" ");
                    }
                    String reqValue = stringBuilder.substring(0, stringBuilder.length()-1);
                    resultValue.add(reqValue);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            catch (NullPointerException ex) {
                System.out.println("No Records found for this specific query" +ex.getStackTrace());
            }
            finally {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                        System.out.println( "SQL Exception:" +ex.getStackTrace());
                    }
                }
            }
 
        }catch(SQLException sqlEx) {
            System.out.println( "SQL Exception:" +sqlEx.getStackTrace());
        }
        return resultValue;
    }
}