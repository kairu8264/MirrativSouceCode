package ai;

import android.util.Log;

/* loaded from: classes3.dex */
public final class my3 implements ly3 {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f7111a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f7112b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7113c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7114d;

    public my3(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f7111a = jArr;
        this.f7112b = jArr2;
        this.f7113c = j10;
        this.f7114d = j11;
    }

    public static my3 e(long j10, long j11, fw3 fw3Var, hb hbVar) {
        int v10;
        hbVar.s(10);
        int D = hbVar.D();
        if (D <= 0) {
            return null;
        }
        int i10 = fw3Var.f4233d;
        long h10 = sb.h(D, (i10 >= 32000 ? 1152 : 576) * 1000000, i10);
        int w10 = hbVar.w();
        int w11 = hbVar.w();
        int w12 = hbVar.w();
        hbVar.s(2);
        long j12 = j11 + fw3Var.f4232c;
        long[] jArr = new long[w10];
        long[] jArr2 = new long[w10];
        int i11 = 0;
        long j13 = j11;
        while (i11 < w10) {
            int i12 = w11;
            long j14 = j12;
            jArr[i11] = (i11 * h10) / w10;
            jArr2[i11] = Math.max(j13, j14);
            if (w12 == 1) {
                v10 = hbVar.v();
            } else if (w12 == 2) {
                v10 = hbVar.w();
            } else if (w12 == 3) {
                v10 = hbVar.z();
            } else if (w12 != 4) {
                return null;
            } else {
                v10 = hbVar.b();
            }
            j13 += v10 * i12;
            i11++;
            j12 = j14;
            w11 = i12;
        }
        if (j10 != -1 && j10 != j13) {
            StringBuilder sb2 = new StringBuilder(67);
            sb2.append("VBRI data size mismatch: ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j13);
            Log.w("VbriSeeker", sb2.toString());
        }
        return new my3(jArr, jArr2, h10, j13);
    }

    @Override // ai.lw3
    public final jw3 a(long j10) {
        int d10 = sb.d(this.f7111a, j10, true, true);
        mw3 mw3Var = new mw3(this.f7111a[d10], this.f7112b[d10]);
        if (mw3Var.f7082a < j10) {
            long[] jArr = this.f7111a;
            if (d10 != jArr.length - 1) {
                int i10 = d10 + 1;
                return new jw3(mw3Var, new mw3(jArr[i10], this.f7112b[i10]));
            }
        }
        return new jw3(mw3Var, mw3Var);
    }

    @Override // ai.ly3
    public final long b() {
        return this.f7114d;
    }

    @Override // ai.lw3
    public final boolean c() {
        return true;
    }

    @Override // ai.ly3
    public final long d(long j10) {
        return this.f7111a[sb.d(this.f7112b, j10, true, true)];
    }

    @Override // ai.lw3
    public final long f() {
        return this.f7113c;
    }
}
