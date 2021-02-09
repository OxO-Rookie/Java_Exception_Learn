package Exception_classfication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// Throwable
public class two {
    public static void main(String[] args)
    {
        try
        {
            method1();
        } catch (Throwable e)
        {
            e.printStackTrace();
        }

        try
        {
            method2();
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        try
        {
            method3();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    // 选择直接抛出Throwable
    private static void method1() throws Throwable
    {
        File f = new File("/Users/fwy/Downloads/QAQ.jpg");
        new FileInputStream(f);
    }

    private static void method2() throws FileNotFoundException
    {
        File f = new File("/Users/fwy/Downloads/QAQ.jpg");
        new FileInputStream(f);
    }

    private static void method3() throws Exception
    {
        File f = new File("/Users/fwy/Downloads/QAQ.jpg");
        new FileInputStream(f);
    }
}
