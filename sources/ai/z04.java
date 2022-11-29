package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class z04 implements x04 {

    /* renamed from: q  reason: collision with root package name */
    public static final double[] f12789q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    public String f12790a;

    /* renamed from: b  reason: collision with root package name */
    public pw3 f12791b;

    /* renamed from: c  reason: collision with root package name */
    public final n24 f12792c;

    /* renamed from: d  reason: collision with root package name */
    public final hb f12793d;

    /* renamed from: e  reason: collision with root package name */
    public final m14 f12794e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f12795f = new boolean[4];

    /* renamed from: g  reason: collision with root package name */
    public final y04 f12796g = new y04(128);

    /* renamed from: h  reason: collision with root package name */
    public long f12797h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12798i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12799j;

    /* renamed from: k  reason: collision with root package name */
    public long f12800k;

    /* renamed from: l  reason: collision with root package name */
    public long f12801l;

    /* renamed from: m  reason: collision with root package name */
    public long f12802m;

    /* renamed from: n  reason: collision with root package name */
    public long f12803n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12804o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12805p;

    public z04(n24 n24Var) {
        hb hbVar;
        this.f12792c = n24Var;
        if (n24Var != null) {
            this.f12794e = new m14(178, 128);
            hbVar = new hb();
        } else {
            hbVar = null;
            this.f12794e = null;
        }
        this.f12793d = hbVar;
        this.f12801l = C.TIME_UNSET;
        this.f12803n = C.TIME_UNSET;
    }

    @Override // ai.x04
    public final void a(pv3 pv3Var, k24 k24Var) {
        k24Var.a();
        this.f12790a = k24Var.c();
        this.f12791b = pv3Var.p(k24Var.b(), 2);
        n24 n24Var = this.f12792c;
        if (n24Var != null) {
            n24Var.a(pv3Var, k24Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01df  */
    @Override // ai.x04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(ai.hb r20) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.z04.b(ai.hb):void");
    }

    @Override // ai.x04
    public final void c() {
    }

    @Override // ai.x04
    public final void d(long j10, int i10) {
        this.f12801l = j10;
    }

    @Override // ai.x04
    public final void zza() {
        xa.e(this.f12795f);
        this.f12796g.a();
        m14 m14Var = this.f12794e;
        if (m14Var != null) {
            m14Var.a();
        }
        this.f12797h = 0L;
        this.f12798i = false;
        this.f12801l = C.TIME_UNSET;
        this.f12803n = C.TIME_UNSET;
    }
}
