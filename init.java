package com.views;

import com.bean.TradeBean;
import com.data.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;



public class AdminScreen {
    JFrame frame;
    private JPanel adminScreen;
    private JLabel film1;
    private JLabel film2;
    private JLabel film3;
    private JLabel film4;
    private JLabel film5;
    private JLabel student;
    private JLabel senior;
    private JLabel adult;
    private JLabel child;
    private JLabel sums;
    private JLabel profits;
    private JButton button1;

    public AdminScreen() {
        frame = new JFrame("adminScreen");
        frame.setContentPane(this.adminScreen);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                JFrame jFrame = (JFrame) Data.jframeMap.get("mainScreen");
                jFrame.setVisible(true);
            }
        });
        calculate();
    }

    void calculate() {
        int[] filmCount = new int[5];
        int profits = 0;
        int sums = 0;
        int[] idCount = new int[4];

        for (TradeBean t :
                Data.tradeBeanArrayList) {
            sums += 1;
            profits += t.getPrice();
            filmCount[t.getFilmNameID() - 1] += 1;
            idCount[Data.idMap.get(t.getTicketType().toLowerCase())] += 1;
        }

        this.film1.setText(String.valueOf(filmCount[0]));
        this.film2.setText(String.valueOf(filmCount[1]));
        this.film3.setText(String.valueOf(filmCount[2]));
        this.film4.setText(String.valueOf(filmCount[3]));
        this.film5.setText(String.valueOf(filmCount[4]));
        this.sums.setText(String.valueOf(sums));
        this.student.setText(String.valueOf(idCount[0]));
        this.senior.setText(String.valueOf(idCount[1]));
        this.adult.setText(String.valueOf(idCount[2]));
        this.child.setText(String.valueOf(idCount[3]));
        this.profits.setText(String.valueOf(profits));

    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        adminScreen = new JPanel();
        adminScreen.setLayout(new GridBagLayout());
        final JLabel label1 = new JLabel();
        label1.setText("BEAUTY AND THE BEAST");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(label1, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        adminScreen.add(spacer1, gbc);
        film1 = new JLabel();
        film1.setText("Label");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(film1, gbc);
        final JLabel label2 = new JLabel();
        label2.setText("KONG: SKULL ISLAND");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(label2, gbc);
        film2 = new JLabel();
        film2.setText("Label");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(film2, gbc);
        final JLabel label3 = new JLabel();
        label3.setText("LA LA LAND");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(label3, gbc);
        film3 = new JLabel();
        film3.setText("Label");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(film3, gbc);
        final JLabel label4 = new JLabel();
        label4.setText("MOONLIGHT");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(label4, gbc);
        film4 = new JLabel();
        film4.setText("Label");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(film4, gbc);
        final JLabel label5 = new JLabel();
        label5.setText("LOGAN");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(label5, gbc);
        film5 = new JLabel();
        film5.setText("Label");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(film5, gbc);
        final JLabel label6 = new JLabel();
        label6.setText("Student");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(label6, gbc);
        student = new JLabel();
        student.setText("Label");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(student, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        adminScreen.add(spacer2, gbc);
        final JLabel label7 = new JLabel();
        label7.setText("Senior");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(label7, gbc);
        senior = new JLabel();
        senior.setText("Label");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(senior, gbc);
        final JLabel label8 = new JLabel();
        label8.setText("Adult");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(label8, gbc);
        adult = new JLabel();
        adult.setText("Label");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(adult, gbc);
        final JLabel label9 = new JLabel();
        label9.setText("Child");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(label9, gbc);
        child = new JLabel();
        child.setText("Label");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(child, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.VERTICAL;
        adminScreen.add(spacer3, gbc);
        sums = new JLabel();
        sums.setText("Label");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 11;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(sums, gbc);
        final JLabel label10 = new JLabel();
        label10.setText("sums");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(label10, gbc);
        final JLabel label11 = new JLabel();
        label11.setText("profits");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 11;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(label11, gbc);
        profits = new JLabel();
        profits.setText("Label");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 11;
        gbc.anchor = GridBagConstraints.WEST;
        adminScreen.add(profits, gbc);
        final JPanel spacer4 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        adminScreen.add(spacer4, gbc);
        button1 = new JButton();
        button1.setText("Back to main");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        adminScreen.add(button1, gbc);
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        adminScreen.add(spacer5, gbc);
        final JPanel spacer6 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        adminScreen.add(spacer6, gbc);
        final JPanel spacer7 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.VERTICAL;
        adminScreen.add(spacer7, gbc);
        final JPanel spacer8 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.VERTICAL;
        adminScreen.add(spacer8, gbc);
        final JPanel spacer9 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.VERTICAL;
        adminScreen.add(spacer9, gbc);
        final JPanel spacer10 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        adminScreen.add(spacer10, gbc);
        final JSeparator separator1 = new JSeparator();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 12;
        gbc.fill = GridBagConstraints.BOTH;
        adminScreen.add(separator1, gbc);
        final JSeparator separator2 = new JSeparator();
        separator2.setOrientation(1);
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.gridheight = 10;
        gbc.fill = GridBagConstraints.BOTH;
        adminScreen.add(separator2, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return adminScreen;
    }
}
