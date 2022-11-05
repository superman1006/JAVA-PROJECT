package OOP.Static.d3_ToolClass;

import java.util.Random;

public class VerifyTool {

    // 创建私有构造器 , 不对外创建对象
    private VerifyTool(){

    }

    // 验证码工具 VerifyTool
    public static String createVerify(int times){
        String code = "";
        String chars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";
        Random r = new Random();
        for (int i = 0; i < times; i++) {
            int index = r.nextInt(chars.length());
            code += chars.charAt(index);
        }
        return code;
    }
}
