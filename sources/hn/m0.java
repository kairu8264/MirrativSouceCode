package hn;

/* loaded from: classes4.dex */
public class m0 {
    public static boolean a(char c10) {
        if (c10 == '\t' || c10 == ' ' || c10 == '\"' || c10 == ',' || c10 == '/' || c10 == '{' || c10 == '}' || c10 == '(' || c10 == ')') {
            return true;
        }
        switch (c10) {
            case ':':
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
                return true;
            default:
                switch (c10) {
                    case '[':
                    case '\\':
                    case ']':
                        return true;
                    default:
                        return false;
                }
        }
    }

    public static boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (a(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        if (str.indexOf(92) < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '\\' || z10) {
                sb2.append(charAt);
                z10 = false;
            } else {
                z10 = true;
            }
        }
        return sb2.toString();
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length < 2 || str.charAt(0) != '\"') {
            return str;
        }
        int i10 = length - 1;
        return str.charAt(i10) != '\"' ? str : c(str.substring(1, i10));
    }
}
