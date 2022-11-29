package v6;

import java.util.Collections;

/* loaded from: classes.dex */
public class q<K, A> extends a<K, A> {

    /* renamed from: i  reason: collision with root package name */
    public final A f56825i;

    public q(g7.c<A> cVar) {
        this(cVar, null);
    }

    @Override // v6.a
    public float c() {
        return 1.0f;
    }

    @Override // v6.a
    public A h() {
        g7.c<A> cVar = this.f56772e;
        A a10 = this.f56825i;
        return cVar.b(0.0f, 0.0f, a10, a10, f(), f(), f());
    }

    @Override // v6.a
    public A i(g7.a<K> aVar, float f10) {
        return h();
    }

    @Override // v6.a
    public void k() {
        if (this.f56772e != null) {
            super.k();
        }
    }

    @Override // v6.a
    public void m(float f10) {
        this.f56771d = f10;
    }

    public q(g7.c<A> cVar, A a10) {
        super(Collections.emptyList());
        n(cVar);
        this.f56825i = a10;
    }
}
