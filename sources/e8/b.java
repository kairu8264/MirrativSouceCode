package e8;

import e8.e;

/* loaded from: classes.dex */
public final class b implements e, d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f30309a;

    /* renamed from: b  reason: collision with root package name */
    public final e f30310b;

    /* renamed from: c  reason: collision with root package name */
    public volatile d f30311c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d f30312d;

    /* renamed from: e  reason: collision with root package name */
    public e.a f30313e;

    /* renamed from: f  reason: collision with root package name */
    public e.a f30314f;

    public b(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f30313e = aVar;
        this.f30314f = aVar;
        this.f30309a = obj;
        this.f30310b = eVar;
    }

    @Override // e8.e, e8.d
    public boolean a() {
        boolean z10;
        synchronized (this.f30309a) {
            z10 = this.f30311c.a() || this.f30312d.a();
        }
        return z10;
    }

    @Override // e8.e
    public boolean b(d dVar) {
        boolean z10;
        synchronized (this.f30309a) {
            z10 = m() && k(dVar);
        }
        return z10;
    }

    @Override // e8.e
    public boolean c(d dVar) {
        boolean z10;
        synchronized (this.f30309a) {
            z10 = n() && k(dVar);
        }
        return z10;
    }

    @Override // e8.d
    public void clear() {
        synchronized (this.f30309a) {
            e.a aVar = e.a.CLEARED;
            this.f30313e = aVar;
            this.f30311c.clear();
            if (this.f30314f != aVar) {
                this.f30314f = aVar;
                this.f30312d.clear();
            }
        }
    }

    @Override // e8.e
    public void d(d dVar) {
        synchronized (this.f30309a) {
            if (!dVar.equals(this.f30312d)) {
                this.f30313e = e.a.FAILED;
                e.a aVar = this.f30314f;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f30314f = aVar2;
                    this.f30312d.i();
                }
                return;
            }
            this.f30314f = e.a.FAILED;
            e eVar = this.f30310b;
            if (eVar != null) {
                eVar.d(this);
            }
        }
    }

    @Override // e8.d
    public boolean e() {
        boolean z10;
        synchronized (this.f30309a) {
            e.a aVar = this.f30313e;
            e.a aVar2 = e.a.CLEARED;
            z10 = aVar == aVar2 && this.f30314f == aVar2;
        }
        return z10;
    }

    @Override // e8.e
    public void f(d dVar) {
        synchronized (this.f30309a) {
            if (dVar.equals(this.f30311c)) {
                this.f30313e = e.a.SUCCESS;
            } else if (dVar.equals(this.f30312d)) {
                this.f30314f = e.a.SUCCESS;
            }
            e eVar = this.f30310b;
            if (eVar != null) {
                eVar.f(this);
            }
        }
    }

    @Override // e8.d
    public boolean g() {
        boolean z10;
        synchronized (this.f30309a) {
            e.a aVar = this.f30313e;
            e.a aVar2 = e.a.SUCCESS;
            z10 = aVar == aVar2 || this.f30314f == aVar2;
        }
        return z10;
    }

    @Override // e8.e
    public e getRoot() {
        e root;
        synchronized (this.f30309a) {
            e eVar = this.f30310b;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    @Override // e8.d
    public boolean h(d dVar) {
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            return this.f30311c.h(bVar.f30311c) && this.f30312d.h(bVar.f30312d);
        }
        return false;
    }

    @Override // e8.d
    public void i() {
        synchronized (this.f30309a) {
            e.a aVar = this.f30313e;
            e.a aVar2 = e.a.RUNNING;
            if (aVar != aVar2) {
                this.f30313e = aVar2;
                this.f30311c.i();
            }
        }
    }

    @Override // e8.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f30309a) {
            e.a aVar = this.f30313e;
            e.a aVar2 = e.a.RUNNING;
            z10 = aVar == aVar2 || this.f30314f == aVar2;
        }
        return z10;
    }

    @Override // e8.e
    public boolean j(d dVar) {
        boolean z10;
        synchronized (this.f30309a) {
            z10 = l() && k(dVar);
        }
        return z10;
    }

    public final boolean k(d dVar) {
        return dVar.equals(this.f30311c) || (this.f30313e == e.a.FAILED && dVar.equals(this.f30312d));
    }

    public final boolean l() {
        e eVar = this.f30310b;
        return eVar == null || eVar.j(this);
    }

    public final boolean m() {
        e eVar = this.f30310b;
        return eVar == null || eVar.b(this);
    }

    public final boolean n() {
        e eVar = this.f30310b;
        return eVar == null || eVar.c(this);
    }

    public void o(d dVar, d dVar2) {
        this.f30311c = dVar;
        this.f30312d = dVar2;
    }

    @Override // e8.d
    public void pause() {
        synchronized (this.f30309a) {
            e.a aVar = this.f30313e;
            e.a aVar2 = e.a.RUNNING;
            if (aVar == aVar2) {
                this.f30313e = e.a.PAUSED;
                this.f30311c.pause();
            }
            if (this.f30314f == aVar2) {
                this.f30314f = e.a.PAUSED;
                this.f30312d.pause();
            }
        }
    }
}
