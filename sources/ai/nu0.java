package ai;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfaw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nu0 extends qu {
    public final w42 A;
    public final tr1 B;
    public final ai0 C;
    public final rn1 D;
    public final ms1 E;
    public boolean F = false;

    /* renamed from: w  reason: collision with root package name */
    public final Context f7528w;

    /* renamed from: x  reason: collision with root package name */
    public final zj0 f7529x;

    /* renamed from: y  reason: collision with root package name */
    public final mn1 f7530y;

    /* renamed from: z  reason: collision with root package name */
    public final ty1<pm2, o02> f7531z;

    public nu0(Context context, zj0 zj0Var, mn1 mn1Var, ty1<pm2, o02> ty1Var, w42 w42Var, tr1 tr1Var, ai0 ai0Var, rn1 rn1Var, ms1 ms1Var) {
        this.f7528w = context;
        this.f7529x = zj0Var;
        this.f7530y = mn1Var;
        this.f7531z = ty1Var;
        this.A = w42Var;
        this.B = tr1Var;
        this.C = ai0Var;
        this.D = rn1Var;
        this.E = ms1Var;
    }

    @Override // ai.ru
    public final void F5(yh.a aVar, String str) {
        if (aVar == null) {
            uj0.c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) yh.b.z0(aVar);
        if (context == null) {
            uj0.c("Context is null. Failed to open debug menu.");
            return;
        }
        yg.w wVar = new yg.w(context);
        wVar.c(str);
        wVar.d(this.f7529x.f13013w);
        wVar.b();
    }

    @Override // ai.ru
    public final void J0(k50 k50Var) throws RemoteException {
        this.B.h(k50Var);
    }

    @Override // ai.ru
    public final void L3(z80 z80Var) throws RemoteException {
        this.f7530y.a(z80Var);
    }

    @Override // ai.ru
    public final void N5(String str, yh.a aVar) {
        String str2;
        Runnable runnable;
        ox.a(this.f7528w);
        if (((Boolean) ft.c().c(ox.f8119w2)).booleanValue()) {
            wg.t.d();
            str2 = yg.d2.c0(this.f7528w);
        } else {
            str2 = "";
        }
        boolean z10 = true;
        if (true != TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean booleanValue = ((Boolean) ft.c().c(ox.f8095t2)).booleanValue();
        gx<Boolean> gxVar = ox.B0;
        boolean booleanValue2 = booleanValue | ((Boolean) ft.c().c(gxVar)).booleanValue();
        if (((Boolean) ft.c().c(gxVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) yh.b.z0(aVar);
            runnable = new Runnable(this, runnable2) { // from class: ai.lu0

                /* renamed from: w  reason: collision with root package name */
                public final nu0 f6666w;

                /* renamed from: x  reason: collision with root package name */
                public final Runnable f6667x;

                {
                    this.f6666w = this;
                    this.f6667x = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final nu0 nu0Var = this.f6666w;
                    final Runnable runnable3 = this.f6667x;
                    hk0.f4882e.execute(new Runnable(nu0Var, runnable3) { // from class: ai.mu0

                        /* renamed from: w  reason: collision with root package name */
                        public final nu0 f7057w;

                        /* renamed from: x  reason: collision with root package name */
                        public final Runnable f7058x;

                        {
                            this.f7057w = nu0Var;
                            this.f7058x = runnable3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7057w.R5(this.f7058x);
                        }
                    });
                }
            };
        } else {
            z10 = booleanValue2;
            runnable = null;
        }
        if (z10) {
            wg.t.l().a(this.f7528w, this.f7529x, str, runnable);
        }
    }

    @Override // ai.ru
    public final void P2(pw pwVar) throws RemoteException {
        this.C.h(this.f7528w, pwVar);
    }

    @Override // ai.ru
    public final synchronized void R(String str) {
        ox.a(this.f7528w);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) ft.c().c(ox.f8095t2)).booleanValue()) {
                wg.t.l().a(this.f7528w, this.f7529x, str, null);
            }
        }
    }

    public final void R5(Runnable runnable) {
        rh.p.d("Adapters must be initialized on the main thread.");
        Map<String, u80> f10 = wg.t.h().p().n().f();
        if (f10.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                uj0.g("Could not initialize rewarded ads.", th2);
                return;
            }
        }
        if (this.f7530y.d()) {
            HashMap hashMap = new HashMap();
            for (u80 u80Var : f10.values()) {
                for (t80 t80Var : u80Var.f10646a) {
                    String str = t80Var.f10185k;
                    for (String str2 : t80Var.f10177c) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    uy1<pm2, o02> a10 = this.f7531z.a(str3, jSONObject);
                    if (a10 != null) {
                        pm2 pm2Var = a10.f10879b;
                        if (!pm2Var.q() && pm2Var.t()) {
                            pm2Var.u(this.f7528w, a10.f10880c, (List) entry.getValue());
                            String valueOf = String.valueOf(str3);
                            uj0.a(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (zzfaw e10) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb2.append("Failed to initialize rewarded video mediation adapter \"");
                    sb2.append(str3);
                    sb2.append("\"");
                    uj0.g(sb2.toString(), e10);
                }
            }
        }
    }

    @Override // ai.ru
    public final synchronized void c() {
        if (this.F) {
            uj0.f("Mobile ads is initialized already.");
            return;
        }
        ox.a(this.f7528w);
        wg.t.h().i(this.f7528w, this.f7529x);
        wg.t.j().d(this.f7528w);
        this.F = true;
        this.B.i();
        this.A.a();
        if (((Boolean) ft.c().c(ox.f8103u2)).booleanValue()) {
            this.D.a();
        }
        this.E.a();
        if (((Boolean) ft.c().c(ox.E6)).booleanValue()) {
            hk0.f4878a.execute(new Runnable(this) { // from class: ai.ku0

                /* renamed from: w  reason: collision with root package name */
                public final nu0 f6361w;

                {
                    this.f6361w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f6361w.zzb();
                }
            });
        }
    }

    @Override // ai.ru
    public final synchronized float i() {
        return wg.t.i().b();
    }

    @Override // ai.ru
    public final synchronized boolean j() {
        return wg.t.i().d();
    }

    @Override // ai.ru
    public final String k() {
        return this.f7529x.f13013w;
    }

    @Override // ai.ru
    public final List<d50> l() throws RemoteException {
        return this.B.j();
    }

    @Override // ai.ru
    public final synchronized void n1(float f10) {
        wg.t.i().a(f10);
    }

    @Override // ai.ru
    public final void o0(String str) {
        this.A.d(str);
    }

    @Override // ai.ru
    public final synchronized void p0(boolean z10) {
        wg.t.i().c(z10);
    }

    @Override // ai.ru
    public final void q() {
        this.B.g();
    }

    @Override // ai.ru
    public final void v1(cv cvVar) throws RemoteException {
        this.E.k(cvVar, ls1.API);
    }

    public final void zzb() {
        if (wg.t.h().p().Q()) {
            if (wg.t.n().e(this.f7528w, wg.t.h().p().W(), this.f7529x.f13013w)) {
                return;
            }
            wg.t.h().p().r(false);
            wg.t.h().p().i("");
        }
    }
}
