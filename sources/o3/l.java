package o3;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f43975a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<n> f43976b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<n, a> f43977c = new HashMap();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.lifecycle.o f43978a;

        /* renamed from: b  reason: collision with root package name */
        public androidx.lifecycle.r f43979b;

        public a(androidx.lifecycle.o oVar, androidx.lifecycle.r rVar) {
            this.f43978a = oVar;
            this.f43979b = rVar;
            oVar.a(rVar);
        }

        public void a() {
            this.f43978a.c(this.f43979b);
            this.f43979b = null;
        }
    }

    public l(Runnable runnable) {
        this.f43975a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(n nVar, androidx.lifecycle.u uVar, o.b bVar) {
        if (bVar == o.b.ON_DESTROY) {
            j(nVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(o.c cVar, n nVar, androidx.lifecycle.u uVar, o.b bVar) {
        if (bVar == o.b.h(cVar)) {
            c(nVar);
        } else if (bVar == o.b.ON_DESTROY) {
            j(nVar);
        } else if (bVar == o.b.a(cVar)) {
            this.f43976b.remove(nVar);
            this.f43975a.run();
        }
    }

    public void c(n nVar) {
        this.f43976b.add(nVar);
        this.f43975a.run();
    }

    public void d(final n nVar, androidx.lifecycle.u uVar) {
        c(nVar);
        androidx.lifecycle.o g10 = uVar.g();
        a remove = this.f43977c.remove(nVar);
        if (remove != null) {
            remove.a();
        }
        this.f43977c.put(nVar, new a(g10, new androidx.lifecycle.r() { // from class: o3.k
            @Override // androidx.lifecycle.r
            public final void i(androidx.lifecycle.u uVar2, o.b bVar) {
                l.this.f(nVar, uVar2, bVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(final n nVar, androidx.lifecycle.u uVar, final o.c cVar) {
        androidx.lifecycle.o g10 = uVar.g();
        a remove = this.f43977c.remove(nVar);
        if (remove != null) {
            remove.a();
        }
        this.f43977c.put(nVar, new a(g10, new androidx.lifecycle.r() { // from class: o3.j
            @Override // androidx.lifecycle.r
            public final void i(androidx.lifecycle.u uVar2, o.b bVar) {
                l.this.g(cVar, nVar, uVar2, bVar);
            }
        }));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator<n> it = this.f43976b.iterator();
        while (it.hasNext()) {
            it.next().b(menu, menuInflater);
        }
    }

    public boolean i(MenuItem menuItem) {
        Iterator<n> it = this.f43976b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void j(n nVar) {
        this.f43976b.remove(nVar);
        a remove = this.f43977c.remove(nVar);
        if (remove != null) {
            remove.a();
        }
        this.f43975a.run();
    }
}
