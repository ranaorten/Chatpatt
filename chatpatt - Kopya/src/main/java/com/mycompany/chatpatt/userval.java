
package com.mycompany.chatpatt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class userval {

    protected boolean validateUsername(String username) {
        String usernameRegex = "^[a-zA-Z0-9]{3,15}$";
        Pattern pattern = Pattern.compile(usernameRegex);
        Matcher matcher = pattern.matcher(username);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Geçersiz kullanıcı adı. Kullanıcı adı sadece harf ve rakamlardan oluşmalı ve 3-15 karakter uzunluğunda olmalıdır.");
            return false;
        }
        return true;
    }

    protected boolean validateEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Geçersiz e-posta adresi.");
            return false;
        }
        return true;
    }

    protected boolean validatePassword(String password) {
        String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,20}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Geçersiz şifre. Şifre en az bir harf ve bir rakam içermeli ve 6-20 karakter uzunluğunda olmalıdır.");
            return false;
        }
        return true;
    }
}
