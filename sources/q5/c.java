package q5;

import java.util.ArrayList;
import java.util.List;
import t5.p;

/* loaded from: classes.dex */
public abstract class c<T> implements p5.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f48721a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public T f48722b;

    /* renamed from: c  reason: collision with root package name */
    public r5.d<T> f48723c;

    /* renamed from: d  reason: collision with root package name */
    public a f48724d;

    /* loaded from: classes.dex */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    public c(r5.d<T> dVar) {
        this.f48723c = dVar;
    }

    @Override // p5.a
    public void a(T t10) {
        this.f48722b = t10;
        h(this.f48724d, t10);
    }

    public abstract boolean b(p pVar);

    public abstract boolean c(T t10);

    public boolean d(String str) {
        T t10 = this.f48722b;
        return t10 != null && c(t10) && this.f48721a.contains(str);
    }

    public void e(Iterable<p> iterable) {
        this.f48721a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.f48721a.add(pVar.f53192a);
            }
        }
        if (this.f48721a.isEmpty()) {
            this.f48723c.c(this);
        } else {
            this.f48723c.a(this);
        }
        h(this.f48724d, this.f48722b);
    }

    public void f() {
        if (this.f48721a.isEmpty()) {
            return;
        }
        this.f48721a.clear();
        this.f48723c.c(this);
    }

    public void g(a aVar) {
        if (this.f48724d != aVar) {
            this.f48724d = aVar;
            h(aVar, this.f48722b);
        }
    }

    public final void h(a aVar, T t10) {
        if (this.f48721a.isEmpty() || aVar == null) {
            return;
        }
        if (t10 != null && !c(t10)) {
            aVar.a(this.f48721a);
        } else {
            aVar.b(this.f48721a);
        }
    }
}
