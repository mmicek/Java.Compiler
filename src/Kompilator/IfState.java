package Kompilator;

import java.io.FileOutputStream;
import java.io.IOException;

public class IfState {
    static int num=0;
    public static String IfState(int []table, FileOutputStream fileout) throws IOException {
        SaveIn.typeIn(BooleanState.Boolean(table,num)+"if_state"+Conv.ert(num)+'\n',fileout);
        return "if_state"+Conv.ert(num)+":"+'\n' ;
    }
}
