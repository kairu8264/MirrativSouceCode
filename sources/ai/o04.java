package ai;

import com.google.android.exoplayer2.C;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class o04 implements mv3 {

    /* renamed from: d  reason: collision with root package name */
    public static final sv3 f7597d = n04.f7141a;

    /* renamed from: a  reason: collision with root package name */
    public final p04 f7598a = new p04(null);

    /* renamed from: b  reason: collision with root package name */
    public final hb f7599b = new hb(16384);

    /* renamed from: c  reason: collision with root package name */
    public boolean f7600c;

    @Override // ai.mv3
    public final int e(nv3 nv3Var, iw3 iw3Var) throws IOException {
        int b10 = nv3Var.b(this.f7599b.q(), 0, 16384);
        if (b10 == -1) {
            return -1;
        }
        this.f7599b.p(0);
        this.f7599b.n(b10);
        if (!this.f7600c) {
            this.f7598a.d(0L, 4);
            this.f7600c = true;
        }
        this.f7598a.b(this.f7599b);
        return 0;
    }

    @Override // ai.mv3
    public final void g(long j10, long j11) {
        this.f7600c = false;
        this.f7598a.zza();
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.f7598a.a(pv3Var, new k24(Integer.MIN_VALUE, 0, 1));
        pv3Var.x();
        pv3Var.s(new kw3(C.TIME_UNSET, 0L));
    }

    @Override // ai.mv3
    public final boolean i(nv3 nv3Var) throws IOException {
        int i10;
        hb hbVar = new hb(10);
        int i11 = 0;
        while (true) {
            hv3 hv3Var = (hv3) nv3Var;
            hv3Var.c(hbVar.q(), 0, 10, false);
            hbVar.p(0);
            if (hbVar.z() != 4801587) {
                break;
            }
            hbVar.s(3);
            int a10 = hbVar.a();
            i11 += a10 + 10;
            hv3Var.r(a10, false);
        }
        nv3Var.j();
        hv3 hv3Var2 = (hv3) nv3Var;
        hv3Var2.r(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            hv3Var2.c(hbVar.q(), 0, 7, false);
            hbVar.p(0);
            int w10 = hbVar.w();
            if (w10 == 44096 || w10 == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] q10 = hbVar.q();
                int i15 = vu3.f11365b;
                if (q10.length < 7) {
                    i10 = -1;
                } else {
                    int i16 = ((q10[2] & TagConstant.TAG_CAT_RESERVED) << 8) | (q10[3] & TagConstant.TAG_CAT_RESERVED);
                    if (i16 == 65535) {
                        i16 = ((q10[4] & TagConstant.TAG_CAT_RESERVED) << 16) | ((q10[5] & TagConstant.TAG_CAT_RESERVED) << 8) | (q10[6] & TagConstant.TAG_CAT_RESERVED);
                    } else {
                        i14 = 4;
                    }
                    if (w10 == 44097) {
                        i14 += 2;
                    }
                    i10 = i16 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                hv3Var2.r(i10 - 7, false);
            } else {
                nv3Var.j();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                hv3Var2.r(i13, false);
                i12 = 0;
            }
        }
    }
}
