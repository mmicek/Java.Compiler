package Kompilator;

import java.io.FileOutputStream;
import java.io.IOException;

public class Translate {
    public static String Translate_table(int []table,FileOutputStream fileout) throws IOException {
        if (Conv.scal(table,0,2).equals("if")) {
            IfState.num++;
            return IfState.IfState(table,fileout);
        }
        if(Conv.scal(table,0,5).equals("while")){
            WhileState.num++;
            return WhileState.WhileState(table,fileout);
        }
        if(Conv.scal(table,0,3).equals("int")){
            Iniciate.Iniciate(table,fileout);
            return null;
        }
        //tu musi byc cos co zaczyna kod w asmie typu np 'main'
        else{

            return null;
        }
    }
}
