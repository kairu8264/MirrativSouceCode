package p5;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import k5.j;
import q5.c;
import q5.e;
import q5.f;
import q5.g;
import q5.h;
import t5.p;

/* loaded from: classes.dex */
public class d implements c.a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f45796d = j.f("WorkConstraintsTracker");

    /* renamed from: a  reason: collision with root package name */
    public final c f45797a;

    /* renamed from: b  reason: collision with root package name */
    public final q5.c<?>[] f45798b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f45799c;

    public d(Context context, w5.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f45797a = cVar;
        this.f45798b = new q5.c[]{new q5.a(applicationContext, aVar), new q5.b(applicationContext, aVar), new h(applicationContext, aVar), new q5.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f45799c = new Object();
    }

    @Override // q5.c.a
    public void a(List<String> list) {
        synchronized (this.f45799c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (c(str)) {
                    j.c().a(f45796d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            c cVar = this.f45797a;
            if (cVar != null) {
                cVar.f(arrayList);
            }
        }
    }

    @Override // q5.c.a
    public void b(List<String> list) {
        synchronized (this.f45799c) {
            c cVar = this.f45797a;
            if (cVar != null) {
                cVar.b(list);
            }
        }
    }

    public boolean c(String str) {
        q5.c<?>[] cVarArr;
        synchronized (this.f45799c) {
            for (q5.c<?> cVar : this.f45798b) {
                if (cVar.d(str)) {
                    j.c().a(f45796d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(Iterable<p> iterable) {
        synchronized (this.f45799c) {
            for (q5.c<?> cVar : this.f45798b) {
                cVar.g(null);
            }
            for (q5.c<?> cVar2 : this.f45798b) {
                cVar2.e(iterable);
            }
            for (q5.c<?> cVar3 : this.f45798b) {
                cVar3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.f45799c) {
            for (q5.c<?> cVar : this.f45798b) {
                cVar.f();
            }
        }
    }
}
