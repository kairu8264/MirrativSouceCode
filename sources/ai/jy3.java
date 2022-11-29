package ai;

import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzaha;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class jy3 implements mv3 {

    /* renamed from: q  reason: collision with root package name */
    public static final sv3 f5961q = hy3.f5043a;

    /* renamed from: r  reason: collision with root package name */
    public static final v8 f5962r = iy3.f5449a;

    /* renamed from: a  reason: collision with root package name */
    public final hb f5963a;

    /* renamed from: b  reason: collision with root package name */
    public final fw3 f5964b;

    /* renamed from: c  reason: collision with root package name */
    public final bw3 f5965c;

    /* renamed from: d  reason: collision with root package name */
    public final dw3 f5966d;

    /* renamed from: e  reason: collision with root package name */
    public final pw3 f5967e;

    /* renamed from: f  reason: collision with root package name */
    public pv3 f5968f;

    /* renamed from: g  reason: collision with root package name */
    public pw3 f5969g;

    /* renamed from: h  reason: collision with root package name */
    public pw3 f5970h;

    /* renamed from: i  reason: collision with root package name */
    public int f5971i;

    /* renamed from: j  reason: collision with root package name */
    public v7 f5972j;

    /* renamed from: k  reason: collision with root package name */
    public long f5973k;

    /* renamed from: l  reason: collision with root package name */
    public long f5974l;

    /* renamed from: m  reason: collision with root package name */
    public long f5975m;

    /* renamed from: n  reason: collision with root package name */
    public int f5976n;

    /* renamed from: o  reason: collision with root package name */
    public ly3 f5977o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5978p;

    public jy3() {
        this(0);
    }

    public static boolean k(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    public final void a() {
        this.f5978p = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(ai.nv3 r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.jy3.b(ai.nv3):int");
    }

    public final long c(long j10) {
        return this.f5973k + ((j10 * 1000000) / this.f5964b.f4233d);
    }

    public final boolean d(nv3 nv3Var, boolean z10) throws IOException {
        int i10;
        int i11;
        int h10;
        int i12 = true != z10 ? 131072 : 32768;
        nv3Var.j();
        if (nv3Var.n() == 0) {
            v7 a10 = this.f5966d.a(nv3Var, null);
            this.f5972j = a10;
            if (a10 != null) {
                this.f5965c.a(a10);
            }
            i10 = (int) nv3Var.k();
            if (!z10) {
                ((hv3) nv3Var).q(i10, false);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i13 = i11;
        int i14 = i13;
        while (true) {
            if (!f(nv3Var)) {
                this.f5963a.p(0);
                int D = this.f5963a.D();
                if ((i11 == 0 || k(D, i11)) && (h10 = gw3.h(D)) != -1) {
                    i13++;
                    if (i13 != 1) {
                        if (i13 == 4) {
                            break;
                        }
                    } else {
                        this.f5964b.a(D);
                        i11 = D;
                    }
                    ((hv3) nv3Var).r(h10 - 4, false);
                } else {
                    int i15 = i14 + 1;
                    if (i14 == i12) {
                        if (z10) {
                            return false;
                        }
                        throw zzaha.b("Searched too many bytes.", null);
                    }
                    if (z10) {
                        nv3Var.j();
                        ((hv3) nv3Var).r(i10 + i15, false);
                    } else {
                        ((hv3) nv3Var).q(1, false);
                    }
                    i13 = 0;
                    i14 = i15;
                    i11 = 0;
                }
            } else if (i13 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            ((hv3) nv3Var).q(i10 + i14, false);
        } else {
            nv3Var.j();
        }
        this.f5971i = i11;
        return true;
    }

    @Override // ai.mv3
    public final int e(nv3 nv3Var, iw3 iw3Var) throws IOException {
        u9.e(this.f5969g);
        int i10 = sb.f9778a;
        int b10 = b(nv3Var);
        if (b10 == -1 && (this.f5977o instanceof fy3)) {
            if (this.f5977o.f() != c(this.f5974l)) {
                fy3 fy3Var = (fy3) this.f5977o;
                throw null;
            }
        }
        return b10;
    }

    public final boolean f(nv3 nv3Var) throws IOException {
        ly3 ly3Var = this.f5977o;
        if (ly3Var != null) {
            long b10 = ly3Var.b();
            if (b10 != -1 && nv3Var.k() > b10 - 4) {
                return true;
            }
        }
        try {
            return !nv3Var.c(this.f5963a.q(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // ai.mv3
    public final void g(long j10, long j11) {
        this.f5971i = 0;
        this.f5973k = C.TIME_UNSET;
        this.f5974l = 0L;
        this.f5976n = 0;
        ly3 ly3Var = this.f5977o;
        if (ly3Var instanceof fy3) {
            fy3 fy3Var = (fy3) ly3Var;
            throw null;
        }
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.f5968f = pv3Var;
        pw3 p10 = pv3Var.p(0, 1);
        this.f5969g = p10;
        this.f5970h = p10;
        this.f5968f.x();
    }

    @Override // ai.mv3
    public final boolean i(nv3 nv3Var) throws IOException {
        return d(nv3Var, true);
    }

    public final ly3 j(nv3 nv3Var, boolean z10) throws IOException {
        ((hv3) nv3Var).c(this.f5963a.q(), 0, 4, false);
        this.f5963a.p(0);
        this.f5964b.a(this.f5963a.D());
        return new ey3(nv3Var.o(), nv3Var.n(), this.f5964b, false);
    }

    public jy3(int i10) {
        this.f5963a = new hb(10);
        this.f5964b = new fw3();
        this.f5965c = new bw3();
        this.f5973k = C.TIME_UNSET;
        this.f5966d = new dw3();
        lv3 lv3Var = new lv3();
        this.f5967e = lv3Var;
        this.f5970h = lv3Var;
    }
}
