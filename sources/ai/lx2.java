package ai;

/* loaded from: classes3.dex */
public final class lx2 {
    public static void a(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static <T> T c(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException((String) obj);
    }

    public static <T> T d(T t10, String str, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(xx2.d(str, obj));
    }

    public static int e(int i10, int i11, String str) {
        String d10;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                d10 = xx2.d("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else if (i11 < 0) {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("negative size: ");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            } else {
                d10 = xx2.d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(d10);
        }
        return i10;
    }

    public static int f(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(h(i10, i11, "index"));
        }
        return i10;
    }

    public static void g(int i10, int i11, int i12) {
        String h10;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 >= 0 && i10 <= i12) {
                h10 = (i11 < 0 || i11 > i12) ? h(i11, i12, "end index") : xx2.d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                h10 = h(i10, i12, "start index");
            }
            throw new IndexOutOfBoundsException(h10);
        }
    }

    public static String h(int i10, int i11, String str) {
        if (i10 < 0) {
            return xx2.d("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return xx2.d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }
}
