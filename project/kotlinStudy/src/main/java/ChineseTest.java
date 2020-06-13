import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by qiyei2015 on 2018/10/13.
 * @version: 1.0
 * @email: 1273482124@qq.com
 * @description:
 */
public class ChineseTest {

    private static final String fileName1 = "不带钟名字.txt";
    private static final String fileName2 = "带钟的名字.txt";
    private static final String fileName3 = "2个字的名字.txt";
    private static final String fileName4 = "2个字的常用名字.txt";

    private static final String fileName5 = "3个字的常用名字.txt";

    private static final String fileName6 = "韩如Xxx的常用名字.txt";
    private static final String fileName7 = "韩锦Xxx的常用名字.txt";

    private static List<String> commonlyUsedChinese = new ArrayList<>();

    static List<String> names1 = new ArrayList<>();

    public static void main(String[] args) throws Exception{
        commonlyUsedChinese = getChineseCharList();
        generateNames();
        System.out.println("名字已经生成完成！！！");
        chooseNames();
    }

    private static void chooseNames(){
        List<String> chooseNames = new ArrayList<>();
        for (int i = 0 ;i < names1.size() ;i++){
            if (i % 910609 == 0){
                chooseNames.add(names1.get(i));
            }
        }
        System.out.println(chooseNames);
    }

    private static void generateChineseName(){
        try {
            File file = new File(fileName1);
            file.delete();
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(fileName1);

            File file2 = new File(fileName2);
            file2.delete();
            if (!file2.exists()) {
                file2.createNewFile();
            }
            FileWriter fw2 = new FileWriter(fileName2);

            String start = "4e00";//定义一个字符串变量为4e00
            String end = "9fa5";//定义一个字符串变量为9fa5

            int s = Integer.parseInt(start, 16);
            int e = Integer.parseInt(end, 16);
            String pre = "韩";
            String nice = "钟";
            int k = 0;
            for (int i = s; i <= e; i++) {
                if (i == '韩'){
                    continue;
                }
                for (int j = s ; j <= e; j++){
                    if (j == '韩'){
                        continue;
                    }
                    String str1 = (char) i + "";
                    String str2 = (char) j + "";
                    k++;
                    String name = pre + str1 + str2 + "   ";
                    if (k % 100 == 0){
                        name = name + "\n";
                    }
                    if (str1.equals(nice) || str2.equals(nice)){
                        fw2.write(name);
                    }else {
                        fw.write(name);
                    }
                }
            }

            System.out.println("名字已经生成完成！！！");
            fw.flush();
            fw.close();
            fw2.flush();
            fw2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void generateChineseName2(){
        try {
            File file = new File(fileName3);
            file.delete();
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(fileName3);

            String start = "4e00";//定义一个字符串变量为4e00
            String end = "9fa5";//定义一个字符串变量为9fa5

            int s = Integer.parseInt(start, 16);
            int e = Integer.parseInt(end, 16);
            String pre = "韩";
            int k = 0;
            for (int i = s; i <= e; i++) {
                if (i == '韩'){
                    continue;
                }
                String str1 = (char) i + "";
                k++;
                String name = pre + str1 + "   ";
                if (k % 100 == 0){
                    name = name + "\n";
                }
                fw.write(name);
            }
            System.out.println("名字已经生成完成！！！");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generateNames() {
        int k = 0;

        try {
            File file = new File(fileName4);
            file.delete();
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(fileName4);

            File file2 = new File(fileName5);
            file2.delete();
            if (!file2.exists()) {
                file2.createNewFile();
            }
            FileWriter fw2 = new FileWriter(fileName5);

            File file3 = new File(fileName6);
            file3.delete();
            if (!file3.exists()) {
                file3.createNewFile();
            }
            FileWriter fw3 = new FileWriter(fileName6);

            File file4 = new File(fileName7);
            file4.delete();
            if (!file4.exists()) {
                file4.createNewFile();
            }
            FileWriter fw4 = new FileWriter(fileName7);

            String pre = "韩";
            String name;
            int separator_count = 25;
            for (int i = 0 ;i < commonlyUsedChinese.size() ;i++){
                name = pre + commonlyUsedChinese.get(i) + "   ";
                k++;
                if (k % separator_count == 0){
                    name = name + "\n";
                }

                fw.write(name);
            }
            separator_count = 20;

            for (int i = 0 ;i < commonlyUsedChinese.size() ;i++){
                String str1 = commonlyUsedChinese.get(i);
                for (int j = 0;j < commonlyUsedChinese.size() ;j++){
                    name = pre + str1 + commonlyUsedChinese.get(j) + "   ";
                    k++;
                    if (k % separator_count == 0){
                        name = name + "\n";
                    }
                    names1.add(name);
                    fw2.write(name);
                }
            }

            for (int i = 0 ;i < commonlyUsedChinese.size() ;i++){
                String str1 = commonlyUsedChinese.get(i);
                if (str1.equals("如")){
                    for (int j = 0;j < commonlyUsedChinese.size() ;j++){
                        name = pre + str1 + commonlyUsedChinese.get(j) + "   ";
                        k++;
                        if (k % separator_count == 0){
                            name = name + "\n";
                        }
                        fw3.write(name);
                    }
                }
            }

            for (int i = 0 ;i < commonlyUsedChinese.size() ;i++){
                String str1 = commonlyUsedChinese.get(i);
                if (str1.equals("锦")){
                    for (int j = 0;j < commonlyUsedChinese.size() ;j++){
                        name = pre + str1 + commonlyUsedChinese.get(j) + "   ";
                        k++;
                        if (k % separator_count == 0){
                            name = name + "\n";
                        }
                        fw4.write(name);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //fw.flush();
            //fw.close();
        }


    }

    /**
     * 生成常用汉字
     * @return
     * @throws IOException
     */
    private static List<String> getChineseCharList() throws IOException {
        int highPos;
        int lowPos;
        String str;
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 39; i++) {
            for (int j = 0; j < 93; j++) {
                highPos = (176 + i);
                lowPos = (161 + j);
                byte[] b = new byte[2];
                b[0] = (Integer.valueOf(highPos)).byteValue();
                b[1] = (Integer.valueOf(lowPos)).byteValue();
                str = new String(b, "GBK");
                names.add(str);
            }
        }
        return names;
    }
}
