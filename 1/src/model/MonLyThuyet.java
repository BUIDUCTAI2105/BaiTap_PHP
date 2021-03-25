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
public class MonLyThuyet extends MonHoc {
     float tL,gK,cK;

    public float gettL() {
        return tL;
    }

    public void settL(float tL) {
        this.tL = tL;
    }

    public float getgK() {
        return gK;
    }

    public void setgK(float gK) {
        this.gK = gK;
    }

    public float getcK() {
        return cK;
    }

    public void setcK(float cK) {
        this.cK = cK;
    }

    
    public MonLyThuyet()
    {
        super();
        tL=gK=cK=0;
    }
    public MonLyThuyet(String maM,String tenM,int soTC,float tl,float gk,float ck)
    {
     super(maM, tenM, soTC);
     this.tL=tl;
     this.gK=gk;
     this.cK=ck;
    }
    
    @Override
    float DTB()
    {
        return (float)(tL*0.2+gK*0.3+cK*0.5);
    }
    
    @Override
    public void nhap()
    {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem tieu luan: ");
        tL=sc.nextFloat();
        System.out.println("Nhap diem giua ki: ");
        gK=sc.nextFloat();
        System.out.println("Nhap diem cuoi ki: ");
        cK=sc.nextFloat();   
    }
    
    @Override
    public void xuat()
    {
        System.out.println("Mon ly thuyet: ");
        super.xuat();
        System.out.println("Diem tieu luan: "+tL+" Diem giua ki: "+gK+" Diem cuoi ki: "+cK+"\n");
    }
}
