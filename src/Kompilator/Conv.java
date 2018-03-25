package Kompilator;

public class Conv {
    public static String ert(int numb){
        int number=0;
        while(numb>0){
            number=number*10+numb%10;
            numb=numb/10;
        }
        String numbx="";
        while(number>0){
            numbx=numbx+number%10;
            number=number/10;
        }
        return numbx;
    }
    public static String scal(int []table,int pocz,int ile_cyfr){
        String ret="";
        for(int i=pocz;i<pocz+ile_cyfr;i++){
            ret=ret+(char)table[i];
        }
        return ret;
    }
}
