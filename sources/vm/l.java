package vm;

import android.content.Context;
import com.dena.mirrorman.net.api.Referer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: j  reason: collision with root package name */
    public static final vh.f f57517j = vh.i.b();

    /* renamed from: k  reason: collision with root package name */
    public static final Random f57518k = new Random();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, e> f57519a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f57520b;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f57521c;

    /* renamed from: d  reason: collision with root package name */
    public final pk.c f57522d;

    /* renamed from: e  reason: collision with root package name */
    public final yl.f f57523e;

    /* renamed from: f  reason: collision with root package name */
    public final qk.b f57524f;

    /* renamed from: g  reason: collision with root package name */
    public final xl.b<tk.a> f57525g;

    /* renamed from: h  reason: collision with root package name */
    public final String f57526h;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, String> f57527i;

    public l(Context context, pk.c cVar, yl.f fVar, qk.b bVar, xl.b<tk.a> bVar2) {
        this(context, Executors.newCachedThreadPool(), cVar, fVar, bVar, bVar2, true);
    }

    public static com.google.firebase.remoteconfig.internal.c i(Context context, String str, String str2) {
        return new com.google.firebase.remoteconfig.internal.c(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, Referer.SETTINGS), 0));
    }

    public static wm.m j(pk.c cVar, String str, xl.b<tk.a> bVar) {
        if (l(cVar) && str.equals("firebase")) {
            return new wm.m(bVar);
        }
        return null;
    }

    public static boolean k(pk.c cVar, String str) {
        return str.equals("firebase") && l(cVar);
    }

    public static boolean l(pk.c cVar) {
        return cVar.j().equals("[DEFAULT]");
    }

    public static /* synthetic */ tk.a m() {
        return null;
    }

    public synchronized e b(String str) {
        wm.d d10;
        wm.d d11;
        wm.d d12;
        com.google.firebase.remoteconfig.internal.c i10;
        wm.j h10;
        d10 = d(str, "fetch");
        d11 = d(str, "activate");
        d12 = d(str, "defaults");
        i10 = i(this.f57520b, this.f57526h, str);
        h10 = h(d11, d12);
        final wm.m j10 = j(this.f57522d, str, this.f57525g);
        if (j10 != null) {
            h10.b(new vh.d() { // from class: vm.j
                @Override // vh.d
                public final void a(Object obj, Object obj2) {
                    wm.m.this.a((String) obj, (com.google.firebase.remoteconfig.internal.a) obj2);
                }
            });
        }
        return c(this.f57522d, str, this.f57523e, this.f57524f, this.f57521c, d10, d11, d12, f(str, d10, i10), h10, i10);
    }

    public synchronized e c(pk.c cVar, String str, yl.f fVar, qk.b bVar, Executor executor, wm.d dVar, wm.d dVar2, wm.d dVar3, com.google.firebase.remoteconfig.internal.b bVar2, wm.j jVar, com.google.firebase.remoteconfig.internal.c cVar2) {
        if (!this.f57519a.containsKey(str)) {
            e eVar = new e(this.f57520b, cVar, fVar, k(cVar, str) ? bVar : null, executor, dVar, dVar2, dVar3, bVar2, jVar, cVar2);
            eVar.o();
            this.f57519a.put(str, eVar);
        }
        return this.f57519a.get(str);
    }

    public final wm.d d(String str, String str2) {
        return wm.d.h(Executors.newCachedThreadPool(), wm.k.c(this.f57520b, String.format("%s_%s_%s_%s.json", "frc", this.f57526h, str, str2)));
    }

    public e e() {
        return b("firebase");
    }

    public synchronized com.google.firebase.remoteconfig.internal.b f(String str, wm.d dVar, com.google.firebase.remoteconfig.internal.c cVar) {
        return new com.google.firebase.remoteconfig.internal.b(this.f57523e, l(this.f57522d) ? this.f57525g : k.f57516a, this.f57521c, f57517j, f57518k, dVar, g(this.f57522d.k().b(), str, cVar), cVar, this.f57527i);
    }

    public ConfigFetchHttpClient g(String str, String str2, com.google.firebase.remoteconfig.internal.c cVar) {
        return new ConfigFetchHttpClient(this.f57520b, this.f57522d.k().c(), str, str2, cVar.b(), cVar.b());
    }

    public final wm.j h(wm.d dVar, wm.d dVar2) {
        return new wm.j(this.f57521c, dVar, dVar2);
    }

    public l(Context context, ExecutorService executorService, pk.c cVar, yl.f fVar, qk.b bVar, xl.b<tk.a> bVar2, boolean z10) {
        this.f57519a = new HashMap();
        this.f57527i = new HashMap();
        this.f57520b = context;
        this.f57521c = executorService;
        this.f57522d = cVar;
        this.f57523e = fVar;
        this.f57524f = bVar;
        this.f57525g = bVar2;
        this.f57526h = cVar.k().c();
        if (z10) {
            vi.j.c(executorService, new Callable() { // from class: vm.i
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return l.this.e();
                }
            });
        }
    }
}
