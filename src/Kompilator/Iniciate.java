package Kompilator;

import java.io.FileOutputStream;
import java.io.IOException;

public class Iniciate {
    public static void Iniciate(int [] tab, FileOutputStream fileout) throws IOException {
        int i=3;
        while(tab[i]==' ')
            i++;
        int x=i;
        while(tab[x]!=-1)
            x++;
        SaveIn.typeIn(Conv.scal(tab,i,x-i)+" db  0"+'\n',fileout);
    }
}
