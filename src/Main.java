import java.io.File;
import java.io.IOException;

public class Main {

    public static void main (String[] args) {

        File src = new File("E://NWork/Netology/JavaCore/_3.1/Games/src");
        if (src.mkdir())
            System.out.println("Каталог " + src.getName() + " создан");

        File res = new File("E://NWork/Netology/JavaCore/_3.1/Games/res");
        if (res.mkdir())
            System.out.println("Каталог " + res.getName() + " создан");

        File saveGames = new File("E://NWork/Netology/JavaCore/_3.1/Games/savegames");
        if (saveGames.mkdir())
            System.out.println("Каталог " + saveGames.getName() + " создан");

        File temp = new File("E://NWork/Netology/JavaCore/_3.1/Games/temp");
        if (temp.mkdir())
            System.out.println("Каталог " + temp.getName() + " создан");

        File main = new File(src, "main");
        if (main.mkdir())
            System.out.println("Каталог " + main.getName() + " создан");

        File test = new File(src, "test");
        if (test.mkdir())
            System.out.println("Каталог " + test.getName() + " создан");

        File fileMain = new File(main, "Main.java");
        try {
            if (fileMain.createNewFile())
                System.out.println("Файл " + fileMain.getName() + " был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File utils = new File(main, "Utils.java");
        try {
            if (utils.createNewFile())
                System.out.println("Файл " + utils.getName() + " был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File drawables = new File(res, "drawables");
        if (drawables.mkdir())
            System.out.println("Каталог " + drawables.getName() + " создан");

        File vectors = new File(res, "vectors");
        if (vectors.mkdir())
            System.out.println("Каталог " + vectors.getName() + " создан");

        File icons = new File(res, "icons");
        if (icons.mkdir())
            System.out.println("Каталог " + icons.getName() + " создан");

        File fileTemp = new File(temp, "temp.txt");
        try {
            if (fileTemp.createNewFile())
                System.out.println("Файл " + fileTemp.getName() + " был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
