package Kompilator;

import java.io.FileOutputStream;
import java.io.IOException;

public class Assign {
    public static void Assign(int [] table, FileOutputStream fileout) throws IOException {
        int nazwa=0;
        while(table[nazwa]!='=')
            nazwa++;
        int i=0;
        while(table[i]!=-1)
            i++;
        i--;
        while(table[i]!='='){

            i--;
        }

        SaveIn.typeIn("     mov "+Conv.scal(table,0,i+1)+",ax"+'\n',fileout);
    }
}
