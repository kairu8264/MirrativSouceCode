package ai;

import com.google.android.gms.internal.ads.zzaha;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class dx3 implements mv3 {

    /* renamed from: n  reason: collision with root package name */
    public static final sv3 f3436n = cx3.f3069a;

    /* renamed from: d  reason: collision with root package name */
    public pv3 f3440d;

    /* renamed from: e  reason: collision with root package name */
    public pw3 f3441e;

    /* renamed from: g  reason: collision with root package name */
    public v7 f3443g;

    /* renamed from: h  reason: collision with root package name */
    public zv3 f3444h;

    /* renamed from: i  reason: collision with root package name */
    public int f3445i;

    /* renamed from: j  reason: collision with root package name */
    public int f3446j;

    /* renamed from: k  reason: collision with root package name */
    public bx3 f3447k;

    /* renamed from: l  reason: collision with root package name */
    public int f3448l;

    /* renamed from: m  reason: collision with root package name */
    public long f3449m;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f3437a = new byte[42];

    /* renamed from: b  reason: collision with root package name */
    public final hb f3438b = new hb(new byte[32768], 0);

    /* renamed from: c  reason: collision with root package name */
    public final tv3 f3439c = new tv3();

    /* renamed from: f  reason: collision with root package name */
    public int f3442f = 0;

    public dx3(int i10) {
    }

    public final long a(hb hbVar, boolean z10) {
        boolean z11;
        Objects.requireNonNull(this.f3444h);
        int o10 = hbVar.o();
        while (o10 <= hbVar.m() - 16) {
            hbVar.p(o10);
            if (uv3.a(hbVar, this.f3444h, this.f3446j, this.f3439c)) {
                hbVar.p(o10);
                return this.f3439c.f10481a;
            }
            o10++;
        }
        if (z10) {
            while (o10 <= hbVar.m() - this.f3445i) {
                hbVar.p(o10);
                try {
                    z11 = uv3.a(hbVar, this.f3444h, this.f3446j, this.f3439c);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (hbVar.o() <= hbVar.m() && z11) {
                    hbVar.p(o10);
                    return this.f3439c.f10481a;
                }
                o10++;
            }
            hbVar.p(hbVar.m());
            return -1L;
        }
        hbVar.p(o10);
        return -1L;
    }

    public final void b() {
        long j10 = this.f3449m;
        zv3 zv3Var = this.f3444h;
        int i10 = sb.f9778a;
        this.f3441e.e((j10 * 1000000) / zv3Var.f13216e, 1, this.f3448l, 0, null);
    }

    @Override // ai.mv3
    public final int e(nv3 nv3Var, iw3 iw3Var) throws IOException {
        boolean g10;
        zv3 zv3Var;
        lw3 kw3Var;
        boolean z10;
        int i10 = this.f3442f;
        if (i10 == 0) {
            nv3Var.j();
            long k10 = nv3Var.k();
            v7 a10 = wv3.a(nv3Var, true);
            ((hv3) nv3Var).q((int) (nv3Var.k() - k10), false);
            this.f3443g = a10;
            this.f3442f = 1;
            return 0;
        } else if (i10 == 1) {
            ((hv3) nv3Var).c(this.f3437a, 0, 42, false);
            nv3Var.j();
            this.f3442f = 2;
            return 0;
        } else if (i10 == 2) {
            hb hbVar = new hb(4);
            ((hv3) nv3Var).f(hbVar.q(), 0, 4, false);
            if (hbVar.B() == 1716281667) {
                this.f3442f = 3;
                return 0;
            }
            throw zzaha.b("Failed to read FLAC stream marker.", null);
        } else if (i10 == 3) {
            vv3 vv3Var = new vv3(this.f3444h);
            do {
                nv3Var.j();
                gb gbVar = new gb(new byte[4], 4);
                hv3 hv3Var = (hv3) nv3Var;
                hv3Var.c(gbVar.f4375a, 0, 4, false);
                g10 = gbVar.g();
                int h10 = gbVar.h(7);
                int h11 = gbVar.h(24) + 4;
                if (h10 == 0) {
                    byte[] bArr = new byte[38];
                    hv3Var.f(bArr, 0, 38, false);
                    vv3Var.f11391a = new zv3(bArr, 4);
                } else {
                    zv3 zv3Var2 = vv3Var.f11391a;
                    if (zv3Var2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (h10 == 3) {
                        hb hbVar2 = new hb(h11);
                        hv3Var.f(hbVar2.q(), 0, h11, false);
                        vv3Var.f11391a = zv3Var2.e(wv3.b(hbVar2));
                    } else if (h10 == 4) {
                        hb hbVar3 = new hb(h11);
                        hv3Var.f(hbVar3.q(), 0, h11, false);
                        hbVar3.s(4);
                        vv3Var.f11391a = zv3Var2.f(Arrays.asList(vw3.b(hbVar3, false, false).f9614b));
                    } else if (h10 == 6) {
                        hb hbVar4 = new hb(h11);
                        hv3Var.f(hbVar4.q(), 0, h11, false);
                        hbVar4.s(4);
                        int D = hbVar4.D();
                        String e10 = hbVar4.e(hbVar4.D(), zw2.f13230a);
                        String e11 = hbVar4.e(hbVar4.D(), zw2.f13232c);
                        int D2 = hbVar4.D();
                        int D3 = hbVar4.D();
                        int D4 = hbVar4.D();
                        int D5 = hbVar4.D();
                        int D6 = hbVar4.D();
                        byte[] bArr2 = new byte[D6];
                        hbVar4.u(bArr2, 0, D6);
                        vv3Var.f11391a = zv3Var2.g(Collections.singletonList(new d8(D, e10, e11, D2, D3, D4, D5, bArr2)));
                    } else {
                        hv3Var.q(h11, false);
                    }
                }
                zv3Var = vv3Var.f11391a;
                int i11 = sb.f9778a;
                this.f3444h = zv3Var;
            } while (!g10);
            Objects.requireNonNull(zv3Var);
            this.f3445i = Math.max(zv3Var.f13214c, 6);
            this.f3441e.b(this.f3444h.c(this.f3437a, this.f3443g));
            this.f3442f = 4;
            return 0;
        } else if (i10 != 4) {
            Objects.requireNonNull(this.f3441e);
            Objects.requireNonNull(this.f3444h);
            bx3 bx3Var = this.f3447k;
            if (bx3Var == null || !bx3Var.c()) {
                if (this.f3449m == -1) {
                    this.f3449m = uv3.b(nv3Var, this.f3444h);
                    return 0;
                }
                int m10 = this.f3438b.m();
                if (m10 < 32768) {
                    int b10 = nv3Var.b(this.f3438b.q(), m10, 32768 - m10);
                    z10 = b10 == -1;
                    if (!z10) {
                        this.f3438b.n(m10 + b10);
                    } else if (this.f3438b.l() == 0) {
                        b();
                        return -1;
                    }
                } else {
                    z10 = false;
                }
                int o10 = this.f3438b.o();
                int i12 = this.f3448l;
                int i13 = this.f3445i;
                if (i12 < i13) {
                    hb hbVar5 = this.f3438b;
                    hbVar5.s(Math.min(i13 - i12, hbVar5.l()));
                }
                long a11 = a(this.f3438b, z10);
                int o11 = this.f3438b.o() - o10;
                this.f3438b.p(o10);
                nw3.b(this.f3441e, this.f3438b, o11);
                this.f3448l += o11;
                if (a11 != -1) {
                    b();
                    this.f3448l = 0;
                    this.f3449m = a11;
                }
                if (this.f3438b.l() >= 16) {
                    return 0;
                }
                int l10 = this.f3438b.l();
                System.arraycopy(this.f3438b.q(), this.f3438b.o(), this.f3438b.q(), 0, l10);
                this.f3438b.p(0);
                this.f3438b.n(l10);
                return 0;
            }
            return this.f3447k.d(nv3Var, iw3Var);
        } else {
            nv3Var.j();
            hb hbVar6 = new hb(2);
            ((hv3) nv3Var).c(hbVar6.q(), 0, 2, false);
            int w10 = hbVar6.w();
            if ((w10 >> 2) == 16382) {
                nv3Var.j();
                this.f3446j = w10;
                pv3 pv3Var = this.f3440d;
                int i14 = sb.f9778a;
                long n10 = nv3Var.n();
                long o12 = nv3Var.o();
                zv3 zv3Var3 = this.f3444h;
                Objects.requireNonNull(zv3Var3);
                if (zv3Var3.f13222k != null) {
                    kw3Var = new xv3(zv3Var3, n10);
                } else if (o12 != -1 && zv3Var3.f13221j > 0) {
                    bx3 bx3Var2 = new bx3(zv3Var3, this.f3446j, n10, o12);
                    this.f3447k = bx3Var2;
                    kw3Var = bx3Var2.a();
                } else {
                    kw3Var = new kw3(zv3Var3.a(), 0L);
                }
                pv3Var.s(kw3Var);
                this.f3442f = 5;
                return 0;
            }
            nv3Var.j();
            throw zzaha.b("First frame does not start with sync code.", null);
        }
    }

    @Override // ai.mv3
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f3442f = 0;
        } else {
            bx3 bx3Var = this.f3447k;
            if (bx3Var != null) {
                bx3Var.b(j11);
            }
        }
        this.f3449m = j11 != 0 ? -1L : 0L;
        this.f3448l = 0;
        this.f3438b.i(0);
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.f3440d = pv3Var;
        this.f3441e = pv3Var.p(0, 1);
        pv3Var.x();
    }

    @Override // ai.mv3
    public final boolean i(nv3 nv3Var) throws IOException {
        wv3.a(nv3Var, false);
        hb hbVar = new hb(4);
        ((hv3) nv3Var).c(hbVar.q(), 0, 4, false);
        return hbVar.B() == 1716281667;
    }
}
