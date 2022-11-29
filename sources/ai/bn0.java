package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class bn0 {

    /* renamed from: a  reason: collision with root package name */
    public final wi f2408a = new wi(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);

    /* renamed from: b  reason: collision with root package name */
    public long f2409b = 15000000;

    /* renamed from: c  reason: collision with root package name */
    public long f2410c = 30000000;

    /* renamed from: d  reason: collision with root package name */
    public long f2411d = 2500000;

    /* renamed from: e  reason: collision with root package name */
    public long f2412e = 5000000;

    /* renamed from: f  reason: collision with root package name */
    public int f2413f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2414g;

    public final void a() {
        k(false);
    }

    public final void b(rc[] rcVarArr, ci ciVar, ni niVar) {
        this.f2413f = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            if (niVar.a(i10) != null) {
                this.f2413f += vj.q(rcVarArr[i10].zza());
            }
        }
        this.f2408a.b(this.f2413f);
    }

    public final void c() {
        k(true);
    }

    public final void d() {
        k(true);
    }

    public final synchronized boolean e(long j10, boolean z10) {
        long j11;
        j11 = z10 ? this.f2412e : this.f2411d;
        return j11 <= 0 || j10 >= j11;
    }

    public final synchronized boolean f(long j10) {
        boolean z10;
        z10 = true;
        boolean z11 = j10 > this.f2410c ? false : j10 < this.f2409b ? true : true;
        int g10 = this.f2408a.g();
        int i10 = this.f2413f;
        if (!z11 && (!z11 || !this.f2414g || g10 >= i10)) {
            z10 = false;
        }
        this.f2414g = z10;
        return z10;
    }

    public final synchronized void g(int i10) {
        this.f2409b = i10 * 1000;
    }

    public final synchronized void h(int i10) {
        this.f2410c = i10 * 1000;
    }

    public final synchronized void i(int i10) {
        this.f2411d = i10 * 1000;
    }

    public final synchronized void j(int i10) {
        this.f2412e = i10 * 1000;
    }

    public final void k(boolean z10) {
        this.f2413f = 0;
        this.f2414g = false;
        if (z10) {
            this.f2408a.a();
        }
    }

    public final wi l() {
        return this.f2408a;
    }
}
