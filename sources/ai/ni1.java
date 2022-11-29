package ai;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ni1 implements wg1 {

    /* renamed from: a  reason: collision with root package name */
    public final o90 f7343a;

    /* renamed from: b  reason: collision with root package name */
    public final n51 f7344b;

    /* renamed from: c  reason: collision with root package name */
    public final t41 f7345c;

    /* renamed from: d  reason: collision with root package name */
    public final lc1 f7346d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f7347e;

    /* renamed from: f  reason: collision with root package name */
    public final fl2 f7348f;

    /* renamed from: g  reason: collision with root package name */
    public final zj0 f7349g;

    /* renamed from: h  reason: collision with root package name */
    public final yl2 f7350h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7351i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7352j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7353k = true;

    /* renamed from: l  reason: collision with root package name */
    public final k90 f7354l;

    /* renamed from: m  reason: collision with root package name */
    public final l90 f7355m;

    public ni1(k90 k90Var, l90 l90Var, o90 o90Var, n51 n51Var, t41 t41Var, lc1 lc1Var, Context context, fl2 fl2Var, zj0 zj0Var, yl2 yl2Var, byte[] bArr) {
        this.f7354l = k90Var;
        this.f7355m = l90Var;
        this.f7343a = o90Var;
        this.f7344b = n51Var;
        this.f7345c = t41Var;
        this.f7346d = lc1Var;
        this.f7347e = context;
        this.f7348f = fl2Var;
        this.f7349g = zj0Var;
        this.f7350h = yl2Var;
    }

    public static final HashMap<String, View> s(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    hashMap.put(entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // ai.wg1
    public final void J() {
        throw null;
    }

    @Override // ai.wg1
    public final void R(String str) {
    }

    @Override // ai.wg1
    public final void T(Bundle bundle) {
    }

    @Override // ai.wg1
    public final JSONObject a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    @Override // ai.wg1
    public final void a0(Bundle bundle) {
    }

    @Override // ai.wg1
    public final void b(View view, Map<String, WeakReference<View>> map) {
        try {
            yh.a h12 = yh.b.h1(view);
            o90 o90Var = this.f7343a;
            if (o90Var != null) {
                o90Var.l3(h12);
                return;
            }
            k90 k90Var = this.f7354l;
            if (k90Var != null) {
                k90Var.f4(h12);
                return;
            }
            l90 l90Var = this.f7355m;
            if (l90Var != null) {
                l90Var.p5(h12);
            }
        } catch (RemoteException e10) {
            uj0.g("Failed to call untrackView", e10);
        }
    }

    @Override // ai.wg1
    public final void c(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // ai.wg1
    public final void d(View view) {
    }

    @Override // ai.wg1
    public final JSONObject e(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    @Override // ai.wg1
    public final void f(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        yh.a l10;
        try {
            yh.a h12 = yh.b.h1(view);
            JSONObject jSONObject = this.f7348f.f4093g0;
            boolean z10 = true;
            if (((Boolean) ft.c().c(ox.f7948b1)).booleanValue() && jSONObject.length() != 0) {
                Map<String, WeakReference<View>> hashMap = map == null ? new HashMap<>() : map;
                Map<String, WeakReference<View>> hashMap2 = map2 == null ? new HashMap<>() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) ft.c().c(ox.f7957c1)).booleanValue() && next.equals("3010")) {
                                o90 o90Var = this.f7343a;
                                Object obj2 = null;
                                if (o90Var != null) {
                                    try {
                                        l10 = o90Var.l();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    k90 k90Var = this.f7354l;
                                    if (k90Var != null) {
                                        l10 = k90Var.D5();
                                    } else {
                                        l90 l90Var = this.f7355m;
                                        l10 = l90Var != null ? l90Var.r() : null;
                                    }
                                }
                                if (l10 != null) {
                                    obj2 = yh.b.z0(l10);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList<String> arrayList = new ArrayList();
                                yg.y0.a(optJSONArray, arrayList);
                                wg.t.d();
                                ClassLoader classLoader = this.f7347e.getClassLoader();
                                for (String str : arrayList) {
                                    if (Class.forName(str, false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z10 = false;
                        break;
                    }
                }
            }
            this.f7353k = z10;
            HashMap<String, View> s10 = s(map);
            HashMap<String, View> s11 = s(map2);
            o90 o90Var2 = this.f7343a;
            if (o90Var2 != null) {
                o90Var2.l4(h12, yh.b.h1(s10), yh.b.h1(s11));
                return;
            }
            k90 k90Var2 = this.f7354l;
            if (k90Var2 != null) {
                k90Var2.R5(h12, yh.b.h1(s10), yh.b.h1(s11));
                this.f7354l.L4(h12);
                return;
            }
            l90 l90Var2 = this.f7355m;
            if (l90Var2 != null) {
                l90Var2.D5(h12, yh.b.h1(s10), yh.b.h1(s11));
                this.f7355m.M1(h12);
            }
        } catch (RemoteException e10) {
            uj0.g("Failed to call trackView", e10);
        }
    }

    @Override // ai.wg1
    public final void g() {
        this.f7352j = true;
    }

    @Override // ai.wg1
    public final boolean h(Bundle bundle) {
        return false;
    }

    @Override // ai.wg1
    public final boolean i() {
        return this.f7348f.H;
    }

    @Override // ai.wg1
    public final void j(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        if (!this.f7352j) {
            uj0.f("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.f7348f.H) {
            uj0.f("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            r(view);
        }
    }

    @Override // ai.wg1
    public final void k(d20 d20Var) {
    }

    @Override // ai.wg1
    public final void l() {
    }

    @Override // ai.wg1
    public final void m() {
    }

    @Override // ai.wg1
    public final void n(vu vuVar) {
        uj0.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // ai.wg1
    public final void o(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        if (this.f7352j && this.f7348f.H) {
            return;
        }
        r(view);
    }

    @Override // ai.wg1
    public final void p(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.f7351i) {
                this.f7351i = wg.t.n().g(this.f7347e, this.f7349g.f13013w, this.f7348f.C.toString(), this.f7350h.f12652f);
            }
            if (this.f7353k) {
                o90 o90Var = this.f7343a;
                if (o90Var != null && !o90Var.m()) {
                    this.f7343a.C();
                    this.f7344b.zza();
                    return;
                }
                k90 k90Var = this.f7354l;
                if (k90Var != null && !k90Var.p()) {
                    this.f7354l.k();
                    this.f7344b.zza();
                    return;
                }
                l90 l90Var = this.f7355m;
                if (l90Var == null || l90Var.n()) {
                    return;
                }
                this.f7355m.i();
                this.f7344b.zza();
            }
        } catch (RemoteException e10) {
            uj0.g("Failed to call recordImpression", e10);
        }
    }

    @Override // ai.wg1
    public final void q(yu yuVar) {
        uj0.f("Mute This Ad is not supported for 3rd party ads");
    }

    public final void r(View view) {
        try {
            o90 o90Var = this.f7343a;
            if (o90Var != null && !o90Var.r()) {
                this.f7343a.t0(yh.b.h1(view));
                this.f7345c.onAdClicked();
                if (((Boolean) ft.c().c(ox.f7954b7)).booleanValue()) {
                    this.f7346d.zzb();
                    return;
                }
                return;
            }
            k90 k90Var = this.f7354l;
            if (k90Var != null && !k90Var.l()) {
                this.f7354l.h0(yh.b.h1(view));
                this.f7345c.onAdClicked();
                if (((Boolean) ft.c().c(ox.f7954b7)).booleanValue()) {
                    this.f7346d.zzb();
                    return;
                }
                return;
            }
            l90 l90Var = this.f7355m;
            if (l90Var == null || l90Var.o()) {
                return;
            }
            this.f7355m.z4(yh.b.h1(view));
            this.f7345c.onAdClicked();
            if (((Boolean) ft.c().c(ox.f7954b7)).booleanValue()) {
                this.f7346d.zzb();
            }
        } catch (RemoteException e10) {
            uj0.g("Failed to call handleClick", e10);
        }
    }

    @Override // ai.wg1
    public final void y() {
    }

    @Override // ai.wg1
    public final void z() {
    }
}
