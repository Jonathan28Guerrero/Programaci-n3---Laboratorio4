/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class FileManagement {
    public ArrayList LoginByFile(File FileStudents) throws FileNotFoundException{
        ArrayList TableStudents = new ArrayList();
        try(Scanner ScanFile = new Scanner(FileStudents)){
            while (ScanFile.hasNextLine()){
                ArrayList Values = SplitColumns(ScanFile.nextLine());
                TableStudents.add(Values);
            }
        }
        return TableStudents;
    }
    public ArrayList SplitColumns(String Row){
        ArrayList Columns = new ArrayList();
        try(Scanner RowScanner = new Scanner(Row)){
            RowScanner.useDelimiter(";");
                while(RowScanner.hasNext()) {
                Columns.add(RowScanner.next());
            }
        }
        return Columns;
    }
    public void ExportFileScores(){
        
    }
    public void ExportFileAverges(){
        
    }
}
