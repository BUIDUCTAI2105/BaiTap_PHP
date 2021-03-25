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
public class MonThucHanh extends MonHoc{
    float c1,c2,c3,c4;

    public float getC1() {
        return c1;
    }

    public void setC1(float c1) {
        this.c1 = c1;
    }

    public float getC2() {
        return c2;
    }

    public void setC2(float c2) {
        this.c2 = c2;
    }

    public float getC3() {
        return c3;
    }

    public void setC3(float c3) {
        this.c3 = c3;
    }

    public float getC4() {
        return c4;
    }

    public void setC4(float c4) {
        this.c4 = c4;
    }

    
    
    public MonThucHanh()
    {
        super();
        c1=c2=c3=c4=0;
    }
    public MonThucHanh(String maM,String tenM,int soTC,float c1,float c2,float c3,float c4)
    {
        super(maM, tenM, soTC);
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.c4=c4;
    }
    
    @Override
    float DTB()
    {
        return (float)(c1+c2+c3+c4)/4;
    }
    
    @Override
    public void nhap()
    {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem cot 1: ");
        c1=sc.nextFloat();
        System.out.println("Nhap diem cot 2: ");
        c2=sc.nextFloat();
        System.out.println("Nhap diem cot 3: ");
        c3=sc.nextFloat();  
        System.out.println("Nhap diem cot 4: ");
        c4=sc.nextFloat();   
    }
    
    @Override
    public void xuat()
    {
        System.out.println("Mon thuc hanh: ");
        super.xuat();
        System.out.println("Diem cot 1: "+c1+" Diem cot 2: "+c2+" Diem cot 3: "+c3+" Diem cot 4: "+c4+"\n");
    }
}
