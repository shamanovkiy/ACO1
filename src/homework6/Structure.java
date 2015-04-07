package homework6;


import java.io.File;

public class Structure {

    public static void main(String[] args) {
        seeStructure("E:\\find");
    }

    public static void seeStructure(String path){
        File file = new File(path);
        String[] files = file.list();
        for(String f : files){
            if(files == null){
                return;
            }
            System.out.println(path + "\\" + f);
            File newF = new File(path + "\\" + f);
            if(newF.isDirectory()){
                seeStructure(newF.getPath());
            }
        }
    }
}
