package ai;

import android.content.Context;
import com.google.android.gms.internal.ads.zzehs;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jk1 {

    /* renamed from: a  reason: collision with root package name */
    public final yl2 f5818a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f5819b;

    /* renamed from: c  reason: collision with root package name */
    public final ym1 f5820c;

    /* renamed from: d  reason: collision with root package name */
    public final tl1 f5821d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f5822e;

    /* renamed from: f  reason: collision with root package name */
    public final pp1 f5823f;

    /* renamed from: g  reason: collision with root package name */
    public final nq2 f5824g;

    /* renamed from: h  reason: collision with root package name */
    public final fr2 f5825h;

    /* renamed from: i  reason: collision with root package name */
    public final ey1 f5826i;

    public jk1(yl2 yl2Var, Executor executor, ym1 ym1Var, Context context, pp1 pp1Var, nq2 nq2Var, fr2 fr2Var, ey1 ey1Var, tl1 tl1Var) {
        this.f5818a = yl2Var;
        this.f5819b = executor;
        this.f5820c = ym1Var;
        this.f5822e = context;
        this.f5823f = pp1Var;
        this.f5824g = nq2Var;
        this.f5825h = fr2Var;
        this.f5826i = ey1Var;
        this.f5821d = tl1Var;
    }

    public static final void i(rp0 rp0Var) {
        rp0Var.c1("/videoClicked", q30.f8786h);
        rp0Var.i0().E0(true);
        if (((Boolean) ft.c().c(ox.f8023k2)).booleanValue()) {
            rp0Var.c1("/getNativeAdViewSignals", q30.f8797s);
        }
        rp0Var.c1("/getNativeClickMeta", q30.f8798t);
    }

    public final s43<rp0> a(final JSONObject jSONObject) {
        return j43.i(j43.i(j43.a(null), new p33(this) { // from class: ai.zj1

            /* renamed from: a  reason: collision with root package name */
            public final jk1 f13017a;

            {
                this.f13017a = this;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f13017a.c(obj);
            }
        }, this.f5819b), new p33(this, jSONObject) { // from class: ai.xj1

            /* renamed from: a  reason: collision with root package name */
            public final jk1 f11967a;

            /* renamed from: b  reason: collision with root package name */
            public final JSONObject f11968b;

            {
                this.f11967a = this;
                this.f11968b = jSONObject;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f11967a.f(this.f11968b, (rp0) obj);
            }
        }, this.f5819b);
    }

    public final s43<rp0> b(final String str, final String str2, final fl2 fl2Var, final kl2 kl2Var, final fs fsVar) {
        return j43.i(j43.a(null), new p33(this, fsVar, fl2Var, kl2Var, str, str2) { // from class: ai.yj1

            /* renamed from: a  reason: collision with root package name */
            public final jk1 f12632a;

            /* renamed from: b  reason: collision with root package name */
            public final fs f12633b;

            /* renamed from: c  reason: collision with root package name */
            public final fl2 f12634c;

            /* renamed from: d  reason: collision with root package name */
            public final kl2 f12635d;

            /* renamed from: e  reason: collision with root package name */
            public final String f12636e;

            /* renamed from: f  reason: collision with root package name */
            public final String f12637f;

            {
                this.f12632a = this;
                this.f12633b = fsVar;
                this.f12634c = fl2Var;
                this.f12635d = kl2Var;
                this.f12636e = str;
                this.f12637f = str2;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f12632a.d(this.f12633b, this.f12634c, this.f12635d, this.f12636e, this.f12637f, obj);
            }
        }, this.f5819b);
    }

    public final /* synthetic */ s43 c(Object obj) throws Exception {
        rp0 b10 = this.f5820c.b(fs.P(), null, null);
        final lk0 f10 = lk0.f(b10);
        h(b10);
        b10.i0().P(new er0(f10) { // from class: ai.ak1

            /* renamed from: a  reason: collision with root package name */
            public final lk0 f1889a;

            {
                this.f1889a = f10;
            }

            @Override // ai.er0
            public final void zzb() {
                this.f1889a.g();
            }
        });
        b10.loadUrl((String) ft.c().c(ox.f8015j2));
        return f10;
    }

    public final /* synthetic */ s43 d(fs fsVar, fl2 fl2Var, kl2 kl2Var, String str, String str2, Object obj) throws Exception {
        final rp0 b10 = this.f5820c.b(fsVar, fl2Var, kl2Var);
        final lk0 f10 = lk0.f(b10);
        if (this.f5818a.f12648b != null) {
            h(b10);
            b10.v0(ir0.e());
        } else {
            ql1 b11 = this.f5821d.b();
            b10.i0().L0(b11, b11, b11, b11, b11, false, null, new wg.b(this.f5822e, null, null), null, null, this.f5826i, this.f5825h, this.f5823f, this.f5824g, null, b11);
            i(b10);
        }
        b10.i0().b1(new dr0(this, b10, f10) { // from class: ai.bk1

            /* renamed from: w  reason: collision with root package name */
            public final jk1 f2383w;

            /* renamed from: x  reason: collision with root package name */
            public final rp0 f2384x;

            /* renamed from: y  reason: collision with root package name */
            public final lk0 f2385y;

            {
                this.f2383w = this;
                this.f2384x = b10;
                this.f2385y = f10;
            }

            @Override // ai.dr0
            public final void b(boolean z10) {
                this.f2383w.e(this.f2384x, this.f2385y, z10);
            }
        });
        b10.Z0(str, str2, null);
        return f10;
    }

    public final /* synthetic */ void e(rp0 rp0Var, lk0 lk0Var, boolean z10) {
        if (z10) {
            if (this.f5818a.f12647a != null && rp0Var.e() != null) {
                rp0Var.e().S5(this.f5818a.f12647a);
            }
            lk0Var.g();
            return;
        }
        lk0Var.e(new zzehs(1, "Html video Web View failed to load."));
    }

    public final /* synthetic */ s43 f(JSONObject jSONObject, final rp0 rp0Var) throws Exception {
        final lk0 f10 = lk0.f(rp0Var);
        if (this.f5818a.f12648b != null) {
            rp0Var.v0(ir0.e());
        } else {
            rp0Var.v0(ir0.d());
        }
        rp0Var.i0().b1(new dr0(this, rp0Var, f10) { // from class: ai.ck1

            /* renamed from: w  reason: collision with root package name */
            public final jk1 f2854w;

            /* renamed from: x  reason: collision with root package name */
            public final rp0 f2855x;

            /* renamed from: y  reason: collision with root package name */
            public final lk0 f2856y;

            {
                this.f2854w = this;
                this.f2855x = rp0Var;
                this.f2856y = f10;
            }

            @Override // ai.dr0
            public final void b(boolean z10) {
                this.f2854w.g(this.f2855x, this.f2856y, z10);
            }
        });
        rp0Var.l0("google.afma.nativeAds.renderVideo", jSONObject);
        return f10;
    }

    public final /* synthetic */ void g(rp0 rp0Var, lk0 lk0Var, boolean z10) {
        if (this.f5818a.f12647a != null && rp0Var.e() != null) {
            rp0Var.e().S5(this.f5818a.f12647a);
        }
        lk0Var.g();
    }

    public final void h(rp0 rp0Var) {
        i(rp0Var);
        rp0Var.c1("/video", q30.f8790l);
        rp0Var.c1("/videoMeta", q30.f8791m);
        rp0Var.c1("/precache", new go0());
        rp0Var.c1("/delayPageLoaded", q30.f8794p);
        rp0Var.c1("/instrument", q30.f8792n);
        rp0Var.c1("/log", q30.f8785g);
        rp0Var.c1("/click", q30.b(null));
        if (this.f5818a.f12648b != null) {
            rp0Var.i0().H0(true);
            rp0Var.c1("/open", new d40(null, null, null, null, null));
        } else {
            rp0Var.i0().H0(false);
        }
        if (wg.t.a().g(rp0Var.getContext())) {
            rp0Var.c1("/logScionEvent", new x30(rp0Var.getContext()));
        }
    }
}
