package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zw3 implements cv3 {

    /* renamed from: a  reason: collision with root package name */
    public final zv3 f13236a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13237b;

    /* renamed from: c  reason: collision with root package name */
    public final tv3 f13238c = new tv3();

    public /* synthetic */ zw3(zv3 zv3Var, int i10, ax3 ax3Var) {
        this.f13236a = zv3Var;
        this.f13237b = i10;
    }

    @Override // ai.cv3
    public final bv3 a(nv3 nv3Var, long j10) throws IOException {
        long n10 = nv3Var.n();
        long b10 = b(nv3Var);
        long k10 = nv3Var.k();
        ((hv3) nv3Var).r(Math.max(6, this.f13236a.f13214c), false);
        long b11 = b(nv3Var);
        return (b10 > j10 || b11 <= j10) ? b11 <= j10 ? bv3.e(b11, nv3Var.k()) : bv3.d(b10, n10) : bv3.f(k10);
    }

    public final long b(nv3 nv3Var) throws IOException {
        while (nv3Var.k() < nv3Var.o() - 6) {
            zv3 zv3Var = this.f13236a;
            int i10 = this.f13237b;
            tv3 tv3Var = this.f13238c;
            long k10 = nv3Var.k();
            byte[] bArr = new byte[2];
            hv3 hv3Var = (hv3) nv3Var;
            hv3Var.c(bArr, 0, 2, false);
            if ((((bArr[0] & TagConstant.TAG_CAT_RESERVED) << 8) | (bArr[1] & TagConstant.TAG_CAT_RESERVED)) != i10) {
                nv3Var.j();
                hv3Var.r((int) (k10 - nv3Var.n()), false);
            } else {
                hb hbVar = new hb(16);
                System.arraycopy(bArr, 0, hbVar.q(), 0, 2);
                hbVar.n(qv3.b(nv3Var, hbVar.q(), 2, 14));
                nv3Var.j();
                hv3Var.r((int) (k10 - nv3Var.n()), false);
                if (uv3.a(hbVar, zv3Var, i10, tv3Var)) {
                    break;
                }
            }
            hv3Var.r(1, false);
        }
        if (nv3Var.k() >= nv3Var.o() - 6) {
            ((hv3) nv3Var).r((int) (nv3Var.o() - nv3Var.k()), false);
            return this.f13236a.f13221j;
        }
        return this.f13238c.f10481a;
    }

    @Override // ai.cv3
    public final void zzb() {
    }
}
