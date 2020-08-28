package br.com.projeto.util;

import javax.swing.JOptionPane;

public class Magic {
    
    public static String s(String msg) {
        return JOptionPane.showInputDialog(msg).toUpperCase()
    }

    public static int i(String msg) {
        return Integer.parseInt(s(msg));
    }

    public static double d(String msg) {
        return Double.parseDouble(s(msg));
    }
}