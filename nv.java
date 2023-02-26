/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
import java.util.Scanner;
public class nv {
    String tennv;
    double lcb;
    double hesoluong;
     Scanner sc=new Scanner(System.in);
    public double tinhluong(double lcb,double hesoluong)
    {
      double luong=lcb*hesoluong;
    
        return luong;
    }
    public void inTT(String v)
    {
        this.tennv=v;
        v =sc.toString();
        System.out.println(" "+v);
    }
    public boolean tangluong(double tthsl,double lcb,double luongmax)
    {
        boolean tangluong;
        System.out.println("hay nhap he so luong");
        tthsl =sc.nextDouble();
        this.hesoluong= hesoluong +tthsl;
        double luong = lcb*tthsl;
        if(luong>luongmax)
        {
            tangluong=false;
            luong=luongmax;
        }
        else 
        {
            tangluong=true;
            luong=luong;
        }
        return tangluong;
    }
    public double Luong_max(double luongmax)
    {
        System.out.println("hay nhap luong toi da");
        luongmax = sc.nextDouble();
                  
        return luongmax;
    }
    
}
