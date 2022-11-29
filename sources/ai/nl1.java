package ai;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nl1 {

    /* renamed from: b  reason: collision with root package name */
    public final wg.a f7382b;

    /* renamed from: c  reason: collision with root package name */
    public final cq0 f7383c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f7384d;

    /* renamed from: e  reason: collision with root package name */
    public final pp1 f7385e;

    /* renamed from: f  reason: collision with root package name */
    public final nq2 f7386f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f7387g;

    /* renamed from: h  reason: collision with root package name */
    public final u f7388h;

    /* renamed from: i  reason: collision with root package name */
    public final zj0 f7389i;

    /* renamed from: k  reason: collision with root package name */
    public final ey1 f7391k;

    /* renamed from: l  reason: collision with root package name */
    public final fr2 f7392l;

    /* renamed from: m  reason: collision with root package name */
    public s43<rp0> f7393m;

    /* renamed from: a  reason: collision with root package name */
    public final hl1 f7381a = new hl1(null);

    /* renamed from: j  reason: collision with root package name */
    public final g40 f7390j = new g40();

    public nl1(ll1 ll1Var) {
        this.f7384d = ll1.c(ll1Var);
        this.f7387g = ll1.g(ll1Var);
        this.f7388h = ll1.h(ll1Var);
        this.f7389i = ll1.i(ll1Var);
        this.f7382b = ll1.a(ll1Var);
        this.f7383c = ll1.b(ll1Var);
        this.f7391k = ll1.f(ll1Var);
        this.f7392l = ll1.j(ll1Var);
        this.f7385e = ll1.d(ll1Var);
        this.f7386f = ll1.e(ll1Var);
    }

    public final synchronized void b() {
        s43<rp0> j10 = j43.j(cq0.b(this.f7384d, this.f7389i, (String) ft.c().c(ox.f8007i2), this.f7388h, this.f7382b), new bx2(this) { // from class: ai.al1

            /* renamed from: a  reason: collision with root package name */
            public final nl1 f1912a;

            {
                this.f1912a = this;
            }

            @Override // ai.bx2
            public final Object apply(Object obj) {
                rp0 rp0Var = (rp0) obj;
                this.f1912a.k(rp0Var);
                return rp0Var;
            }
        }, this.f7387g);
        this.f7393m = j10;
        kk0.a(j10, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void c() {
        s43<rp0> s43Var = this.f7393m;
        if (s43Var == null) {
            return;
        }
        j43.p(s43Var, new cl1(this), this.f7387g);
        this.f7393m = null;
    }

    public final synchronized s43<JSONObject> d(final String str, final JSONObject jSONObject) {
        s43<rp0> s43Var = this.f7393m;
        if (s43Var == null) {
            return j43.a(null);
        }
        return j43.i(s43Var, new p33(this, str, jSONObject) { // from class: ai.bl1

            /* renamed from: a  reason: collision with root package name */
            public final nl1 f2393a;

            /* renamed from: b  reason: collision with root package name */
            public final String f2394b;

            /* renamed from: c  reason: collision with root package name */
            public final JSONObject f2395c;

            {
                this.f2393a = this;
                this.f2394b = str;
                this.f2395c = jSONObject;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f2393a.j(this.f2394b, this.f2395c, (rp0) obj);
            }
        }, this.f7387g);
    }

    public final synchronized void e(String str, r30<Object> r30Var) {
        s43<rp0> s43Var = this.f7393m;
        if (s43Var == null) {
            return;
        }
        j43.p(s43Var, new dl1(this, str, r30Var), this.f7387g);
    }

    public final synchronized void f(String str, r30<Object> r30Var) {
        s43<rp0> s43Var = this.f7393m;
        if (s43Var == null) {
            return;
        }
        j43.p(s43Var, new el1(this, str, r30Var), this.f7387g);
    }

    public final synchronized void g(String str, Map<String, ?> map) {
        s43<rp0> s43Var = this.f7393m;
        if (s43Var == null) {
            return;
        }
        j43.p(s43Var, new fl1(this, "sendMessageToNativeJs", map), this.f7387g);
    }

    public final synchronized void h(fl2 fl2Var, kl2 kl2Var) {
        s43<rp0> s43Var = this.f7393m;
        if (s43Var == null) {
            return;
        }
        j43.p(s43Var, new gl1(this, fl2Var, kl2Var), this.f7387g);
    }

    public final <T> void i(WeakReference<T> weakReference, String str, r30<T> r30Var) {
        e(str, new ml1(this, weakReference, str, r30Var, null));
    }

    public final /* synthetic */ s43 j(String str, JSONObject jSONObject, rp0 rp0Var) throws Exception {
        return this.f7390j.c(rp0Var, str, jSONObject);
    }

    public final /* synthetic */ rp0 k(rp0 rp0Var) {
        rp0Var.c1("/result", this.f7390j);
        fr0 i02 = rp0Var.i0();
        hl1 hl1Var = this.f7381a;
        i02.L0(null, hl1Var, hl1Var, hl1Var, hl1Var, false, null, new wg.b(this.f7384d, null, null), null, null, this.f7391k, this.f7392l, this.f7385e, this.f7386f, null, null);
        return rp0Var;
    }
}
