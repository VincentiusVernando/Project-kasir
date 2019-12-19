package GUI;

import javax.swing.JTextField;

public class NPM06974_Model1 {

    public final String[] masukanmenu = new String[100];
    public final int[] pesanberapa = new int[100];
    public final int[] hargaa = new int[100];
    public static int index = 0;

    public void addmenu(JTextField masukanmenu, JTextField pesanberapa, int hargaa) {
        String getMasukanmenu = masukanmenu.getText();
        int getPesanberapa = Integer.parseInt(pesanberapa.getText());
        this.masukanmenu[index] = getMasukanmenu;
        this.pesanberapa[index] = getPesanberapa;
        this.hargaa[index] = hargaa * getPesanberapa;
        index++;
    }
}
