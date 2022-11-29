package ai;

import com.google.android.gms.internal.ads.zzaha;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes3.dex */
public final class zz3 implements mv3 {

    /* renamed from: d  reason: collision with root package name */
    public static final sv3 f13290d = yz3.f12779a;

    /* renamed from: a  reason: collision with root package name */
    public pv3 f13291a;

    /* renamed from: b  reason: collision with root package name */
    public h04 f13292b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13293c;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    public final boolean a(nv3 nv3Var) throws IOException {
        b04 b04Var = new b04();
        if (b04Var.c(nv3Var, true) && (b04Var.f2180a & 2) == 2) {
            int min = Math.min(b04Var.f2184e, 8);
            hb hbVar = new hb(min);
            ((hv3) nv3Var).c(hbVar.q(), 0, min, false);
            hbVar.p(0);
            if (hbVar.l() >= 5 && hbVar.v() == 127 && hbVar.B() == 1179402563) {
                this.f13292b = new xz3();
            } else {
                hbVar.p(0);
                try {
                    if (vw3.c(1, hbVar, true)) {
                        this.f13292b = new j04();
                    }
                } catch (zzaha unused) {
                }
                hbVar.p(0);
                if (d04.j(hbVar)) {
                    this.f13292b = new d04();
                }
            }
            return true;
        }
        return false;
    }

    @Override // ai.mv3
    public final int e(nv3 nv3Var, iw3 iw3Var) throws IOException {
        u9.e(this.f13291a);
        if (this.f13292b == null) {
            if (a(nv3Var)) {
                nv3Var.j();
            } else {
                throw zzaha.b("Failed to determine bitstream type", null);
            }
        }
        if (!this.f13293c) {
            pw3 p10 = this.f13291a.p(0, 1);
            this.f13291a.x();
            this.f13292b.d(this.f13291a, p10);
            this.f13293c = true;
        }
        return this.f13292b.f(nv3Var, iw3Var);
    }

    @Override // ai.mv3
    public final void g(long j10, long j11) {
        h04 h04Var = this.f13292b;
        if (h04Var != null) {
            h04Var.e(j10, j11);
        }
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.f13291a = pv3Var;
    }

    @Override // ai.mv3
    public final boolean i(nv3 nv3Var) throws IOException {
        try {
            return a(nv3Var);
        } catch (zzaha unused) {
            return false;
        }
    }
}
