package ai;

import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class bj3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f2374a = Charset.forName(C.UTF8_NAME);

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f2375b = Charset.forName(C.ISO88591_NAME);

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f2376c;

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f2377d;

    /* renamed from: e  reason: collision with root package name */
    public static final uh3 f2378e;

    static {
        byte[] bArr = new byte[0];
        f2376c = bArr;
        f2377d = ByteBuffer.wrap(bArr);
        int i10 = uh3.f10713e;
        f2378e = uh3.d(bArr, 0, 0, false);
    }

    public static <T> T a(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T b(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static boolean c(byte[] bArr) {
        return sl3.a(bArr);
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f2374a);
    }

    public static int e(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int f(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int g(byte[] bArr) {
        int length = bArr.length;
        int h10 = h(length, bArr, 0, length);
        if (h10 == 0) {
            return 1;
        }
        return h10;
    }

    public static int h(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static Object i(Object obj, Object obj2) {
        return ((xj3) obj).c().N0((xj3) obj2).P();
    }
}
