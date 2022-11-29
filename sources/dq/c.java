package dq;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: s  reason: collision with root package name */
    public static volatile c f29782s;

    /* renamed from: t  reason: collision with root package name */
    public static final d f29783t = new d();

    /* renamed from: u  reason: collision with root package name */
    public static final Map<Class<?>, List<Class<?>>> f29784u = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, CopyOnWriteArrayList<p>> f29785a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Object, List<Class<?>>> f29786b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, Object> f29787c;

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<C0292c> f29788d;

    /* renamed from: e  reason: collision with root package name */
    public final g f29789e;

    /* renamed from: f  reason: collision with root package name */
    public final k f29790f;

    /* renamed from: g  reason: collision with root package name */
    public final dq.b f29791g;

    /* renamed from: h  reason: collision with root package name */
    public final dq.a f29792h;

    /* renamed from: i  reason: collision with root package name */
    public final o f29793i;

    /* renamed from: j  reason: collision with root package name */
    public final ExecutorService f29794j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f29795k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f29796l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f29797m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f29798n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f29799o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f29800p;

    /* renamed from: q  reason: collision with root package name */
    public final int f29801q;

    /* renamed from: r  reason: collision with root package name */
    public final f f29802r;

    /* loaded from: classes4.dex */
    public class a extends ThreadLocal<C0292c> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public C0292c initialValue() {
            return new C0292c();
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29804a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f29804a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29804a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29804a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29804a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29804a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: dq.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0292c {

        /* renamed from: a  reason: collision with root package name */
        public final List<Object> f29805a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public boolean f29806b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f29807c;

        /* renamed from: d  reason: collision with root package name */
        public p f29808d;

        /* renamed from: e  reason: collision with root package name */
        public Object f29809e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f29810f;
    }

    public c() {
        this(f29783t);
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static c c() {
        c cVar = f29782s;
        if (cVar == null) {
            synchronized (c.class) {
                cVar = f29782s;
                if (cVar == null) {
                    cVar = new c();
                    f29782s = cVar;
                }
            }
        }
        return cVar;
    }

    public static List<Class<?>> k(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f29784u;
        synchronized (map) {
            list = map.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    a(list, cls2.getInterfaces());
                }
                f29784u.put(cls, list);
            }
        }
        return list;
    }

    public final void b(p pVar, Object obj) {
        if (obj != null) {
            o(pVar, obj, i());
        }
    }

    public ExecutorService d() {
        return this.f29794j;
    }

    public f e() {
        return this.f29802r;
    }

    public final void f(p pVar, Object obj, Throwable th2) {
        if (obj instanceof m) {
            if (this.f29796l) {
                f fVar = this.f29802r;
                Level level = Level.SEVERE;
                fVar.a(level, "SubscriberExceptionEvent subscriber " + pVar.f29860a.getClass() + " threw an exception", th2);
                m mVar = (m) obj;
                f fVar2 = this.f29802r;
                fVar2.a(level, "Initial event " + mVar.f29839c + " caused exception in " + mVar.f29840d, mVar.f29838b);
            }
        } else if (!this.f29795k) {
            if (this.f29796l) {
                f fVar3 = this.f29802r;
                Level level2 = Level.SEVERE;
                fVar3.a(level2, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + pVar.f29860a.getClass(), th2);
            }
            if (this.f29798n) {
                l(new m(this, th2, obj, pVar.f29860a));
            }
        } else {
            throw new EventBusException("Invoking subscriber failed", th2);
        }
    }

    public void g(i iVar) {
        Object obj = iVar.f29832a;
        p pVar = iVar.f29833b;
        i.b(iVar);
        if (pVar.f29862c) {
            h(pVar, obj);
        }
    }

    public void h(p pVar, Object obj) {
        try {
            pVar.f29861b.f29841a.invoke(pVar.f29860a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            f(pVar, obj, e11.getCause());
        }
    }

    public final boolean i() {
        g gVar = this.f29789e;
        return gVar == null || gVar.b();
    }

    public synchronized boolean j(Object obj) {
        return this.f29786b.containsKey(obj);
    }

    public void l(Object obj) {
        C0292c c0292c = this.f29788d.get();
        List<Object> list = c0292c.f29805a;
        list.add(obj);
        if (c0292c.f29806b) {
            return;
        }
        c0292c.f29807c = i();
        c0292c.f29806b = true;
        if (c0292c.f29810f) {
            throw new EventBusException("Internal error. Abort state was not reset");
        }
        while (true) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                m(list.remove(0), c0292c);
            } finally {
                c0292c.f29806b = false;
                c0292c.f29807c = false;
            }
        }
    }

    public final void m(Object obj, C0292c c0292c) throws Error {
        boolean n10;
        Class<?> cls = obj.getClass();
        if (this.f29800p) {
            List<Class<?>> k10 = k(cls);
            int size = k10.size();
            n10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                n10 |= n(obj, c0292c, k10.get(i10));
            }
        } else {
            n10 = n(obj, c0292c, cls);
        }
        if (n10) {
            return;
        }
        if (this.f29797m) {
            this.f29802r.b(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f29799o || cls == h.class || cls == m.class) {
            return;
        }
        l(new h(this, obj));
    }

    public final boolean n(Object obj, C0292c c0292c, Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f29785a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<p> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            p next = it.next();
            c0292c.f29809e = obj;
            c0292c.f29808d = next;
            try {
                o(next, obj, c0292c.f29807c);
                if (c0292c.f29810f) {
                    return true;
                }
            } finally {
                c0292c.f29809e = null;
                c0292c.f29808d = null;
                c0292c.f29810f = false;
            }
        }
        return true;
    }

    public final void o(p pVar, Object obj, boolean z10) {
        int i10 = b.f29804a[pVar.f29861b.f29842b.ordinal()];
        if (i10 == 1) {
            h(pVar, obj);
        } else if (i10 == 2) {
            if (z10) {
                h(pVar, obj);
            } else {
                this.f29790f.a(pVar, obj);
            }
        } else if (i10 == 3) {
            k kVar = this.f29790f;
            if (kVar != null) {
                kVar.a(pVar, obj);
            } else {
                h(pVar, obj);
            }
        } else if (i10 == 4) {
            if (z10) {
                this.f29791g.a(pVar, obj);
            } else {
                h(pVar, obj);
            }
        } else if (i10 == 5) {
            this.f29792h.a(pVar, obj);
        } else {
            throw new IllegalStateException("Unknown thread mode: " + pVar.f29861b.f29842b);
        }
    }

    public void p(Object obj) {
        List<n> a10 = this.f29793i.a(obj.getClass());
        synchronized (this) {
            for (n nVar : a10) {
                q(obj, nVar);
            }
        }
    }

    public final void q(Object obj, n nVar) {
        Class<?> cls = nVar.f29843c;
        p pVar = new p(obj, nVar);
        CopyOnWriteArrayList<p> copyOnWriteArrayList = this.f29785a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f29785a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(pVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i10 = 0; i10 <= size; i10++) {
            if (i10 == size || nVar.f29844d > copyOnWriteArrayList.get(i10).f29861b.f29844d) {
                copyOnWriteArrayList.add(i10, pVar);
                break;
            }
        }
        List<Class<?>> list = this.f29786b.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.f29786b.put(obj, list);
        }
        list.add(cls);
        if (nVar.f29845e) {
            if (this.f29800p) {
                for (Map.Entry<Class<?>, Object> entry : this.f29787c.entrySet()) {
                    if (cls.isAssignableFrom(entry.getKey())) {
                        b(pVar, entry.getValue());
                    }
                }
                return;
            }
            b(pVar, this.f29787c.get(cls));
        }
    }

    public synchronized void r(Object obj) {
        List<Class<?>> list = this.f29786b.get(obj);
        if (list != null) {
            for (Class<?> cls : list) {
                s(obj, cls);
            }
            this.f29786b.remove(obj);
        } else {
            f fVar = this.f29802r;
            Level level = Level.WARNING;
            fVar.b(level, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public final void s(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<p> copyOnWriteArrayList = this.f29785a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                p pVar = copyOnWriteArrayList.get(i10);
                if (pVar.f29860a == obj) {
                    pVar.f29862c = false;
                    copyOnWriteArrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f29801q + ", eventInheritance=" + this.f29800p + "]";
    }

    public c(d dVar) {
        this.f29788d = new a();
        this.f29802r = dVar.b();
        this.f29785a = new HashMap();
        this.f29786b = new HashMap();
        this.f29787c = new ConcurrentHashMap();
        g c10 = dVar.c();
        this.f29789e = c10;
        this.f29790f = c10 != null ? c10.a(this) : null;
        this.f29791g = new dq.b(this);
        this.f29792h = new dq.a(this);
        List<fq.b> list = dVar.f29821j;
        this.f29801q = list != null ? list.size() : 0;
        this.f29793i = new o(dVar.f29821j, dVar.f29819h, dVar.f29818g);
        this.f29796l = dVar.f29812a;
        this.f29797m = dVar.f29813b;
        this.f29798n = dVar.f29814c;
        this.f29799o = dVar.f29815d;
        this.f29795k = dVar.f29816e;
        this.f29800p = dVar.f29817f;
        this.f29794j = dVar.f29820i;
    }
}
