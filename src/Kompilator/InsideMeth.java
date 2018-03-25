package Kompilator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InsideMeth {
    List<String> lista = new ArrayList<String>();
    public void Check(int znak,int [] table,FileOutputStream fileout) throws IOException {
        if(znak=='{'){
            lista.add(Translate.Translate_table(table,fileout));
        }
        else{
            SaveIn.typeIn(lista.get(lista.size()-1),fileout);
            lista.remove(lista.size()-1);
        }
    }
}
