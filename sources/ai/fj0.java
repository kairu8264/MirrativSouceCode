package ai;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.internal.ads.zzcgw;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class fj0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4047a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final yg.u1 f4048b;

    /* renamed from: c  reason: collision with root package name */
    public final jj0 f4049c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4050d;

    /* renamed from: e  reason: collision with root package name */
    public Context f4051e;

    /* renamed from: f  reason: collision with root package name */
    public zj0 f4052f;

    /* renamed from: g  reason: collision with root package name */
    public tx f4053g;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f4054h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f4055i;

    /* renamed from: j  reason: collision with root package name */
    public final dj0 f4056j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f4057k;

    /* renamed from: l  reason: collision with root package name */
    public s43<ArrayList<String>> f4058l;

    public fj0() {
        yg.u1 u1Var = new yg.u1();
        this.f4048b = u1Var;
        this.f4049c = new jj0(dt.c(), u1Var);
        this.f4050d = false;
        this.f4053g = null;
        this.f4054h = null;
        this.f4055i = new AtomicInteger(0);
        this.f4056j = new dj0(null);
        this.f4057k = new Object();
    }

    public final tx e() {
        tx txVar;
        synchronized (this.f4047a) {
            txVar = this.f4053g;
        }
        return txVar;
    }

    public final void f(Boolean bool) {
        synchronized (this.f4047a) {
            this.f4054h = bool;
        }
    }

    public final Boolean g() {
        Boolean bool;
        synchronized (this.f4047a) {
            bool = this.f4054h;
        }
        return bool;
    }

    public final void h() {
        this.f4056j.a();
    }

    @TargetApi(23)
    public final void i(Context context, zj0 zj0Var) {
        tx txVar;
        synchronized (this.f4047a) {
            if (!this.f4050d) {
                this.f4051e = context.getApplicationContext();
                this.f4052f = zj0Var;
                wg.t.g().b(this.f4049c);
                this.f4048b.p(this.f4051e);
                pd0.d(this.f4051e, this.f4052f);
                wg.t.m();
                if (!xy.f12356c.e().booleanValue()) {
                    yg.p1.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    txVar = null;
                } else {
                    txVar = new tx();
                }
                this.f4053g = txVar;
                if (txVar != null) {
                    kk0.a(new cj0(this).c(), "AppState.registerCsiReporter");
                }
                this.f4050d = true;
                r();
            }
        }
        wg.t.d().P(context, zj0Var.f13013w);
    }

    public final Resources j() {
        if (this.f4052f.f13016z) {
            return this.f4051e.getResources();
        }
        try {
            xj0.b(this.f4051e).getResources();
            return null;
        } catch (zzcgw e10) {
            uj0.g("Cannot load resource from dynamite apk or local jar", e10);
            return null;
        }
    }

    public final void k(Throwable th2, String str) {
        pd0.d(this.f4051e, this.f4052f).b(th2, str);
    }

    public final void l(Throwable th2, String str) {
        pd0.d(this.f4051e, this.f4052f).a(th2, str, kz.f6414g.e().floatValue());
    }

    public final void m() {
        this.f4055i.incrementAndGet();
    }

    public final void n() {
        this.f4055i.decrementAndGet();
    }

    public final int o() {
        return this.f4055i.get();
    }

    public final yg.r1 p() {
        yg.u1 u1Var;
        synchronized (this.f4047a) {
            u1Var = this.f4048b;
        }
        return u1Var;
    }

    public final Context q() {
        return this.f4051e;
    }

    public final s43<ArrayList<String>> r() {
        if (vh.n.c() && this.f4051e != null) {
            if (!((Boolean) ft.c().c(ox.N1)).booleanValue()) {
                synchronized (this.f4057k) {
                    s43<ArrayList<String>> s43Var = this.f4058l;
                    if (s43Var != null) {
                        return s43Var;
                    }
                    s43<ArrayList<String>> h10 = hk0.f4878a.h(new Callable(this) { // from class: ai.bj0

                        /* renamed from: a  reason: collision with root package name */
                        public final fj0 f2361a;

                        {
                            this.f2361a = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f2361a.t();
                        }
                    });
                    this.f4058l = h10;
                    return h10;
                }
            }
        }
        return j43.a(new ArrayList());
    }

    public final jj0 s() {
        return this.f4049c;
    }

    public final /* synthetic */ ArrayList t() throws Exception {
        Context a10 = we0.a(this.f4051e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f10 = xh.c.a(a10).f(a10.getApplicationInfo().packageName, 4096);
            if (f10.requestedPermissions != null && f10.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = f10.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((f10.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }
}
