package LBXX;

import java.util.Scanner;

public class Switch {

        public static void main(String args[]) {
            System.out.println("欢迎使用蜡笔3小新的多规则密码系统！");
            System.out.println("请选择您需要使用的密码规则: 1.凯撒密码 2.MD5加密");
            Scanner a=new Scanner(System.in);
            int choose=a.nextInt();
            switch (choose){
                case 1:
                    System.out.println("请输入你所要使用的功能：1.加密 2.解密");
                    Scanner t=new Scanner(System.in);
                    int choice=t.nextInt();
                    LBXX.CaesarEncryption st=new LBXX.CaesarEncryption();
                    switch(choice) {
                        case 1:
                            System.out.println("请输入需要加密的字符:");
                            Scanner s1 = new Scanner(System.in);
                            String text = s1.nextLine();
                            System.out.println("请输入密钥:");
                            Scanner s2 = new Scanner(System.in);
                            int key1 = s2.nextInt();
                            st.jiami(key1,text);
                            break;
                        case 2:
                            System.out.println("请输入需要解密的字符");
                            Scanner s3 = new Scanner(System.in);
                            String code = s3.nextLine();
                            System.out.println("请输入密钥");
                            Scanner s4 = new Scanner(System.in);
                            int key2 = s4.nextInt();
                            st.jiemi(key2,code);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("请输入你所要使用的功能：1.加密 2.解密");
                    Scanner b=new Scanner(System.in);
                    int opt=b.nextInt();
                    LBXX.Md5Encryption st1 = new LBXX.Md5Encryption();
                    switch(opt) {
                                case 1:
                                    System.out.println("请输入需要加密的字符::");
                                    Scanner s1 = new Scanner(System.in);
                                    String c = s1.nextLine();
                                    st1.jiamia(c);
                                    break;
                                case 2:
                                    st1.jiemia();
                    }
            }
        }
    }


