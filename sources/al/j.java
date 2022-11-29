package al;

import al.p;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import androidx.appcompat.widget.ActivityChooserModel;
import cl.c0;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: r  reason: collision with root package name */
    public static final FilenameFilter f13781r = al.i.f13779a;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13782a;

    /* renamed from: b  reason: collision with root package name */
    public final r f13783b;

    /* renamed from: c  reason: collision with root package name */
    public final m f13784c;

    /* renamed from: d  reason: collision with root package name */
    public final g0 f13785d;

    /* renamed from: e  reason: collision with root package name */
    public final al.h f13786e;

    /* renamed from: f  reason: collision with root package name */
    public final v f13787f;

    /* renamed from: g  reason: collision with root package name */
    public final fl.f f13788g;

    /* renamed from: h  reason: collision with root package name */
    public final al.a f13789h;

    /* renamed from: i  reason: collision with root package name */
    public final bl.b f13790i;

    /* renamed from: j  reason: collision with root package name */
    public final xk.a f13791j;

    /* renamed from: k  reason: collision with root package name */
    public final yk.a f13792k;

    /* renamed from: l  reason: collision with root package name */
    public final e0 f13793l;

    /* renamed from: m  reason: collision with root package name */
    public p f13794m;

    /* renamed from: n  reason: collision with root package name */
    public final vi.h<Boolean> f13795n = new vi.h<>();

    /* renamed from: o  reason: collision with root package name */
    public final vi.h<Boolean> f13796o = new vi.h<>();

    /* renamed from: p  reason: collision with root package name */
    public final vi.h<Void> f13797p = new vi.h<>();

    /* renamed from: q  reason: collision with root package name */
    public final AtomicBoolean f13798q = new AtomicBoolean(false);

    /* loaded from: classes2.dex */
    public class a implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f13799a;

        public a(long j10) {
            this.f13799a = j10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f13799a);
            j.this.f13792k.a("_ae", bundle);
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements p.a {
        public b() {
        }

        @Override // al.p.a
        public void a(hl.e eVar, Thread thread, Throwable th2) {
            j.this.K(eVar, thread, th2);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Callable<vi.g<Void>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f13802a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Throwable f13803b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Thread f13804c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ hl.e f13805d;

        /* loaded from: classes2.dex */
        public class a implements vi.f<il.a, Void> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Executor f13807a;

            public a(Executor executor) {
                this.f13807a = executor;
            }

            @Override // vi.f
            /* renamed from: b */
            public vi.g<Void> a(il.a aVar) throws Exception {
                if (aVar == null) {
                    xk.f.f().k("Received null app settings, cannot send reports at crash time.");
                    return vi.j.e(null);
                }
                return vi.j.g(j.this.P(), j.this.f13793l.w(this.f13807a));
            }
        }

        public c(long j10, Throwable th2, Thread thread, hl.e eVar) {
            this.f13802a = j10;
            this.f13803b = th2;
            this.f13804c = thread;
            this.f13805d = eVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public vi.g<Void> call() throws Exception {
            long J = j.J(this.f13802a);
            String G = j.this.G();
            if (G != null) {
                j.this.f13784c.a();
                j.this.f13793l.r(this.f13803b, this.f13804c, G, J);
                j.this.A(this.f13802a);
                j.this.x(this.f13805d);
                j.this.z();
                if (j.this.f13783b.d()) {
                    Executor c10 = j.this.f13786e.c();
                    return this.f13805d.b().t(c10, new a(c10));
                }
                return vi.j.e(null);
            }
            xk.f.f().d("Tried to write a fatal exception while no session was open.");
            return vi.j.e(null);
        }
    }

    /* loaded from: classes2.dex */
    public class d implements vi.f<Void, Boolean> {
        public d() {
        }

        @Override // vi.f
        /* renamed from: b */
        public vi.g<Boolean> a(Void r12) throws Exception {
            return vi.j.e(Boolean.TRUE);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements vi.f<Boolean, Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vi.g f13810a;

        /* loaded from: classes2.dex */
        public class a implements Callable<vi.g<Void>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Boolean f13812a;

            /* renamed from: al.j$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class C0036a implements vi.f<il.a, Void> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ Executor f13814a;

                public C0036a(Executor executor) {
                    this.f13814a = executor;
                }

                @Override // vi.f
                /* renamed from: b */
                public vi.g<Void> a(il.a aVar) throws Exception {
                    if (aVar != null) {
                        j.this.P();
                        j.this.f13793l.w(this.f13814a);
                        j.this.f13797p.e(null);
                        return vi.j.e(null);
                    }
                    xk.f.f().k("Received null app settings at app startup. Cannot send cached reports");
                    return vi.j.e(null);
                }
            }

            public a(Boolean bool) {
                this.f13812a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public vi.g<Void> call() throws Exception {
                if (!this.f13812a.booleanValue()) {
                    xk.f.f().i("Deleting cached crash reports...");
                    j.u(j.this.N());
                    j.this.f13793l.v();
                    j.this.f13797p.e(null);
                    return vi.j.e(null);
                }
                xk.f.f().b("Sending cached crash reports...");
                j.this.f13783b.c(this.f13812a.booleanValue());
                Executor c10 = j.this.f13786e.c();
                return e.this.f13810a.t(c10, new C0036a(c10));
            }
        }

        public e(vi.g gVar) {
            this.f13810a = gVar;
        }

        @Override // vi.f
        /* renamed from: b */
        public vi.g<Void> a(Boolean bool) throws Exception {
            return j.this.f13786e.i(new a(bool));
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f13816a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f13817b;

        public f(long j10, String str) {
            this.f13816a = j10;
            this.f13817b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            if (j.this.L()) {
                return null;
            }
            j.this.f13790i.g(this.f13816a, this.f13817b);
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ long f13819w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Throwable f13820x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Thread f13821y;

        public g(long j10, Throwable th2, Thread thread) {
            this.f13819w = j10;
            this.f13820x = th2;
            this.f13821y = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j.this.L()) {
                return;
            }
            long J = j.J(this.f13819w);
            String G = j.this.G();
            if (G != null) {
                j.this.f13793l.s(this.f13820x, this.f13821y, G, J);
            } else {
                xk.f.f().k("Tried to write a non-fatal exception while no session was open.");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class h implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g0 f13823a;

        public h(g0 g0Var) {
            this.f13823a = g0Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            String G = j.this.G();
            if (G != null) {
                j.this.f13793l.u(G);
                new z(j.this.f13788g).k(G, this.f13823a);
                return null;
            }
            xk.f.f().b("Tried to cache user data while no session was open.");
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class i implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f13825a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f13826b;

        public i(Map map, boolean z10) {
            this.f13825a = map;
            this.f13826b = z10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            new z(j.this.f13788g).j(j.this.G(), this.f13825a, this.f13826b);
            return null;
        }
    }

    /* renamed from: al.j$j  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class CallableC0037j implements Callable<Void> {
        public CallableC0037j() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            j.this.z();
            return null;
        }
    }

    public j(Context context, al.h hVar, v vVar, r rVar, fl.f fVar, m mVar, al.a aVar, g0 g0Var, bl.b bVar, e0 e0Var, xk.a aVar2, yk.a aVar3) {
        this.f13782a = context;
        this.f13786e = hVar;
        this.f13787f = vVar;
        this.f13783b = rVar;
        this.f13788g = fVar;
        this.f13784c = mVar;
        this.f13789h = aVar;
        this.f13785d = g0Var;
        this.f13790i = bVar;
        this.f13791j = aVar2;
        this.f13792k = aVar3;
        this.f13793l = e0Var;
    }

    public static boolean E() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static long H() {
        return J(System.currentTimeMillis());
    }

    public static List<a0> I(xk.g gVar, String str, fl.f fVar, byte[] bArr) {
        z zVar = new z(fVar);
        File c10 = zVar.c(str);
        File b10 = zVar.b(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new al.e("logs_file", "logs", bArr));
        arrayList.add(new u("crash_meta_file", TtmlNode.TAG_METADATA, gVar.c()));
        arrayList.add(new u("session_meta_file", "session", gVar.f()));
        arrayList.add(new u("app_meta_file", "app", gVar.d()));
        arrayList.add(new u("device_meta_file", "device", gVar.a()));
        arrayList.add(new u("os_meta_file", LogBase.OS, gVar.e()));
        arrayList.add(new u("minidump_file", "minidump", gVar.b()));
        arrayList.add(new u("user_meta_file", MRLog.TARGET_TYPE_USER, c10));
        arrayList.add(new u("keys_file", "keys", b10));
        return arrayList;
    }

    public static long J(long j10) {
        return j10 / 1000;
    }

    public static c0.a r(v vVar, al.a aVar) {
        return c0.a.b(vVar.f(), aVar.f13743e, aVar.f13744f, vVar.a(), s.a(aVar.f13741c).c(), aVar.f13745g);
    }

    public static c0.b s(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return c0.b.c(al.g.l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), al.g.s(), statFs.getBlockCount() * statFs.getBlockSize(), al.g.y(context), al.g.m(context), Build.MANUFACTURER, Build.PRODUCT);
    }

    public static c0.c t(Context context) {
        return c0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, al.g.z(context));
    }

    public static void u(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    public final void A(long j10) {
        try {
            fl.f fVar = this.f13788g;
            if (fVar.d(".ae" + j10).createNewFile()) {
                return;
            }
            throw new IOException("Create new file failed.");
        } catch (IOException e10) {
            xk.f.f().l("Could not create app exception marker file.", e10);
        }
    }

    public void B(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, hl.e eVar) {
        Q();
        p pVar = new p(new b(), eVar, uncaughtExceptionHandler, this.f13791j);
        this.f13794m = pVar;
        Thread.setDefaultUncaughtExceptionHandler(pVar);
    }

    public final void C(String str) {
        xk.f f10 = xk.f.f();
        f10.i("Finalizing native report for session " + str);
        xk.g a10 = this.f13791j.a(str);
        File b10 = a10.b();
        if (b10 != null && b10.exists()) {
            long lastModified = b10.lastModified();
            bl.b bVar = new bl.b(this.f13788g, str);
            File h10 = this.f13788g.h(str);
            if (!h10.isDirectory()) {
                xk.f.f().k("Couldn't create directory to store native session files, aborting.");
                return;
            }
            A(lastModified);
            List<a0> I = I(a10, str, this.f13788g, bVar.b());
            b0.b(h10, I);
            xk.f.f().b("CrashlyticsController#finalizePreviousNativeSession");
            this.f13793l.h(str, I);
            bVar.a();
            return;
        }
        xk.f f11 = xk.f.f();
        f11.k("No minidump data found for session " + str);
    }

    public boolean D(hl.e eVar) {
        this.f13786e.b();
        if (L()) {
            xk.f.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        xk.f.f().i("Finalizing previously open sessions.");
        try {
            y(true, eVar);
            xk.f.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            xk.f.f().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final Context F() {
        return this.f13782a;
    }

    public final String G() {
        SortedSet<String> n10 = this.f13793l.n();
        if (n10.isEmpty()) {
            return null;
        }
        return n10.first();
    }

    public synchronized void K(hl.e eVar, Thread thread, Throwable th2) {
        xk.f f10 = xk.f.f();
        f10.b("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
        try {
            k0.d(this.f13786e.i(new c(System.currentTimeMillis(), th2, thread, eVar)));
        } catch (Exception e10) {
            xk.f.f().e("Error handling uncaught exception", e10);
        }
    }

    public boolean L() {
        p pVar = this.f13794m;
        return pVar != null && pVar.a();
    }

    public List<File> N() {
        return this.f13788g.e(f13781r);
    }

    public final vi.g<Void> O(long j10) {
        if (E()) {
            xk.f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return vi.j.e(null);
        }
        xk.f.f().b("Logging app exception event to Firebase Analytics");
        return vi.j.c(new ScheduledThreadPoolExecutor(1), new a(j10));
    }

    public final vi.g<Void> P() {
        ArrayList arrayList = new ArrayList();
        for (File file : N()) {
            try {
                arrayList.add(O(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                xk.f f10 = xk.f.f();
                f10.k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return vi.j.f(arrayList);
    }

    public void Q() {
        this.f13786e.h(new CallableC0037j());
    }

    public vi.g<Void> R() {
        this.f13796o.e(Boolean.TRUE);
        return this.f13797p.a();
    }

    public void S(String str, String str2) {
        try {
            this.f13785d.d(str, str2);
            o(this.f13785d.a(), false);
        } catch (IllegalArgumentException e10) {
            Context context = this.f13782a;
            if (context != null && al.g.w(context)) {
                throw e10;
            }
            xk.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void T(String str) {
        this.f13785d.f(str);
        p(this.f13785d);
    }

    public vi.g<Void> U(vi.g<il.a> gVar) {
        if (!this.f13793l.l()) {
            xk.f.f().i("No crash reports are available to be sent.");
            this.f13795n.e(Boolean.FALSE);
            return vi.j.e(null);
        }
        xk.f.f().i("Crash reports are available to be sent.");
        return V().u(new e(gVar));
    }

    public final vi.g<Boolean> V() {
        if (this.f13783b.d()) {
            xk.f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f13795n.e(Boolean.FALSE);
            return vi.j.e(Boolean.TRUE);
        }
        xk.f.f().b("Automatic data collection is disabled.");
        xk.f.f().i("Notifying that unsent reports are available.");
        this.f13795n.e(Boolean.TRUE);
        vi.g<TContinuationResult> u10 = this.f13783b.i().u(new d());
        xk.f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return k0.j(u10, this.f13796o.a());
    }

    public final void W(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f13782a.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                bl.b bVar = new bl.b(this.f13788g, str);
                g0 g0Var = new g0();
                g0Var.e(new z(this.f13788g).f(str));
                this.f13793l.t(str, historicalProcessExitReasons, bVar, g0Var);
                return;
            }
            xk.f f10 = xk.f.f();
            f10.i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        xk.f f11 = xk.f.f();
        f11.i("ANR feature enabled, but device is API " + i10);
    }

    public void X(Thread thread, Throwable th2) {
        this.f13786e.g(new g(System.currentTimeMillis(), th2, thread));
    }

    public void Y(long j10, String str) {
        this.f13786e.h(new f(j10, str));
    }

    public final void o(Map<String, String> map, boolean z10) {
        this.f13786e.h(new i(map, z10));
    }

    public final void p(g0 g0Var) {
        this.f13786e.h(new h(g0Var));
    }

    public vi.g<Boolean> q() {
        if (!this.f13798q.compareAndSet(false, true)) {
            xk.f.f().k("checkForUnsentReports should only be called once per execution.");
            return vi.j.e(Boolean.FALSE);
        }
        return this.f13795n.a();
    }

    public vi.g<Void> v() {
        this.f13796o.e(Boolean.FALSE);
        return this.f13797p.a();
    }

    public boolean w() {
        if (!this.f13784c.c()) {
            String G = G();
            return G != null && this.f13791j.d(G);
        }
        xk.f.f().i("Found previous crash marker.");
        this.f13784c.d();
        return true;
    }

    public void x(hl.e eVar) {
        y(false, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(boolean z10, hl.e eVar) {
        ArrayList arrayList = new ArrayList(this.f13793l.n());
        if (arrayList.size() <= z10) {
            xk.f.f().i("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z10 ? 1 : 0);
        if (eVar.a().a().f36852b) {
            W(str);
        } else {
            xk.f.f().i("ANR feature disabled.");
        }
        if (this.f13791j.d(str)) {
            C(str);
        }
        this.f13793l.i(H(), z10 != 0 ? (String) arrayList.get(0) : null);
    }

    public final void z() {
        long H = H();
        String fVar = new al.f(this.f13787f).toString();
        xk.f f10 = xk.f.f();
        f10.b("Opening a new session with ID " + fVar);
        this.f13791j.c(fVar, String.format(Locale.US, "Crashlytics Android SDK/%s", l.l()), H, cl.c0.b(r(this.f13787f, this.f13789h), t(F()), s(F())));
        this.f13790i.e(fVar);
        this.f13793l.o(fVar, H);
    }
}
