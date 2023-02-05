import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();


        File src = new File("E://NWork/Netology/JavaCore/_3.1/Games/src");
        if (src.mkdir())
            stringBuilder.append("Каталог " + src.getName() + " создан");

        File res = new File("E://NWork/Netology/JavaCore/_3.1/Games/res");
        if (res.mkdir())
            stringBuilder.append(" Каталог " + res.getName() + " создан");



        File saveGames = new File("E://NWork/Netology/JavaCore/_3.1/Games/savegames");
        if (saveGames.mkdir())
            stringBuilder.append(" Каталог " + saveGames.getName() + " создан");


        File temp = new File("E://NWork/Netology/JavaCore/_3.1/Games/temp");
        if (temp.mkdir())
            stringBuilder.append(" Каталог " + temp.getName() + " создан");


        File main = new File(src, "main");
        if (main.mkdir())
            stringBuilder.append(" Каталог " + main.getName() + " создан");


        File test = new File(src, "test");
        if (test.mkdir())
            stringBuilder.append(" Каталог " + res.getName() + " создан");


        File fileMain = new File(main, "Main.java");
        try {
            if (fileMain.createNewFile())
                stringBuilder.append(" Файл " + fileMain.getName() + " был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File utils = new File(main, "Utils.java");
        try {
            if (utils.createNewFile())
                stringBuilder.append(" Файл " + utils.getName() + " был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File drawables = new File(res, "drawables");
        if (drawables.mkdir())
            stringBuilder.append(" Каталог " + drawables.getName() + " создан");

        File vectors = new File(res, "vectors");
        if (vectors.mkdir())
            stringBuilder.append(" Каталог " + vectors.getName() + " создан");

        File icons = new File(res, "icons");
        if (icons.mkdir())
            stringBuilder.append(" Каталог " + icons.getName() + " создан");

        File fileTemp = new File(temp, "temp.txt");
        try {
            if (fileTemp.createNewFile())
                stringBuilder.append(" Файл " + fileTemp.getName() + " был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String data = stringBuilder.toString();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E://NWork/Netology/JavaCore/_3.1/Games/temp/temp.txt"));
        bufferedWriter.write(data);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
