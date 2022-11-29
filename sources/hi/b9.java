package hi;

import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.measurement.zzkh;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class b9 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f35663a = Charset.forName(C.ASCII_NAME);

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f35664b = Charset.forName(C.UTF8_NAME);

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f35665c = Charset.forName(C.ISO88591_NAME);

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f35666d;

    /* renamed from: e  reason: collision with root package name */
    public static final ByteBuffer f35667e;

    /* renamed from: f  reason: collision with root package name */
    public static final y7 f35668f;

    static {
        byte[] bArr = new byte[0];
        f35666d = bArr;
        f35667e = ByteBuffer.wrap(bArr);
        int i10 = y7.f36074a;
        w7 w7Var = new w7(bArr, 0, 0, false, null);
        try {
            w7Var.c(0);
            f35668f = w7Var;
        } catch (zzkh e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int d10 = d(length, bArr, 0, length);
        if (d10 == 0) {
            return 1;
        }
        return d10;
    }

    public static int c(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int d(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static <T> T e(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T f(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static Object g(Object obj, Object obj2) {
        return ((w9) obj).u0().V0((w9) obj2).S();
    }

    public static String h(byte[] bArr) {
        return new String(bArr, f35664b);
    }

    public static boolean i(byte[] bArr) {
        return kb.e(bArr);
    }
}
