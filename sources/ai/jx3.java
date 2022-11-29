package ai;

import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzaha;
import com.google.android.gms.internal.ads.zzpp;

/* loaded from: classes3.dex */
public final class jx3 extends ix3 {

    /* renamed from: b  reason: collision with root package name */
    public final hb f5950b;

    /* renamed from: c  reason: collision with root package name */
    public final hb f5951c;

    /* renamed from: d  reason: collision with root package name */
    public int f5952d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5953e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5954f;

    /* renamed from: g  reason: collision with root package name */
    public int f5955g;

    public jx3(pw3 pw3Var) {
        super(pw3Var);
        this.f5950b = new hb(xa.f11894a);
        this.f5951c = new hb(4);
    }

    @Override // ai.ix3
    public final boolean a(hb hbVar) throws zzpp {
        int v10 = hbVar.v();
        int i10 = v10 >> 4;
        int i11 = v10 & 15;
        if (i11 == 7) {
            this.f5955g = i10;
            return i10 != 5;
        }
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Video format not supported: ");
        sb2.append(i11);
        throw new zzpp(sb2.toString());
    }

    @Override // ai.ix3
    public final boolean b(hb hbVar, long j10) throws zzaha {
        int v10 = hbVar.v();
        long A = j10 + (hbVar.A() * 1000);
        if (v10 == 0) {
            if (!this.f5953e) {
                hb hbVar2 = new hb(new byte[hbVar.l()]);
                hbVar.u(hbVar2.q(), 0, hbVar.l());
                wu3 a10 = wu3.a(hbVar2);
                this.f5952d = a10.f11755b;
                t4 t4Var = new t4();
                t4Var.n(MimeTypes.VIDEO_H264);
                t4Var.k(a10.f11759f);
                t4Var.s(a10.f11756c);
                t4Var.t(a10.f11757d);
                t4Var.w(a10.f11758e);
                t4Var.p(a10.f11754a);
                this.f5443a.b(t4Var.I());
                this.f5953e = true;
                return false;
            }
        } else if (v10 == 1 && this.f5953e) {
            int i10 = this.f5955g == 1 ? 1 : 0;
            if (this.f5954f || i10 != 0) {
                byte[] q10 = this.f5951c.q();
                q10[0] = 0;
                q10[1] = 0;
                q10[2] = 0;
                int i11 = 4 - this.f5952d;
                int i12 = 0;
                while (hbVar.l() > 0) {
                    hbVar.u(this.f5951c.q(), i11, this.f5952d);
                    this.f5951c.p(0);
                    int b10 = this.f5951c.b();
                    this.f5950b.p(0);
                    this.f5443a.a(this.f5950b, 4);
                    this.f5443a.a(hbVar, b10);
                    i12 = i12 + 4 + b10;
                }
                this.f5443a.e(A, i10, i12, 0, null);
                this.f5954f = true;
                return true;
            }
            return false;
        }
        return false;
    }
}
