package v4;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserModel;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import z4.h;

/* loaded from: classes.dex */
public abstract class q0 {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public volatile z4.g f56670a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f56671b;

    /* renamed from: c  reason: collision with root package name */
    public Executor f56672c;

    /* renamed from: d  reason: collision with root package name */
    public z4.h f56673d;

    /* renamed from: f  reason: collision with root package name */
    public boolean f56675f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f56676g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public List<b> f56677h;

    /* renamed from: k  reason: collision with root package name */
    public v4.a f56680k;

    /* renamed from: j  reason: collision with root package name */
    public final ReentrantReadWriteLock f56679j = new ReentrantReadWriteLock();

    /* renamed from: l  reason: collision with root package name */
    public final ThreadLocal<Integer> f56681l = new ThreadLocal<>();

    /* renamed from: m  reason: collision with root package name */
    public final Map<String, Object> f56682m = Collections.synchronizedMap(new HashMap());

    /* renamed from: e  reason: collision with root package name */
    public final androidx.room.c f56674e = g();

    /* renamed from: n  reason: collision with root package name */
    public final Map<Class<?>, Object> f56683n = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public Map<Class<? extends w4.a>, w4.a> f56678i = new HashMap();

    /* loaded from: classes.dex */
    public static class a<T extends q0> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f56684a;

        /* renamed from: b  reason: collision with root package name */
        public final String f56685b;

        /* renamed from: c  reason: collision with root package name */
        public final Context f56686c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<b> f56687d;

        /* renamed from: e  reason: collision with root package name */
        public e f56688e;

        /* renamed from: f  reason: collision with root package name */
        public f f56689f;

        /* renamed from: g  reason: collision with root package name */
        public Executor f56690g;

        /* renamed from: h  reason: collision with root package name */
        public List<Object> f56691h;

        /* renamed from: i  reason: collision with root package name */
        public List<w4.a> f56692i;

        /* renamed from: j  reason: collision with root package name */
        public Executor f56693j;

        /* renamed from: k  reason: collision with root package name */
        public Executor f56694k;

        /* renamed from: l  reason: collision with root package name */
        public h.c f56695l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f56696m;

        /* renamed from: o  reason: collision with root package name */
        public Intent f56698o;

        /* renamed from: q  reason: collision with root package name */
        public boolean f56700q;

        /* renamed from: s  reason: collision with root package name */
        public TimeUnit f56702s;

        /* renamed from: u  reason: collision with root package name */
        public Set<Integer> f56704u;

        /* renamed from: v  reason: collision with root package name */
        public Set<Integer> f56705v;

        /* renamed from: w  reason: collision with root package name */
        public String f56706w;

        /* renamed from: x  reason: collision with root package name */
        public File f56707x;

        /* renamed from: y  reason: collision with root package name */
        public Callable<InputStream> f56708y;

        /* renamed from: r  reason: collision with root package name */
        public long f56701r = -1;

        /* renamed from: n  reason: collision with root package name */
        public c f56697n = c.AUTOMATIC;

        /* renamed from: p  reason: collision with root package name */
        public boolean f56699p = true;

        /* renamed from: t  reason: collision with root package name */
        public final d f56703t = new d();

        public a(Context context, Class<T> cls, String str) {
            this.f56686c = context;
            this.f56684a = cls;
            this.f56685b = str;
        }

        public a<T> a(b bVar) {
            if (this.f56687d == null) {
                this.f56687d = new ArrayList<>();
            }
            this.f56687d.add(bVar);
            return this;
        }

        public a<T> b(w4.b... bVarArr) {
            if (this.f56705v == null) {
                this.f56705v = new HashSet();
            }
            for (w4.b bVar : bVarArr) {
                this.f56705v.add(Integer.valueOf(bVar.f58125a));
                this.f56705v.add(Integer.valueOf(bVar.f58126b));
            }
            this.f56703t.b(bVarArr);
            return this;
        }

        public a<T> c() {
            this.f56696m = true;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public T d() {
            Executor executor;
            if (this.f56686c != null) {
                if (this.f56684a != null) {
                    Executor executor2 = this.f56693j;
                    if (executor2 == null && this.f56694k == null) {
                        Executor d10 = l.a.d();
                        this.f56694k = d10;
                        this.f56693j = d10;
                    } else if (executor2 != null && this.f56694k == null) {
                        this.f56694k = executor2;
                    } else if (executor2 == null && (executor = this.f56694k) != null) {
                        this.f56693j = executor;
                    }
                    Set<Integer> set = this.f56705v;
                    if (set != null && this.f56704u != null) {
                        for (Integer num : set) {
                            if (this.f56704u.contains(num)) {
                                throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                            }
                        }
                    }
                    p pVar = this.f56695l;
                    if (pVar == null) {
                        pVar = new a5.c();
                    }
                    long j10 = this.f56701r;
                    if (j10 > 0) {
                        if (this.f56685b != null) {
                            pVar = new p(pVar, new v4.a(j10, this.f56702s, this.f56694k));
                        } else {
                            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                        }
                    }
                    String str = this.f56706w;
                    if (str != null || this.f56707x != null || this.f56708y != null) {
                        if (this.f56685b != null) {
                            int i10 = str == null ? 0 : 1;
                            File file = this.f56707x;
                            int i11 = i10 + (file == null ? 0 : 1);
                            Callable<InputStream> callable = this.f56708y;
                            if (i11 + (callable != null ? 1 : 0) == 1) {
                                pVar = new v0(str, file, callable, pVar);
                            } else {
                                throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                            }
                        } else {
                            throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                        }
                    }
                    f fVar = this.f56689f;
                    i0 i0Var = fVar != null ? new i0(pVar, fVar, this.f56690g) : pVar;
                    Context context = this.f56686c;
                    q qVar = new q(context, this.f56685b, i0Var, this.f56703t, this.f56687d, this.f56696m, this.f56697n.c(context), this.f56693j, this.f56694k, this.f56698o, this.f56699p, this.f56700q, this.f56704u, this.f56706w, this.f56707x, this.f56708y, this.f56688e, this.f56691h, this.f56692i);
                    T t10 = (T) n0.b(this.f56684a, "_Impl");
                    t10.q(qVar);
                    return t10;
                }
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }

        public a<T> e() {
            this.f56699p = false;
            this.f56700q = true;
            return this;
        }

        public a<T> f(int... iArr) {
            if (this.f56704u == null) {
                this.f56704u = new HashSet(iArr.length);
            }
            for (int i10 : iArr) {
                this.f56704u.add(Integer.valueOf(i10));
            }
            return this;
        }

        public a<T> g(h.c cVar) {
            this.f56695l = cVar;
            return this;
        }

        public a<T> h(Executor executor) {
            this.f56693j = executor;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(z4.g gVar) {
        }

        public void b(z4.g gVar) {
        }

        public void c(z4.g gVar) {
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public static boolean a(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return z4.c.b(activityManager);
            }
            return false;
        }

        public c c(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT >= 16 && (activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)) != null && !a(activityManager)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public HashMap<Integer, TreeMap<Integer, w4.b>> f56709a = new HashMap<>();

        public final void a(w4.b bVar) {
            int i10 = bVar.f58125a;
            int i11 = bVar.f58126b;
            TreeMap<Integer, w4.b> treeMap = this.f56709a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f56709a.put(Integer.valueOf(i10), treeMap);
            }
            w4.b bVar2 = treeMap.get(Integer.valueOf(i11));
            if (bVar2 != null) {
                Log.w("ROOM", "Overriding migration " + bVar2 + " with " + bVar);
            }
            treeMap.put(Integer.valueOf(i11), bVar);
        }

        public void b(w4.b... bVarArr) {
            for (w4.b bVar : bVarArr) {
                a(bVar);
            }
        }

        public List<w4.b> c(int i10, int i11) {
            if (i10 == i11) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i11 > i10, i10, i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<w4.b> d(java.util.List<w4.b> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L5a
                goto L7
            L5:
                if (r9 <= r10) goto L5a
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, w4.b>> r0 = r6.f56709a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L56
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = r4
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                w4.b r9 = (w4.b) r9
                r7.add(r9)
                r9 = r3
                goto L57
            L56:
                r4 = r5
            L57:
                if (r4 != 0) goto L0
                return r1
            L5a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: v4.q0.d.d(java.util.List, boolean, int, int):java.util.List");
        }

        public Map<Integer, Map<Integer, w4.b>> e() {
            return Collections.unmodifiableMap(this.f56709a);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(String str, List<Object> list);
    }

    public static boolean u() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object w(z4.g gVar) {
        r();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object x(z4.g gVar) {
        s();
        return null;
    }

    @Deprecated
    public void A() {
        this.f56673d.getWritableDatabase().T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T B(Class<T> cls, z4.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof r) {
            return (T) B(cls, ((r) hVar).a());
        }
        return null;
    }

    public void c() {
        if (!this.f56675f && u()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!p() && this.f56681l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void e() {
        c();
        v4.a aVar = this.f56680k;
        if (aVar == null) {
            r();
        } else {
            aVar.c(new n.a() { // from class: v4.o0
                @Override // n.a
                public final Object apply(Object obj) {
                    Object w10;
                    w10 = q0.this.w((z4.g) obj);
                    return w10;
                }
            });
        }
    }

    public z4.k f(String str) {
        c();
        d();
        return this.f56673d.getWritableDatabase().X0(str);
    }

    public abstract androidx.room.c g();

    public abstract z4.h h(q qVar);

    @Deprecated
    public void i() {
        v4.a aVar = this.f56680k;
        if (aVar == null) {
            s();
        } else {
            aVar.c(new n.a() { // from class: v4.p0
                @Override // n.a
                public final Object apply(Object obj) {
                    Object x10;
                    x10 = q0.this.x((z4.g) obj);
                    return x10;
                }
            });
        }
    }

    public List<w4.b> j(Map<Class<? extends w4.a>, w4.a> map) {
        return Collections.emptyList();
    }

    public Lock k() {
        return this.f56679j.readLock();
    }

    public z4.h l() {
        return this.f56673d;
    }

    public Executor m() {
        return this.f56671b;
    }

    public Set<Class<? extends w4.a>> n() {
        return Collections.emptySet();
    }

    public Map<Class<?>, List<Class<?>>> o() {
        return Collections.emptyMap();
    }

    public boolean p() {
        return this.f56673d.getWritableDatabase().C1();
    }

    public void q(q qVar) {
        boolean z10;
        this.f56673d = h(qVar);
        Set<Class<? extends w4.a>> n10 = n();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends w4.a>> it = n10.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class<? extends w4.a> next = it.next();
                int size = qVar.f56657h.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    } else if (next.isAssignableFrom(qVar.f56657h.get(size).getClass())) {
                        bitSet.set(size);
                        i10 = size;
                        break;
                    } else {
                        size--;
                    }
                }
                if (i10 >= 0) {
                    this.f56678i.put(next, qVar.f56657h.get(i10));
                } else {
                    throw new IllegalArgumentException("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.");
                }
            } else {
                for (int size2 = qVar.f56657h.size() - 1; size2 >= 0; size2--) {
                    if (!bitSet.get(size2)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                }
                Iterator<w4.b> it2 = j(this.f56678i).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    w4.b next2 = it2.next();
                    if (!qVar.f56653d.e().containsKey(Integer.valueOf(next2.f58125a))) {
                        qVar.f56653d.b(next2);
                    }
                }
                u0 u0Var = (u0) B(u0.class, this.f56673d);
                if (u0Var != null) {
                    u0Var.e(qVar);
                }
                l lVar = (l) B(l.class, this.f56673d);
                if (lVar != null) {
                    v4.a c10 = lVar.c();
                    this.f56680k = c10;
                    this.f56674e.k(c10);
                }
                if (Build.VERSION.SDK_INT >= 16) {
                    z10 = qVar.f56659j == c.WRITE_AHEAD_LOGGING;
                    this.f56673d.setWriteAheadLoggingEnabled(z10);
                }
                this.f56677h = qVar.f56654e;
                this.f56671b = qVar.f56660k;
                this.f56672c = new x0(qVar.f56661l);
                this.f56675f = qVar.f56658i;
                this.f56676g = z10;
                Intent intent = qVar.f56663n;
                if (intent != null) {
                    this.f56674e.l(qVar.f56651b, qVar.f56652c, intent);
                }
                Map<Class<?>, List<Class<?>>> o10 = o();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : o10.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = qVar.f56656g.size() - 1;
                        while (true) {
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            } else if (cls.isAssignableFrom(qVar.f56656g.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                size3--;
                            }
                        }
                        if (size3 >= 0) {
                            this.f56683n.put(cls, qVar.f56656g.get(size3));
                        } else {
                            throw new IllegalArgumentException("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.");
                        }
                    }
                }
                for (int size4 = qVar.f56656g.size() - 1; size4 >= 0; size4--) {
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + qVar.f56656g.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
                return;
            }
        }
    }

    public final void r() {
        c();
        z4.g writableDatabase = this.f56673d.getWritableDatabase();
        this.f56674e.p(writableDatabase);
        if (Build.VERSION.SDK_INT >= 16 && writableDatabase.J1()) {
            writableDatabase.W();
        } else {
            writableDatabase.s();
        }
    }

    public final void s() {
        this.f56673d.getWritableDatabase().e0();
        if (p()) {
            return;
        }
        this.f56674e.h();
    }

    public void t(z4.g gVar) {
        this.f56674e.e(gVar);
    }

    public boolean v() {
        v4.a aVar = this.f56680k;
        if (aVar != null) {
            return aVar.g();
        }
        z4.g gVar = this.f56670a;
        return gVar != null && gVar.isOpen();
    }

    public Cursor y(z4.j jVar) {
        return z(jVar, null);
    }

    public Cursor z(z4.j jVar, CancellationSignal cancellationSignal) {
        c();
        d();
        if (cancellationSignal != null && Build.VERSION.SDK_INT >= 16) {
            return this.f56673d.getWritableDatabase().m0(jVar, cancellationSignal);
        }
        return this.f56673d.getWritableDatabase().j0(jVar);
    }
}
