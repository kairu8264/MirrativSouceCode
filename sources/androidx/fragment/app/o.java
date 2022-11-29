package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f15372a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final FragmentManager f15373b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final FragmentManager.j f15374a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f15375b;

        public a(FragmentManager.j jVar, boolean z10) {
            this.f15374a = jVar;
            this.f15375b = z10;
        }
    }

    public o(FragmentManager fragmentManager) {
        this.f15373b = fragmentManager;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment t02 = this.f15373b.t0();
        if (t02 != null) {
            t02.I0().s0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.f15372a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f15375b) {
                next.f15374a.a(this.f15373b, fragment, bundle);
            }
        }
    }

    public void b(Fragment fragment, boolean z10) {
        Context f10 = this.f15373b.q0().f();
        Fragment t02 = this.f15373b.t0();
        if (t02 != null) {
            t02.I0().s0().b(fragment, true);
        }
        Iterator<a> it = this.f15372a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f15375b) {
                next.f15374a.b(this.f15373b, fragment, f10);
            }
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment t02 = this.f15373b.t0();
        if (t02 != null) {
            t02.I0().s0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.f15372a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f15375b) {
                next.f15374a.c(this.f15373b, fragment, bundle);
            }
        }
    }

    public void d(Fragment fragment, boolean z10) {
        Fragment t02 = this.f15373b.t0();
        if (t02 != null) {
            t02.I0().s0().d(fragment, true);
        }
        Iterator<a> it = this.f15372a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f15375b) {
                next.f15374a.d(this.f15373b, fragment);
            }
        }
    }

    public void e(Fragment fragment, boolean z10) {
        Fragment t02 = this.f15373b.t0();
        if (t02 != null) {
            t02.I0().s0().e(fragment, true);
        }
        Iterator<a> it = this.f15372a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f15375b) {
                next.f15374a.e(this.f15373b, fragment);
            }
        }
    }

    public void f(Fragment fragment, boolean z10) {
        Fragment t02 = this.f15373b.t0();
        if (t02 != null) {
            t02.I0().s0().f(fragment, true);
        }
        Iterator<a> it = this.f15372a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f15375b) {
                next.f15374a.f(this.f15373b, fragment);
            }
        }
    }

    public void g(Fragment fragment, boolean z10) {
        Context f10 = this.f15373b.q0().f();
        Fragment t02 = this.f15373b.t0();
        if (t02 != null) {
            t02.I0().s0().g(fragment, true);
        }
        Iterator<a> it = this.f15372a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f15375b) {
                next.f15374a.g(this.f15373b, fragment, f10);
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment t02 = this.f15373b.t0();
        if (t02 != null) {
            t02.I0().s0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.f15372a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f15375b) {
                next.f15374a.h(this.f15373b, fragment, bundle);
            }
        }
    }

    public void i(Fragment fragment, boolean z10) {
        Fragment t02 = this.f15373b.t0();
        if (t02 != null) {
            t02.I0().s0().i(fragment, true);
        }
        Iterator<a> it = this.f15372a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f15375b) {
                next.f15374a.i(this.f15373b, fragment);
            }
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment t02 = this.f15373b.t0();
        if (t02 != null) {
            t02.I0().s0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.f15372a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f15375b) {
                next.f15374a.j(this.f15373b, fragment, bundle);
            }
        }
    }

    public void k(Fragment fragment, boolean z10) {
        Fragment t02 = this.f15373b.t0();
        if (t02 != null) {
            t02.I0().s0().k(fragment, true);
        }
        Iterator<a> it = this.f15372a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f15375b) {
                next.f15374a.k(this.f15373b, fragment);
            }
        }
    }

    public void l(Fragment fragment, boolean z10) {
        Fragment t02 = this.f15373b.t0();
        if (t02 != null) {
            t02.I0().s0().l(fragment, true);
        }
        Iterator<a> it = this.f15372a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f15375b) {
                next.f15374a.l(this.f15373b, fragment);
            }
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment t02 = this.f15373b.t0();
        if (t02 != null) {
            t02.I0().s0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f15372a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f15375b) {
                next.f15374a.m(this.f15373b, fragment, view, bundle);
            }
        }
    }

    public void n(Fragment fragment, boolean z10) {
        Fragment t02 = this.f15373b.t0();
        if (t02 != null) {
            t02.I0().s0().n(fragment, true);
        }
        Iterator<a> it = this.f15372a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f15375b) {
                next.f15374a.n(this.f15373b, fragment);
            }
        }
    }

    public void o(FragmentManager.j jVar, boolean z10) {
        this.f15372a.add(new a(jVar, z10));
    }

    public void p(FragmentManager.j jVar) {
        synchronized (this.f15372a) {
            int i10 = 0;
            int size = this.f15372a.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (this.f15372a.get(i10).f15374a == jVar) {
                    this.f15372a.remove(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
    }
}
