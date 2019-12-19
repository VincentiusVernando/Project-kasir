package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.table.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class NPM06974_Menu1 extends JFrame{
    
    static ArrayList menu_kopi;
    NPM06974_Model1 model1 = new NPM06974_Model1();
    
    public NPM06974_Menu1(){
        JFrame frame_menu1 = new JFrame();       
        getContentPane().setBackground(Color.orange);
        
        setSize(1000,800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label_kopisenja = new JLabel("Kopi Senja");
        label_kopisenja.setFont(new Font("Arial",Font.BOLD,24));
        label_kopisenja.setBounds(320, 15, 200, 30);
        
        JLabel label_menu = new JLabel("Menu : ");
        label_menu.setFont(new Font("Consolas",Font.BOLD,14));
        label_menu.setBounds(25, 50, 200, 30);
        
        JLabel label_pesanberapa = new JLabel("Jumlah Yang Di Pesan : ");
        label_pesanberapa.setFont(new Font("Consolas",Font.BOLD,14));
        label_pesanberapa.setBounds(25, 360, 200, 30);
        
        JLabel label_masukanmenu = new JLabel("Masukkan Menu : ");
        label_masukanmenu.setFont(new Font("Consolas",Font.BOLD,14));
        label_masukanmenu.setBounds(25, 290, 200, 30);
        
        JLabel harga = new JLabel("Harga : ");
        harga.setFont(new Font("Consolas",Font.BOLD,14));
        harga.setBounds(25, 470, 200, 30);
        
        JLabel label_bayar = new JLabel("Bayar : ");
        label_bayar.setFont(new Font("Consolas",Font.BOLD,14));
        label_bayar.setBounds(730, 300, 200, 30);
        
        JLabel label_americano = new JLabel("1. Americano");
        label_americano.setFont(new Font("Consolas",Font.BOLD,14));
        label_americano.setBounds(25, 90, 200, 30);
        
        JLabel label_robusta = new JLabel("2. Robusta");
        label_robusta.setFont(new Font("Consolas",Font.BOLD,14));
        label_robusta.setBounds(25, 130, 200, 30);
        
        JLabel label_arabika = new JLabel("3. Arabika");
        label_arabika.setFont(new Font("Consolas",Font.BOLD,14));
        label_arabika.setBounds(25, 170, 200, 30);
        
        JLabel label_mochacino = new JLabel("4. Mochacino");
        label_mochacino.setFont(new Font("Consolas",Font.BOLD,14));
        label_mochacino.setBounds(25, 210, 200, 30);
        
        JLabel label_lemontea = new JLabel("5. Lemon Tea");
        label_lemontea.setFont(new Font("Consolas",Font.BOLD,14));
        label_lemontea.setBounds(25, 250, 200, 30);
        
        JTextField text_masukanmenu = new JTextField();
        text_masukanmenu.setBounds(25, 320, 200, 30);
        
        JTextField text_pesanberapa = new JTextField();
        text_pesanberapa.setBounds(25, 390, 200, 30);
        
        JTextField text_harga = new JTextField();
        text_harga.setBounds(25, 500, 200, 30);
        
        JTextField text_bayar = new JTextField();
        text_bayar.setBounds(730, 330, 200, 30);
        
        String[] field = {"Menu", "Jumlah", "Harga"};
        DefaultTableModel model = new DefaultTableModel(field, 0);
        JTable tabel_kopisenja = new JTable(model);
        
        JButton button_pesan = new JButton("Pesan");
        button_pesan.setBounds(25, 430, 200, 30);
        button_pesan.addActionListener((ActionEvent ae) -> {
            String menu = text_masukanmenu.getText();
                int hargaa = 0;
                if(menu.equals("1")){
                    hargaa = 15000;
                }else if(menu.equals("2")){
                    hargaa = 15000;
                }else if(menu.equals("3")){
                    hargaa = 15000;
                }else if(menu.equals("4")){
                    hargaa = 15000;
                }else if(menu.equals("5")){
                    hargaa = 15000;
                }
            int Rp = ((Integer.parseInt(text_pesanberapa.getText()) * hargaa));
            int total = Rp;
            text_harga.setText(Integer.toString(total));
            menu_kopi = new ArrayList<>();
                tabel_kopisenja.setAutoscrolls(true);
                menu_kopi.add(text_masukanmenu.getText());
                menu_kopi.add(text_pesanberapa.getText());
               menu_kopi.add(text_harga.getText());
                model.addRow(menu_kopi.toArray());
                model1.addmenu(text_masukanmenu, text_pesanberapa, hargaa);
        });
//        button_pesan.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                DefaultTableModel datapesan = (DefaultTableModel) tabel_kopisenja.getModel();
//                String menu = text_masukanmenu.getText();
//                int harga = 0;
//                if(menu.equals("1")){
//                    harga = 15000;
//                }else if(menu.equals("2")){
//                    harga = 15000;
//                }else if(menu.equals("3")){
//                    harga = 15000;
//                }else if(menu.equals("4")){
//                    harga = 15000;
//                }else if(menu.equals("5")){
//                    harga = 15000;
//                }
//                menu_kopi = new ArrayList<>();
//                tabel_kopisenja.setAutoscrolls(true);
//                menu_kopi.add(text_masukanmenu.getText());
//                menu_kopi.add(text_pesanberapa.getText());
//               menu_kopi.add(Integer.parseInt(text_pesanberapa.getText())*harga);
//                model.addRow(menu_kopi.toArray());
//                model1.addmenu(text_masukanmenu, text_pesanberapa, harga);
//            }
//        });
        
        
        JButton button_bayar = new JButton("Bayar");
        button_bayar.setBounds(730, 370, 200, 30);
        button_bayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int bayarr = Integer.parseInt(text_bayar.getText()) - (Integer.parseInt(text_harga.getText()));
                JOptionPane.showMessageDialog(null, "Kembalian Anda : "+bayarr+"\nTerima Kasih Sudah Pesan di Kopi Senja");
            }
        });
        
        TableColumn tc1 = new TableColumn();
        TableColumn tc2 = new TableColumn();
        
        tc1 = tabel_kopisenja.getColumnModel().getColumn(0);
        tc2 = tabel_kopisenja.getColumnModel().getColumn(1);
        tc1.setPreferredWidth(50);
        tc2.setPreferredWidth(50);
        JScrollPane scroll_pane = new JScrollPane(tabel_kopisenja);
        scroll_pane.setBounds(450, 90, 480, 180);                
        
        add(label_kopisenja);
        add(label_pesanberapa);
        add(label_masukanmenu);
        add(label_menu);
        add(label_bayar);
        add(label_americano);
        add(label_robusta);
        add(label_mochacino);
        add(label_arabika);
        add(label_lemontea);
        add(text_masukanmenu);
        add(text_pesanberapa);
        add(text_bayar);
        add(button_pesan);
        add(button_bayar);
        add(scroll_pane);
        add(harga);
        add(text_harga);
        
        setVisible(true);
        
    }
}
