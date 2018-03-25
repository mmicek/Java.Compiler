package Kompilator;

import java.io.FileOutputStream;
import java.io.IOException;

public class SaveIn {
    public static void typeIn(String tab,FileOutputStream fileout) throws IOException {
        if(tab==null) return;
        for(int i=0;i<tab.length();i++){
            char x=tab.charAt(i);
            System.out.print(x);
            fileout.write(x);
        }
    }
}
