package dk;

/* loaded from: classes3.dex */
public final class w {
    public static <T> T a(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException((String) obj);
    }

    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
