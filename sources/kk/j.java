package kk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class j {
    public static String a(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0) {
            return m.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return m.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    public static String b(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0) {
            return m.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return m.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    public static String c(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i12) {
            return b(i10, i12, "start index");
        }
        return (i11 < 0 || i11 > i12) ? b(i11, i12, "end index") : m.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public static void d(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z10, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z10, @NullableDecl String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(m.a(str, Long.valueOf(j10)));
        }
    }

    @CanIgnoreReturnValue
    public static int g(int i10, int i11) {
        return h(i10, i11, "index");
    }

    @CanIgnoreReturnValue
    public static int h(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a(i10, i11, str));
        }
        return i10;
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T i(@NonNullDecl T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T j(@NonNullDecl T t10, @NullableDecl Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @CanIgnoreReturnValue
    public static int k(int i10, int i11) {
        return l(i10, i11, "index");
    }

    @CanIgnoreReturnValue
    public static int l(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b(i10, i11, str));
        }
        return i10;
    }

    public static void m(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(c(i10, i11, i12));
        }
    }

    public static void n(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void o(boolean z10, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void p(boolean z10, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalStateException(m.a(str, obj));
        }
    }
}
