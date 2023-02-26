/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
public class vuong_tron {
    public class Vuong{
        int dai;
        int rong;
        public int setrong(int rong)
        {
            return this.rong;
        }
        public int setdai(int dai)
        {
            return this.dai;
        }
        public void getrong(int r)
        {
            this.rong=r;
        }
        public void getdai(int d)
        {
            this.dai=d;
        }
        public void vuong(int dai, int rong)
        {
            Vuong vuong=new Vuong();
            vuong.setdai(dai);
            vuong.setrong(rong);
            vuong.getrong(rong);
            vuong.getdai(dai);
        }
              
    }
    public class tron
    {
        double r;
        public double setbankinh(double r)
        {
            return r;
        }
        public void getbankinh(double R)
        {
            this.r=R;
        }
        public void tron(double r)
        {
            tron tron =new tron();
            tron.setbankinh(r);
            tron.getbankinh(r);
            
        }
       
    }
    
}
