package homework6;


import java.io.File;

public class Structure {

    public static void main(String[] args) {
        seeStructure("E:\\find");
    }

    public static void seeStructure(String path){
        File file = new File(path);
        File[] files = file.listFiles();
        for(File f : files){
            if(files == null){
                return;
            }
            System.out.println(f);
            if(f.isDirectory()){
                seeStructure(f.getPath());
            }
        }
    }
}
