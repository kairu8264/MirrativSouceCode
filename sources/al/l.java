package al;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13835a;

    /* renamed from: b  reason: collision with root package name */
    public final pk.c f13836b;

    /* renamed from: c  reason: collision with root package name */
    public final r f13837c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13838d = System.currentTimeMillis();

    /* renamed from: e  reason: collision with root package name */
    public m f13839e;

    /* renamed from: f  reason: collision with root package name */
    public m f13840f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13841g;

    /* renamed from: h  reason: collision with root package name */
    public j f13842h;

    /* renamed from: i  reason: collision with root package name */
    public final v f13843i;

    /* renamed from: j  reason: collision with root package name */
    public final fl.f f13844j;

    /* renamed from: k  reason: collision with root package name */
    public final zk.b f13845k;

    /* renamed from: l  reason: collision with root package name */
    public final yk.a f13846l;

    /* renamed from: m  reason: collision with root package name */
    public final ExecutorService f13847m;

    /* renamed from: n  reason: collision with root package name */
    public final h f13848n;

    /* renamed from: o  reason: collision with root package name */
    public final xk.a f13849o;

    /* loaded from: classes2.dex */
    public class a implements Callable<vi.g<Void>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hl.e f13850a;

        public a(hl.e eVar) {
            this.f13850a = eVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public vi.g<Void> call() throws Exception {
            return l.this.i(this.f13850a);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ hl.e f13852w;

        public b(hl.e eVar) {
            this.f13852w = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.i(this.f13852w);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Callable<Boolean> {
        public c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() throws Exception {
            try {
                boolean d10 = l.this.f13839e.d();
                if (!d10) {
                    xk.f.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d10);
            } catch (Exception e10) {
                xk.f.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Callable<Boolean> {
        public d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() throws Exception {
            return Boolean.valueOf(l.this.f13842h.w());
        }
    }

    public l(pk.c cVar, v vVar, xk.a aVar, r rVar, zk.b bVar, yk.a aVar2, fl.f fVar, ExecutorService executorService) {
        this.f13836b = cVar;
        this.f13837c = rVar;
        this.f13835a = cVar.h();
        this.f13843i = vVar;
        this.f13849o = aVar;
        this.f13845k = bVar;
        this.f13846l = aVar2;
        this.f13847m = executorService;
        this.f13844j = fVar;
        this.f13848n = new h(executorService);
    }

    public static String l() {
        return "18.2.6";
    }

    public static boolean m(String str, boolean z10) {
        if (!z10) {
            xk.f.f().i("Configured not to require a build ID.");
            return true;
        } else if (TextUtils.isEmpty(str)) {
            Log.e("FirebaseCrashlytics", TopicConstant.SEPARATOR);
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", TopicConstant.SEPARATOR);
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e("FirebaseCrashlytics", TopicConstant.SEPARATOR);
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", TopicConstant.SEPARATOR);
            return false;
        } else {
            return true;
        }
    }

    public final void d() {
        try {
            this.f13841g = Boolean.TRUE.equals((Boolean) k0.d(this.f13848n.h(new d())));
        } catch (Exception unused) {
            this.f13841g = false;
        }
    }

    public vi.g<Boolean> e() {
        return this.f13842h.q();
    }

    public vi.g<Void> f() {
        return this.f13842h.v();
    }

    public boolean g() {
        return this.f13841g;
    }

    public boolean h() {
        return this.f13839e.c();
    }

    public final vi.g<Void> i(hl.e eVar) {
        q();
        try {
            this.f13845k.a(new zk.a() { // from class: al.k
                @Override // zk.a
                public final void a(String str) {
                    l.this.n(str);
                }
            });
            if (!eVar.a().a().f36851a) {
                xk.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return vi.j.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f13842h.D(eVar)) {
                xk.f.f().k("Previous sessions could not be finalized.");
            }
            return this.f13842h.U(eVar.b());
        } catch (Exception e10) {
            xk.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
            return vi.j.d(e10);
        } finally {
            p();
        }
    }

    public vi.g<Void> j(hl.e eVar) {
        return k0.e(this.f13847m, new a(eVar));
    }

    public final void k(hl.e eVar) {
        Future<?> submit = this.f13847m.submit(new b(eVar));
        xk.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            xk.f.f().e("Crashlytics was interrupted during initialization.", e10);
        } catch (ExecutionException e11) {
            xk.f.f().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            xk.f.f().e("Crashlytics timed out during initialization.", e12);
        }
    }

    public void n(String str) {
        this.f13842h.Y(System.currentTimeMillis() - this.f13838d, str);
    }

    public void o(Throwable th2) {
        this.f13842h.X(Thread.currentThread(), th2);
    }

    public void p() {
        this.f13848n.h(new c());
    }

    public void q() {
        this.f13848n.b();
        this.f13839e.a();
        xk.f.f().i("Initialization marker file was created.");
    }

    public boolean r(al.a aVar, hl.e eVar) {
        if (m(aVar.f13740b, g.k(this.f13835a, "com.crashlytics.RequireBuildId", true))) {
            try {
                this.f13840f = new m("crash_marker", this.f13844j);
                this.f13839e = new m("initialization_marker", this.f13844j);
                g0 g0Var = new g0();
                bl.b bVar = new bl.b(this.f13844j);
                this.f13842h = new j(this.f13835a, this.f13848n, this.f13843i, this.f13837c, this.f13844j, this.f13840f, aVar, g0Var, bVar, e0.g(this.f13835a, this.f13843i, this.f13844j, aVar, bVar, g0Var, new kl.a(1024, new kl.c(10)), eVar), this.f13849o, this.f13846l);
                boolean h10 = h();
                d();
                this.f13842h.B(Thread.getDefaultUncaughtExceptionHandler(), eVar);
                if (h10 && g.c(this.f13835a)) {
                    xk.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    k(eVar);
                    return false;
                }
                xk.f.f().b("Successfully configured exception handler.");
                return true;
            } catch (Exception e10) {
                xk.f.f().e("Crashlytics was not started due to an exception during initialization", e10);
                this.f13842h = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
    }

    public vi.g<Void> s() {
        return this.f13842h.R();
    }

    public void t(Boolean bool) {
        this.f13837c.g(bool);
    }

    public void u(String str, String str2) {
        this.f13842h.S(str, str2);
    }

    public void v(String str) {
        this.f13842h.T(str);
    }
}
