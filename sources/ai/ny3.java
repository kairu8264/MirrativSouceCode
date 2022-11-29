package ai;

import android.util.Log;

/* loaded from: classes3.dex */
public final class ny3 implements ly3 {

    /* renamed from: a  reason: collision with root package name */
    public final long f7576a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7577b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7578c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7579d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7580e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f7581f;

    public ny3(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f7576a = j10;
        this.f7577b = i10;
        this.f7578c = j11;
        this.f7581f = jArr;
        this.f7579d = j12;
        this.f7580e = j12 != -1 ? j10 + j12 : -1L;
    }

    public static ny3 e(long j10, long j11, fw3 fw3Var, hb hbVar) {
        int b10;
        int i10 = fw3Var.f4236g;
        int i11 = fw3Var.f4233d;
        int D = hbVar.D();
        if ((D & 1) != 1 || (b10 = hbVar.b()) == 0) {
            return null;
        }
        long h10 = sb.h(b10, i10 * 1000000, i11);
        if ((D & 6) != 6) {
            return new ny3(j11, fw3Var.f4232c, h10, -1L, null);
        }
        long B = hbVar.B();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = hbVar.v();
        }
        if (j10 != -1) {
            long j12 = j11 + B;
            if (j10 != j12) {
                StringBuilder sb2 = new StringBuilder(67);
                sb2.append("XING data size mismatch: ");
                sb2.append(j10);
                sb2.append(", ");
                sb2.append(j12);
                Log.w("XingSeeker", sb2.toString());
            }
        }
        return new ny3(j11, fw3Var.f4232c, h10, B, jArr);
    }

    @Override // ai.lw3
    public final jw3 a(long j10) {
        long[] jArr;
        if (!c()) {
            mw3 mw3Var = new mw3(0L, this.f7576a + this.f7577b);
            return new jw3(mw3Var, mw3Var);
        }
        long d02 = sb.d0(j10, 0L, this.f7578c);
        double d10 = (d02 * 100.0d) / this.f7578c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) u9.e(this.f7581f))[i10];
                d11 = d12 + ((d10 - i10) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        mw3 mw3Var2 = new mw3(d02, this.f7576a + sb.d0(Math.round((d11 / 256.0d) * this.f7579d), this.f7577b, this.f7579d - 1));
        return new jw3(mw3Var2, mw3Var2);
    }

    @Override // ai.ly3
    public final long b() {
        return this.f7580e;
    }

    @Override // ai.lw3
    public final boolean c() {
        return this.f7581f != null;
    }

    @Override // ai.ly3
    public final long d(long j10) {
        long j11 = j10 - this.f7576a;
        if (!c() || j11 <= this.f7577b) {
            return 0L;
        }
        long[] jArr = (long[]) u9.e(this.f7581f);
        double d10 = (j11 * 256.0d) / this.f7579d;
        int d11 = sb.d(jArr, (long) d10, true, true);
        long g10 = g(d11);
        long j12 = jArr[d11];
        int i10 = d11 + 1;
        long g11 = g(i10);
        long j13 = d11 == 99 ? 256L : jArr[i10];
        return g10 + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (g11 - g10));
    }

    @Override // ai.lw3
    public final long f() {
        return this.f7578c;
    }

    public final long g(int i10) {
        return (this.f7578c * i10) / 100;
    }
}
