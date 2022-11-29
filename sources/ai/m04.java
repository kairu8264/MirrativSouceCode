package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class m04 implements x04 {

    /* renamed from: a  reason: collision with root package name */
    public final gb f6749a;

    /* renamed from: b  reason: collision with root package name */
    public final hb f6750b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6751c;

    /* renamed from: d  reason: collision with root package name */
    public String f6752d;

    /* renamed from: e  reason: collision with root package name */
    public pw3 f6753e;

    /* renamed from: f  reason: collision with root package name */
    public int f6754f;

    /* renamed from: g  reason: collision with root package name */
    public int f6755g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6756h;

    /* renamed from: i  reason: collision with root package name */
    public long f6757i;

    /* renamed from: j  reason: collision with root package name */
    public v4 f6758j;

    /* renamed from: k  reason: collision with root package name */
    public int f6759k;

    /* renamed from: l  reason: collision with root package name */
    public long f6760l;

    public m04(String str) {
        gb gbVar = new gb(new byte[128], 128);
        this.f6749a = gbVar;
        this.f6750b = new hb(gbVar.f4375a);
        this.f6754f = 0;
        this.f6760l = C.TIME_UNSET;
        this.f6751c = str;
    }

    @Override // ai.x04
    public final void a(pv3 pv3Var, k24 k24Var) {
        k24Var.a();
        this.f6752d = k24Var.c();
        this.f6753e = pv3Var.p(k24Var.b(), 1);
    }

    @Override // ai.x04
    public final void b(hb hbVar) {
        u9.e(this.f6753e);
        while (hbVar.l() > 0) {
            int i10 = this.f6754f;
            if (i10 == 0) {
                while (true) {
                    if (hbVar.l() <= 0) {
                        break;
                    } else if (!this.f6756h) {
                        this.f6756h = hbVar.v() == 11;
                    } else {
                        int v10 = hbVar.v();
                        if (v10 == 119) {
                            this.f6756h = false;
                            this.f6754f = 1;
                            this.f6750b.q()[0] = 11;
                            this.f6750b.q()[1] = 119;
                            this.f6755g = 2;
                            break;
                        }
                        this.f6756h = v10 == 11;
                    }
                }
            } else if (i10 != 1) {
                int min = Math.min(hbVar.l(), this.f6759k - this.f6755g);
                nw3.b(this.f6753e, hbVar, min);
                int i11 = this.f6755g + min;
                this.f6755g = i11;
                int i12 = this.f6759k;
                if (i11 == i12) {
                    long j10 = this.f6760l;
                    if (j10 != C.TIME_UNSET) {
                        this.f6753e.e(j10, 1, i12, 0, null);
                        this.f6760l += this.f6757i;
                    }
                    this.f6754f = 0;
                }
            } else {
                byte[] q10 = this.f6750b.q();
                int min2 = Math.min(hbVar.l(), 128 - this.f6755g);
                hbVar.u(q10, this.f6755g, min2);
                int i13 = this.f6755g + min2;
                this.f6755g = i13;
                if (i13 == 128) {
                    this.f6749a.d(0);
                    qu3 c10 = su3.c(this.f6749a);
                    v4 v4Var = this.f6758j;
                    if (v4Var == null || c10.f9203c != v4Var.f10973y || c10.f9202b != v4Var.f10974z || !sb.H(c10.f9201a, v4Var.f10960l)) {
                        t4 t4Var = new t4();
                        t4Var.d(this.f6752d);
                        t4Var.n(c10.f9201a);
                        t4Var.B(c10.f9203c);
                        t4Var.C(c10.f9202b);
                        t4Var.g(this.f6751c);
                        v4 I = t4Var.I();
                        this.f6758j = I;
                        this.f6753e.b(I);
                    }
                    this.f6759k = c10.f9204d;
                    this.f6757i = (c10.f9205e * 1000000) / this.f6758j.f10974z;
                    this.f6750b.p(0);
                    nw3.b(this.f6753e, this.f6750b, 128);
                    this.f6754f = 2;
                }
            }
        }
    }

    @Override // ai.x04
    public final void c() {
    }

    @Override // ai.x04
    public final void d(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f6760l = j10;
        }
    }

    @Override // ai.x04
    public final void zza() {
        this.f6754f = 0;
        this.f6755g = 0;
        this.f6756h = false;
        this.f6760l = C.TIME_UNSET;
    }
}
