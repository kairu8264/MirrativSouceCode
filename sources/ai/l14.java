package ai;

import com.google.android.exoplayer2.C;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;

/* loaded from: classes3.dex */
public final class l14 implements x04 {

    /* renamed from: a  reason: collision with root package name */
    public final hb f6452a;

    /* renamed from: b  reason: collision with root package name */
    public final fw3 f6453b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6454c;

    /* renamed from: d  reason: collision with root package name */
    public pw3 f6455d;

    /* renamed from: e  reason: collision with root package name */
    public String f6456e;

    /* renamed from: f  reason: collision with root package name */
    public int f6457f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f6458g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6459h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6460i;

    /* renamed from: j  reason: collision with root package name */
    public long f6461j;

    /* renamed from: k  reason: collision with root package name */
    public int f6462k;

    /* renamed from: l  reason: collision with root package name */
    public long f6463l;

    public l14(String str) {
        hb hbVar = new hb(4);
        this.f6452a = hbVar;
        hbVar.q()[0] = -1;
        this.f6453b = new fw3();
        this.f6463l = C.TIME_UNSET;
        this.f6454c = str;
    }

    @Override // ai.x04
    public final void a(pv3 pv3Var, k24 k24Var) {
        k24Var.a();
        this.f6456e = k24Var.c();
        this.f6455d = pv3Var.p(k24Var.b(), 1);
    }

    @Override // ai.x04
    public final void b(hb hbVar) {
        fw3 fw3Var;
        u9.e(this.f6455d);
        while (hbVar.l() > 0) {
            int i10 = this.f6457f;
            if (i10 == 0) {
                byte[] q10 = hbVar.q();
                int o10 = hbVar.o();
                int m10 = hbVar.m();
                while (true) {
                    if (o10 < m10) {
                        byte b10 = q10[o10];
                        boolean z10 = (b10 & TagConstant.TAG_CAT_RESERVED) == 255;
                        boolean z11 = this.f6460i && (b10 & 224) == 224;
                        this.f6460i = z10;
                        if (z11) {
                            hbVar.p(o10 + 1);
                            this.f6460i = false;
                            this.f6452a.q()[1] = q10[o10];
                            this.f6458g = 2;
                            this.f6457f = 1;
                            break;
                        }
                        o10++;
                    } else {
                        hbVar.p(m10);
                        break;
                    }
                }
            } else if (i10 != 1) {
                int min = Math.min(hbVar.l(), this.f6462k - this.f6458g);
                nw3.b(this.f6455d, hbVar, min);
                int i11 = this.f6458g + min;
                this.f6458g = i11;
                int i12 = this.f6462k;
                if (i11 >= i12) {
                    long j10 = this.f6463l;
                    if (j10 != C.TIME_UNSET) {
                        this.f6455d.e(j10, 1, i12, 0, null);
                        this.f6463l += this.f6461j;
                    }
                    this.f6458g = 0;
                    this.f6457f = 0;
                }
            } else {
                int min2 = Math.min(hbVar.l(), 4 - this.f6458g);
                hbVar.u(this.f6452a.q(), this.f6458g, min2);
                int i13 = this.f6458g + min2;
                this.f6458g = i13;
                if (i13 >= 4) {
                    this.f6452a.p(0);
                    if (this.f6453b.a(this.f6452a.D())) {
                        this.f6462k = this.f6453b.f4232c;
                        if (!this.f6459h) {
                            this.f6461j = (fw3Var.f4236g * 1000000) / fw3Var.f4233d;
                            t4 t4Var = new t4();
                            t4Var.d(this.f6456e);
                            t4Var.n(this.f6453b.f4231b);
                            t4Var.o(4096);
                            t4Var.B(this.f6453b.f4234e);
                            t4Var.C(this.f6453b.f4233d);
                            t4Var.g(this.f6454c);
                            this.f6455d.b(t4Var.I());
                            this.f6459h = true;
                        }
                        this.f6452a.p(0);
                        nw3.b(this.f6455d, this.f6452a, 4);
                        this.f6457f = 2;
                    } else {
                        this.f6458g = 0;
                        this.f6457f = 1;
                    }
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
            this.f6463l = j10;
        }
    }

    @Override // ai.x04
    public final void zza() {
        this.f6457f = 0;
        this.f6458g = 0;
        this.f6460i = false;
        this.f6463l = C.TIME_UNSET;
    }
}
