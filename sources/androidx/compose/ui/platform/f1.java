package androidx.compose.ui.platform;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f1 {
    public static final String a(Object obj, String str) {
        jo.p.h(obj, "obj");
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        jo.i0 i0Var = jo.i0.f38149a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        jo.p.g(format, "format(format, *args)");
        sb2.append(format);
        return sb2.toString();
    }
}
