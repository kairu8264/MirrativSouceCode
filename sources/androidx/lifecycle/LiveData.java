package androidx.lifecycle;

import androidx.lifecycle.o;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f15453k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f15454a;

    /* renamed from: b  reason: collision with root package name */
    public m.b<f0<? super T>, LiveData<T>.c> f15455b;

    /* renamed from: c  reason: collision with root package name */
    public int f15456c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15457d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f15458e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f15459f;

    /* renamed from: g  reason: collision with root package name */
    public int f15460g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f15461h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15462i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f15463j;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements r {
        public final u A;

        public LifecycleBoundObserver(u uVar, f0<? super T> f0Var) {
            super(f0Var);
            this.A = uVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public void e() {
            this.A.g().c(this);
        }

        @Override // androidx.lifecycle.r
        public void i(u uVar, o.b bVar) {
            o.c b10 = this.A.g().b();
            if (b10 == o.c.DESTROYED) {
                LiveData.this.n(this.f15465w);
                return;
            }
            o.c cVar = null;
            while (cVar != b10) {
                a(k());
                cVar = b10;
                b10 = this.A.g().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean j(u uVar) {
            return this.A == uVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return this.A.g().b().a(o.c.STARTED);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f15454a) {
                obj = LiveData.this.f15459f;
                LiveData.this.f15459f = LiveData.f15453k;
            }
            LiveData.this.p(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        public b(f0<? super T> f0Var) {
            super(f0Var);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: w  reason: collision with root package name */
        public final f0<? super T> f15465w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f15466x;

        /* renamed from: y  reason: collision with root package name */
        public int f15467y = -1;

        public c(f0<? super T> f0Var) {
            this.f15465w = f0Var;
        }

        public void a(boolean z10) {
            if (z10 == this.f15466x) {
                return;
            }
            this.f15466x = z10;
            LiveData.this.c(z10 ? 1 : -1);
            if (this.f15466x) {
                LiveData.this.e(this);
            }
        }

        public void e() {
        }

        public boolean j(u uVar) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData(T t10) {
        this.f15454a = new Object();
        this.f15455b = new m.b<>();
        this.f15456c = 0;
        this.f15459f = f15453k;
        this.f15463j = new a();
        this.f15458e = t10;
        this.f15460g = 0;
    }

    public static void b(String str) {
        if (l.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void c(int i10) {
        int i11 = this.f15456c;
        this.f15456c = i10 + i11;
        if (this.f15457d) {
            return;
        }
        this.f15457d = true;
        while (true) {
            try {
                int i12 = this.f15456c;
                if (i11 == i12) {
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    k();
                } else if (z11) {
                    l();
                }
                i11 = i12;
            } finally {
                this.f15457d = false;
            }
        }
    }

    public final void d(LiveData<T>.c cVar) {
        if (cVar.f15466x) {
            if (!cVar.k()) {
                cVar.a(false);
                return;
            }
            int i10 = cVar.f15467y;
            int i11 = this.f15460g;
            if (i10 >= i11) {
                return;
            }
            cVar.f15467y = i11;
            cVar.f15465w.d((Object) this.f15458e);
        }
    }

    public void e(LiveData<T>.c cVar) {
        if (this.f15461h) {
            this.f15462i = true;
            return;
        }
        this.f15461h = true;
        do {
            this.f15462i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                m.b<f0<? super T>, LiveData<T>.c>.d g10 = this.f15455b.g();
                while (g10.hasNext()) {
                    d((c) g10.next().getValue());
                    if (this.f15462i) {
                        break;
                    }
                }
            }
        } while (this.f15462i);
        this.f15461h = false;
    }

    public T f() {
        T t10 = (T) this.f15458e;
        if (t10 != f15453k) {
            return t10;
        }
        return null;
    }

    public int g() {
        return this.f15460g;
    }

    public boolean h() {
        return this.f15456c > 0;
    }

    public void i(u uVar, f0<? super T> f0Var) {
        b("observe");
        if (uVar.g().b() == o.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(uVar, f0Var);
        LiveData<T>.c l10 = this.f15455b.l(f0Var, lifecycleBoundObserver);
        if (l10 != null && !l10.j(uVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (l10 != null) {
            return;
        }
        uVar.g().a(lifecycleBoundObserver);
    }

    public void j(f0<? super T> f0Var) {
        b("observeForever");
        b bVar = new b(f0Var);
        LiveData<T>.c l10 = this.f15455b.l(f0Var, bVar);
        if (l10 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (l10 != null) {
            return;
        }
        bVar.a(true);
    }

    public void k() {
    }

    public void l() {
    }

    public void m(T t10) {
        boolean z10;
        synchronized (this.f15454a) {
            z10 = this.f15459f == f15453k;
            this.f15459f = t10;
        }
        if (z10) {
            l.a.e().c(this.f15463j);
        }
    }

    public void n(f0<? super T> f0Var) {
        b("removeObserver");
        LiveData<T>.c m10 = this.f15455b.m(f0Var);
        if (m10 == null) {
            return;
        }
        m10.e();
        m10.a(false);
    }

    public void o(u uVar) {
        b("removeObservers");
        Iterator<Map.Entry<f0<? super T>, LiveData<T>.c>> it = this.f15455b.iterator();
        while (it.hasNext()) {
            Map.Entry<f0<? super T>, LiveData<T>.c> next = it.next();
            if (next.getValue().j(uVar)) {
                n(next.getKey());
            }
        }
    }

    public void p(T t10) {
        b("setValue");
        this.f15460g++;
        this.f15458e = t10;
        e(null);
    }

    public LiveData() {
        this.f15454a = new Object();
        this.f15455b = new m.b<>();
        this.f15456c = 0;
        Object obj = f15453k;
        this.f15459f = obj;
        this.f15463j = new a();
        this.f15458e = obj;
        this.f15460g = -1;
    }
}
