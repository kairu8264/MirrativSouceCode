package ai;

import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public final class j14 implements x04 {

    /* renamed from: b  reason: collision with root package name */
    public pw3 f5590b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5591c;

    /* renamed from: e  reason: collision with root package name */
    public int f5593e;

    /* renamed from: f  reason: collision with root package name */
    public int f5594f;

    /* renamed from: a  reason: collision with root package name */
    public final hb f5589a = new hb(10);

    /* renamed from: d  reason: collision with root package name */
    public long f5592d = C.TIME_UNSET;

    @Override // ai.x04
    public final void a(pv3 pv3Var, k24 k24Var) {
        k24Var.a();
        pw3 p10 = pv3Var.p(k24Var.b(), 5);
        this.f5590b = p10;
        t4 t4Var = new t4();
        t4Var.d(k24Var.c());
        t4Var.n(MimeTypes.APPLICATION_ID3);
        p10.b(t4Var.I());
    }

    @Override // ai.x04
    public final void b(hb hbVar) {
        u9.e(this.f5590b);
        if (this.f5591c) {
            int l10 = hbVar.l();
            int i10 = this.f5594f;
            if (i10 < 10) {
                int min = Math.min(l10, 10 - i10);
                System.arraycopy(hbVar.q(), hbVar.o(), this.f5589a.q(), this.f5594f, min);
                if (this.f5594f + min == 10) {
                    this.f5589a.p(0);
                    if (this.f5589a.v() == 73 && this.f5589a.v() == 68 && this.f5589a.v() == 51) {
                        this.f5589a.s(3);
                        this.f5593e = this.f5589a.a() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f5591c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(l10, this.f5593e - this.f5594f);
            nw3.b(this.f5590b, hbVar, min2);
            this.f5594f += min2;
        }
    }

    @Override // ai.x04
    public final void c() {
        int i10;
        u9.e(this.f5590b);
        if (this.f5591c && (i10 = this.f5593e) != 0 && this.f5594f == i10) {
            long j10 = this.f5592d;
            if (j10 != C.TIME_UNSET) {
                this.f5590b.e(j10, 1, i10, 0, null);
            }
            this.f5591c = false;
        }
    }

    @Override // ai.x04
    public final void d(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f5591c = true;
        if (j10 != C.TIME_UNSET) {
            this.f5592d = j10;
        }
        this.f5593e = 0;
        this.f5594f = 0;
    }

    @Override // ai.x04
    public final void zza() {
        this.f5591c = false;
        this.f5592d = C.TIME_UNSET;
    }
}
