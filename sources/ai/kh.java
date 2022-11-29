package ai;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class kh implements oh, nh {
    public final Handler A;
    public final jh B;
    public final vc C = new vc();
    public final int D;
    public nh E;
    public xc F;
    public boolean G;

    /* renamed from: w  reason: collision with root package name */
    public final Uri f6231w;

    /* renamed from: x  reason: collision with root package name */
    public final ti f6232x;

    /* renamed from: y  reason: collision with root package name */
    public final oe f6233y;

    /* renamed from: z  reason: collision with root package name */
    public final int f6234z;

    public kh(Uri uri, ti tiVar, oe oeVar, int i10, Handler handler, jh jhVar, String str, int i11) {
        this.f6231w = uri;
        this.f6232x = tiVar;
        this.f6233y = oeVar;
        this.f6234z = i10;
        this.A = handler;
        this.B = jhVar;
        this.D = i11;
    }

    @Override // ai.nh
    public final void a(xc xcVar, Object obj) {
        vc vcVar = this.C;
        xcVar.d(0, vcVar, false);
        boolean z10 = vcVar.f11019c != C.TIME_UNSET;
        if (!this.G || z10) {
            this.F = xcVar;
            this.G = z10;
            this.E.a(xcVar, null);
        }
    }

    @Override // ai.oh
    public final void b(mh mhVar) {
        ((ih) mhVar).C();
    }

    @Override // ai.oh
    public final mh c(int i10, wi wiVar) {
        fj.a(i10 == 0);
        return new ih(this.f6231w, this.f6232x.zza(), this.f6233y.zza(), this.f6234z, this.A, this.B, this, wiVar, null, this.D, null);
    }

    @Override // ai.oh
    public final void d() {
        this.E = null;
    }

    @Override // ai.oh
    public final void e(ec ecVar, boolean z10, nh nhVar) {
        this.E = nhVar;
        ai aiVar = new ai(C.TIME_UNSET, false);
        this.F = aiVar;
        nhVar.a(aiVar, null);
    }

    @Override // ai.oh
    public final void zzb() throws IOException {
    }
}
