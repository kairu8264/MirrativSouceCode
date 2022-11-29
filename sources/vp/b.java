package vp;

import java.util.Iterator;

/* loaded from: classes4.dex */
public class b {
    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String b(Iterable<?> iterable, String str) {
        if (iterable == null) {
            return null;
        }
        return c(iterable.iterator(), str);
    }

    public static String c(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return a.b(next);
            }
            StringBuilder sb2 = new StringBuilder(256);
            if (next != null) {
                sb2.append(next);
            }
            while (it.hasNext()) {
                if (str != null) {
                    sb2.append(str);
                }
                Object next2 = it.next();
                if (next2 != null) {
                    sb2.append(next2);
                }
            }
            return sb2.toString();
        }
        return "";
    }
}
