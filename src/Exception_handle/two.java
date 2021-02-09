package Exception_handle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 多异常捕捉
public class two {
    public static void main(String[] args)
    {
        // 方法一：分别对不同异常进行catch
        File f = new File("/Users/fwy/Downloads/QAQ.jpg");
        try
        {
            System.out.println("试图打开不存在的文件QAQ.jpg");
            new FileInputStream(f);
            System.out.println("成功打开！");

            int[] arr = new int[10];
            System.out.println(arr[10]);
            // 实际上只能捕捉到一个异常，捕捉到异常后就会直接终端
            // 比如本例中运行到18行就会直接中断，数组越界部分不会设计到
        } catch (FileNotFoundException e)
        {
            System.out.println("文件不存在");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e)
        {
            System.out.println("数组访问越界");
            e.printStackTrace();
        }

        // 方法二：直接放在同一个catch里
        f = new File("/Users/fwy/Downloads/QVQ.jpg");
        try
        {
            System.out.println("试图打开存在的文件QVQ.jpg");
            new FileInputStream(f);
            System.out.println("成功打开！");

            int[] arr = new int[10];
            System.out.println(arr[10]);
        } catch (FileNotFoundException | IndexOutOfBoundsException e)
        {
            // 格式为 Exception1 | Exception2 e, IDE可以报出具体错误
            // 使用 instanceof 来区分异常，用于进行不同异常的处理
            if (e instanceof FileNotFoundException)
                System.out.println("文件不存在");
            else if (e instanceof IndexOutOfBoundsException)
                System.out.println("数组访问越界");
            e.printStackTrace();
        }
    }
}
