package Exception_classfication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 异常分类：1. 可查异常
//         2. 非可查异常：a.运行时异常  b.错误
public class one {
    public static void main(String[] args)
    {
        // 1. 可查异常 CheckedException：必须处理的异常，catch | throws，否则编译错误
        //    比如FileNotFoundException
        File f = new File("/Users/fwy/Downloads/QAQ.jpg");
        try
        {
            new FileInputStream(f);
            System.out.println("打开成功");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        // 2. 运行时异常 RuntimeException：不是必须处理的异常,不用catch | throws也可以编译
        //    比如NullPointException,ArrayIndexOutOfBoundsException等
        //    设计原因：Java中此类错误太过普遍，都进行捕捉的话，代码可读性不好
        int k = 5/0;

        String s = null;
        s.length();

        // 3. 错误 Error：系统级别的异常，通常是内存溢出。同2一样不要求强制捕捉
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < Integer.MAX_VALUE; i++)
        {
            // 不断增加字符导致内存用光，OutOfMemoryError
            sb.append('a');
        }
    }
}
