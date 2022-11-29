package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class p04 implements x04 {

    /* renamed from: a  reason: collision with root package name */
    public final gb f8205a;

    /* renamed from: b  reason: collision with root package name */
    public final hb f8206b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8207c;

    /* renamed from: d  reason: collision with root package name */
    public String f8208d;

    /* renamed from: e  reason: collision with root package name */
    public pw3 f8209e;

    /* renamed from: f  reason: collision with root package name */
    public int f8210f;

    /* renamed from: g  reason: collision with root package name */
    public int f8211g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8212h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8213i;

    /* renamed from: j  reason: collision with root package name */
    public long f8214j;

    /* renamed from: k  reason: collision with root package name */
    public v4 f8215k;

    /* renamed from: l  reason: collision with root package name */
    public int f8216l;

    /* renamed from: m  reason: collision with root package name */
    public long f8217m;

    public p04(String str) {
        gb gbVar = new gb(new byte[16], 16);
        this.f8205a = gbVar;
        this.f8206b = new hb(gbVar.f4375a);
        this.f8210f = 0;
        this.f8211g = 0;
        this.f8212h = false;
        this.f8213i = false;
        this.f8217m = C.TIME_UNSET;
        this.f8207c = str;
    }

    @Override // ai.x04
    public final void a(pv3 pv3Var, k24 k24Var) {
        k24Var.a();
        this.f8208d = k24Var.c();
        this.f8209e = pv3Var.p(k24Var.b(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    @Override // ai.x04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(ai.hb r11) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.p04.b(ai.hb):void");
    }

    @Override // ai.x04
    public final void c() {
    }

    @Override // ai.x04
    public final void d(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f8217m = j10;
        }
    }

    @Override // ai.x04
    public final void zza() {
        this.f8210f = 0;
        this.f8211g = 0;
        this.f8212h = false;
        this.f8213i = false;
        this.f8217m = C.TIME_UNSET;
    }
}
