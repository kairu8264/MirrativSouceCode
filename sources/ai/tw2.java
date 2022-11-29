package ai;

/* loaded from: classes3.dex */
public final class tw2 {
    public static String a(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (d(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (d(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String b(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (c(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static boolean c(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    public static boolean d(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    public static boolean e(CharSequence charSequence, CharSequence charSequence2) {
        int f10;
        int length = "content-length".length();
        if (charSequence2 == "content-length") {
            return true;
        }
        if (length == charSequence2.length()) {
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = "content-length".charAt(i10);
                char charAt2 = charSequence2.charAt(i10);
                if (charAt != charAt2 && ((f10 = f(charAt)) >= 26 || f10 != f(charAt2))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static int f(char c10) {
        return (char) ((c10 | ' ') - 97);
    }
}
