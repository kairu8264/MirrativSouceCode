package ai;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class nq1 implements r71, or, v41, p51, q51, k61, y41, xb, dq2 {

    /* renamed from: w  reason: collision with root package name */
    public final List<Object> f7440w;

    /* renamed from: x  reason: collision with root package name */
    public final aq1 f7441x;

    /* renamed from: y  reason: collision with root package name */
    public long f7442y;

    public nq1(aq1 aq1Var, or0 or0Var) {
        this.f7441x = aq1Var;
        this.f7440w = Collections.singletonList(or0Var);
    }

    @Override // ai.dq2
    public final void A(wp2 wp2Var, String str) {
        M(vp2.class, "onTaskCreated", str);
    }

    @Override // ai.v41
    public final void B(ye0 ye0Var, String str, String str2) {
        M(v41.class, "onRewarded", ye0Var, str, str2);
    }

    @Override // ai.dq2
    public final void K(wp2 wp2Var, String str) {
        M(vp2.class, "onTaskStarted", str);
    }

    public final void M(Class<?> cls, String str, Object... objArr) {
        aq1 aq1Var = this.f7441x;
        List<Object> list = this.f7440w;
        String simpleName = cls.getSimpleName();
        aq1Var.a(list, simpleName.length() != 0 ? "Event-".concat(simpleName) : new String("Event-"), str, objArr);
    }

    @Override // ai.k61
    public final void a() {
        long elapsedRealtime = wg.t.k().elapsedRealtime();
        long j10 = this.f7442y;
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Ad Request Latency : ");
        sb2.append(elapsedRealtime - j10);
        yg.p1.k(sb2.toString());
        M(k61.class, "onAdLoaded", new Object[0]);
    }

    @Override // ai.dq2
    public final void c(wp2 wp2Var, String str) {
        M(vp2.class, "onTaskSucceeded", str);
    }

    @Override // ai.v41
    public final void e() {
        M(v41.class, "onAdOpened", new Object[0]);
    }

    @Override // ai.p51
    public final void f() {
        M(p51.class, "onAdImpression", new Object[0]);
    }

    @Override // ai.v41
    public final void g() {
        M(v41.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // ai.v41
    public final void h() {
        M(v41.class, "onAdClosed", new Object[0]);
    }

    @Override // ai.v41
    public final void j() {
        M(v41.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // ai.v41
    public final void k() {
        M(v41.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // ai.dq2
    public final void n(wp2 wp2Var, String str, Throwable th2) {
        M(vp2.class, "onTaskFailed", str, th2.getClass().getSimpleName());
    }

    @Override // ai.or
    public final void onAdClicked() {
        M(or.class, "onAdClicked", new Object[0]);
    }

    @Override // ai.q51
    public final void p(Context context) {
        M(q51.class, "onPause", context);
    }

    @Override // ai.r71
    public final void s(ie0 ie0Var) {
        this.f7442y = wg.t.k().elapsedRealtime();
        M(r71.class, "onAdRequest", new Object[0]);
    }

    @Override // ai.q51
    public final void t(Context context) {
        M(q51.class, "onDestroy", context);
    }

    @Override // ai.r71
    public final void u(sl2 sl2Var) {
    }

    @Override // ai.xb
    public final void v(String str, String str2) {
        M(xb.class, "onAppEvent", str, str2);
    }

    @Override // ai.q51
    public final void y(Context context) {
        M(q51.class, "onResume", context);
    }

    @Override // ai.y41
    public final void z(sr srVar) {
        M(y41.class, "onAdFailedToLoad", Integer.valueOf(srVar.f9916w), srVar.f9917x, srVar.f9918y);
    }
}
