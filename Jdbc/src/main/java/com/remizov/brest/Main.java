package com.remizov.brest;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("ok");

       /* try {
            Connection connection = DriverManager.getConnection("jdbc:mysql//localhost:3306/epamcourse","bond","agent007");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("connection well done");*/
    }
}
