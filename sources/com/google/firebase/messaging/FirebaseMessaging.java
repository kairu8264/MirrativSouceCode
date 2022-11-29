package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.e;
import com.google.firebase.messaging.f;
import em.a0;
import em.e0;
import em.h0;
import em.l;
import em.m;
import em.n;
import em.o0;
import em.q;
import em.s0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import rh.p;
import um.i;
import vi.h;
import vi.j;
import wl.a;
import zf.g;

/* loaded from: classes4.dex */
public class FirebaseMessaging {

    /* renamed from: n  reason: collision with root package name */
    public static final long f27976n = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o  reason: collision with root package name */
    public static f f27977o;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: p  reason: collision with root package name */
    public static g f27978p;

    /* renamed from: q  reason: collision with root package name */
    public static ScheduledExecutorService f27979q;

    /* renamed from: a  reason: collision with root package name */
    public final pk.c f27980a;

    /* renamed from: b  reason: collision with root package name */
    public final wl.a f27981b;

    /* renamed from: c  reason: collision with root package name */
    public final yl.f f27982c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f27983d;

    /* renamed from: e  reason: collision with root package name */
    public final a0 f27984e;

    /* renamed from: f  reason: collision with root package name */
    public final e f27985f;

    /* renamed from: g  reason: collision with root package name */
    public final a f27986g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f27987h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f27988i;

    /* renamed from: j  reason: collision with root package name */
    public final vi.g<s0> f27989j;

    /* renamed from: k  reason: collision with root package name */
    public final e0 f27990k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f27991l;

    /* renamed from: m  reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f27992m;

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final ul.d f27993a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f27994b;

        /* renamed from: c  reason: collision with root package name */
        public ul.b<pk.a> f27995c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f27996d;

        public a(ul.d dVar) {
            this.f27993a = dVar;
        }

        public synchronized void a() {
            if (this.f27994b) {
                return;
            }
            Boolean d10 = d();
            this.f27996d = d10;
            if (d10 == null) {
                ul.b<pk.a> bVar = new ul.b() { // from class: em.w
                    @Override // ul.b
                    public final void a(ul.a aVar) {
                        FirebaseMessaging.a.this.c(aVar);
                    }
                };
                this.f27995c = bVar;
                this.f27993a.a(pk.a.class, bVar);
            }
            this.f27994b = true;
        }

        public synchronized boolean b() {
            boolean q10;
            a();
            Boolean bool = this.f27996d;
            if (bool != null) {
                q10 = bool.booleanValue();
            } else {
                q10 = FirebaseMessaging.this.f27980a.q();
            }
            return q10;
        }

        public /* synthetic */ void c(ul.a aVar) {
            if (b()) {
                FirebaseMessaging.this.w();
            }
        }

        public final Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context h10 = FirebaseMessaging.this.f27980a.h();
            SharedPreferences sharedPreferences = h10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = h10.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(h10.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(pk.c cVar, wl.a aVar, xl.b<i> bVar, xl.b<vl.f> bVar2, yl.f fVar, g gVar, ul.d dVar) {
        this(cVar, aVar, bVar, bVar2, fVar, gVar, dVar, new e0(cVar.h()));
    }

    public static synchronized FirebaseMessaging f() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(pk.c.i());
        }
        return firebaseMessaging;
    }

    public static synchronized f g(Context context) {
        f fVar;
        synchronized (FirebaseMessaging.class) {
            if (f27977o == null) {
                f27977o = new f(context);
            }
            fVar = f27977o;
        }
        return fVar;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(pk.c cVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) cVar.g(FirebaseMessaging.class);
            p.j(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static g k() {
        return f27978p;
    }

    public String c() throws IOException {
        wl.a aVar = this.f27981b;
        if (aVar != null) {
            try {
                return (String) j.a(aVar.c());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final f.a j10 = j();
        if (!y(j10)) {
            return j10.f28007a;
        }
        final String c10 = e0.c(this.f27980a);
        try {
            return (String) j.a(this.f27985f.a(c10, new e.a() { // from class: em.t
                @Override // com.google.firebase.messaging.e.a
                public final vi.g start() {
                    return FirebaseMessaging.this.p(c10, j10);
                }
            }));
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    public void d(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f27979q == null) {
                f27979q = new ScheduledThreadPoolExecutor(1, new wh.a("TAG"));
            }
            f27979q.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    public Context e() {
        return this.f27983d;
    }

    public final String h() {
        return "[DEFAULT]".equals(this.f27980a.j()) ? "" : this.f27980a.l();
    }

    public vi.g<String> i() {
        wl.a aVar = this.f27981b;
        if (aVar != null) {
            return aVar.c();
        }
        final h hVar = new h();
        this.f27987h.execute(new Runnable() { // from class: em.p
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.q(hVar);
            }
        });
        return hVar.a();
    }

    public f.a j() {
        return g(this.f27983d).d(h(), e0.c(this.f27980a));
    }

    public final void l(String str) {
        if ("[DEFAULT]".equals(this.f27980a.j())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(this.f27980a.j());
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(valueOf) : new String("Invoking onNewToken for app: "));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new l(this.f27983d).g(intent);
        }
    }

    public boolean m() {
        return this.f27986g.b();
    }

    public boolean n() {
        return this.f27990k.g();
    }

    public /* synthetic */ vi.g o(String str, f.a aVar, String str2) throws Exception {
        g(this.f27983d).f(h(), str, str2, this.f27990k.a());
        if (aVar == null || !str2.equals(aVar.f28007a)) {
            l(str2);
        }
        return j.e(str2);
    }

    public /* synthetic */ vi.g p(final String str, final f.a aVar) {
        return this.f27984e.d().t(q.f30725w, new vi.f() { // from class: em.r
            @Override // vi.f
            public final vi.g a(Object obj) {
                return FirebaseMessaging.this.o(str, aVar, (String) obj);
            }
        });
    }

    public /* synthetic */ void q(h hVar) {
        try {
            hVar.c(c());
        } catch (Exception e10) {
            hVar.b(e10);
        }
    }

    public /* synthetic */ void r() {
        if (m()) {
            w();
        }
    }

    public /* synthetic */ void s(s0 s0Var) {
        if (m()) {
            s0Var.n();
        }
    }

    public /* synthetic */ void t() {
        h0.b(this.f27983d);
    }

    public synchronized void u(boolean z10) {
        this.f27991l = z10;
    }

    public final synchronized void v() {
        if (this.f27991l) {
            return;
        }
        x(0L);
    }

    public final void w() {
        wl.a aVar = this.f27981b;
        if (aVar != null) {
            aVar.b();
        } else if (y(j())) {
            v();
        }
    }

    public synchronized void x(long j10) {
        d(new o0(this, Math.min(Math.max(30L, j10 + j10), f27976n)), j10);
        this.f27991l = true;
    }

    public boolean y(f.a aVar) {
        return aVar == null || aVar.b(this.f27990k.a());
    }

    public FirebaseMessaging(pk.c cVar, wl.a aVar, xl.b<i> bVar, xl.b<vl.f> bVar2, yl.f fVar, g gVar, ul.d dVar, e0 e0Var) {
        this(cVar, aVar, fVar, gVar, dVar, e0Var, new a0(cVar, e0Var, bVar, bVar2, fVar), m.d(), m.a());
    }

    public FirebaseMessaging(pk.c cVar, wl.a aVar, yl.f fVar, g gVar, ul.d dVar, e0 e0Var, a0 a0Var, Executor executor, Executor executor2) {
        this.f27991l = false;
        f27978p = gVar;
        this.f27980a = cVar;
        this.f27981b = aVar;
        this.f27982c = fVar;
        this.f27986g = new a(dVar);
        Context h10 = cVar.h();
        this.f27983d = h10;
        n nVar = new n();
        this.f27992m = nVar;
        this.f27990k = e0Var;
        this.f27988i = executor;
        this.f27984e = a0Var;
        this.f27985f = new e(executor);
        this.f27987h = executor2;
        Context h11 = cVar.h();
        if (h11 instanceof Application) {
            ((Application) h11).registerActivityLifecycleCallbacks(nVar);
        } else {
            String valueOf = String.valueOf(h11);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 125);
            sb2.append("Context ");
            sb2.append(valueOf);
            sb2.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb2.toString());
        }
        if (aVar != null) {
            aVar.a(new a.InterfaceC0981a() { // from class: em.s
            });
        }
        executor2.execute(new Runnable() { // from class: em.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.r();
            }
        });
        vi.g<s0> d10 = s0.d(this, e0Var, a0Var, h10, m.e());
        this.f27989j = d10;
        d10.h(executor2, new vi.e() { // from class: em.o
            @Override // vi.e
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.s((s0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: em.v
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.t();
            }
        });
    }
}
