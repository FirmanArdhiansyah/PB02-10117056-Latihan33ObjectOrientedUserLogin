
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nama     : Firman Ardhiansyah
 *         Kelas    : IF-2 (10117056)
 *         NIM      : 10117056
 */
public class latihan33Login {

    private static String usName;
    private static String passWord;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        usName = scn.next();

        System.out.print("Masukkan Password = ");
        passWord = scn.next();

        User cek = new User();
        cek.pengecekkanLogin(usName, passWord);
    }

}
