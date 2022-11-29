package ai;

import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public final class gx3 implements mv3 {

    /* renamed from: q  reason: collision with root package name */
    public static final sv3 f4626q = fx3.f4245a;

    /* renamed from: f  reason: collision with root package name */
    public pv3 f4632f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4634h;

    /* renamed from: i  reason: collision with root package name */
    public long f4635i;

    /* renamed from: j  reason: collision with root package name */
    public int f4636j;

    /* renamed from: k  reason: collision with root package name */
    public int f4637k;

    /* renamed from: l  reason: collision with root package name */
    public int f4638l;

    /* renamed from: m  reason: collision with root package name */
    public long f4639m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4640n;

    /* renamed from: o  reason: collision with root package name */
    public ex3 f4641o;

    /* renamed from: p  reason: collision with root package name */
    public jx3 f4642p;

    /* renamed from: a  reason: collision with root package name */
    public final hb f4627a = new hb(4);

    /* renamed from: b  reason: collision with root package name */
    public final hb f4628b = new hb(9);

    /* renamed from: c  reason: collision with root package name */
    public final hb f4629c = new hb(11);

    /* renamed from: d  reason: collision with root package name */
    public final hb f4630d = new hb();

    /* renamed from: e  reason: collision with root package name */
    public final hx3 f4631e = new hx3();

    /* renamed from: g  reason: collision with root package name */
    public int f4633g = 1;

    public final hb a(nv3 nv3Var) throws IOException {
        if (this.f4638l > this.f4630d.r()) {
            hb hbVar = this.f4630d;
            int r10 = hbVar.r();
            hbVar.j(new byte[Math.max(r10 + r10, this.f4638l)], 0);
        } else {
            this.f4630d.p(0);
        }
        this.f4630d.n(this.f4638l);
        ((hv3) nv3Var).f(this.f4630d.q(), 0, this.f4638l, false);
        return this.f4630d;
    }

    @RequiresNonNull({"extractorOutput"})
    public final void b() {
        if (this.f4640n) {
            return;
        }
        this.f4632f.s(new kw3(C.TIME_UNSET, 0L));
        this.f4640n = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // ai.mv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(ai.nv3 r17, ai.iw3 r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.gx3.e(ai.nv3, ai.iw3):int");
    }

    @Override // ai.mv3
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f4633g = 1;
            this.f4634h = false;
        } else {
            this.f4633g = 3;
        }
        this.f4636j = 0;
    }

    @Override // ai.mv3
    public final void h(pv3 pv3Var) {
        this.f4632f = pv3Var;
    }

    @Override // ai.mv3
    public final boolean i(nv3 nv3Var) throws IOException {
        hv3 hv3Var = (hv3) nv3Var;
        hv3Var.c(this.f4627a.q(), 0, 3, false);
        this.f4627a.p(0);
        if (this.f4627a.z() != 4607062) {
            return false;
        }
        hv3Var.c(this.f4627a.q(), 0, 2, false);
        this.f4627a.p(0);
        if ((this.f4627a.w() & ListPopupWindow.EXPAND_LIST_TIMEOUT) != 0) {
            return false;
        }
        hv3Var.c(this.f4627a.q(), 0, 4, false);
        this.f4627a.p(0);
        int D = this.f4627a.D();
        nv3Var.j();
        hv3 hv3Var2 = (hv3) nv3Var;
        hv3Var2.r(D, false);
        hv3Var2.c(this.f4627a.q(), 0, 4, false);
        this.f4627a.p(0);
        return this.f4627a.D() == 0;
    }
}
