package com.company;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame
{
    private JPanel rootPanel;

    public Menu()
    {
        add(rootPanel);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
