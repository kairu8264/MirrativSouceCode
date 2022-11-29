package l1;

import a1.a0;
import a1.j;
import android.view.KeyEvent;
import io.l;
import jo.p;
import q1.l0;
import q1.q;
import s1.k;

/* loaded from: classes.dex */
public final class e implements r1.b, r1.d<e>, l0 {
    public k A;

    /* renamed from: w  reason: collision with root package name */
    public final l<b, Boolean> f39495w;

    /* renamed from: x  reason: collision with root package name */
    public final l<b, Boolean> f39496x;

    /* renamed from: y  reason: collision with root package name */
    public j f39497y;

    /* renamed from: z  reason: collision with root package name */
    public e f39498z;

    /* JADX WARN: Multi-variable type inference failed */
    public e(l<? super b, Boolean> lVar, l<? super b, Boolean> lVar2) {
        this.f39495w = lVar;
        this.f39496x = lVar2;
    }

    @Override // q1.l0
    public void T(q qVar) {
        p.h(qVar, "coordinates");
        this.A = ((s1.p) qVar).z1();
    }

    public final k a() {
        return this.A;
    }

    public final e b() {
        return this.f39498z;
    }

    @Override // r1.d
    /* renamed from: c */
    public e getValue() {
        return this;
    }

    public final boolean f(KeyEvent keyEvent) {
        j b10;
        e d10;
        p.h(keyEvent, "keyEvent");
        j jVar = this.f39497y;
        if (jVar != null && (b10 = a0.b(jVar)) != null && (d10 = a0.d(b10)) != null) {
            if (d10.i(keyEvent)) {
                return true;
            }
            return d10.g(keyEvent);
        }
        throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
    }

    public final boolean g(KeyEvent keyEvent) {
        p.h(keyEvent, "keyEvent");
        l<b, Boolean> lVar = this.f39495w;
        Boolean invoke = lVar != null ? lVar.invoke(b.a(keyEvent)) : null;
        if (p.c(invoke, Boolean.TRUE)) {
            return invoke.booleanValue();
        }
        e eVar = this.f39498z;
        if (eVar != null) {
            return eVar.g(keyEvent);
        }
        return false;
    }

    @Override // r1.d
    public r1.f<e> getKey() {
        return f.a();
    }

    public final boolean i(KeyEvent keyEvent) {
        p.h(keyEvent, "keyEvent");
        e eVar = this.f39498z;
        Boolean valueOf = eVar != null ? Boolean.valueOf(eVar.i(keyEvent)) : null;
        if (p.c(valueOf, Boolean.TRUE)) {
            return valueOf.booleanValue();
        }
        l<b, Boolean> lVar = this.f39496x;
        if (lVar != null) {
            return lVar.invoke(b.a(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // r1.b
    public void j0(r1.e eVar) {
        m0.e<e> n10;
        m0.e<e> n11;
        p.h(eVar, "scope");
        j jVar = this.f39497y;
        if (jVar != null && (n11 = jVar.n()) != null) {
            n11.u(this);
        }
        j jVar2 = (j) eVar.a(a1.k.c());
        this.f39497y = jVar2;
        if (jVar2 != null && (n10 = jVar2.n()) != null) {
            n10.c(this);
        }
        this.f39498z = (e) eVar.a(f.a());
    }
}
