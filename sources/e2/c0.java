package e2;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final v f30068a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<f0> f30069b;

    public c0(v vVar) {
        jo.p.h(vVar, "platformTextInputService");
        this.f30068a = vVar;
        this.f30069b = new AtomicReference<>(null);
    }

    public final f0 a() {
        return this.f30069b.get();
    }

    public final void b() {
        this.f30068a.b();
    }

    public f0 c(a0 a0Var, m mVar, io.l<? super List<? extends d>, wn.v> lVar, io.l<? super l, wn.v> lVar2) {
        jo.p.h(a0Var, "value");
        jo.p.h(mVar, "imeOptions");
        jo.p.h(lVar, "onEditCommand");
        jo.p.h(lVar2, "onImeActionPerformed");
        this.f30068a.c(a0Var, mVar, lVar, lVar2);
        f0 f0Var = new f0(this, this.f30068a);
        this.f30069b.set(f0Var);
        return f0Var;
    }

    public void d(f0 f0Var) {
        jo.p.h(f0Var, "session");
        if (this.f30069b.compareAndSet(f0Var, null)) {
            this.f30068a.a();
        }
    }
}
