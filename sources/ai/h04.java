package ai;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes3.dex */
public abstract class h04 {

    /* renamed from: b  reason: collision with root package name */
    public pw3 f4677b;

    /* renamed from: c  reason: collision with root package name */
    public pv3 f4678c;

    /* renamed from: d  reason: collision with root package name */
    public c04 f4679d;

    /* renamed from: e  reason: collision with root package name */
    public long f4680e;

    /* renamed from: f  reason: collision with root package name */
    public long f4681f;

    /* renamed from: g  reason: collision with root package name */
    public long f4682g;

    /* renamed from: h  reason: collision with root package name */
    public int f4683h;

    /* renamed from: i  reason: collision with root package name */
    public int f4684i;

    /* renamed from: k  reason: collision with root package name */
    public long f4686k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4687l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4688m;

    /* renamed from: a  reason: collision with root package name */
    public final a04 f4676a = new a04();

    /* renamed from: j  reason: collision with root package name */
    public f04 f4685j = new f04();

    public void a(boolean z10) {
        int i10;
        if (z10) {
            this.f4685j = new f04();
            this.f4681f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f4683h = i10;
        this.f4680e = -1L;
        this.f4682g = 0L;
    }

    public abstract long b(hb hbVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean c(hb hbVar, long j10, f04 f04Var) throws IOException;

    public final void d(pv3 pv3Var, pw3 pw3Var) {
        this.f4678c = pv3Var;
        this.f4677b = pw3Var;
        a(true);
    }

    public final void e(long j10, long j11) {
        this.f4676a.a();
        if (j10 == 0) {
            a(!this.f4687l);
        } else if (this.f4683h != 0) {
            long h10 = h(j11);
            this.f4680e = h10;
            c04 c04Var = this.f4679d;
            int i10 = sb.f9778a;
            c04Var.a(h10);
            this.f4683h = 2;
        }
    }

    public final int f(nv3 nv3Var, iw3 iw3Var) throws IOException {
        u9.e(this.f4677b);
        int i10 = sb.f9778a;
        int i11 = this.f4683h;
        if (i11 == 0) {
            while (this.f4676a.b(nv3Var)) {
                this.f4686k = nv3Var.n() - this.f4681f;
                if (!c(this.f4676a.d(), this.f4681f, this.f4685j)) {
                    v4 v4Var = this.f4685j.f3873a;
                    this.f4684i = v4Var.f10974z;
                    if (!this.f4688m) {
                        this.f4677b.b(v4Var);
                        this.f4688m = true;
                    }
                    c04 c04Var = this.f4685j.f3874b;
                    if (c04Var != null) {
                        this.f4679d = c04Var;
                    } else if (nv3Var.o() == -1) {
                        this.f4679d = new g04(null);
                    } else {
                        b04 c10 = this.f4676a.c();
                        this.f4679d = new vz3(this, this.f4681f, nv3Var.o(), c10.f2183d + c10.f2184e, c10.f2181b, (c10.f2180a & 4) != 0);
                    }
                    this.f4683h = 2;
                    this.f4676a.e();
                    return 0;
                }
                this.f4681f = nv3Var.n();
            }
            this.f4683h = 3;
            return -1;
        } else if (i11 == 1) {
            ((hv3) nv3Var).q((int) this.f4681f, false);
            this.f4683h = 2;
            return 0;
        } else if (i11 != 2) {
            return -1;
        } else {
            long b10 = this.f4679d.b(nv3Var);
            if (b10 >= 0) {
                iw3Var.f5438a = b10;
                return 1;
            }
            if (b10 < -1) {
                i(-(b10 + 2));
            }
            if (!this.f4687l) {
                lw3 f10 = this.f4679d.f();
                u9.e(f10);
                this.f4678c.s(f10);
                this.f4687l = true;
            }
            if (this.f4686k <= 0 && !this.f4676a.b(nv3Var)) {
                this.f4683h = 3;
                return -1;
            }
            this.f4686k = 0L;
            hb d10 = this.f4676a.d();
            long b11 = b(d10);
            if (b11 >= 0) {
                long j10 = this.f4682g;
                if (j10 + b11 >= this.f4680e) {
                    long g10 = g(j10);
                    nw3.b(this.f4677b, d10, d10.m());
                    this.f4677b.e(g10, 1, d10.m(), 0, null);
                    this.f4680e = -1L;
                }
            }
            this.f4682g += b11;
            return 0;
        }
    }

    public final long g(long j10) {
        return (j10 * 1000000) / this.f4684i;
    }

    public final long h(long j10) {
        return (this.f4684i * j10) / 1000000;
    }

    public void i(long j10) {
        this.f4682g = j10;
    }
}
