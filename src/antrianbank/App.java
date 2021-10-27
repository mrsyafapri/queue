package antrianbank;

import java.util.Scanner;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class App {

    int id, cs;
    String nama;
    App next;
    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    public void input() {
        System.out.print("Masukkan Nomor Antrian : ");
        id = in.nextInt();
        System.out.print("Masukkan nama costumer : ");
        nama = str.nextLine();
        System.out.print("Masukkan nomor CS      : ");
        cs = in.nextInt();
        next = null;
    }

    public void read() {
        System.out.println("|| " + id + " \t|| " + nama + " \t|| " + cs + " \t||");
    }

    public static void main(String[] args) {
        int menu = 0;
        BankQueue queue = new BankQueue();
        while (menu != 4) {
            System.out.println("Antrian pada Customer Service (CS) Bank XYZ");
            System.out.println("1.Enqueue\n2.Dequeue\n3.View\n4.Exit");
            System.out.print("Pilih menu(1/2/3/4): ");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    queue.enque();
                    break;
                case 2:
                    queue.deque();
                    break;
                case 3:
                    queue.view();
                    break;
                case 4:
                    System.out.println("- Keluar -");
                    break;
                default:
                    System.out.println("- SILAHKAN PILIH MENU YANG TERSEDIA -");
                    break;
            }
            System.out.println();
        }
    }
}
