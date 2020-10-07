package LBXX;

import static java.lang.Math.abs;

public class CaesarEncryption implements LBXX.Encryption {

    @Override
    public void jiemi(int key2,String code) {
        char a[] = code.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'a' && 'z' >= a[i]) {
                int d = ((int) a[i] - (int) 'a' - key2) % 26;
                if(d<0){
                    d += 26;
                }
                char c = (char)(d + 97);
                System.out.print(c);
            } else if (a[i] >= 'A' && a[i] <= 'Z') {
                int d = ((int) a[i] - (int) 'A' - key2) % 26;
                if(d<0){
                    d += 26;
                }
                char c = (char)(d + 65);
                System.out.print(c);
            } else if (a[i] >= '0' && a[i] <= '9') {
                int d = ((int) a[i] - (int) '0' - key2) % 10;
                if(d<0){
                    d += 10;
                }
                char c = (char)(d + 48);
                System.out.print(c);
            } else {
                System.out.print(a[i]);
            }
        }
    }


    @Override
    public void jiami(int key1,String text) {
        char a[] = text.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 'a' && 'z' >= a[i]) {
                char c = (char) ((int) 'a' + ((int) a[i] - (int) 'a' + key1) % 26);

                System.out.print(c);
            } else if (a[i] >= 'A' && a[i] <= 'Z') {
                char c = (char) ((int) 'A' + ((int) a[i] - (int) 'A' + key1) % 26);
                System.out.print(c);
            } else if (a[i] >= '0' && a[i] <= '9') {
                char c = (char) ((int) '0' + ((int) a[i] - (int) '0' + key1) % 10);
                System.out.print(c);
            } else {
                System.out.print(a[i]);
            }
        }
    }

    @Override
    public void jiamia(String c) {

    }

    @Override
    public void jiemia() {

    }
}

