package ai;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class og1 {

    /* renamed from: a  reason: collision with root package name */
    public int f7764a;

    /* renamed from: b  reason: collision with root package name */
    public pv f7765b;

    /* renamed from: c  reason: collision with root package name */
    public e00 f7766c;

    /* renamed from: d  reason: collision with root package name */
    public View f7767d;

    /* renamed from: e  reason: collision with root package name */
    public List<?> f7768e;

    /* renamed from: g  reason: collision with root package name */
    public bw f7770g;

    /* renamed from: h  reason: collision with root package name */
    public Bundle f7771h;

    /* renamed from: i  reason: collision with root package name */
    public rp0 f7772i;

    /* renamed from: j  reason: collision with root package name */
    public rp0 f7773j;

    /* renamed from: k  reason: collision with root package name */
    public rp0 f7774k;

    /* renamed from: l  reason: collision with root package name */
    public yh.a f7775l;

    /* renamed from: m  reason: collision with root package name */
    public View f7776m;

    /* renamed from: n  reason: collision with root package name */
    public View f7777n;

    /* renamed from: o  reason: collision with root package name */
    public yh.a f7778o;

    /* renamed from: p  reason: collision with root package name */
    public double f7779p;

    /* renamed from: q  reason: collision with root package name */
    public m00 f7780q;

    /* renamed from: r  reason: collision with root package name */
    public m00 f7781r;

    /* renamed from: s  reason: collision with root package name */
    public String f7782s;

    /* renamed from: v  reason: collision with root package name */
    public float f7785v;

    /* renamed from: w  reason: collision with root package name */
    public String f7786w;

    /* renamed from: t  reason: collision with root package name */
    public final s.g<String, wz> f7783t = new s.g<>();

    /* renamed from: u  reason: collision with root package name */
    public final s.g<String, String> f7784u = new s.g<>();

    /* renamed from: f  reason: collision with root package name */
    public List<bw> f7769f = Collections.emptyList();

    public static og1 B(o90 o90Var) {
        try {
            return G(I(o90Var.n(), o90Var), o90Var.o(), (View) H(o90Var.p()), o90Var.c(), o90Var.a(), o90Var.f(), o90Var.q(), o90Var.h(), (View) H(o90Var.l()), o90Var.w(), o90Var.j(), o90Var.k(), o90Var.i(), o90Var.e(), o90Var.g(), o90Var.u());
        } catch (RemoteException e10) {
            uj0.g("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }

    public static og1 C(l90 l90Var) {
        try {
            ng1 I = I(l90Var.B4(), null);
            e00 k52 = l90Var.k5();
            String c10 = l90Var.c();
            List<?> a10 = l90Var.a();
            String f10 = l90Var.f();
            Bundle f42 = l90Var.f4();
            String h10 = l90Var.h();
            yh.a C = l90Var.C();
            String g10 = l90Var.g();
            m00 e10 = l90Var.e();
            og1 og1Var = new og1();
            og1Var.f7764a = 1;
            og1Var.f7765b = I;
            og1Var.f7766c = k52;
            og1Var.f7767d = (View) H(l90Var.w());
            og1Var.Y("headline", c10);
            og1Var.f7768e = a10;
            og1Var.Y(TtmlNode.TAG_BODY, f10);
            og1Var.f7771h = f42;
            og1Var.Y("call_to_action", h10);
            og1Var.f7776m = (View) H(l90Var.r());
            og1Var.f7778o = C;
            og1Var.Y("advertiser", g10);
            og1Var.f7781r = e10;
            return og1Var;
        } catch (RemoteException e11) {
            uj0.g("Failed to get native ad from content ad mapper", e11);
            return null;
        }
    }

    public static og1 D(k90 k90Var) {
        try {
            ng1 I = I(k90Var.B4(), null);
            e00 k52 = k90Var.k5();
            String c10 = k90Var.c();
            List<?> a10 = k90Var.a();
            String f10 = k90Var.f();
            Bundle w10 = k90Var.w();
            String h10 = k90Var.h();
            yh.a Q5 = k90Var.Q5();
            String i10 = k90Var.i();
            String j10 = k90Var.j();
            double M1 = k90Var.M1();
            m00 e10 = k90Var.e();
            og1 og1Var = new og1();
            og1Var.f7764a = 2;
            og1Var.f7765b = I;
            og1Var.f7766c = k52;
            og1Var.f7767d = (View) H(k90Var.r());
            og1Var.Y("headline", c10);
            og1Var.f7768e = a10;
            og1Var.Y(TtmlNode.TAG_BODY, f10);
            og1Var.f7771h = w10;
            og1Var.Y("call_to_action", h10);
            og1Var.f7776m = (View) H(k90Var.D5());
            og1Var.f7778o = Q5;
            og1Var.Y("store", i10);
            og1Var.Y("price", j10);
            og1Var.f7779p = M1;
            og1Var.f7780q = e10;
            return og1Var;
        } catch (RemoteException e11) {
            uj0.g("Failed to get native ad from app install ad mapper", e11);
            return null;
        }
    }

    public static og1 E(k90 k90Var) {
        try {
            return G(I(k90Var.B4(), null), k90Var.k5(), (View) H(k90Var.r()), k90Var.c(), k90Var.a(), k90Var.f(), k90Var.w(), k90Var.h(), (View) H(k90Var.D5()), k90Var.Q5(), k90Var.i(), k90Var.j(), k90Var.M1(), k90Var.e(), null, 0.0f);
        } catch (RemoteException e10) {
            uj0.g("Failed to get native ad assets from app install ad mapper", e10);
            return null;
        }
    }

    public static og1 F(l90 l90Var) {
        try {
            return G(I(l90Var.B4(), null), l90Var.k5(), (View) H(l90Var.w()), l90Var.c(), l90Var.a(), l90Var.f(), l90Var.f4(), l90Var.h(), (View) H(l90Var.r()), l90Var.C(), null, null, -1.0d, l90Var.e(), l90Var.g(), 0.0f);
        } catch (RemoteException e10) {
            uj0.g("Failed to get native ad assets from content ad mapper", e10);
            return null;
        }
    }

    public static og1 G(pv pvVar, e00 e00Var, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, yh.a aVar, String str4, String str5, double d10, m00 m00Var, String str6, float f10) {
        og1 og1Var = new og1();
        og1Var.f7764a = 6;
        og1Var.f7765b = pvVar;
        og1Var.f7766c = e00Var;
        og1Var.f7767d = view;
        og1Var.Y("headline", str);
        og1Var.f7768e = list;
        og1Var.Y(TtmlNode.TAG_BODY, str2);
        og1Var.f7771h = bundle;
        og1Var.Y("call_to_action", str3);
        og1Var.f7776m = view2;
        og1Var.f7778o = aVar;
        og1Var.Y("store", str4);
        og1Var.Y("price", str5);
        og1Var.f7779p = d10;
        og1Var.f7780q = m00Var;
        og1Var.Y("advertiser", str6);
        og1Var.a0(f10);
        return og1Var;
    }

    public static <T> T H(yh.a aVar) {
        if (aVar == null) {
            return null;
        }
        return (T) yh.b.z0(aVar);
    }

    public static ng1 I(pv pvVar, o90 o90Var) {
        if (pvVar == null) {
            return null;
        }
        return new ng1(pvVar, o90Var);
    }

    public final synchronized void A(int i10) {
        this.f7764a = i10;
    }

    public final synchronized void J(pv pvVar) {
        this.f7765b = pvVar;
    }

    public final synchronized void K(e00 e00Var) {
        this.f7766c = e00Var;
    }

    public final synchronized void L(List<wz> list) {
        this.f7768e = list;
    }

    public final synchronized void M(List<bw> list) {
        this.f7769f = list;
    }

    public final synchronized void N(bw bwVar) {
        this.f7770g = bwVar;
    }

    public final synchronized void O(View view) {
        this.f7776m = view;
    }

    public final synchronized void P(View view) {
        this.f7777n = view;
    }

    public final synchronized void Q(double d10) {
        this.f7779p = d10;
    }

    public final synchronized void R(m00 m00Var) {
        this.f7780q = m00Var;
    }

    public final synchronized void S(m00 m00Var) {
        this.f7781r = m00Var;
    }

    public final synchronized void T(String str) {
        this.f7782s = str;
    }

    public final synchronized void U(rp0 rp0Var) {
        this.f7772i = rp0Var;
    }

    public final synchronized void V(rp0 rp0Var) {
        this.f7773j = rp0Var;
    }

    public final synchronized void W(rp0 rp0Var) {
        this.f7774k = rp0Var;
    }

    public final synchronized void X(yh.a aVar) {
        this.f7775l = aVar;
    }

    public final synchronized void Y(String str, String str2) {
        if (str2 == null) {
            this.f7784u.remove(str);
        } else {
            this.f7784u.put(str, str2);
        }
    }

    public final synchronized void Z(String str, wz wzVar) {
        if (wzVar == null) {
            this.f7783t.remove(str);
        } else {
            this.f7783t.put(str, wzVar);
        }
    }

    public final synchronized List<?> a() {
        return this.f7768e;
    }

    public final synchronized void a0(float f10) {
        this.f7785v = f10;
    }

    public final m00 b() {
        List<?> list = this.f7768e;
        if (list != null && list.size() != 0) {
            Object obj = this.f7768e.get(0);
            if (obj instanceof IBinder) {
                return l00.R5((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized void b0(String str) {
        this.f7786w = str;
    }

    public final synchronized List<bw> c() {
        return this.f7769f;
    }

    public final synchronized String c0(String str) {
        return this.f7784u.get(str);
    }

    public final synchronized bw d() {
        return this.f7770g;
    }

    public final synchronized int d0() {
        return this.f7764a;
    }

    public final synchronized String e() {
        return c0(TtmlNode.TAG_BODY);
    }

    public final synchronized pv e0() {
        return this.f7765b;
    }

    public final synchronized Bundle f() {
        if (this.f7771h == null) {
            this.f7771h = new Bundle();
        }
        return this.f7771h;
    }

    public final synchronized e00 f0() {
        return this.f7766c;
    }

    public final synchronized String g() {
        return c0("call_to_action");
    }

    public final synchronized View g0() {
        return this.f7767d;
    }

    public final synchronized View h() {
        return this.f7776m;
    }

    public final synchronized String h0() {
        return c0("headline");
    }

    public final synchronized View i() {
        return this.f7777n;
    }

    public final synchronized yh.a j() {
        return this.f7778o;
    }

    public final synchronized String k() {
        return c0("store");
    }

    public final synchronized String l() {
        return c0("price");
    }

    public final synchronized double m() {
        return this.f7779p;
    }

    public final synchronized m00 n() {
        return this.f7780q;
    }

    public final synchronized String o() {
        return c0("advertiser");
    }

    public final synchronized m00 p() {
        return this.f7781r;
    }

    public final synchronized String q() {
        return this.f7782s;
    }

    public final synchronized rp0 r() {
        return this.f7772i;
    }

    public final synchronized rp0 s() {
        return this.f7773j;
    }

    public final synchronized rp0 t() {
        return this.f7774k;
    }

    public final synchronized yh.a u() {
        return this.f7775l;
    }

    public final synchronized s.g<String, wz> v() {
        return this.f7783t;
    }

    public final synchronized float w() {
        return this.f7785v;
    }

    public final synchronized String x() {
        return this.f7786w;
    }

    public final synchronized s.g<String, String> y() {
        return this.f7784u;
    }

    public final synchronized void z() {
        rp0 rp0Var = this.f7772i;
        if (rp0Var != null) {
            rp0Var.destroy();
            this.f7772i = null;
        }
        rp0 rp0Var2 = this.f7773j;
        if (rp0Var2 != null) {
            rp0Var2.destroy();
            this.f7773j = null;
        }
        rp0 rp0Var3 = this.f7774k;
        if (rp0Var3 != null) {
            rp0Var3.destroy();
            this.f7774k = null;
        }
        this.f7775l = null;
        this.f7783t.clear();
        this.f7784u.clear();
        this.f7765b = null;
        this.f7766c = null;
        this.f7767d = null;
        this.f7768e = null;
        this.f7771h = null;
        this.f7776m = null;
        this.f7777n = null;
        this.f7778o = null;
        this.f7780q = null;
        this.f7781r = null;
        this.f7782s = null;
    }
}
