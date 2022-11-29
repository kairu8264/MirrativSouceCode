package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class u04 implements x04 {

    /* renamed from: b  reason: collision with root package name */
    public final String f10545b;

    /* renamed from: c  reason: collision with root package name */
    public String f10546c;

    /* renamed from: d  reason: collision with root package name */
    public pw3 f10547d;

    /* renamed from: f  reason: collision with root package name */
    public int f10549f;

    /* renamed from: g  reason: collision with root package name */
    public int f10550g;

    /* renamed from: h  reason: collision with root package name */
    public long f10551h;

    /* renamed from: i  reason: collision with root package name */
    public v4 f10552i;

    /* renamed from: j  reason: collision with root package name */
    public int f10553j;

    /* renamed from: a  reason: collision with root package name */
    public final hb f10544a = new hb(new byte[18]);

    /* renamed from: e  reason: collision with root package name */
    public int f10548e = 0;

    /* renamed from: k  reason: collision with root package name */
    public long f10554k = C.TIME_UNSET;

    public u04(String str) {
        this.f10545b = str;
    }

    @Override // ai.x04
    public final void a(pv3 pv3Var, k24 k24Var) {
        k24Var.a();
        this.f10546c = k24Var.c();
        this.f10547d = pv3Var.p(k24Var.b(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0144  */
    @Override // ai.x04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(ai.hb r18) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.u04.b(ai.hb):void");
    }

    @Override // ai.x04
    public final void c() {
    }

    @Override // ai.x04
    public final void d(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f10554k = j10;
        }
    }

    @Override // ai.x04
    public final void zza() {
        this.f10548e = 0;
        this.f10549f = 0;
        this.f10550g = 0;
        this.f10554k = C.TIME_UNSET;
    }
}
