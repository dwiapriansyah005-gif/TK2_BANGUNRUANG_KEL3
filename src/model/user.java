package model;

import javax.swing.JOptionPane;

public class user {

    public static String namaUser = "";
    public static String username = "";
    public static String password = "";

  public static boolean login(String user, String pass) {

    if (user.isEmpty() || user.equals("Username")
            || pass.isEmpty() || pass.equals("Password")) {

        javax.swing.JOptionPane.showMessageDialog(
            null,
            "Username dan password harus diisi!"
        );

        return false;

    } else {
        namaUser = user;
        username = user;
        password = pass;

        return true;
    }
  }
  public static void logout() {
    namaUser = "";
    username = "";
    password = "";
}
}
