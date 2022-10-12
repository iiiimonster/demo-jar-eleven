package top.iiiimonster.ten.new_feature;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * &#064;Description:  JDK10 - 局部变量类型推断 <BR/>
 * 变量类型的推断在 Java 中不是一个崭新的概念，
 * 但在局部变量中确是很大的一个改进。说到变量类型推断，
 * 从 Java 5 中引进泛型，到 Java 7 的 <> 操作符允许不绑定类型而初始化 List，
 * 再到 Java 8 中的 Lambda 表达式，再到现在 Java 10 中引入的局部变量类型推断，
 * Java 类型推断正大刀阔斧地向前进步、发展。
 * 不过对于JAVA强类型语言来说使用这种方式写代码可能会在没有IDE和文档的支持下去阅读代码带来一定的难度，
 * 所以个人不太喜欢，不过这也是JAVA也在学习各路语言的优点，一种非常好的表现。
 * &#064;author:  zwy<BR/>
 * &#064;date:  2022年10月12日 17:04<BR/>
 */
public class LocalVariableTypeInference {

    public static void main(String[] args) {

        var list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        var stream = list.stream();
        for (String s : list) {
            System.out.println(s);
        }
        //顺便 复习一下 Lambda 表达式
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        stream.forEach(s -> System.out.println(s));

        stream.forEach(System.out::println);

    }
}
