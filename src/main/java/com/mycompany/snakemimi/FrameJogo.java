/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snakemimi;

import javax.swing.JFrame;

/**
 *
 * @author mimi
 */
public class FrameJogo extends JFrame
{
    FrameJogo()
    {
        /*PanelJogo panel=new PanelJogo();
        this.add(panel);*/
        this.add(new PanelJogo());
        this.setTitle("Cobrinha Mimi");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
