package com.agyo.skyblockitems;

import java.sql.*;
import java.util.ArrayList;

    public class DatabaseService {

        private static Connection con;
        private static final String Driver = "com.mysql.jdbc.Driver";
        private static final String ConnectionString = "jdbc:mysql://127.0.0.1:3306/skyblock" +
                "?verifyServerCertificate=false" +
                "&useSSL=false" +
                "&requireSSL=false";
        private static final String user = "skyblock";
        private static final String pwd = "skyblock";

        /**
         * create Database object
         */
        public DatabaseService() {
        }

        /**
         * to load the database base driver
         *
         * @return a database connection
         * @throws SQLException throws an exception if an error occurs
         */
        public static Connection loadDriver() throws SQLException {
            try {
                Class dbDriver = Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(ConnectionString, user, pwd);
                }
            catch (Exception ex) {
                    ex.printStackTrace();
                }
            return con;
        }

        /**
         * to get a result set of a query
         *
         * @param query custom query
         * @return a result set of custom query
         * @throws SQLException throws an exception if an error occurs
         */
        public static ResultSet getResultSet(String query) throws SQLException {
            Connection con = loadDriver();
            ResultSet rs;
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            return rs;
        }

        /**
         * to run an update query such as update, delete
         *
         * @param query custom query
         * @throws SQLException throws an exception if an error occurs
         */
        public static void runQuery(String query) throws SQLException {
            Connection con = loadDriver();
            ResultSet rs;
            PreparedStatement st = con.prepareStatement(query);
            st.executeUpdate();
        }

        public void runPlayerSQL() throws SQLException {

            Statement statement = null;
            ResultSet result = statement.executeQuery("SELECT * FROM PlayerData WHERE BALANCE = 0;");
            ArrayList<String> bankruptPlayers = new ArrayList<String>();
            while (result.next()) {
                String name = result.getString("PLAYERNAME");
                bankruptPlayers.add(name);
            }
        }
    }
