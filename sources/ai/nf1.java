package ai;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.dena.mirrorman.clientlog.logs.AdLogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nf1 implements wg1 {

    /* renamed from: a */
    public final Context f7295a;

    /* renamed from: b */
    public final zg1 f7296b;

    /* renamed from: c */
    public final JSONObject f7297c;

    /* renamed from: d */
    public final nl1 f7298d;

    /* renamed from: e */
    public final og1 f7299e;

    /* renamed from: f */
    public final u f7300f;

    /* renamed from: g */
    public final n51 f7301g;

    /* renamed from: h */
    public final t41 f7302h;

    /* renamed from: i */
    public final lc1 f7303i;

    /* renamed from: j */
    public final fl2 f7304j;

    /* renamed from: k */
    public final zj0 f7305k;

    /* renamed from: l */
    public final yl2 f7306l;

    /* renamed from: m */
    public final ax0 f7307m;

    /* renamed from: n */
    public final rh1 f7308n;

    /* renamed from: o */
    public final vh.f f7309o;

    /* renamed from: p */
    public final ic1 f7310p;

    /* renamed from: q */
    public final fr2 f7311q;

    /* renamed from: s */
    public boolean f7313s;

    /* renamed from: z */
    public vu f7320z;

    /* renamed from: r */
    public boolean f7312r = false;

    /* renamed from: t */
    public boolean f7314t = false;

    /* renamed from: u */
    public boolean f7315u = false;

    /* renamed from: v */
    public Point f7316v = new Point();

    /* renamed from: w */
    public Point f7317w = new Point();

    /* renamed from: x */
    public long f7318x = 0;

    /* renamed from: y */
    public long f7319y = 0;

    public nf1(Context context, zg1 zg1Var, JSONObject jSONObject, nl1 nl1Var, og1 og1Var, u uVar, n51 n51Var, t41 t41Var, lc1 lc1Var, fl2 fl2Var, zj0 zj0Var, yl2 yl2Var, ax0 ax0Var, rh1 rh1Var, vh.f fVar, ic1 ic1Var, fr2 fr2Var) {
        this.f7295a = context;
        this.f7296b = zg1Var;
        this.f7297c = jSONObject;
        this.f7298d = nl1Var;
        this.f7299e = og1Var;
        this.f7300f = uVar;
        this.f7301g = n51Var;
        this.f7302h = t41Var;
        this.f7303i = lc1Var;
        this.f7304j = fl2Var;
        this.f7305k = zj0Var;
        this.f7306l = yl2Var;
        this.f7307m = ax0Var;
        this.f7308n = rh1Var;
        this.f7309o = fVar;
        this.f7310p = ic1Var;
        this.f7311q = fr2Var;
    }

    public final void A(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) {
        String str2;
        rh.p.d("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put(AdLogBase.AD, this.f7297c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f7296b.g(this.f7299e.q()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f7299e.d0());
            jSONObject8.put("view_aware_api_used", z10);
            a00 a00Var = this.f7306l.f12655i;
            jSONObject8.put("custom_mute_requested", a00Var != null && a00Var.C);
            jSONObject8.put("custom_mute_enabled", (this.f7299e.c().isEmpty() || this.f7299e.d() == null) ? false : true);
            if (this.f7308n.b() != null && this.f7297c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f7309o.currentTimeMillis());
            if (this.f7315u && t()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f7296b.g(this.f7299e.q()) != null);
            try {
                JSONObject optJSONObject = this.f7297c.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f7300f.b().a(this.f7295a, optJSONObject.optString("click_string"), view);
            } catch (Exception e10) {
                uj0.d("Exception obtaining click signals", e10);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) ft.c().c(ox.Y2)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) ft.c().c(ox.f7995g6)).booleanValue() && vh.n.n()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) ft.c().c(ox.f8003h6)).booleanValue() && vh.n.n()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put(MRLog.ACTION_TYPE_CLICK, jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.f7309o.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.f7318x);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.f7319y);
            jSONObject7.put("touch_signal", jSONObject9);
            kk0.a(this.f7298d.d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e11) {
            uj0.d("Unable to create click JSON.", e11);
        }
    }

    @Override // ai.wg1
    public final void J() {
        try {
            vu vuVar = this.f7320z;
            if (vuVar != null) {
                vuVar.c();
            }
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // ai.wg1
    public final void R(String str) {
        A(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // ai.wg1
    public final void T(Bundle bundle) {
        if (bundle == null) {
            uj0.a("Touch event data is null. No touch event is reported.");
        } else if (!r("touch_reporting")) {
            uj0.c("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            float f10 = bundle.getFloat("x");
            float f11 = bundle.getFloat("y");
            this.f7300f.b().g((int) f10, (int) f11, bundle.getInt("duration_ms"));
        }
    }

    @Override // ai.wg1
    public final JSONObject a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject e10 = e(view, map, map2);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f7315u && t()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (e10 != null) {
                jSONObject.put("nas", e10);
            }
        } catch (JSONException e11) {
            uj0.d("Unable to create native click meta data JSON.", e11);
        }
        return jSONObject;
    }

    @Override // ai.wg1
    public final void a0(Bundle bundle) {
        if (bundle == null) {
            uj0.a("Click data is null. No click is reported.");
        } else if (!r("click_reporting")) {
            uj0.c("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            A(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, wg.t.d().R(bundle, null), false, false);
        }
    }

    @Override // ai.wg1
    public final void b(View view, Map<String, WeakReference<View>> map) {
        this.f7316v = new Point();
        this.f7317w = new Point();
        if (view != null) {
            this.f7310p.T0(view);
        }
        this.f7313s = false;
    }

    @Override // ai.wg1
    public final void c(View view, MotionEvent motionEvent, View view2) {
        this.f7316v = yg.c1.h(motionEvent, view2);
        long currentTimeMillis = this.f7309o.currentTimeMillis();
        this.f7319y = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f7318x = currentTimeMillis;
            this.f7317w = this.f7316v;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f7316v;
        obtain.setLocation(point.x, point.y);
        this.f7300f.d(obtain);
        obtain.recycle();
    }

    @Override // ai.wg1
    public final void d(View view) {
        if (!this.f7297c.optBoolean("custom_one_point_five_click_enabled", false)) {
            uj0.f("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        rh1 rh1Var = this.f7308n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(rh1Var);
        view.setClickable(true);
        rh1Var.C = new WeakReference<>(view);
    }

    @Override // ai.wg1
    public final JSONObject e(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject e10 = yg.c1.e(this.f7295a, map, map2, view);
        JSONObject b10 = yg.c1.b(this.f7295a, view);
        JSONObject c10 = yg.c1.c(view);
        JSONObject d10 = yg.c1.d(this.f7295a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", e10);
            jSONObject.put("ad_view_signal", b10);
            jSONObject.put("scroll_view_signal", c10);
            jSONObject.put("lock_screen_signal", d10);
            return jSONObject;
        } catch (JSONException e11) {
            uj0.d("Unable to create native ad view signals JSON.", e11);
            return null;
        }
    }

    @Override // ai.wg1
    public final void f(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f7316v = new Point();
        this.f7317w = new Point();
        if (!this.f7313s) {
            this.f7310p.S0(view);
            this.f7313s = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f7307m.j(this);
        boolean a10 = yg.c1.a(this.f7305k.f13015y);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null) {
                    if (a10) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> entry2 : map2.entrySet()) {
                View view3 = entry2.getValue().get();
                if (view3 != null) {
                    if (a10) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // ai.wg1
    public final void g() {
        this.f7315u = true;
    }

    @Override // ai.wg1
    public final boolean h(Bundle bundle) {
        if (!r("impression_reporting")) {
            uj0.c("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return u(null, null, null, null, null, wg.t.d().R(bundle, null), false);
    }

    @Override // ai.wg1
    public final boolean i() {
        return t();
    }

    @Override // ai.wg1
    public final void j(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        if (!this.f7315u) {
            uj0.a("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!t()) {
            uj0.a("Custom click reporting failed. Ad unit id not in the allow list.");
        } else {
            JSONObject e10 = yg.c1.e(this.f7295a, map, map2, view);
            JSONObject b10 = yg.c1.b(this.f7295a, view);
            JSONObject c10 = yg.c1.c(view);
            JSONObject d10 = yg.c1.d(this.f7295a, view);
            String s10 = s(null, map);
            A(view, b10, e10, c10, d10, s10, yg.c1.f(s10, this.f7295a, this.f7317w, this.f7316v), null, z10, true);
        }
    }

    @Override // ai.wg1
    public final void k(d20 d20Var) {
        if (!this.f7297c.optBoolean("custom_one_point_five_click_enabled", false)) {
            uj0.f("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.f7308n.a(d20Var);
        }
    }

    @Override // ai.wg1
    public final void l() {
        u(null, null, null, null, null, null, false);
    }

    @Override // ai.wg1
    public final void m() {
        if (this.f7297c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f7308n.c();
        }
    }

    @Override // ai.wg1
    public final void n(vu vuVar) {
        this.f7320z = vuVar;
    }

    @Override // ai.wg1
    public final void o(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        JSONObject e10 = yg.c1.e(this.f7295a, map, map2, view2);
        JSONObject b10 = yg.c1.b(this.f7295a, view2);
        JSONObject c10 = yg.c1.c(view2);
        JSONObject d10 = yg.c1.d(this.f7295a, view2);
        String s10 = s(view, map);
        A(true == ((Boolean) ft.c().c(ox.f7949b2)).booleanValue() ? view2 : view, b10, e10, c10, d10, s10, yg.c1.f(s10, this.f7295a, this.f7317w, this.f7316v), null, z10, false);
    }

    @Override // ai.wg1
    public final void p(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        String e10;
        JSONObject e11 = yg.c1.e(this.f7295a, map, map2, view);
        JSONObject b10 = yg.c1.b(this.f7295a, view);
        JSONObject c10 = yg.c1.c(view);
        JSONObject d10 = yg.c1.d(this.f7295a, view);
        if (((Boolean) ft.c().c(ox.f7940a2)).booleanValue()) {
            try {
                e10 = this.f7300f.b().e(this.f7295a, view, null);
            } catch (Exception unused) {
                uj0.c("Exception getting data.");
            }
            u(b10, e11, c10, d10, e10, null, yg.c1.i(this.f7295a, this.f7304j));
        }
        e10 = null;
        u(b10, e11, c10, d10, e10, null, yg.c1.i(this.f7295a, this.f7304j));
    }

    @Override // ai.wg1
    public final void q(yu yuVar) {
        try {
            if (this.f7314t) {
                return;
            }
            if (yuVar == null && this.f7299e.d() != null) {
                this.f7314t = true;
                this.f7311q.b(this.f7299e.d().a());
                J();
                return;
            }
            this.f7314t = true;
            this.f7311q.b(yuVar.a());
            J();
        } catch (RemoteException e10) {
            uj0.i("#007 Could not call remote method.", e10);
        }
    }

    public final boolean r(String str) {
        JSONObject optJSONObject = this.f7297c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    public final String s(View view, Map<String, WeakReference<View>> map) {
        if (map != null && view != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int d02 = this.f7299e.d0();
        if (d02 != 1) {
            if (d02 != 2) {
                if (d02 != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    public final boolean t() {
        return this.f7297c.optBoolean("allow_custom_click_gesture", false);
    }

    public final boolean u(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10) {
        rh.p.d("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(AdLogBase.AD, this.f7297c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) ft.c().c(ox.f7940a2)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z10);
            Context context = this.f7295a;
            JSONObject jSONObject7 = new JSONObject();
            wg.t.d();
            DisplayMetrics f02 = yg.d2.f0((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", dt.a().a(context, f02.widthPixels));
                jSONObject7.put("height", dt.a().a(context, f02.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) ft.c().c(ox.f7962c6)).booleanValue()) {
                this.f7298d.e("/clickRecorded", new kf1(this, null));
            } else {
                this.f7298d.e("/logScionEvent", new jf1(this, null));
            }
            this.f7298d.e("/nativeImpression", new lf1(this, null));
            kk0.a(this.f7298d.d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f7312r) {
                return true;
            }
            this.f7312r = wg.t.n().g(this.f7295a, this.f7305k.f13013w, this.f7304j.C.toString(), this.f7306l.f12652f);
            return true;
        } catch (JSONException e10) {
            uj0.d("Unable to create impression JSON.", e10);
            return false;
        }
    }

    @Override // ai.wg1
    public final void y() {
        this.f7298d.c();
    }

    @Override // ai.wg1
    public final void z() {
        rh.p.d("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AdLogBase.AD, this.f7297c);
            kk0.a(this.f7298d.d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e10) {
            uj0.d("", e10);
        }
    }
}
