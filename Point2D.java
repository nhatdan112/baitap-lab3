/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
public class Point2D {
    public float x=0.0f;
    public float y=0.0f;
    public void getX(float x)
    {
        this.x = x;
    }
    public void getY(float y)
    {
        this.y=y;
    }
Point2D point2d =new Point2D();
public void Point2D(float x, float y)
{
    point2d.getX(x);
    point2d.getY(y);
    
}
}
