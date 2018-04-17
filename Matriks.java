/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriks;
import java.util.Scanner;
/**
 *
 * @author 17523217
 */
public class Matriks {

     int M1[][]=new int[10][10];                                                //Menentukan batas besar matriks
     int M2[][]=new int[10][10];
     int M3[][]=new int[10][10];
     int nB,nK;                                                                 //nB = banyak i, nK = banyak j
     Scanner sc = new Scanner(System.in);
    
    public void ordo(){                                                                       
        System.out.print("Masukan jumlah baris Matriks = ");                    //Memasukkan jumlah i matriks
        nB=sc.nextInt();
        System.out.print("Masukan jumlah Kolom Matriks = ");
        nK=sc.nextInt();
   
    }
    public void  inputMatriks(){
        System.out.println();                                                   // Memasukkan angka Matriks1
        System.out.println("Masukan Matriks 1 ordo("+nB+","+nK+") : ");
        for (int i =0;i<nB;i++){
            for (int j=0;j<nK;j++){
                System.out.print("Matriks1("+i+","+j+") : ");
                M1[i][j]=sc.nextInt();
            }
        }
        System.out.println();
                                                                                //Memasukkan angka Matriks2
        System.out.println("Masukan Matriks 2 ordo("+nB+","+nK+") : ");
        for (int i =0;i<nB;i++){
            for (int j=0;j<nK;j++){
                System.out.print("Matriks1("+i+","+j+") : ");
                M2[i][j]=sc.nextInt();
            }
        }
    }    
        public void outputMatriks(int n){
            if (n==1){                                                          //Output matriks1
                System.out.println();
                System.out.println("Matriks 1 = ");
                for (int i =0;i<nB;i++){
                    for (int j=0;j<nK;j++){
                        System.out.print(M1[i][j]+" ");
                }
                System.out.println();

                }
            }else if(n==2){                                                     //Output matriks2
                System.out.println();
                System.out.println("Matriks 2 = ");
                for (int i =0;i<nB;i++){
                    for (int j=0;j<nK;j++){
                        System.out.print(M2[i][j]+" ");
                }
                System.out.println();

                }
            }
            else if(n==3){                                                      //Output hasil matriks (Matriks3)
                System.out.println();
                System.out.println("Matriks 3 = ");
                for (int i =0;i<nB;i++){
                    for (int j=0;j<nK;j++){
                        System.out.print(M3[i][j]+" ");
                }
                System.out.println();

                }
            }
    }
        public void penjumlahan(){                                              //Metode Penjumlahan
            System.out.println("Hasil dari penjumlahan Matriks : ");
            for (int i=0;i<nB;i++){
                for (int j=0;j<nK;j++){
                    M3[i][j]=M1[i][j]+M2[i][j];
                }
        
            }
        }
        public void pengurangan(){                                              //Metode Pengurangan
            System.out.println("Hasil dari penjumlahan Matriks : ");
            for (int i=0;i<nB;i++){
                for (int j=0;j<nK;j++){
                    M3[i][j]=M1[i][j]-M2[i][j];
                }
        
            }
        }
        public void perkalian(){                                                //Metode Perkalian
            System.out.println();
            for (int i = 0;i<nB;i++){
                 for (int j =0;j<nK;j++){
                    M3[i][j]=0;
                    for (int a =0;a<nK;a++){
                        int hasilkali=M1[i][a]*M2[a][j];
                        M3[i][j]=M3[i][j]+hasilkali;
                    }   
                }
            }
            System.out.println("Transpose Matriks : ");
        }
        public void transpose(){                                                //Metode Transpose Matriks
            System.out.println();
            for (int i = 0;i<nB;i++){
                for (int j =0;j<nK;j++){
                    M3[j][i]=M1[i][j];
                }
            }
        }
        public void scalar(){                                                   //Metode Perkalian Skalar Matriks
            System.out.println();
            System.out.print("Masukan nilai yang akan dikali kan :");
            int n = sc.nextInt();
            for (int i = 0;i<nB;i++){
                for (int j =0;j<nK;j++){
                    M3[j][i]=M1[i][j]*n;
                }
            }
        }
        public void proses(int n){                                              //Pemrosesan Matriks sesuai Pilihan
            if(n==1){
                penjumlahan();
                outputMatriks(3);
            }else if(n==2){
                pengurangan();
                outputMatriks(3);
            }else if(n==3){
                perkalian();
                outputMatriks(3);
            }else if(n==4){
                scalar();
                outputMatriks(3);
            }else if(n==5){
                transpose();
                outputMatriks(3);
            }else{
                System.out.println("Terima Kasih :)");
            }
        }
        public int Menu(){                                                      //Tampilan Menu Pilihan Operasi
            System.out.println();
            System.out.println("Menu Operasi Matriks");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Perkalian Scalar");
            System.out.println("5. Transpose");
            System.out.println("0. Keluar");
            int p;
            do {
            System.out.print("Masukan pilihan(0-5) : ");
            p = sc.nextInt();
            }while(p<0 && p>5);
            return p;
        }
    
            
    public static void main(String[] args) {
        Matriks m = new Matriks();
        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        
        int k;
        m.ordo();
        m.inputMatriks();
        m.outputMatriks(1);
        m.outputMatriks(2);
        do{
            k=m.Menu();
            m.proses(k);   
        }while(k!=0);
        
    }
    
}


