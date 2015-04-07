package homework6;


import java.io.File;

public class FindFile {

    public static void main(String[] args) {
        fileSearch("txt.txt", "E:\\find");
    }

    static boolean found;
    public static void fileSearch(String name, String path){
        File file = new File(path);
        String[] files = file.list();
        for(String f : files){
            if(files == null){
                return;
            }
            if(f.equalsIgnoreCase(name)){
                System.out.println(path + "\\" + f);
                found = true;
                return;
            }
            File newF = new File(path + "\\" + f);
            if(newF.isDirectory()){
                fileSearch(name, newF.getPath());
                if(found) return;
            }
        }
    }
}
