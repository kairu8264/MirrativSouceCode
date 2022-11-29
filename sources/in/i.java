package in;

import in.m;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class i<T extends m> implements n<T> {

    /* renamed from: a  reason: collision with root package name */
    public final mn.a f36909a;

    /* renamed from: b  reason: collision with root package name */
    public final mn.d<T> f36910b;

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentHashMap<Long, T> f36911c;

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentHashMap<Long, mn.c<T>> f36912d;

    /* renamed from: e  reason: collision with root package name */
    public final mn.c<T> f36913e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<T> f36914f;

    /* renamed from: g  reason: collision with root package name */
    public final String f36915g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f36916h;

    public i(mn.a aVar, mn.d<T> dVar, String str, String str2) {
        this(aVar, dVar, new ConcurrentHashMap(1), new ConcurrentHashMap(1), new mn.c(aVar, dVar, str), str2);
    }

    @Override // in.n
    public void a(T t10) {
        if (t10 != null) {
            i();
            e(t10.b(), t10, true);
            return;
        }
        throw new IllegalArgumentException("Session must not be null!");
    }

    @Override // in.n
    public Map<Long, T> b() {
        i();
        return Collections.unmodifiableMap(this.f36911c);
    }

    @Override // in.n
    public T c() {
        i();
        return this.f36914f.get();
    }

    public String d(long j10) {
        return this.f36915g + "_" + j10;
    }

    public final void e(long j10, T t10, boolean z10) {
        this.f36911c.put(Long.valueOf(j10), t10);
        mn.c<T> cVar = this.f36912d.get(Long.valueOf(j10));
        if (cVar == null) {
            cVar = new mn.c<>(this.f36909a, this.f36910b, d(j10));
            this.f36912d.putIfAbsent(Long.valueOf(j10), cVar);
        }
        cVar.b(t10);
        T t11 = this.f36914f.get();
        if (t11 == null || t11.b() == j10 || z10) {
            synchronized (this) {
                this.f36914f.compareAndSet(t11, t10);
                this.f36913e.b(t10);
            }
        }
    }

    public boolean f(String str) {
        return str.startsWith(this.f36915g);
    }

    public final void g() {
        T a10 = this.f36913e.a();
        if (a10 != null) {
            e(a10.b(), a10, false);
        }
    }

    public final synchronized void h() {
        if (this.f36916h) {
            g();
            j();
            this.f36916h = false;
        }
    }

    public void i() {
        if (this.f36916h) {
            h();
        }
    }

    public final void j() {
        T b10;
        for (Map.Entry<String, ?> entry : this.f36909a.get().getAll().entrySet()) {
            if (f(entry.getKey()) && (b10 = this.f36910b.b((String) entry.getValue())) != null) {
                e(b10.b(), b10, false);
            }
        }
    }

    public i(mn.a aVar, mn.d<T> dVar, ConcurrentHashMap<Long, T> concurrentHashMap, ConcurrentHashMap<Long, mn.c<T>> concurrentHashMap2, mn.c<T> cVar, String str) {
        this.f36916h = true;
        this.f36909a = aVar;
        this.f36910b = dVar;
        this.f36911c = concurrentHashMap;
        this.f36912d = concurrentHashMap2;
        this.f36913e = cVar;
        this.f36914f = new AtomicReference<>();
        this.f36915g = str;
    }
}
