package LBXX;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class Md5Encryption implements LBXX.Encryption {
    public static String getMD5(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public static String MD5(String s){
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        try {
            byte[] btInput = s.getBytes();
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void jiami(int key1, String text) {

    }

    @Override
    public void jiemi(int key2, String code) {

    }

    @Override
    public void jiamia(String c) {
        String md50 = getMD5(c);
        String md5 = MD5(c);
        System.out.print("小写加密结果:");
        System.out.println(md50);
        System.out.print("大写加密结果:");
        System.out.println(md5);
    }

    @Override
    public void jiemia() {
        try {
            throw new UnsupportedOperationException("MD5算法无法解密");
        }
        catch (UnsupportedOperationException e){
            System.out.println("抛出异常："+e);
            LBXX.Switch ad = new LBXX.Switch();
        }
    }
}
