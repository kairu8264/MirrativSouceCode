package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class c14 implements x04 {

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f2656l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final n24 f2657a;

    /* renamed from: f  reason: collision with root package name */
    public b14 f2662f;

    /* renamed from: g  reason: collision with root package name */
    public long f2663g;

    /* renamed from: h  reason: collision with root package name */
    public String f2664h;

    /* renamed from: i  reason: collision with root package name */
    public pw3 f2665i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2666j;

    /* renamed from: c  reason: collision with root package name */
    public final boolean[] f2659c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    public final a14 f2660d = new a14(128);

    /* renamed from: k  reason: collision with root package name */
    public long f2667k = C.TIME_UNSET;

    /* renamed from: e  reason: collision with root package name */
    public final m14 f2661e = new m14(178, 128);

    /* renamed from: b  reason: collision with root package name */
    public final hb f2658b = new hb();

    public c14(n24 n24Var) {
        this.f2657a = n24Var;
    }

    @Override // ai.x04
    public final void a(pv3 pv3Var, k24 k24Var) {
        k24Var.a();
        this.f2664h = k24Var.c();
        pw3 p10 = pv3Var.p(k24Var.b(), 2);
        this.f2665i = p10;
        this.f2662f = new b14(p10);
        this.f2657a.a(pv3Var, k24Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cd A[SYNTHETIC] */
    @Override // ai.x04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(ai.hb r19) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.c14.b(ai.hb):void");
    }

    @Override // ai.x04
    public final void c() {
    }

    @Override // ai.x04
    public final void d(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f2667k = j10;
        }
    }

    @Override // ai.x04
    public final void zza() {
        xa.e(this.f2659c);
        this.f2660d.a();
        b14 b14Var = this.f2662f;
        if (b14Var != null) {
            b14Var.a();
        }
        this.f2661e.a();
        this.f2663g = 0L;
        this.f2667k = C.TIME_UNSET;
    }
}
