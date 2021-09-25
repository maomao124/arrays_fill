import java.util.Arrays;

/**
 * Project name(项目名称)：数组填充
 * Package(包名): PACKAGE_NAME
 * Description(描述)： 无
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/25
 * Time(创建时间)： 20:00
 * Version(版本): 1.0
 */

public class test
{
    public static void main(String[] args)
    {
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++)
        {
            Arrays.fill(num, i);
            System.out.print("第" + i + "次:");
            for (int s : num)
            {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        for (int s : num)
        {
            System.out.println(s);
        }
    }

}
