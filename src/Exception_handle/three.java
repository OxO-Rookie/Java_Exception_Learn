package Exception_handle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class three {
    // 同样不处理异常
    public static void main(String[] args)
    {
        //method1();
        try
        {
            method1();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    // 选择在method1中处理异常
    private static void method1() throws FileNotFoundException
    {
        method2();
        /*
        try
        {
            method2();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

         */
    }

    // 不处理异常，而是抛出异常
    private static void method2() throws FileNotFoundException
    {
        File f = new File("/Users/fwy/Downloads/QAQ.jpg");
        System.out.println("试图打开不存在的文件QAQ.jpg");
        new FileInputStream(f);
        System.out.println("成功打开");
    }
}
