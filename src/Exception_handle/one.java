package Exception_handle;

import java.io.File;
import java.io.FileInputStream;

// 常见的异常处理手段是：try, catch, finally, throws
// 关键词：printStackTrace(), Exception
public class one {
    public static void main(String[] args)
    {
        // 此处不会报错，因为此时f只是一个定义了文件路径的File类，并没有真正访问这个路径
        File f = new File("/Users/fwy/Downloads/jojo.jpg");
        try
        {
            System.out.println("试图打开不存在的文件jojo.jpg");
            new FileInputStream(f);
            System.out.println("成功打开");
            // }catch (FileNotFoundException e){ // FileNotFoundException：文件不存在 异常
        }catch (Exception e){ // Exception：所有异常的父类，可以直接用于捕捉异常。
            System.out.println("jojo.jpg不存在噢！");
            // printStackTrace()：这玩意是用来打印方法的调用痕迹的
            // 控制台的橙色部分就是该函数的打印内容
            // 在此例子中打印出了异常起始位置为第15行
            e.printStackTrace();
            // 打印 堆栈 痕迹
        }
    }
}
