package ai;

import com.google.android.exoplayer2.C;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class r04 implements mv3 {

    /* renamed from: j  reason: collision with root package name */
    public static final sv3 f9285j = q04.f8767a;

    /* renamed from: c  reason: collision with root package name */
    public final hb f9288c;

    /* renamed from: d  reason: collision with root package name */
    public final gb f9289d;

    /* renamed from: e  reason: collision with root package name */
    public pv3 f9290e;

    /* renamed from: f  reason: collision with root package name */
    public long f9291f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9293h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9294i;

    /* renamed from: a  reason: collision with root package name */
    public final s04 f9286a = new s04(true, null);

    /* renamed from: b  reason: collision with root package name */
    public final hb f9287b = new hb(2048);

    /* renamed from: g  reason: collision with root package name */
    public long f9292g = -1;

    public r04(int i10) {
        hb hbVar = new hb(10);
        this.f9288c = hbVar;
        byte[] q10 = hbVar.q();
        this.f9289d = new gb(q10, q10.length);
    }

    @Override // ai.mv3
    public final int e(nv3 nv3Var, iw3 iw3Var) throws IOException {
        u9.e(this.f9290e);
        int b10 = nv3Var.b(this.f9287b.q(), 0, 2048);
        if (!this.f9294i) {
            this.f9290e.s(new kw3(C.TIME_UNSET, 0L));
            this.f9294i = true;
        }
        if (b10 == -1) {
            return -1;
        }
        this.f9287b.p(0);
        this.f9287b.n(b10);
        if (!this.f9293h) {
            this.f9286a.d(this.f9291f, 4);
            this.f9293h = true;
        }
        this.f9286a.b(this.f9287b);
        return 0;
    }

    @Override // ai.mv3
    public final void g(long j10, long j11) {
        this.f9293h = false;
        this.f9286a.zza();
        this.f9291f = j11;
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.f9290e = pv3Var;
        this.f9286a.a(pv3Var, new k24(Integer.MIN_VALUE, 0, 1));
        pv3Var.x();
    }

    @Override // ai.mv3
    public final boolean i(nv3 nv3Var) throws IOException {
        int i10 = 0;
        while (true) {
            hv3 hv3Var = (hv3) nv3Var;
            hv3Var.c(this.f9288c.q(), 0, 10, false);
            this.f9288c.p(0);
            if (this.f9288c.z() != 4801587) {
                break;
            }
            this.f9288c.s(3);
            int a10 = this.f9288c.a();
            i10 += a10 + 10;
            hv3Var.r(a10, false);
        }
        nv3Var.j();
        hv3 hv3Var2 = (hv3) nv3Var;
        hv3Var2.r(i10, false);
        if (this.f9292g == -1) {
            this.f9292g = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        while (true) {
            hv3Var2.c(this.f9288c.q(), 0, 2, false);
            this.f9288c.p(0);
            if (s04.e(this.f9288c.w())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                hv3Var2.c(this.f9288c.q(), 0, 4, false);
                this.f9289d.d(14);
                int h10 = this.f9289d.h(13);
                if (h10 <= 6) {
                    return false;
                }
                hv3Var2.r(h10 - 6, false);
                i12 += h10;
            } else {
                nv3Var.j();
                i13++;
                if (i13 - i10 >= 8192) {
                    return false;
                }
                hv3Var2.r(i13, false);
                i11 = 0;
                i12 = 0;
            }
        }
    }
}
