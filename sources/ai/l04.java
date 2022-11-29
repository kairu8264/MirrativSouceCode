package ai;

import com.google.android.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class l04 implements mv3 {

    /* renamed from: d  reason: collision with root package name */
    public static final sv3 f6440d = k04.f6021a;

    /* renamed from: a  reason: collision with root package name */
    public final m04 f6441a = new m04(null);

    /* renamed from: b  reason: collision with root package name */
    public final hb f6442b = new hb(2786);

    /* renamed from: c  reason: collision with root package name */
    public boolean f6443c;

    @Override // ai.mv3
    public final int e(nv3 nv3Var, iw3 iw3Var) throws IOException {
        int b10 = nv3Var.b(this.f6442b.q(), 0, 2786);
        if (b10 == -1) {
            return -1;
        }
        this.f6442b.p(0);
        this.f6442b.n(b10);
        if (!this.f6443c) {
            this.f6441a.d(0L, 4);
            this.f6443c = true;
        }
        this.f6441a.b(this.f6442b);
        return 0;
    }

    @Override // ai.mv3
    public final void g(long j10, long j11) {
        this.f6443c = false;
        this.f6441a.zza();
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.f6441a.a(pv3Var, new k24(Integer.MIN_VALUE, 0, 1));
        pv3Var.x();
        pv3Var.s(new kw3(C.TIME_UNSET, 0L));
    }

    @Override // ai.mv3
    public final boolean i(nv3 nv3Var) throws IOException {
        hb hbVar = new hb(10);
        int i10 = 0;
        while (true) {
            hv3 hv3Var = (hv3) nv3Var;
            hv3Var.c(hbVar.q(), 0, 10, false);
            hbVar.p(0);
            if (hbVar.z() != 4801587) {
                break;
            }
            hbVar.s(3);
            int a10 = hbVar.a();
            i10 += a10 + 10;
            hv3Var.r(a10, false);
        }
        nv3Var.j();
        hv3 hv3Var2 = (hv3) nv3Var;
        hv3Var2.r(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            hv3Var2.c(hbVar.q(), 0, 6, false);
            hbVar.p(0);
            if (hbVar.w() != 2935) {
                nv3Var.j();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                hv3Var2.r(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int d10 = su3.d(hbVar.q());
                if (d10 == -1) {
                    return false;
                }
                hv3Var2.r(d10 - 6, false);
            }
        }
    }
}
