package ai;

import com.google.android.gms.internal.ads.zzamy;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class yb implements rc, sc {

    /* renamed from: a  reason: collision with root package name */
    public final int f12496a;

    /* renamed from: b  reason: collision with root package name */
    public tc f12497b;

    /* renamed from: c  reason: collision with root package name */
    public int f12498c;

    /* renamed from: d  reason: collision with root package name */
    public int f12499d;

    /* renamed from: e  reason: collision with root package name */
    public xh f12500e;

    /* renamed from: f  reason: collision with root package name */
    public long f12501f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12502g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12503h;

    public yb(int i10) {
        this.f12496a = i10;
    }

    @Override // ai.rc
    public final void F(int i10) {
        this.f12498c = i10;
    }

    @Override // ai.rc
    public final void O(long j10) throws zzamy {
        this.f12503h = false;
        this.f12502g = false;
        t(j10, false);
    }

    @Override // ai.rc
    public final void P(tc tcVar, oc[] ocVarArr, xh xhVar, long j10, boolean z10, long j11) throws zzamy {
        fj.d(this.f12499d == 0);
        this.f12497b = tcVar;
        this.f12499d = 1;
        r(z10);
        Q(ocVarArr, xhVar, j11);
        t(j10, z10);
    }

    @Override // ai.rc
    public final void Q(oc[] ocVarArr, xh xhVar, long j10) throws zzamy {
        fj.d(!this.f12503h);
        this.f12500e = xhVar;
        this.f12502g = false;
        this.f12501f = j10;
        s(ocVarArr, j10);
    }

    public final int b(pc pcVar, ee eeVar, boolean z10) {
        int c10 = this.f12500e.c(pcVar, eeVar, z10);
        if (c10 == -4) {
            if (eeVar.c()) {
                this.f12502g = true;
                return this.f12503h ? -4 : -3;
            }
            eeVar.f3617d += this.f12501f;
        } else if (c10 == -5) {
            oc ocVar = pcVar.f8372a;
            long j10 = ocVar.S;
            if (j10 != Long.MAX_VALUE) {
                pcVar.f8372a = new oc(ocVar.f7711w, ocVar.A, ocVar.B, ocVar.f7713y, ocVar.f7712x, ocVar.C, ocVar.F, ocVar.G, ocVar.H, ocVar.I, ocVar.J, ocVar.L, ocVar.K, ocVar.M, ocVar.N, ocVar.O, ocVar.P, ocVar.Q, ocVar.R, ocVar.T, ocVar.U, ocVar.V, j10 + this.f12501f, ocVar.D, ocVar.E, ocVar.f7714z);
                return -5;
            }
        }
        return c10;
    }

    @Override // ai.rc
    public final int c() {
        return this.f12499d;
    }

    @Override // ai.rc
    public jj d() {
        return null;
    }

    public final void e(long j10) {
        this.f12500e.a(j10 - this.f12501f);
    }

    @Override // ai.rc
    public final void f() throws zzamy {
        fj.d(this.f12499d == 1);
        this.f12499d = 2;
        u();
    }

    @Override // ai.rc
    public final boolean g() {
        return this.f12502g;
    }

    @Override // ai.rc
    public final xh h() {
        return this.f12500e;
    }

    @Override // ai.rc
    public final void i() {
        this.f12503h = true;
    }

    @Override // ai.rc
    public final boolean j() {
        return this.f12503h;
    }

    @Override // ai.rc
    public final void k() throws IOException {
        this.f12500e.b();
    }

    public final boolean n() {
        return this.f12502g ? this.f12503h : this.f12500e.zzb();
    }

    @Override // ai.rc
    public final void o() throws zzamy {
        fj.d(this.f12499d == 2);
        this.f12499d = 1;
        v();
    }

    @Override // ai.rc
    public final void p() {
        fj.d(this.f12499d == 1);
        this.f12499d = 0;
        this.f12500e = null;
        this.f12503h = false;
        w();
    }

    public abstract void r(boolean z10) throws zzamy;

    public void s(oc[] ocVarArr, long j10) throws zzamy {
    }

    public abstract void t(long j10, boolean z10) throws zzamy;

    public abstract void u() throws zzamy;

    public abstract void v() throws zzamy;

    public abstract void w();

    public final tc x() {
        return this.f12497b;
    }

    public final int y() {
        return this.f12498c;
    }

    @Override // ai.rc, ai.sc
    public final int zza() {
        return this.f12496a;
    }

    @Override // ai.rc
    public final sc zzb() {
        return this;
    }
}
