package ai;

/* loaded from: classes3.dex */
public final class xy2 {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String obj3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(obj3.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(obj3);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }

    public static int b(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }
}
