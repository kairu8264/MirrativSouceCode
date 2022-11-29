package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class w extends o {

    /* renamed from: b  reason: collision with root package name */
    public m.a<t, a> f15624b;

    /* renamed from: c  reason: collision with root package name */
    public o.c f15625c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference<u> f15626d;

    /* renamed from: e  reason: collision with root package name */
    public int f15627e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15628f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15629g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<o.c> f15630h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f15631i;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public o.c f15632a;

        /* renamed from: b  reason: collision with root package name */
        public r f15633b;

        public a(t tVar, o.c cVar) {
            this.f15633b = z.f(tVar);
            this.f15632a = cVar;
        }

        public void a(u uVar, o.b bVar) {
            o.c c10 = bVar.c();
            this.f15632a = w.k(this.f15632a, c10);
            this.f15633b.i(uVar, bVar);
            this.f15632a = c10;
        }
    }

    public w(u uVar) {
        this(uVar, true);
    }

    public static o.c k(o.c cVar, o.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    @Override // androidx.lifecycle.o
    public void a(t tVar) {
        u uVar;
        f("addObserver");
        o.c cVar = this.f15625c;
        o.c cVar2 = o.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = o.c.INITIALIZED;
        }
        a aVar = new a(tVar, cVar2);
        if (this.f15624b.l(tVar, aVar) == null && (uVar = this.f15626d.get()) != null) {
            boolean z10 = this.f15627e != 0 || this.f15628f;
            o.c e10 = e(tVar);
            this.f15627e++;
            while (aVar.f15632a.compareTo(e10) < 0 && this.f15624b.contains(tVar)) {
                n(aVar.f15632a);
                o.b e11 = o.b.e(aVar.f15632a);
                if (e11 != null) {
                    aVar.a(uVar, e11);
                    m();
                    e10 = e(tVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f15632a);
                }
            }
            if (!z10) {
                p();
            }
            this.f15627e--;
        }
    }

    @Override // androidx.lifecycle.o
    public o.c b() {
        return this.f15625c;
    }

    @Override // androidx.lifecycle.o
    public void c(t tVar) {
        f("removeObserver");
        this.f15624b.m(tVar);
    }

    public final void d(u uVar) {
        Iterator<Map.Entry<t, a>> descendingIterator = this.f15624b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f15629g) {
            Map.Entry<t, a> next = descendingIterator.next();
            a value = next.getValue();
            while (value.f15632a.compareTo(this.f15625c) > 0 && !this.f15629g && this.f15624b.contains(next.getKey())) {
                o.b a10 = o.b.a(value.f15632a);
                if (a10 != null) {
                    n(a10.c());
                    value.a(uVar, a10);
                    m();
                } else {
                    throw new IllegalStateException("no event down from " + value.f15632a);
                }
            }
        }
    }

    public final o.c e(t tVar) {
        Map.Entry<t, a> p10 = this.f15624b.p(tVar);
        o.c cVar = null;
        o.c cVar2 = p10 != null ? p10.getValue().f15632a : null;
        if (!this.f15630h.isEmpty()) {
            ArrayList<o.c> arrayList = this.f15630h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return k(k(this.f15625c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void f(String str) {
        if (!this.f15631i || l.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    public final void g(u uVar) {
        m.b<t, a>.d g10 = this.f15624b.g();
        while (g10.hasNext() && !this.f15629g) {
            Map.Entry next = g10.next();
            a aVar = (a) next.getValue();
            while (aVar.f15632a.compareTo(this.f15625c) < 0 && !this.f15629g && this.f15624b.contains((t) next.getKey())) {
                n(aVar.f15632a);
                o.b e10 = o.b.e(aVar.f15632a);
                if (e10 != null) {
                    aVar.a(uVar, e10);
                    m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f15632a);
                }
            }
        }
    }

    public void h(o.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.c());
    }

    public final boolean i() {
        if (this.f15624b.size() == 0) {
            return true;
        }
        o.c cVar = this.f15624b.d().getValue().f15632a;
        o.c cVar2 = this.f15624b.j().getValue().f15632a;
        return cVar == cVar2 && this.f15625c == cVar2;
    }

    @Deprecated
    public void j(o.c cVar) {
        f("markState");
        o(cVar);
    }

    public final void l(o.c cVar) {
        if (this.f15625c == cVar) {
            return;
        }
        this.f15625c = cVar;
        if (!this.f15628f && this.f15627e == 0) {
            this.f15628f = true;
            p();
            this.f15628f = false;
            return;
        }
        this.f15629g = true;
    }

    public final void m() {
        ArrayList<o.c> arrayList = this.f15630h;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void n(o.c cVar) {
        this.f15630h.add(cVar);
    }

    public void o(o.c cVar) {
        f("setCurrentState");
        l(cVar);
    }

    public final void p() {
        u uVar = this.f15626d.get();
        if (uVar != null) {
            while (!i()) {
                this.f15629g = false;
                if (this.f15625c.compareTo(this.f15624b.d().getValue().f15632a) < 0) {
                    d(uVar);
                }
                Map.Entry<t, a> j10 = this.f15624b.j();
                if (!this.f15629g && j10 != null && this.f15625c.compareTo(j10.getValue().f15632a) > 0) {
                    g(uVar);
                }
            }
            this.f15629g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    public w(u uVar, boolean z10) {
        this.f15624b = new m.a<>();
        this.f15627e = 0;
        this.f15628f = false;
        this.f15629g = false;
        this.f15630h = new ArrayList<>();
        this.f15626d = new WeakReference<>(uVar);
        this.f15625c = o.c.INITIALIZED;
        this.f15631i = z10;
    }
}
