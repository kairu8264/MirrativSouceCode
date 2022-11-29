package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class uh3 {

    /* renamed from: d  reason: collision with root package name */
    public static volatile int f10712d = 100;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f10713e = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f10714a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10715b = f10712d;

    /* renamed from: c  reason: collision with root package name */
    public vh3 f10716c;

    public /* synthetic */ uh3(sh3 sh3Var) {
    }

    public static uh3 d(byte[] bArr, int i10, int i11, boolean z10) {
        ph3 ph3Var = new ph3(bArr, i10, i11, z10, null);
        try {
            ph3Var.A(i11);
            return ph3Var;
        } catch (zzggm e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int e(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long f(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public abstract int A(int i10) throws zzggm;

    public abstract void a(int i10);

    public abstract boolean b() throws IOException;

    public abstract int c();

    public abstract int g() throws IOException;

    public abstract void h(int i10) throws zzggm;

    public abstract boolean i(int i10) throws IOException;

    public abstract double j() throws IOException;

    public abstract float k() throws IOException;

    public abstract long l() throws IOException;

    public abstract long m() throws IOException;

    public abstract int n() throws IOException;

    public abstract long o() throws IOException;

    public abstract int p() throws IOException;

    public abstract boolean q() throws IOException;

    public abstract String r() throws IOException;

    public abstract String s() throws IOException;

    public abstract oh3 t() throws IOException;

    public abstract int u() throws IOException;

    public abstract int v() throws IOException;

    public abstract int w() throws IOException;

    public abstract long x() throws IOException;

    public abstract int y() throws IOException;

    public abstract long z() throws IOException;
}
