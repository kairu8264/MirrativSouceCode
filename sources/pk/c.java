package pk;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k3.k;
import ph.c;
import rh.p;
import vk.n;
import vk.t;

/* loaded from: classes.dex */
public class c {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f48421j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final Executor f48422k = new d();

    /* renamed from: l  reason: collision with root package name */
    public static final Map<String, c> f48423l = new s.a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f48424a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48425b;

    /* renamed from: c  reason: collision with root package name */
    public final h f48426c;

    /* renamed from: d  reason: collision with root package name */
    public final n f48427d;

    /* renamed from: g  reason: collision with root package name */
    public final t<dm.a> f48430g;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f48428e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f48429f = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f48431h = new CopyOnWriteArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final List<Object> f48432i = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z10);
    }

    @TargetApi(14)
    /* renamed from: pk.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0726c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public static AtomicReference<C0726c> f48433a = new AtomicReference<>();

        public static void c(Context context) {
            if (vh.n.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f48433a.get() == null) {
                    C0726c c0726c = new C0726c();
                    if (f48433a.compareAndSet(null, c0726c)) {
                        ph.c.c(application);
                        ph.c.b().a(c0726c);
                    }
                }
            }
        }

        @Override // ph.c.a
        public void a(boolean z10) {
            synchronized (c.f48421j) {
                Iterator it = new ArrayList(c.f48423l.values()).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.f48428e.get()) {
                        cVar.u(z10);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Executor {

        /* renamed from: w  reason: collision with root package name */
        public static final Handler f48434w = new Handler(Looper.getMainLooper());

        public d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f48434w.post(runnable);
        }
    }

    @TargetApi(24)
    /* loaded from: classes.dex */
    public static class e extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static AtomicReference<e> f48435b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        public final Context f48436a;

        public e(Context context) {
            this.f48436a = context;
        }

        public static void b(Context context) {
            if (f48435b.get() == null) {
                e eVar = new e(context);
                if (f48435b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f48436a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (c.f48421j) {
                for (c cVar : c.f48423l.values()) {
                    cVar.m();
                }
            }
            c();
        }
    }

    public c(final Context context, String str, h hVar) {
        this.f48424a = (Context) p.i(context);
        this.f48425b = p.e(str);
        this.f48426c = (h) p.i(hVar);
        this.f48427d = n.i(f48422k).d(vk.g.c(context, ComponentDiscoveryService.class).b()).c(new FirebaseCommonRegistrar()).b(vk.d.p(context, Context.class, new Class[0])).b(vk.d.p(this, c.class, new Class[0])).b(vk.d.p(hVar, h.class, new Class[0])).e();
        this.f48430g = new t<>(new xl.b() { // from class: pk.b
            @Override // xl.b
            public final Object get() {
                dm.a s10;
                s10 = c.this.s(context);
                return s10;
            }
        });
    }

    public static c i() {
        c cVar;
        synchronized (f48421j) {
            cVar = f48423l.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + vh.p.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    public static c n(Context context) {
        synchronized (f48421j) {
            if (f48423l.containsKey("[DEFAULT]")) {
                return i();
            }
            h a10 = h.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return o(context, a10);
        }
    }

    public static c o(Context context, h hVar) {
        return p(context, hVar, "[DEFAULT]");
    }

    public static c p(Context context, h hVar, String str) {
        c cVar;
        C0726c.c(context);
        String t10 = t(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f48421j) {
            Map<String, c> map = f48423l;
            boolean z10 = !map.containsKey(t10);
            p.m(z10, "FirebaseApp name " + t10 + " already exists!");
            p.j(context, "Application context cannot be null.");
            cVar = new c(context, t10, hVar);
            map.put(t10, cVar);
        }
        cVar.m();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dm.a s(Context context) {
        return new dm.a(context, l(), (ul.c) this.f48427d.a(ul.c.class));
    }

    public static String t(String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f48425b.equals(((c) obj).j());
        }
        return false;
    }

    public final void f() {
        p.m(!this.f48429f.get(), "FirebaseApp was deleted");
    }

    public <T> T g(Class<T> cls) {
        f();
        return (T) this.f48427d.a(cls);
    }

    public Context h() {
        f();
        return this.f48424a;
    }

    public int hashCode() {
        return this.f48425b.hashCode();
    }

    public String j() {
        f();
        return this.f48425b;
    }

    public h k() {
        f();
        return this.f48426c;
    }

    public String l() {
        return vh.c.b(j().getBytes(Charset.defaultCharset())) + "+" + vh.c.b(k().c().getBytes(Charset.defaultCharset()));
    }

    public final void m() {
        if (!k.a(this.f48424a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + j());
            e.b(this.f48424a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + j());
        this.f48427d.l(r());
    }

    public boolean q() {
        f();
        return this.f48430g.get().b();
    }

    public boolean r() {
        return "[DEFAULT]".equals(j());
    }

    public String toString() {
        return rh.n.c(this).a("name", this.f48425b).a("options", this.f48426c).toString();
    }

    public final void u(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (b bVar : this.f48431h) {
            bVar.a(z10);
        }
    }
}
