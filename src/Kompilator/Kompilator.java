package Kompilator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Kompilator {
    public static void main(String args[]) throws IOException {


        File_Menagment file = new File_Menagment(args);
        file.File_Start();
    }
}
