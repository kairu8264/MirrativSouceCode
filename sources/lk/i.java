package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes3.dex */
public final class i {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 != null) {
        } else {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    @CanIgnoreReturnValue
    public static int b(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static void c(boolean z10) {
        kk.j.o(z10, "no calls to next() since the last call to remove()");
    }
}
