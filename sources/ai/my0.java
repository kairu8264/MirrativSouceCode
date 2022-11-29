package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class my0 extends u01 {

    /* renamed from: i  reason: collision with root package name */
    public final rp0 f7100i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7101j;

    /* renamed from: k  reason: collision with root package name */
    public final Context f7102k;

    /* renamed from: l  reason: collision with root package name */
    public final tx0 f7103l;

    /* renamed from: m  reason: collision with root package name */
    public final ne1 f7104m;

    /* renamed from: n  reason: collision with root package name */
    public final i51 f7105n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7106o;

    public my0(t01 t01Var, Context context, rp0 rp0Var, int i10, tx0 tx0Var, ne1 ne1Var, i51 i51Var) {
        super(t01Var);
        this.f7106o = false;
        this.f7100i = rp0Var;
        this.f7102k = context;
        this.f7101j = i10;
        this.f7103l = tx0Var;
        this.f7104m = ne1Var;
        this.f7105n = i51Var;
    }

    @Override // ai.u01
    public final void b() {
        super.b();
        rp0 rp0Var = this.f7100i;
        if (rp0Var != null) {
            rp0Var.destroy();
        }
    }

    public final void g(jm jmVar) {
        rp0 rp0Var = this.f7100i;
        if (rp0Var != null) {
            rp0Var.R0(jmVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r4 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.app.Activity r4, ai.sm r5, boolean r6) throws android.os.RemoteException {
        /*
            r3 = this;
            if (r4 != 0) goto L4
            android.content.Context r4 = r3.f7102k
        L4:
            ai.gx<java.lang.Boolean> r0 = ai.ox.f8077r0
            ai.mx r1 = ai.ft.c()
            java.lang.Object r0 = r1.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L58
            wg.t.d()
            boolean r0 = yg.d2.j(r4)
            if (r0 == 0) goto L58
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            ai.uj0.f(r5)
            ai.i51 r5 = r3.f7105n
            r5.d()
            ai.gx<java.lang.Boolean> r5 = ai.ox.f8085s0
            ai.mx r6 = ai.ft.c()
            java.lang.Object r5 = r6.c(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lae
            ai.gu2 r5 = new ai.gu2
            android.content.Context r4 = r4.getApplicationContext()
            yg.z0 r6 = wg.t.r()
            android.os.Looper r6 = r6.a()
            r5.<init>(r4, r6)
            ai.sl2 r4 = r3.f10527a
            ai.rl2 r4 = r4.f9876b
            ai.kl2 r4 = r4.f9497b
            java.lang.String r4 = r4.f6277b
            r5.a(r4)
            return
        L58:
            boolean r0 = r3.f7106o
            if (r0 == 0) goto L7f
            java.lang.String r0 = "App open interstitial ad is already visible."
            ai.uj0.f(r0)
            ai.gx<java.lang.Boolean> r0 = ai.ox.X6
            ai.mx r1 = ai.ft.c()
            java.lang.Object r0 = r1.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7f
            ai.i51 r0 = r3.f7105n
            r1 = 10
            r2 = 0
            ai.sr r1 = ai.tm2.d(r1, r2, r2)
            r0.y(r1)
        L7f:
            boolean r0 = r3.f7106o
            if (r0 != 0) goto Lae
            ai.ne1 r0 = r3.f7104m     // Catch: com.google.android.gms.internal.ads.zzdkm -> L8e
            ai.i51 r1 = r3.f7105n     // Catch: com.google.android.gms.internal.ads.zzdkm -> L8e
            r0.a(r6, r4, r1)     // Catch: com.google.android.gms.internal.ads.zzdkm -> L8e
            r4 = 1
            r3.f7106o = r4
            return
        L8e:
            r4 = move-exception
            ai.gx<java.lang.Boolean> r6 = ai.ox.X6
            ai.mx r0 = ai.ft.c()
            java.lang.Object r6 = r0.c(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto La7
            ai.i51 r5 = r3.f7105n
            r5.j0(r4)
            return
        La7:
            ai.sr r4 = ai.tm2.a(r4)
            r5.x0(r4)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.my0.h(android.app.Activity, ai.sm, boolean):void");
    }

    public final int i() {
        return this.f7101j;
    }

    public final void j(long j10, int i10) {
        this.f7103l.a(j10, i10);
    }
}
