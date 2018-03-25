package Kompilator;

import java.io.*;

public class File_Menagment {
    private String args[];
    File_Menagment(String args[]){
        this.args=args;
    }
    public void File_Start() throws IOException{

        FileInputStream filein;
        FileOutputStream fileout;
        String args=this.args[0];  //moze byc blad tu
        filein=new FileInputStream(args+".txt");
        fileout = new FileOutputStream(args+".asm");
        int znak,i;
        InsideMeth insideM= new InsideMeth();
        int table[]=new int[20];
        do{
            znak=filein.read();
        }while(znak==' ' || znak==(char)13 || znak==(char)10);
        do{
            i=0;
            do {
                if(znak=='}') break;
                table[i]=znak;
                i++;
                znak = filein.read();
            }while(ExeptChar(znak));
            table[i]=-1;
           //wypisz(table);
           //System.out.println((char)znak);
           if(znak=='{' || znak=='}')
                insideM.Check(znak,table,fileout);
            else
               Translate.Translate_table(table,fileout);
            do{
                znak=filein.read();
            }while(znak==' ' || znak==(char)13 || znak==(char)10);

        }while(znak!='/');
        filein.close();
        fileout.close();
    }
    public boolean ExeptChar(int znak){
        return znak!=';' && znak!='/' && znak!='{' && znak!='}';
    }
    public void wypisz(int [] table){
        int i;
        for(i=0;table[i]!=-1;i++){
            System.out.print((char)table[i]);
        }
        System.out.print(table[i]);
        System.out.println();
    }
}
