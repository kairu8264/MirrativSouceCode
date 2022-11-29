package vl;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import vk.q;
import vk.t;
import vl.f;

/* loaded from: classes4.dex */
public class d implements f {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadFactory f57484d = a.f57481a;

    /* renamed from: a  reason: collision with root package name */
    public xl.b<g> f57485a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<e> f57486b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f57487c;

    public d(final Context context, Set<e> set) {
        this(new t(new xl.b() { // from class: vl.c
            @Override // xl.b
            public final Object get() {
                g a10;
                a10 = g.a(context);
                return a10;
            }
        }), set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f57484d));
    }

    public static vk.d<f> e() {
        return vk.d.c(f.class).b(q.j(Context.class)).b(q.l(e.class)).f(b.f57482a).d();
    }

    public static /* synthetic */ f f(vk.e eVar) {
        return new d((Context) eVar.a(Context.class), eVar.c(e.class));
    }

    public static /* synthetic */ Thread h(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // vl.f
    public f.a a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean d10 = this.f57485a.get().d(str, currentTimeMillis);
        boolean c10 = this.f57485a.get().c(currentTimeMillis);
        if (d10 && c10) {
            return f.a.COMBINED;
        }
        if (c10) {
            return f.a.GLOBAL;
        }
        if (d10) {
            return f.a.SDK;
        }
        return f.a.NONE;
    }

    public d(xl.b<g> bVar, Set<e> set, Executor executor) {
        this.f57485a = bVar;
        this.f57486b = set;
        this.f57487c = executor;
    }
}
