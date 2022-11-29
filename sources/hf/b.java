package hf;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.BuildConfig;
import com.dena.mirrorman.clientlog.logs.Adjust;
import com.dena.mirrorman.clientlog.logs.Live;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f35490a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final long[] f35491b = {1, 372822632, 697233848, 904016051, 753721729};

    /* renamed from: c  reason: collision with root package name */
    public static final a f35492c = new C0455b("sp6zen", Live.COMMENT_SHARE_TYPE_SHARE);

    /* renamed from: d  reason: collision with root package name */
    public static final a f35493d = new C0455b("pmravw", "coinConsume");

    /* renamed from: e  reason: collision with root package name */
    public static final a f35494e = new C0455b("twvrbf", "chat");

    /* renamed from: f  reason: collision with root package name */
    public static final int f35495f = 8;

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    /* renamed from: hf.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0455b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final String f35496a;

        /* renamed from: b  reason: collision with root package name */
        public final String f35497b;

        public C0455b(String str, String str2) {
            jo.p.h(str, "token");
            jo.p.h(str2, "debugKey");
            this.f35496a = str;
            this.f35497b = str2;
        }

        @Override // hf.b.a
        public void a() {
            p6.e.f(new p6.h(this.f35496a));
            g9.a.g("AdjustHelper.AdjustEventTracker.trackEvent: debugKey=" + this.f35497b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            jo.p.h(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            jo.p.h(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            jo.p.h(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            p6.e.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            jo.p.h(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            p6.e.e();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            jo.p.h(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            jo.p.h(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            jo.p.h(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            jo.p.h(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        }
    }

    public static final void f(p6.f fVar) {
        Puree.d(new Adjust.AttributionChanged(fVar));
        Puree.b();
    }

    public final a b() {
        return f35494e;
    }

    public final a c() {
        return f35493d;
    }

    public final a d() {
        return f35492c;
    }

    public final void e(Application application) {
        jo.p.h(application, "app");
        p6.g gVar = new p6.g(application, "upsby17tvv28", of.n.p() ? BuildConfig.FLAVOR : "sandbox");
        gVar.g(of.n.p() ? p6.g0.INFO : p6.g0.VERBOSE);
        gVar.i(hf.a.f35489a);
        long[] jArr = f35491b;
        gVar.f(jArr[0], jArr[1], jArr[2], jArr[3], jArr[4]);
        p6.e.c(gVar);
        application.registerActivityLifecycleCallbacks(new c());
    }

    public final void g() {
        p6.e.f(new p6.h("vmbe82"));
    }

    public final void h() {
        p6.e.f(new p6.h("jdwii7"));
    }

    public final void i() {
        p6.e.f(new p6.h("oxiund"));
    }

    public final void j() {
        p6.e.f(new p6.h("aao3ha"));
    }

    public final void k() {
        p6.e.f(new p6.h("7d8xvx"));
    }

    public final void l() {
        p6.e.f(new p6.h("eeiaib"));
    }

    public final void m(double d10, String str) {
        jo.p.h(str, "currency");
        p6.h hVar = new p6.h("uii24f");
        hVar.d(d10, str);
        p6.e.f(hVar);
    }

    public final void n() {
        p6.e.f(new p6.h("we2fma"));
    }
}
