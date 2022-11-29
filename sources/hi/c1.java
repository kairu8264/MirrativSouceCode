package hi;

import com.google.android.gms.internal.measurement.zzd;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    public final t3 f35681a;

    /* renamed from: b  reason: collision with root package name */
    public u4 f35682b;

    /* renamed from: c  reason: collision with root package name */
    public final c f35683c;

    /* renamed from: d  reason: collision with root package name */
    public final Cif f35684d;

    public c1() {
        t3 t3Var = new t3();
        this.f35681a = t3Var;
        this.f35682b = t3Var.f35995b.a();
        this.f35683c = new c();
        this.f35684d = new Cif();
        t3Var.f35997d.a("internal.registerCallback", new Callable() { // from class: hi.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c1.this.b();
            }
        });
        t3Var.f35997d.a("internal.eventLogger", new Callable() { // from class: hi.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new v8(c1.this.f35683c);
            }
        });
    }

    public final c a() {
        return this.f35683c;
    }

    public final /* synthetic */ j b() throws Exception {
        return new ef(this.f35684d);
    }

    public final void c(j5 j5Var) throws zzd {
        j jVar;
        try {
            this.f35682b = this.f35681a.f35995b.a();
            if (!(this.f35681a.a(this.f35682b, (o5[]) j5Var.t().toArray(new o5[0])) instanceof h)) {
                for (h5 h5Var : j5Var.r().u()) {
                    List<o5> t10 = h5Var.t();
                    String s10 = h5Var.s();
                    Iterator<o5> it = t10.iterator();
                    while (it.hasNext()) {
                        q a10 = this.f35681a.a(this.f35682b, it.next());
                        if (a10 instanceof n) {
                            u4 u4Var = this.f35682b;
                            if (u4Var.h(s10)) {
                                q d10 = u4Var.d(s10);
                                if (!(d10 instanceof j)) {
                                    String valueOf = String.valueOf(s10);
                                    throw new IllegalStateException(valueOf.length() != 0 ? "Invalid function name: ".concat(valueOf) : new String("Invalid function name: "));
                                }
                                jVar = (j) d10;
                            } else {
                                jVar = null;
                            }
                            if (jVar == null) {
                                String valueOf2 = String.valueOf(s10);
                                throw new IllegalStateException(valueOf2.length() != 0 ? "Rule function is undefined: ".concat(valueOf2) : new String("Rule function is undefined: "));
                            }
                            jVar.a(this.f35682b, Collections.singletonList(a10));
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    public final void d(String str, Callable<? extends j> callable) {
        this.f35681a.f35997d.a(str, callable);
    }

    public final boolean e(b bVar) throws zzd {
        try {
            this.f35683c.d(bVar);
            this.f35681a.f35996c.g("runtime.counter", new i(Double.valueOf(0.0d)));
            this.f35684d.b(this.f35682b.a(), this.f35683c);
            if (g()) {
                return true;
            }
            return f();
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    public final boolean f() {
        return !this.f35683c.c().isEmpty();
    }

    public final boolean g() {
        return !this.f35683c.b().equals(this.f35683c.a());
    }
}
