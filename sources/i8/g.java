package i8;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<T, a<Y>> f36422a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public final long f36423b;

    /* renamed from: c  reason: collision with root package name */
    public long f36424c;

    /* renamed from: d  reason: collision with root package name */
    public long f36425d;

    /* loaded from: classes.dex */
    public static final class a<Y> {

        /* renamed from: a  reason: collision with root package name */
        public final Y f36426a;

        /* renamed from: b  reason: collision with root package name */
        public final int f36427b;

        public a(Y y10, int i10) {
            this.f36426a = y10;
            this.f36427b = i10;
        }
    }

    public g(long j10) {
        this.f36423b = j10;
        this.f36424c = j10;
    }

    public void b() {
        m(0L);
    }

    public final void f() {
        m(this.f36424c);
    }

    public synchronized Y g(T t10) {
        a<Y> aVar;
        aVar = this.f36422a.get(t10);
        return aVar != null ? aVar.f36426a : null;
    }

    public synchronized long h() {
        return this.f36424c;
    }

    public int i(Y y10) {
        return 1;
    }

    public void j(T t10, Y y10) {
    }

    public synchronized Y k(T t10, Y y10) {
        int i10 = i(y10);
        long j10 = i10;
        if (j10 >= this.f36424c) {
            j(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f36425d += j10;
        }
        a<Y> put = this.f36422a.put(t10, y10 == null ? null : new a<>(y10, i10));
        if (put != null) {
            this.f36425d -= put.f36427b;
            if (!put.f36426a.equals(y10)) {
                j(t10, put.f36426a);
            }
        }
        f();
        return put != null ? put.f36426a : null;
    }

    public synchronized Y l(T t10) {
        a<Y> remove = this.f36422a.remove(t10);
        if (remove == null) {
            return null;
        }
        this.f36425d -= remove.f36427b;
        return remove.f36426a;
    }

    public synchronized void m(long j10) {
        while (this.f36425d > j10) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f36422a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f36425d -= value.f36427b;
            T key = next.getKey();
            it.remove();
            j(key, value.f36426a);
        }
    }
}
