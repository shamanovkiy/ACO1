
public class Tree {

    public static void main(String[] args) {
        getTree(6);
    }

    public static void getTree(int rows){
        if(rows < 0){
            System.out.println("Wrong number of rows");
        }
        String[] tree = new String[rows];
        String part = "";
        for (int j = tree.length - 1; j >= 0; j--) {
            part = part + " ";
            tree[j] = part;
        }
        for (int i = 0; i < tree.length; i++) {
            part = part + "* ";
            tree[i] = tree[i] + part;
            System.out.println(tree[i]);
        }
    }
}
