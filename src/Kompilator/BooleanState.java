package Kompilator;

public class BooleanState {
    public static String Boolean(int []table,int numb){
        int pierwsza=table[0];
        int i=0;
        while(table[i]!='(')
            i++;
        i++;
        int x=i;
        String w1="";
        while(table[x]>=65 && table[x]<=122){
            w1=w1+(char)table[x];
            x++;
        }
        int y=table[x];
        int z=table[x+1];
        if(y=='=') x++;
        x++;
        String w2="";
        while(table[x]!=')'){
           if(table[x]!='=') w2=w2+(char)table[x];
            x++;
        }
        String numbx=Conv.ert(numb);
        if(pierwsza=='i') {
            switch (y) {
                case '>':
                    return "    mov ax," + w1 + '\n' + "    mov bx," + w2 + '\n' + "    cmp ax,bx" + '\n' + "    jbe ";
                case '=':
                    return "    mov ax," + w1 + '\n' + "    mov bx," + w2 + '\n' + "    cmp ax,bx" + '\n' + "    jnz ";
                case '<':
                    return "    mov ax," + w1 + '\n' + "    mov bx," + w2 + '\n' + "    cmp ax,bx" + '\n' + "    jae ";
                case '!':
                    return "    mov ax," + w1 + '\n' + "    mov bx," + w2 + '\n' + "    cmp ax,bx" + '\n' + "    je ";
            }
        }
        if(pierwsza=='w'){
            switch (y) {
                case '>':
                    return "    mov ax," + w1 + '\n' + "    mov bx," + w2 + '\n' + "    cmp ax,bx" + '\n' + "    ja ";
                case '=':
                    return "    mov ax," + w1 + '\n' + "    mov bx," + w2 + '\n' + "    cmp ax,bx" + '\n' + "    je ";
                case '<':
                    return "    mov ax," + w1 + '\n' + "    mov bx," + w2 + '\n' + "    cmp ax,bx" + '\n' + "    jb ";
                case '!':
                    return "    mov ax," + w1 + '\n' + "    mov bx," + w2 + '\n' + "    cmp ax,bx" + '\n' + "    jnz ";
            }
        }
        return null;
    }
}
