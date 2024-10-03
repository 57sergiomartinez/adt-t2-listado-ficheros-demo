import java.io.File;


public class DirectoryList {
    public static void main(String[] args) {

        String path = ".";

        if (args.length > 0) {
            path = args[0];
        }

        // Hay dos formas de hacer, dando la ruta o como en el caso File2
        File file = new File (path);
        if (!file.exists()){
            System.out.println("File dosn't exist");
        } else {
            if (file.isFile()) {
                System.out.println(file + "is a file");
            } else if (file.isDirectory()) {
                System.out.println(file + "is a directory. Contents: ");
                File[] files = file.listFiles();
                for (File f: files) {
                    String description = f.isDirectory()? "/" : "_";
                    System.out.println( "(" + description + ") " + f.getName());

                }
            }
            System.out.println("File exist");
        }

        System.out.println(path);








        // Se puede indicar que use el separador si es que las / dan problemas
        File file2 = new File("resources" + File.separator + "archivo.txt");
        if (!file.exists()){
            System.out.println("File2 dosn't exist");
        } else {
            System.out.println("File2 exist");
        }

    }
}