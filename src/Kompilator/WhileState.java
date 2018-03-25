package Kompilator;

import java.io.FileOutputStream;
import java.io.IOException;

public class WhileState {
    public static int num=0;
    public static String WhileState(int []table, FileOutputStream fileout) throws IOException {
        table[0]='i';
        SaveIn.typeIn(BooleanState.Boolean(table,num),fileout);
        SaveIn.typeIn("while_state"+Conv.ert(num)+ '\n'+"loop"+Conv.ert(num)+':'+'\n',fileout);
        table[0]='w';
        return BooleanState.Boolean(table,num)+"loop"+Conv.ert(num)+'\n'+"while_state"+Conv.ert(num)+":"+'\n';
    }
}
