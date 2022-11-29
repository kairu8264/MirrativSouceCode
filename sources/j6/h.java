package j6;

import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.u;

/* loaded from: classes.dex */
public final class h extends androidx.lifecycle.o {

    /* renamed from: b  reason: collision with root package name */
    public static final h f37149b = new h();

    /* renamed from: c  reason: collision with root package name */
    public static final u f37150c = g.f37148w;

    public static final androidx.lifecycle.o e() {
        return f37149b;
    }

    @Override // androidx.lifecycle.o
    public void a(t tVar) {
        if (tVar instanceof androidx.lifecycle.h) {
            androidx.lifecycle.h hVar = (androidx.lifecycle.h) tVar;
            u uVar = f37150c;
            hVar.b(uVar);
            hVar.h(uVar);
            hVar.c(uVar);
            return;
        }
        throw new IllegalArgumentException((tVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    @Override // androidx.lifecycle.o
    public o.c b() {
        return o.c.RESUMED;
    }

    @Override // androidx.lifecycle.o
    public void c(t tVar) {
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
