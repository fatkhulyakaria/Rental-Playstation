package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RentalPS {

    private JComboBox CmbPS;
    private JPanel RentalPS;
    private JTextField lama;
    private JComboBox cmb2;
    private JTextArea Menu;
    private JButton submitButton;
    private JTextField jumlah;

    public RentalPS(){
        Menu.setText("Harga Sewa Playstation per Jam\n" +
                "PS 2\t: 3000\n"+
                "PS 3\t: 5000\n"+
                "PS 4\t: 7000\n"+
                "\nSnack and Drink\n"+
                "Mie Goreng\t: 6000\n" +
                "Mie Rebus\t: 5000\n" +
                "Kopi\t: 4000\n" +
                "Susu\t: 5000\n" +
                "Teh\t: 3000" );

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String JenisPs,Snack;
                int HargaPs,HargaSnack;
                JenisPs = String.valueOf(CmbPS.getSelectedItem());
                switch (JenisPs){
                    case "PS 2":
                        HargaPs = 3000;
                        break;
                    case "PS 3":
                        HargaPs = 5000;
                        break;
                    case "PS 4":
                        HargaPs = 7000;
                        break;
                    default:
                        HargaPs = 0;
                        break;
                }
                Snack = String.valueOf(cmb2.getSelectedItem());
                switch (Snack) {
                    case "Mie Goreng":
                        HargaSnack = 6000;
                        break;
                    case "Mie Rebus":
                        HargaSnack = 5000;
                        break;
                    case "Kopi":
                        HargaSnack = 4000;
                        break;
                    case "Susu":
                        HargaSnack = 5000;
                        break;
                    case "Teh":
                        HargaSnack = 3000;
                        break;
                    default:
                        HargaSnack = 0;
                        break;
                }
                int lm=Integer.parseInt(lama.getText());
                int jumlah1=HargaPs*lm;
                int jmlh=jumlah1+HargaSnack;
                jumlah.setText(String.valueOf(jmlh));
            }
        });
    }

    public static void main(String[] args) {
       JFrame frame = new JFrame("");
       frame.setContentPane(new RentalPS().RentalPS);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(700, 400);
        frame.setResizable(true);
        frame.setTitle("Zaka Rental Playstation");
        frame.setLocation(300,100);

    }

}
