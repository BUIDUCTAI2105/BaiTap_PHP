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
public abstract class MonHoc 
{
    String maM,tenM;

    public String getMaM() {
        return maM;
    }

    public void setMaM(String maM) {
        this.maM = maM;
    }

    public String getTenM() {
        return tenM;
    }

    public void setTenM(String tenM) {
        this.tenM = tenM;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }
    int soTC;
    public MonHoc(){
        maM=tenM="";
        soTC=1;
    }

    public MonHoc(String maM, String tenM, int soTC) {
        this.maM = maM;
        this.tenM = tenM;
        this.soTC = soTC;
    }
    abstract float DTB();
    
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma mon: ");
        maM=sc.nextLine();
        System.out.println("Nhap ten mon: ");
        tenM=sc.nextLine();
        System.out.println("Nhap so tin chi: ");
        soTC=sc.nextInt();
    }
    
    public void xuat()
    {
        System.out.println("Ma mon: "+maM+" Ten mon: "+tenM+" So tin chi: "+soTC);
    }
}
