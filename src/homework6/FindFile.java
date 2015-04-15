package homework6;


import java.io.File;

public class FindFile {

    public static void main(String[] args) {
        fileSearch("txt.txt", "E:\\find");
    }

    static boolean found;
    public static void fileSearch(String name, String path){
        File file = new File(path);
//        String[] files = file.list();

        //TODO: use File[] insteead of String[]
        File[] files = file.listFiles();
        for(File f : files){
            if(files == null){
                return;
            }
            if(f.getName().equalsIgnoreCase(name)){
                System.out.println(path + "\\" + f);
                found = true;
                return;
            }
            if(f.isDirectory()){
                fileSearch(name, f.getPath());
                if(found) return;
            }
        }
    }
}
