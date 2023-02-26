/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
public class vector {
    public double x;
    public double x1;
    public double y;
    public double y1;
 public class vector_a
 {
     public double x;
     public double y;
     public double setx(double x)
     {
         return x;
     }
     public double sety(double y)
     {
         return y;
     }
     public void getX(double getx)
     {
      this.x=getx;
     }
     public void getY(double gety)
     {
        this.y=gety;
     }
     public void vector_a(double x,double y)
     {
         vector_a a=new vector_a();
         a.setx(x);
         a.sety(y);
         a.getX(x);
         a.getY(y);
     }
 }
 public class vector_b
 {
     
     public double x1;
     public double y1;
     public double setx(double x1)
     {
         return x1;
     }
     public double sety(double y1)
     {
         return y1;
     }
     public void getX(double getx1)
     {
      this.x1=getx1;
     }
     public void getY(double gety1)
     {
        this.y1=gety1;
     }
     public void vector_b(double x1,double y1)
     {
         vector_b b=new vector_b();
         b.setx(x1);
         b.sety(y1);
         b.getX(x1);
         b.getY(y1);
     }
 }
 
     public double cong(double tong, double tongx , double tongy)
             {
                 tongx=x+x1;
                 tongy=y+y1;
                 return tong;
             }
     public double tich(double tich,double da,double db)
     {
         da=Math.sqrt(x*y);
         db=Math.sqrt(x1*y1);
         tich=da*db;
         return tich;
     }
 }

