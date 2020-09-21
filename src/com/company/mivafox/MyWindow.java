package com.company.mivafox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame
{
    private String equation;

    public MyWindow()
    {
        setVisible(true);

        setSize(500, 500);
        setLocation(650, 200);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout());
        JLabel label = new JLabel();

        panel.add(label);

        for (int i = 0; i < 10; i++)
        {
            JButton btn = new JButton("" + i);

            btn.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    equation += btn.getText();
                    label.setText(equation);
                }
            });

            panel.add(btn);
        }


        add(panel, BorderLayout.CENTER);
    }
}
