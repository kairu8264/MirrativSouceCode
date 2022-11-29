package ai;

/* loaded from: classes3.dex */
public final class kj {
    public static boolean a(String str) {
        return "audio".equals(c(str));
    }

    public static boolean b(String str) {
        return "video".equals(c(str));
    }

    public static String c(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf == -1) {
            if (str.length() != 0) {
                str2 = "Invalid mime type: ".concat(str);
            } else {
                str2 = new String("Invalid mime type: ");
            }
            throw new IllegalArgumentException(str2);
        }
        return str.substring(0, indexOf);
    }
}
