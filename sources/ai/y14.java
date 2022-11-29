package ai;

/* loaded from: classes3.dex */
public final class y14 implements l24 {

    /* renamed from: a  reason: collision with root package name */
    public final x14 f12412a;

    /* renamed from: b  reason: collision with root package name */
    public final hb f12413b = new hb(32);

    /* renamed from: c  reason: collision with root package name */
    public int f12414c;

    /* renamed from: d  reason: collision with root package name */
    public int f12415d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12416e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12417f;

    public y14(x14 x14Var) {
        this.f12412a = x14Var;
    }

    @Override // ai.l24
    public final void a(pb pbVar, pv3 pv3Var, k24 k24Var) {
        this.f12412a.a(pbVar, pv3Var, k24Var);
        this.f12417f = true;
    }

    @Override // ai.l24
    public final void b(hb hbVar, int i10) {
        int i11 = i10 & 1;
        int o10 = i11 != 0 ? hbVar.o() + hbVar.v() : -1;
        if (this.f12417f) {
            if (i11 == 0) {
                return;
            }
            this.f12417f = false;
            hbVar.p(o10);
            this.f12415d = 0;
        }
        while (hbVar.l() > 0) {
            int i12 = this.f12415d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int v10 = hbVar.v();
                    hbVar.p(hbVar.o() - 1);
                    if (v10 == 255) {
                        this.f12417f = true;
                        return;
                    }
                }
                int min = Math.min(hbVar.l(), 3 - this.f12415d);
                hbVar.u(this.f12413b.q(), this.f12415d, min);
                int i13 = this.f12415d + min;
                this.f12415d = i13;
                if (i13 == 3) {
                    this.f12413b.p(0);
                    this.f12413b.n(3);
                    this.f12413b.s(1);
                    int v11 = this.f12413b.v();
                    int v12 = this.f12413b.v();
                    this.f12416e = (v11 & 128) != 0;
                    this.f12414c = (((v11 & 15) << 8) | v12) + 3;
                    int r10 = this.f12413b.r();
                    int i14 = this.f12414c;
                    if (r10 < i14) {
                        int r11 = this.f12413b.r();
                        this.f12413b.k(Math.min(4098, Math.max(i14, r11 + r11)));
                    }
                }
            } else {
                int min2 = Math.min(hbVar.l(), this.f12414c - this.f12415d);
                hbVar.u(this.f12413b.q(), this.f12415d, min2);
                int i15 = this.f12415d + min2;
                this.f12415d = i15;
                int i16 = this.f12414c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.f12416e) {
                        if (sb.v(this.f12413b.q(), 0, this.f12414c, -1) != 0) {
                            this.f12417f = true;
                            return;
                        }
                        this.f12413b.n(this.f12414c - 4);
                    } else {
                        this.f12413b.n(i16);
                    }
                    this.f12413b.p(0);
                    this.f12412a.b(this.f12413b);
                    this.f12415d = 0;
                }
            }
        }
    }

    @Override // ai.l24
    public final void zzb() {
        this.f12417f = true;
    }
}
