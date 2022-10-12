package top.iiiimonster.nine.new_feature;

/**
 * &#064;Description:  JDK9 - 允许在接口中使用私有方法 <BR/>
 * &#064;author:  zwy<BR/>
 * &#064;date:  2022年10月12日 14:51<BR/>
 */
public class usingPrivateMethods implements usingPrivateMethodsInterface{
    public static void main(String[] args) {
        usingPrivateMethods usingPrivateMethods = new usingPrivateMethods();
        System.out.println(usingPrivateMethods.sayHiBypublic());
    }
}

interface usingPrivateMethodsInterface{
    private String sayHiBypricate(){
        return "你好";
    }

    default String sayHiBypublic(){
        return sayHiBypricate();
    }

}
