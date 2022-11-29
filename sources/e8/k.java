package e8;

import e8.e;

/* loaded from: classes.dex */
public class k implements e, d {

    /* renamed from: a  reason: collision with root package name */
    public final e f30345a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f30346b;

    /* renamed from: c  reason: collision with root package name */
    public volatile d f30347c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d f30348d;

    /* renamed from: e  reason: collision with root package name */
    public e.a f30349e;

    /* renamed from: f  reason: collision with root package name */
    public e.a f30350f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f30351g;

    public k(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f30349e = aVar;
        this.f30350f = aVar;
        this.f30346b = obj;
        this.f30345a = eVar;
    }

    @Override // e8.e, e8.d
    public boolean a() {
        boolean z10;
        synchronized (this.f30346b) {
            z10 = this.f30348d.a() || this.f30347c.a();
        }
        return z10;
    }

    @Override // e8.e
    public boolean b(d dVar) {
        boolean z10;
        synchronized (this.f30346b) {
            z10 = l() && dVar.equals(this.f30347c) && !a();
        }
        return z10;
    }

    @Override // e8.e
    public boolean c(d dVar) {
        boolean z10;
        synchronized (this.f30346b) {
            z10 = m() && (dVar.equals(this.f30347c) || this.f30349e != e.a.SUCCESS);
        }
        return z10;
    }

    @Override // e8.d
    public void clear() {
        synchronized (this.f30346b) {
            this.f30351g = false;
            e.a aVar = e.a.CLEARED;
            this.f30349e = aVar;
            this.f30350f = aVar;
            this.f30348d.clear();
            this.f30347c.clear();
        }
    }

    @Override // e8.e
    public void d(d dVar) {
        synchronized (this.f30346b) {
            if (!dVar.equals(this.f30347c)) {
                this.f30350f = e.a.FAILED;
                return;
            }
            this.f30349e = e.a.FAILED;
            e eVar = this.f30345a;
            if (eVar != null) {
                eVar.d(this);
            }
        }
    }

    @Override // e8.d
    public boolean e() {
        boolean z10;
        synchronized (this.f30346b) {
            z10 = this.f30349e == e.a.CLEARED;
        }
        return z10;
    }

    @Override // e8.e
    public void f(d dVar) {
        synchronized (this.f30346b) {
            if (dVar.equals(this.f30348d)) {
                this.f30350f = e.a.SUCCESS;
                return;
            }
            this.f30349e = e.a.SUCCESS;
            e eVar = this.f30345a;
            if (eVar != null) {
                eVar.f(this);
            }
            if (!this.f30350f.a()) {
                this.f30348d.clear();
            }
        }
    }

    @Override // e8.d
    public boolean g() {
        boolean z10;
        synchronized (this.f30346b) {
            z10 = this.f30349e == e.a.SUCCESS;
        }
        return z10;
    }

    @Override // e8.e
    public e getRoot() {
        e root;
        synchronized (this.f30346b) {
            e eVar = this.f30345a;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    @Override // e8.d
    public boolean h(d dVar) {
        if (dVar instanceof k) {
            k kVar = (k) dVar;
            if (this.f30347c == null) {
                if (kVar.f30347c != null) {
                    return false;
                }
            } else if (!this.f30347c.h(kVar.f30347c)) {
                return false;
            }
            if (this.f30348d == null) {
                if (kVar.f30348d != null) {
                    return false;
                }
            } else if (!this.f30348d.h(kVar.f30348d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // e8.d
    public void i() {
        synchronized (this.f30346b) {
            this.f30351g = true;
            if (this.f30349e != e.a.SUCCESS) {
                e.a aVar = this.f30350f;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f30350f = aVar2;
                    this.f30348d.i();
                }
            }
            if (this.f30351g) {
                e.a aVar3 = this.f30349e;
                e.a aVar4 = e.a.RUNNING;
                if (aVar3 != aVar4) {
                    this.f30349e = aVar4;
                    this.f30347c.i();
                }
            }
            this.f30351g = false;
        }
    }

    @Override // e8.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f30346b) {
            z10 = this.f30349e == e.a.RUNNING;
        }
        return z10;
    }

    @Override // e8.e
    public boolean j(d dVar) {
        boolean z10;
        synchronized (this.f30346b) {
            z10 = k() && dVar.equals(this.f30347c) && this.f30349e != e.a.PAUSED;
        }
        return z10;
    }

    public final boolean k() {
        e eVar = this.f30345a;
        return eVar == null || eVar.j(this);
    }

    public final boolean l() {
        e eVar = this.f30345a;
        return eVar == null || eVar.b(this);
    }

    public final boolean m() {
        e eVar = this.f30345a;
        return eVar == null || eVar.c(this);
    }

    public void n(d dVar, d dVar2) {
        this.f30347c = dVar;
        this.f30348d = dVar2;
    }

    @Override // e8.d
    public void pause() {
        synchronized (this.f30346b) {
            if (!this.f30350f.a()) {
                this.f30350f = e.a.PAUSED;
                this.f30348d.pause();
            }
            if (!this.f30349e.a()) {
                this.f30349e = e.a.PAUSED;
                this.f30347c.pause();
            }
        }
    }
}
