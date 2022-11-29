package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.j;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final Executor f16065h = new c();

    /* renamed from: a  reason: collision with root package name */
    public final u f16066a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.recyclerview.widget.c<T> f16067b;

    /* renamed from: c  reason: collision with root package name */
    public Executor f16068c;

    /* renamed from: e  reason: collision with root package name */
    public List<T> f16070e;

    /* renamed from: g  reason: collision with root package name */
    public int f16072g;

    /* renamed from: d  reason: collision with root package name */
    public final List<b<T>> f16069d = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    public List<T> f16071f = Collections.emptyList();

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List f16073w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List f16074x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f16075y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Runnable f16076z;

        /* renamed from: androidx.recyclerview.widget.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0072a extends j.b {
            public C0072a() {
            }

            @Override // androidx.recyclerview.widget.j.b
            public boolean a(int i10, int i11) {
                Object obj = a.this.f16073w.get(i10);
                Object obj2 = a.this.f16074x.get(i11);
                if (obj == null || obj2 == null) {
                    if (obj == null && obj2 == null) {
                        return true;
                    }
                    throw new AssertionError();
                }
                return d.this.f16067b.b().a(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.j.b
            public boolean b(int i10, int i11) {
                Object obj = a.this.f16073w.get(i10);
                Object obj2 = a.this.f16074x.get(i11);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.f16067b.b().b(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.j.b
            public Object c(int i10, int i11) {
                Object obj = a.this.f16073w.get(i10);
                Object obj2 = a.this.f16074x.get(i11);
                if (obj != null && obj2 != null) {
                    return d.this.f16067b.b().c(obj, obj2);
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.j.b
            public int d() {
                return a.this.f16074x.size();
            }

            @Override // androidx.recyclerview.widget.j.b
            public int e() {
                return a.this.f16073w.size();
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ j.e f16078w;

            public b(j.e eVar) {
                this.f16078w = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f16072g == aVar.f16075y) {
                    dVar.c(aVar.f16074x, this.f16078w, aVar.f16076z);
                }
            }
        }

        public a(List list, List list2, int i10, Runnable runnable) {
            this.f16073w = list;
            this.f16074x = list2;
            this.f16075y = i10;
            this.f16076z = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f16068c.execute(new b(j.b(new C0072a())));
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    /* loaded from: classes.dex */
    public static class c implements Executor {

        /* renamed from: w  reason: collision with root package name */
        public final Handler f16080w = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f16080w.post(runnable);
        }
    }

    public d(u uVar, androidx.recyclerview.widget.c<T> cVar) {
        this.f16066a = uVar;
        this.f16067b = cVar;
        if (cVar.c() != null) {
            this.f16068c = cVar.c();
        } else {
            this.f16068c = f16065h;
        }
    }

    public void a(b<T> bVar) {
        this.f16069d.add(bVar);
    }

    public List<T> b() {
        return this.f16071f;
    }

    public void c(List<T> list, j.e eVar, Runnable runnable) {
        List<T> list2 = this.f16071f;
        this.f16070e = list;
        this.f16071f = Collections.unmodifiableList(list);
        eVar.b(this.f16066a);
        d(list2, runnable);
    }

    public final void d(List<T> list, Runnable runnable) {
        for (b<T> bVar : this.f16069d) {
            bVar.a(list, this.f16071f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void e(List<T> list) {
        f(list, null);
    }

    public void f(List<T> list, Runnable runnable) {
        int i10 = this.f16072g + 1;
        this.f16072g = i10;
        List<T> list2 = this.f16070e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f16071f;
        if (list == null) {
            int size = list2.size();
            this.f16070e = null;
            this.f16071f = Collections.emptyList();
            this.f16066a.b(0, size);
            d(list3, runnable);
        } else if (list2 == null) {
            this.f16070e = list;
            this.f16071f = Collections.unmodifiableList(list);
            this.f16066a.a(0, list.size());
            d(list3, runnable);
        } else {
            this.f16067b.a().execute(new a(list2, list, i10, runnable));
        }
    }
}
