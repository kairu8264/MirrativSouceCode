package ai;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class at2 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<View, String> f2061a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<View, zs2> f2062b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, View> f2063c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<View> f2064d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet<String> f2065e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<String> f2066f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<String, String> f2067g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f2068h;

    public final HashSet<String> a() {
        return this.f2065e;
    }

    public final HashSet<String> b() {
        return this.f2066f;
    }

    public final String c(String str) {
        return this.f2067g.get(str);
    }

    public final void d() {
        ds2 a10 = ds2.a();
        if (a10 != null) {
            for (sr2 sr2Var : a10.f()) {
                View i10 = sr2Var.i();
                if (sr2Var.j()) {
                    String h10 = sr2Var.h();
                    if (i10 != null) {
                        String str = null;
                        if (i10.hasWindowFocus()) {
                            HashSet hashSet = new HashSet();
                            View view = i10;
                            while (true) {
                                if (view != null) {
                                    String b10 = ys2.b(view);
                                    if (b10 != null) {
                                        str = b10;
                                        break;
                                    }
                                    hashSet.add(view);
                                    ViewParent parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                } else {
                                    this.f2064d.addAll(hashSet);
                                    break;
                                }
                            }
                        } else {
                            str = "noWindowFocus";
                        }
                        if (str == null) {
                            this.f2065e.add(h10);
                            this.f2061a.put(i10, h10);
                            for (gs2 gs2Var : sr2Var.f()) {
                                View view2 = gs2Var.a().get();
                                if (view2 != null) {
                                    zs2 zs2Var = this.f2062b.get(view2);
                                    if (zs2Var != null) {
                                        zs2Var.a(sr2Var.h());
                                    } else {
                                        this.f2062b.put(view2, new zs2(gs2Var, sr2Var.h()));
                                    }
                                }
                            }
                        } else {
                            this.f2066f.add(h10);
                            this.f2063c.put(h10, i10);
                            this.f2067g.put(h10, str);
                        }
                    } else {
                        this.f2066f.add(h10);
                        this.f2067g.put(h10, "noAdView");
                    }
                }
            }
        }
    }

    public final void e() {
        this.f2061a.clear();
        this.f2062b.clear();
        this.f2063c.clear();
        this.f2064d.clear();
        this.f2065e.clear();
        this.f2066f.clear();
        this.f2067g.clear();
        this.f2068h = false;
    }

    public final void f() {
        this.f2068h = true;
    }

    public final String g(View view) {
        if (this.f2061a.size() == 0) {
            return null;
        }
        String str = this.f2061a.get(view);
        if (str != null) {
            this.f2061a.remove(view);
        }
        return str;
    }

    public final View h(String str) {
        return this.f2063c.get(str);
    }

    public final zs2 i(View view) {
        zs2 zs2Var = this.f2062b.get(view);
        if (zs2Var != null) {
            this.f2062b.remove(view);
        }
        return zs2Var;
    }

    public final int j(View view) {
        if (this.f2064d.contains(view)) {
            return 1;
        }
        return this.f2068h ? 2 : 3;
    }
}
