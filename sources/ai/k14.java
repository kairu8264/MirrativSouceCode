package ai;

import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzaha;

/* loaded from: classes3.dex */
public final class k14 implements x04 {

    /* renamed from: a  reason: collision with root package name */
    public final String f6024a;

    /* renamed from: b  reason: collision with root package name */
    public final hb f6025b;

    /* renamed from: c  reason: collision with root package name */
    public final gb f6026c;

    /* renamed from: d  reason: collision with root package name */
    public pw3 f6027d;

    /* renamed from: e  reason: collision with root package name */
    public String f6028e;

    /* renamed from: f  reason: collision with root package name */
    public v4 f6029f;

    /* renamed from: g  reason: collision with root package name */
    public int f6030g;

    /* renamed from: h  reason: collision with root package name */
    public int f6031h;

    /* renamed from: i  reason: collision with root package name */
    public int f6032i;

    /* renamed from: j  reason: collision with root package name */
    public int f6033j;

    /* renamed from: k  reason: collision with root package name */
    public long f6034k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6035l;

    /* renamed from: m  reason: collision with root package name */
    public int f6036m;

    /* renamed from: n  reason: collision with root package name */
    public int f6037n;

    /* renamed from: o  reason: collision with root package name */
    public int f6038o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6039p;

    /* renamed from: q  reason: collision with root package name */
    public long f6040q;

    /* renamed from: r  reason: collision with root package name */
    public int f6041r;

    /* renamed from: s  reason: collision with root package name */
    public long f6042s;

    /* renamed from: t  reason: collision with root package name */
    public int f6043t;

    /* renamed from: u  reason: collision with root package name */
    public String f6044u;

    public k14(String str) {
        this.f6024a = str;
        hb hbVar = new hb(1024);
        this.f6025b = hbVar;
        byte[] q10 = hbVar.q();
        this.f6026c = new gb(q10, q10.length);
        this.f6034k = C.TIME_UNSET;
    }

    public static long f(gb gbVar) {
        return gbVar.h((gbVar.h(2) + 1) * 8);
    }

    @Override // ai.x04
    public final void a(pv3 pv3Var, k24 k24Var) {
        k24Var.a();
        this.f6027d = pv3Var.p(k24Var.b(), 1);
        this.f6028e = k24Var.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
        if (r14.f6035l == false) goto L105;
     */
    @Override // ai.x04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(ai.hb r15) throws com.google.android.gms.internal.ads.zzaha {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.k14.b(ai.hb):void");
    }

    @Override // ai.x04
    public final void c() {
    }

    @Override // ai.x04
    public final void d(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f6034k = j10;
        }
    }

    public final int e(gb gbVar) throws zzaha {
        int b10 = gbVar.b();
        mu3 b11 = ou3.b(gbVar, true);
        this.f6044u = b11.f7066c;
        this.f6041r = b11.f7064a;
        this.f6043t = b11.f7065b;
        return b10 - gbVar.b();
    }

    @Override // ai.x04
    public final void zza() {
        this.f6030g = 0;
        this.f6034k = C.TIME_UNSET;
        this.f6035l = false;
    }
}
