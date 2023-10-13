package Grammar2;

import java.util.*;
// import Grammar1Main.ErrorHandling;

// import ErrorHandling;

// import 1Grammar.error.ErrorHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class TableGeral{

    // Integer coluna, linha;
    HashMap<String,String> header = new HashMap<>();             //[name(id) : "Name"(nome da coluna)]
    HashMap<String, String> column_types = new HashMap<>();      //[name(id) : type]
    HashMap<String, ArrayList<Object>> table = new HashMap<>();  //[name(id) : [lines]]
    ArrayList<String> headername = new ArrayList<>();
    String name_table;
    int countnull=0;

    public TableGeral(){}

    public TableGeral(LinkedHashMap<String,ArrayList<String>> fristHeader){
        if(fristHeader.keySet().contains("tablename")){
            this.name_table=fristHeader.get("tablename").get(0);
            fristHeader.remove("tablename");
            for(String i : fristHeader.keySet()) {
                if(fristHeader.get(i).size()==2){
                    addColumn(i,fristHeader.get(i).get(0),fristHeader.get(i).get(1));
                }
                else{
                    addColumn(i,fristHeader.get(i).get(0));
                }
            }
        }
        else{
            for(String i : fristHeader.keySet()) {
                if(fristHeader.get(i).size()==2){
                    addColumn(i,fristHeader.get(i).get(0),fristHeader.get(i).get(1));
                }
                else{
                    addColumn(i,fristHeader.get(i).get(0));
                }
            }
        }
    }
    
    public TableGeral(String name_table){
        this.name_table = name_table;
    }

    public TableGeral(TableGeral table, String id){
        //...
    }

    public String getName_table() {
        return this.name_table;
    }

    public HashMap<String,String>  getHeader() {
        return this.header;
    }

    public  HashMap<String, String> getColumn_types() {
        return this.column_types;
    }

    public void setColumn_types(HashMap<String, String> column_types) {
        this.column_types = column_types;
    }

    public HashMap<String, ArrayList<Object>> getTable() {
        return this.table;
    }

    public void setName_table(String name_table) {
        this.name_table = name_table;
    }

    public void setHeader(HashMap<String,String> header) {
        this.header = header;
    }

    public void setTable(HashMap<String, ArrayList<Object>> table) {
        this.table = table;
    }
    
    public ArrayList<Object>  getColumn(String id){

        return table.get(id);
    }
    public ArrayList<Object>  getColumnNames(){
        ArrayList<Object> names = new ArrayList<>();
        for(String i : headername){
            names.add(header.get(i));
        }

        return names;   
    }
    public String getColumnName(String id){
        return header.get(id);
    }
 
    public void removeColumn(String id){
        table.remove(id);
        header.remove(id);
        headername.remove(id);
    
    }

    public void addColumn(String id, String column_type) {  //Quando não existe nome para a coluna

        for (String i : headername){
            if(i.equals(id)){
                System.out.println("Coluna já existe");
            return;
            }
        }
        this.headername.add(id);
        this.header.put(id, id);
        this.column_types.put(id, column_type);
        this.table.put(id, new ArrayList<>());
    }

    public void addColumn(String id, String column_type, String columnName) {  //quando já existe nome para a coluna

        for (String i : headername){
            if(i.equals(id)){
                System.out.println("Coluna já existe");
            return;
            }
        }
        this.headername.add(id);
        this.header.put(id, columnName);
        this.column_types.put(id, column_type);
        this.table.put(id, new ArrayList<>());
    }

    public void addColumnName(String id , String columnName){
        header.put(id, columnName);
    }


    public ArrayList<String> getHeadername() {
        return this.headername;
    }

    public void setHeadername(ArrayList<String> headername) {
        this.headername = headername;
    }

    public String getColumnType(String id){
        return column_types.get(id);
    }

    // public ArrayList<Object> getRow(int index){
    //     ArrayList<Object> row = new ArrayList<>();
    //     for (String i : )
    // }

    public void printLineByLine(TableGeral table){

        HashMap<String,String> header = table.getHeader();             //[name(id) : "Name"(nome da coluna)]
        HashMap<String, ArrayList<Object>> tableinfo = table.getTable();  //[name(id) : [lines]]
        ArrayList<String> headername = table.getHeadername();
        
        
        int sizeheader = headername.size();
        int[] maxLengths = new int[sizeheader];
        

        // Calculate the maximum length of each column
        for (int i = 0; i < sizeheader; i++) {
            maxLengths[i] = header.get(headername.get(i)).length();
            for (Object value : tableinfo.get(headername.get(i))) {
                maxLengths[i] = Math.max(maxLengths[i], value.toString().length());
            }
        }


        StringBuilder sb = new StringBuilder();
        if(table.getName_table() != null){
            sb.append(table.getName_table()+":");
            System.out.println(sb);
        }
        sb = new StringBuilder();
        for (int i = 0; i < sizeheader; i++) {
            sb.append("| ");
            int padding = maxLengths[i] - header.get(headername.get(i)).length();
            sb.append(header.get(headername.get(i)));
            for (int j = 0; j < padding; j++) {
                sb.append(" ");
            }
            sb.append(" ");
        }
        sb.append("|");
        System.out.println(sb.toString());

        for (int m = 0; m < tableinfo.get(headername.get(0)).size(); m++) {
            sb = new StringBuilder();
            for (int i = 0; i < sizeheader; i++) {
                sb.append("| ");
                int padding = maxLengths[i] - tableinfo.get(headername.get(i)).get(m).toString().length();
                sb.append(tableinfo.get(headername.get(i)).get(m));
                for (int j = 0; j < padding; j++) {
                    sb.append(" ");
                }
                sb.append(" ");
            }
            sb.append("|");
            System.out.println(sb.toString());
        }
        if (countnull != 0) {
            for (int k = 0; k < countnull; k++) {
                sb = new StringBuilder();
                for (int i = 0; i < sizeheader; i++) {
                    sb.append("|");
                    int padding = maxLengths[i] + 2; 
                    for (int j = 0; j < padding; j++) {
                        sb.append(" ");
                    }
                }
                sb.append("|");
                System.out.println(sb.toString());
            }
        }

    }

    public void add(ArrayList<Object> info) {
        int index=0;
        for (String i : headername){
            if(info.get(index)==null){
                countnull++;
                break;
            }
            else{
                addLine(i,info.get(index));
                index++;
            }
        }
    }
   
    public void addLine(String id, Object value) {
        ArrayList<Object> lines = new ArrayList<>();
        String type = column_types.get(id);
       
            switch(type){
                case "String":
                    String input0 =  (String) value;
                    lines = table.get(id);
                    lines.add(input0);
                    lines = table.put(id, lines); 
                    break;
                case "int":
                    Integer input =  (Integer) value;
                    lines = table.get(id);
                    lines.add(input);
                    lines = table.put(id, lines);
                    break;
                case "double":
                    Double input2 = (Double) value;
                    lines = table.get(id);
                    lines.add(input2);
                    lines = table.put(id, lines);
                    break;
                default:
                    //ErrorHandling.printError("Invalid type!");
                    break;
            }
        
    } 



    protected void writeToFile(String filename) throws IOException {
        try (PrintWriter pw = new PrintWriter(filename)) {
            HashMap<String, String> header = getHeader();
            HashMap<String, ArrayList<Object>> tableinfo = getTable();
            ArrayList<String> headername = getHeadername();
    
            int sizeheader = headername.size();
            int[] maxLengths = new int[sizeheader];
    
            // Calculate the maximum length of each column
            for (int i = 0; i < sizeheader; i++) {
                maxLengths[i] = header.get(headername.get(i)).length();
                for (Object value : tableinfo.get(headername.get(i))) {
                    maxLengths[i] = Math.max(maxLengths[i], value.toString().length());
                }
            }
    
            // Write the header
            StringBuilder sb = new StringBuilder();
            if(getName_table() != null){
                sb.append(getName_table()+":\n");
                System.out.print(sb);
                pw.write(sb.toString());
            }

            sb = new StringBuilder();
            for (int i = 0; i < sizeheader; i++) {
                sb.append(header.get(headername.get(i)));
                if (i != sizeheader - 1) {
                    sb.append(" ".repeat(maxLengths[i] - header.get(headername.get(i)).length()));
                    sb.append(',');
                }
            }
            sb.append("\n");
            pw.write(sb.toString());
            System.out.print(sb);
    
            // Write the table rows
            for (int m = 0; m < tableinfo.get(headername.get(0)).size(); m++) {
                sb = new StringBuilder();
                for (int i = 0; i < sizeheader; i++) {
                    sb.append(tableinfo.get(headername.get(i)).get(m));
                    if (i != sizeheader - 1) {
                        sb.append(" ".repeat(maxLengths[i] - tableinfo.get(headername.get(i)).get(m).toString().length()));
                        sb.append(',');
                    }
                }
                sb.append("\n");
                pw.write(sb.toString());
                System.out.print(sb);
            }
            sb.append("\n");
            pw.write(sb.toString());
            System.out.print(sb);
        }
        
    }
    

}