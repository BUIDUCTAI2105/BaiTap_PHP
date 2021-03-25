/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class DoAn extends MonHoc {
    float GVHD,GVPB;

    public float getGVHD() {
        return GVHD;
    }

    public void setGVHD(float GVHD) {
        this.GVHD = GVHD;
    }

    public float getGVPB() {
        return GVPB;
    }

    public void setGVPB(float GVPB) {
        this.GVPB = GVPB;
    }
     public DoAn(String maM,String tenM,int soTC,float gvhd,float gvpb)
    {
        super(maM, tenM, soTC);
        this.GVHD=gvhd;
        this.GVPB=gvpb;
    }
    
    @Override
    float DTB()
    {
        return (float)(GVHD*0.5+GVPB*0.5);
    }
    
     @Override
    public void nhap()
    {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem GV huong dan: ");
        GVHD=sc.nextFloat();
        System.out.println("Nhap diem GV phan bien: ");
        GVPB=sc.nextFloat();
    }
    
    @Override
    public void xuat()
    {
        System.out.println("Mon do an: ");
        super.xuat();
        System.out.println("Diem giao vien huong dan: "+GVHD+" Diem giao vien phan bien: "+GVPB+"\n");
    }
}
