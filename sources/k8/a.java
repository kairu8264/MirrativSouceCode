package k8;

import android.content.Context;
import com.cookpad.puree.PureeLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38462a;

    /* renamed from: b  reason: collision with root package name */
    public final c f38463b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, List<n8.c>> f38464c;

    /* renamed from: d  reason: collision with root package name */
    public final o8.c f38465d;

    /* renamed from: e  reason: collision with root package name */
    public final ScheduledExecutorService f38466e;

    /* renamed from: k8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class ThreadFactoryC0537a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "puree");
            thread.setPriority(1);
            return thread;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Context f38467a;

        /* renamed from: b  reason: collision with root package name */
        public c f38468b;

        /* renamed from: c  reason: collision with root package name */
        public Map<Class<?>, List<n8.c>> f38469c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        public o8.c f38470d;

        /* renamed from: e  reason: collision with root package name */
        public ScheduledExecutorService f38471e;

        public b(Context context) {
            this.f38467a = context.getApplicationContext();
        }

        public a a() {
            if (this.f38468b != null) {
                if (this.f38470d == null) {
                    this.f38470d = new o8.b(this.f38467a);
                }
                if (this.f38471e == null) {
                    this.f38471e = a.b();
                }
                return new a(this.f38467a, this.f38469c, this.f38468b, this.f38470d, this.f38471e);
            }
            throw new IllegalStateException("A PureeSerializer is required to build PureeConfiguration");
        }

        public b b(c cVar) {
            this.f38468b = cVar;
            return this;
        }

        public b c(Class<?> cls, n8.c cVar) {
            List<n8.c> list = this.f38469c.get(cls);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(cVar);
            this.f38469c.put(cls, list);
            return this;
        }
    }

    public a(Context context, Map<Class<?>, List<n8.c>> map, c cVar, o8.c cVar2, ScheduledExecutorService scheduledExecutorService) {
        this.f38462a = context;
        this.f38463b = cVar;
        this.f38464c = map;
        this.f38465d = cVar2;
        this.f38466e = scheduledExecutorService;
    }

    public static ScheduledExecutorService b() {
        return Executors.newScheduledThreadPool(1, new ThreadFactoryC0537a());
    }

    public PureeLogger a() {
        return new PureeLogger(this.f38464c, this.f38463b, this.f38465d, this.f38466e);
    }

    public void c() {
        m8.b.a(this.f38464c);
    }
}
