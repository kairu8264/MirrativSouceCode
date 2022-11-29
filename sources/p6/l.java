package p6;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public String f45996a;

    /* renamed from: d  reason: collision with root package name */
    public x f45999d;

    /* renamed from: f  reason: collision with root package name */
    public String f46001f;

    /* renamed from: g  reason: collision with root package name */
    public String f46002g;

    /* renamed from: h  reason: collision with root package name */
    public String f46003h;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f45997b = null;

    /* renamed from: c  reason: collision with root package name */
    public boolean f45998c = false;

    /* renamed from: e  reason: collision with root package name */
    public b f46000e = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Context f46004w;

        public a(Context context) {
            this.f46004w = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            new a1(this.f46004w).D();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public List<b0> f46006a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public List<p> f46007b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public Boolean f46008c = null;
    }

    public final boolean a(String str) {
        return b(str, false);
    }

    public final boolean b(String str, boolean z10) {
        if (this.f45999d != null) {
            return true;
        }
        if (str == null) {
            k.h().c("Adjust not initialized correctly", new Object[0]);
            return false;
        }
        if (z10) {
            k.h().b("Adjust not initialized, but %s saved for launch", str);
        } else {
            k.h().b("Adjust not initialized, can't perform %s", str);
        }
        return false;
    }

    public String c() {
        if (a("getAdid")) {
            return this.f45999d.c();
        }
        return null;
    }

    public void d(g gVar) {
        if (gVar == null) {
            k.h().c("AdjustConfig missing", new Object[0]);
        } else if (!gVar.e()) {
            k.h().c("AdjustConfig not initialized correctly", new Object[0]);
        } else if (this.f45999d != null) {
            k.h().c("Adjust already initialized", new Object[0]);
        } else {
            gVar.f45946u = this.f46000e;
            gVar.f45949x = this.f45996a;
            gVar.f45950y = this.f45997b;
            gVar.f45951z = this.f45998c;
            gVar.f45926a = this.f46001f;
            gVar.f45927b = this.f46002g;
            gVar.f45928c = this.f46003h;
            this.f45999d = k.a(gVar);
            g(gVar.f45929d);
        }
    }

    public void e() {
        if (a("onPause")) {
            this.f45999d.onPause();
        }
    }

    public void f() {
        if (a("onResume")) {
            this.f45999d.onResume();
        }
    }

    public final void g(Context context) {
        c1.Y(new a(context));
    }

    public void h(h hVar) {
        if (a("trackEvent")) {
            this.f45999d.l(hVar);
        }
    }
}
