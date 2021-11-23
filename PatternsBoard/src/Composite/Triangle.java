/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Mukhtiar
 */
public class Triangle extends BaseShape {
    public int radius;

    public Triangle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
       // int x[] = {20,50,80};
       int x[] = {370,400,430};
        int y[] = {80,20,80};
        //graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
        graphics.drawPolygon(x, y, 3);
    }
}
