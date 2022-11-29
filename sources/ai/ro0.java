package ai;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;

/* loaded from: classes3.dex */
public final class ro0 implements x4 {

    /* renamed from: a  reason: collision with root package name */
    public final is3 f9517a = new is3(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);

    /* renamed from: b  reason: collision with root package name */
    public long f9518b = 15000000;

    /* renamed from: c  reason: collision with root package name */
    public long f9519c = 30000000;

    /* renamed from: d  reason: collision with root package name */
    public long f9520d = 2500000;

    /* renamed from: e  reason: collision with root package name */
    public long f9521e = 5000000;

    /* renamed from: f  reason: collision with root package name */
    public int f9522f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9523g;

    public final synchronized void a(int i10) {
        this.f9518b = i10 * 1000;
    }

    @Override // ai.x4
    public final void b() {
        l(true);
    }

    @Override // ai.x4
    public final boolean c() {
        return false;
    }

    @Override // ai.x4
    public final long d() {
        return 0L;
    }

    @Override // ai.x4
    public final is3 e() {
        return this.f9517a;
    }

    @Override // ai.x4
    public final boolean f(long j10, float f10, boolean z10, long j11) {
        long j12 = z10 ? this.f9521e : this.f9520d;
        return j12 <= 0 || j10 >= j12;
    }

    @Override // ai.x4
    public final void g(u6[] u6VarArr, uz3 uz3Var, br3[] br3VarArr) {
        this.f9522f = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            if (br3VarArr[i10] != null) {
                this.f9522f += u6VarArr[i10].U() != 1 ? DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE : 13107200;
            }
        }
        this.f9517a.b(this.f9522f);
    }

    @Override // ai.x4
    public final boolean h(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = j11 > this.f9519c ? false : j11 < this.f9518b ? true : true;
        int g10 = this.f9517a.g();
        int i10 = this.f9522f;
        if (!z11 && (!z11 || !this.f9523g || g10 >= i10)) {
            z10 = false;
        }
        this.f9523g = z10;
        return z10;
    }

    public final synchronized void i(int i10) {
        this.f9519c = i10 * 1000;
    }

    public final synchronized void j(int i10) {
        this.f9520d = i10 * 1000;
    }

    public final synchronized void k(int i10) {
        this.f9521e = i10 * 1000;
    }

    public final void l(boolean z10) {
        this.f9522f = 0;
        this.f9523g = false;
        if (z10) {
            this.f9517a.a();
        }
    }

    @Override // ai.x4
    public final void zza() {
        l(false);
    }

    @Override // ai.x4
    public final void zzb() {
        l(true);
    }
}
