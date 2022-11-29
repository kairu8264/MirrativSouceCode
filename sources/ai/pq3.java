package ai;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzfi;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class pq3 implements pw3 {
    public v4 A;
    public boolean B;
    public boolean C;
    public lr2 D;

    /* renamed from: a  reason: collision with root package name */
    public final jq3 f8502a;

    /* renamed from: d  reason: collision with root package name */
    public final kq2 f8505d;

    /* renamed from: e  reason: collision with root package name */
    public final hl2 f8506e;

    /* renamed from: f  reason: collision with root package name */
    public final Looper f8507f;

    /* renamed from: g  reason: collision with root package name */
    public oq3 f8508g;

    /* renamed from: h  reason: collision with root package name */
    public v4 f8509h;

    /* renamed from: p  reason: collision with root package name */
    public int f8517p;

    /* renamed from: q  reason: collision with root package name */
    public int f8518q;

    /* renamed from: r  reason: collision with root package name */
    public int f8519r;

    /* renamed from: s  reason: collision with root package name */
    public int f8520s;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8524w;

    /* renamed from: z  reason: collision with root package name */
    public v4 f8527z;

    /* renamed from: b  reason: collision with root package name */
    public final mq3 f8503b = new mq3();

    /* renamed from: i  reason: collision with root package name */
    public int f8510i = 1000;

    /* renamed from: j  reason: collision with root package name */
    public int[] f8511j = new int[1000];

    /* renamed from: k  reason: collision with root package name */
    public long[] f8512k = new long[1000];

    /* renamed from: n  reason: collision with root package name */
    public long[] f8515n = new long[1000];

    /* renamed from: m  reason: collision with root package name */
    public int[] f8514m = new int[1000];

    /* renamed from: l  reason: collision with root package name */
    public int[] f8513l = new int[1000];

    /* renamed from: o  reason: collision with root package name */
    public ow3[] f8516o = new ow3[1000];

    /* renamed from: c  reason: collision with root package name */
    public final wq3<nq3> f8504c = new wq3<>(kq3.f6341a);

    /* renamed from: t  reason: collision with root package name */
    public long f8521t = Long.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    public long f8522u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    public long f8523v = Long.MIN_VALUE;

    /* renamed from: y  reason: collision with root package name */
    public boolean f8526y = true;

    /* renamed from: x  reason: collision with root package name */
    public boolean f8525x = true;

    public pq3(is3 is3Var, Looper looper, kq2 kq2Var, hl2 hl2Var, byte[] bArr) {
        this.f8507f = looper;
        this.f8505d = kq2Var;
        this.f8506e = hl2Var;
        this.f8502a = new jq3(is3Var, null);
    }

    public final synchronized long A() {
        return this.f8523v;
    }

    public final synchronized boolean B() {
        return this.f8524w;
    }

    public final synchronized boolean C(boolean z10) {
        boolean z11 = true;
        if (m()) {
            if (this.f8504c.a(this.f8518q + this.f8520s).f7443a != this.f8509h) {
                return true;
            }
            return o(r(this.f8520s));
        }
        if (!z10 && !this.f8524w) {
            v4 v4Var = this.A;
            if (v4Var == null) {
                z11 = false;
            } else if (v4Var == this.f8509h) {
                return false;
            }
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r9 != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int D(ai.w4 r9, ai.a4 r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            ai.mq3 r7 = r8.f8503b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.g(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.c()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            ai.jq3 r9 = r8.f8502a
            ai.mq3 r11 = r8.f8503b
            r9.d(r10, r11)
            goto L3d
        L2c:
            ai.jq3 r9 = r8.f8502a
            ai.mq3 r11 = r8.f8503b
            r9.c(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.f8520s
            int r9 = r9 + r1
            r8.f8520s = r9
            return r12
        L3d:
            r9 = r12
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.pq3.D(ai.w4, ai.a4, int, boolean):int");
    }

    public final synchronized boolean E(long j10, boolean z10) {
        L();
        int r10 = r(this.f8520s);
        if (!m() || j10 < this.f8515n[r10] || (j10 > this.f8523v && !z10)) {
            return false;
        }
        int p10 = p(r10, this.f8517p - this.f8520s, j10, true);
        if (p10 == -1) {
            return false;
        }
        this.f8521t = j10;
        this.f8520s += p10;
        return true;
    }

    public final synchronized int F(long j10, boolean z10) {
        int r10 = r(this.f8520s);
        if (m() && j10 >= this.f8515n[r10]) {
            if (j10 > this.f8523v && z10) {
                return this.f8517p - this.f8520s;
            }
            int p10 = p(r10, this.f8517p - this.f8520s, j10, true);
            if (p10 == -1) {
                return 0;
            }
            return p10;
        }
        return 0;
    }

    public final synchronized void G(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.f8520s + i10 <= this.f8517p) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        u9.a(z10);
        this.f8520s += i10;
    }

    public final void H(long j10, boolean z10, boolean z11) {
        this.f8502a.e(i(j10, false, z11));
    }

    public final void I() {
        this.f8502a.e(j());
    }

    public final void J(oq3 oq3Var) {
        this.f8508g = oq3Var;
    }

    public final synchronized void L() {
        this.f8520s = 0;
        this.f8502a.b();
    }

    @Override // ai.pw3
    public final void a(hb hbVar, int i10) {
        nw3.b(this, hbVar, i10);
    }

    @Override // ai.pw3
    public final void b(v4 v4Var) {
        this.f8527z = v4Var;
        boolean h10 = h(v4Var);
        oq3 oq3Var = this.f8508g;
        if (oq3Var == null || !h10) {
            return;
        }
        oq3Var.n(v4Var);
    }

    @Override // ai.pw3
    public final int c(a6 a6Var, int i10, boolean z10) throws IOException {
        return nw3.a(this, a6Var, i10, true);
    }

    @Override // ai.pw3
    public final void d(hb hbVar, int i10, int i11) {
        this.f8502a.h(hbVar, i10);
    }

    @Override // ai.pw3
    public final void e(long j10, int i10, int i11, int i12, ow3 ow3Var) {
        int i13 = i10 & 1;
        if (this.f8525x) {
            if (i13 == 0) {
                return;
            }
            this.f8525x = false;
        }
        if (this.B) {
            if (j10 < this.f8521t) {
                return;
            }
            if (i13 == 0) {
                if (!this.C) {
                    Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.A)));
                    this.C = true;
                }
                i10 |= 1;
            }
        }
        l(j10, i10, (this.f8502a.f() - i11) - i12, i11, ow3Var);
    }

    @Override // ai.pw3
    public final int f(a6 a6Var, int i10, boolean z10, int i11) throws IOException {
        return this.f8502a.g(a6Var, i10, z10);
    }

    public final synchronized int g(w4 w4Var, a4 a4Var, boolean z10, boolean z11, mq3 mq3Var) {
        a4Var.f1724d = false;
        if (!m()) {
            if (!z11 && !this.f8524w) {
                v4 v4Var = this.A;
                if (v4Var == null || (!z10 && v4Var == this.f8509h)) {
                    return -3;
                }
                n(v4Var, w4Var);
                return -5;
            }
            a4Var.f(4);
            return -4;
        }
        v4 v4Var2 = this.f8504c.a(this.f8518q + this.f8520s).f7443a;
        if (!z10 && v4Var2 == this.f8509h) {
            int r10 = r(this.f8520s);
            if (!o(r10)) {
                a4Var.f1724d = true;
                return -3;
            }
            a4Var.f(this.f8514m[r10]);
            long j10 = this.f8515n[r10];
            a4Var.f1725e = j10;
            if (j10 < this.f8521t) {
                a4Var.g(Integer.MIN_VALUE);
            }
            mq3Var.f7008a = this.f8513l[r10];
            mq3Var.f7009b = this.f8512k[r10];
            mq3Var.f7010c = this.f8516o[r10];
            return -4;
        }
        n(v4Var2, w4Var);
        return -5;
    }

    public final synchronized boolean h(v4 v4Var) {
        this.f8526y = false;
        if (sb.H(v4Var, this.A)) {
            return false;
        }
        if (!this.f8504c.f() && this.f8504c.c().f7443a.equals(v4Var)) {
            this.A = this.f8504c.c().f7443a;
        } else {
            this.A = v4Var;
        }
        v4 v4Var2 = this.A;
        this.B = ua.c(v4Var2.f10960l, v4Var2.f10957i);
        this.C = false;
        return true;
    }

    public final synchronized long i(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f8517p;
        if (i11 != 0) {
            long[] jArr = this.f8515n;
            int i12 = this.f8519r;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f8520s) != i11) {
                    i11 = i10 + 1;
                }
                int p10 = p(i12, i11, j10, false);
                if (p10 == -1) {
                    return -1L;
                }
                return q(p10);
            }
        }
        return -1L;
    }

    public final synchronized long j() {
        int i10 = this.f8517p;
        if (i10 == 0) {
            return -1L;
        }
        return q(i10);
    }

    public final void k() {
        if (this.D != null) {
            this.D = null;
            this.f8509h = null;
        }
    }

    public final synchronized void l(long j10, int i10, long j11, int i11, ow3 ow3Var) {
        int i12 = this.f8517p;
        if (i12 > 0) {
            int r10 = r(i12 - 1);
            u9.a(this.f8512k[r10] + ((long) this.f8513l[r10]) <= j11);
        }
        this.f8524w = (536870912 & i10) != 0;
        this.f8523v = Math.max(this.f8523v, j10);
        int r11 = r(this.f8517p);
        this.f8515n[r11] = j10;
        this.f8512k[r11] = j11;
        this.f8513l[r11] = i11;
        this.f8514m[r11] = i10;
        this.f8516o[r11] = ow3Var;
        this.f8511j[r11] = 0;
        if (this.f8504c.f() || !this.f8504c.c().f7443a.equals(this.A)) {
            jp2 jp2Var = jp2.f5881a;
            wq3<nq3> wq3Var = this.f8504c;
            int i13 = this.f8518q + this.f8517p;
            v4 v4Var = this.A;
            Objects.requireNonNull(v4Var);
            wq3Var.b(i13, new nq3(v4Var, jp2Var, null));
        }
        int i14 = this.f8517p + 1;
        this.f8517p = i14;
        int i15 = this.f8510i;
        if (i14 == i15) {
            int i16 = i15 + 1000;
            int[] iArr = new int[i16];
            long[] jArr = new long[i16];
            long[] jArr2 = new long[i16];
            int[] iArr2 = new int[i16];
            int[] iArr3 = new int[i16];
            ow3[] ow3VarArr = new ow3[i16];
            int i17 = this.f8519r;
            int i18 = i15 - i17;
            System.arraycopy(this.f8512k, i17, jArr, 0, i18);
            System.arraycopy(this.f8515n, this.f8519r, jArr2, 0, i18);
            System.arraycopy(this.f8514m, this.f8519r, iArr2, 0, i18);
            System.arraycopy(this.f8513l, this.f8519r, iArr3, 0, i18);
            System.arraycopy(this.f8516o, this.f8519r, ow3VarArr, 0, i18);
            System.arraycopy(this.f8511j, this.f8519r, iArr, 0, i18);
            int i19 = this.f8519r;
            System.arraycopy(this.f8512k, 0, jArr, i18, i19);
            System.arraycopy(this.f8515n, 0, jArr2, i18, i19);
            System.arraycopy(this.f8514m, 0, iArr2, i18, i19);
            System.arraycopy(this.f8513l, 0, iArr3, i18, i19);
            System.arraycopy(this.f8516o, 0, ow3VarArr, i18, i19);
            System.arraycopy(this.f8511j, 0, iArr, i18, i19);
            this.f8512k = jArr;
            this.f8515n = jArr2;
            this.f8514m = iArr2;
            this.f8513l = iArr3;
            this.f8516o = ow3VarArr;
            this.f8511j = iArr;
            this.f8519r = 0;
            this.f8510i = i16;
        }
    }

    public final boolean m() {
        return this.f8520s != this.f8517p;
    }

    public final void n(v4 v4Var, w4 w4Var) {
        v4 v4Var2 = this.f8509h;
        ru3 ru3Var = v4Var2 == null ? null : v4Var2.f10963o;
        this.f8509h = v4Var;
        ru3 ru3Var2 = v4Var.f10963o;
        w4Var.f11484a = v4Var.b(this.f8505d.a(v4Var));
        w4Var.f11485b = this.D;
        if (v4Var2 == null || !sb.H(ru3Var, ru3Var2)) {
            lr2 lr2Var = v4Var.f10963o != null ? new lr2(new zzey(new zzfi(1), 6001)) : null;
            this.D = lr2Var;
            w4Var.f11485b = lr2Var;
        }
    }

    public final boolean o(int i10) {
        if (this.D != null) {
            return (this.f8514m[i10] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    public final int p(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f8515n[i10] > j10 ? 1 : (this.f8515n[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.f8514m[i10] & 1) != 0) {
                i12 = i13;
                if (i14 == 0) {
                    break;
                }
            }
            i10++;
            if (i10 == this.f8510i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final long q(int i10) {
        int i11;
        long j10 = this.f8522u;
        long j11 = Long.MIN_VALUE;
        if (i10 != 0) {
            int r10 = r(i10 - 1);
            for (int i12 = 0; i12 < i10; i12++) {
                j11 = Math.max(j11, this.f8515n[r10]);
                if ((this.f8514m[r10] & 1) != 0) {
                    break;
                }
                r10--;
                if (r10 == -1) {
                    r10 = this.f8510i - 1;
                }
            }
        }
        this.f8522u = Math.max(j10, j11);
        this.f8517p -= i10;
        int i13 = this.f8518q + i10;
        this.f8518q = i13;
        int i14 = this.f8519r + i10;
        this.f8519r = i14;
        int i15 = this.f8510i;
        if (i14 >= i15) {
            this.f8519r = i14 - i15;
        }
        int i16 = this.f8520s - i10;
        this.f8520s = i16;
        if (i16 < 0) {
            this.f8520s = 0;
        }
        this.f8504c.d(i13);
        if (this.f8517p == 0) {
            int i17 = this.f8519r;
            if (i17 == 0) {
                i17 = this.f8510i;
            }
            return this.f8512k[i17 - 1] + this.f8513l[i11];
        }
        return this.f8512k[this.f8519r];
    }

    public final int r(int i10) {
        int i11 = this.f8519r + i10;
        int i12 = this.f8510i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final void s() {
        t(true);
        k();
    }

    public final void t(boolean z10) {
        this.f8502a.a();
        this.f8517p = 0;
        this.f8518q = 0;
        this.f8519r = 0;
        this.f8520s = 0;
        this.f8525x = true;
        this.f8521t = Long.MIN_VALUE;
        this.f8522u = Long.MIN_VALUE;
        this.f8523v = Long.MIN_VALUE;
        this.f8524w = false;
        this.f8504c.e();
        if (z10) {
            this.f8527z = null;
            this.A = null;
            this.f8526y = true;
        }
    }

    public final void u(long j10) {
        this.f8521t = j10;
    }

    public final int v() {
        return this.f8518q + this.f8517p;
    }

    public final void w() {
        I();
        k();
    }

    public final void x() throws IOException {
        lr2 lr2Var = this.D;
        if (lr2Var != null) {
            throw lr2Var.a();
        }
    }

    public final int y() {
        return this.f8518q + this.f8520s;
    }

    public final synchronized v4 z() {
        if (this.f8526y) {
            return null;
        }
        return this.A;
    }
}
