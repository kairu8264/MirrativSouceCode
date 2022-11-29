package ai;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class hq3 extends pk3 implements yp3 {

    /* renamed from: g  reason: collision with root package name */
    public final k5 f4934g;

    /* renamed from: h  reason: collision with root package name */
    public final j5 f4935h;

    /* renamed from: i  reason: collision with root package name */
    public final z6 f4936i;

    /* renamed from: j  reason: collision with root package name */
    public final rp3 f4937j;

    /* renamed from: k  reason: collision with root package name */
    public final kq2 f4938k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4939l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4940m;

    /* renamed from: n  reason: collision with root package name */
    public long f4941n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4942o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4943p;

    /* renamed from: q  reason: collision with root package name */
    public pm f4944q;

    /* renamed from: r  reason: collision with root package name */
    public final os3 f4945r;

    public /* synthetic */ hq3(k5 k5Var, z6 z6Var, rp3 rp3Var, kq2 kq2Var, os3 os3Var, int i10, gq3 gq3Var, byte[] bArr) {
        j5 j5Var = k5Var.f6086b;
        Objects.requireNonNull(j5Var);
        this.f4935h = j5Var;
        this.f4934g = k5Var;
        this.f4936i = z6Var;
        this.f4937j = rp3Var;
        this.f4938k = kq2Var;
        this.f4945r = os3Var;
        this.f4939l = i10;
        this.f4940m = true;
        this.f4941n = C.TIME_UNSET;
    }

    @Override // ai.yp3
    public final void c(long j10, boolean z10, boolean z11) {
        if (j10 == C.TIME_UNSET) {
            j10 = this.f4941n;
        }
        if (!this.f4940m && this.f4941n == j10 && this.f4942o == z10 && this.f4943p == z11) {
            return;
        }
        this.f4941n = j10;
        this.f4942o = z10;
        this.f4943p = z11;
        this.f4940m = false;
        z();
    }

    @Override // ai.dp3
    public final ap3 f(bp3 bp3Var, is3 is3Var, long j10) {
        a8 zza = this.f4936i.zza();
        pm pmVar = this.f4944q;
        if (pmVar != null) {
            zza.l(pmVar);
        }
        Uri uri = this.f4935h.f5621a;
        sp3 zza2 = this.f4937j.zza();
        kq2 kq2Var = this.f4938k;
        hl2 w10 = w(bp3Var);
        os3 os3Var = this.f4945r;
        kp3 t10 = t(bp3Var);
        String str = this.f4935h.f5624d;
        return new cq3(uri, zza, zza2, kq2Var, w10, os3Var, t10, this, is3Var, null, this.f4939l, null);
    }

    @Override // ai.dp3
    public final void g(ap3 ap3Var) {
        ((cq3) ap3Var).T();
    }

    @Override // ai.pk3
    public final void n(pm pmVar) {
        this.f4944q = pmVar;
        z();
    }

    @Override // ai.pk3
    public final void p() {
    }

    @Override // ai.dp3
    public final void r() {
    }

    @Override // ai.dp3
    public final k5 u() {
        return this.f4934g;
    }

    public final void z() {
        long j10 = this.f4941n;
        boolean z10 = this.f4942o;
        boolean z11 = this.f4943p;
        k5 k5Var = this.f4934g;
        uq3 uq3Var = new uq3(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, j10, j10, 0L, 0L, z10, false, false, null, k5Var, z11 ? k5Var.f6087c : null);
        s(this.f4940m ? new dq3(this, uq3Var) : uq3Var);
    }
}
