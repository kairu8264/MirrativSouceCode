package ai;

/* loaded from: classes3.dex */
public final class j70 extends tk0<e60> {

    /* renamed from: d  reason: collision with root package name */
    public final yg.f0<e60> f5647d;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5646c = new Object();

    /* renamed from: e  reason: collision with root package name */
    public boolean f5648e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f5649f = 0;

    public j70(yg.f0<e60> f0Var) {
        this.f5647d = f0Var;
    }

    public final e70 f() {
        e70 e70Var = new e70(this);
        synchronized (this.f5646c) {
            b(new f70(this, e70Var), new g70(this, e70Var));
            rh.p.l(this.f5649f >= 0);
            this.f5649f++;
        }
        return e70Var;
    }

    public final void g() {
        synchronized (this.f5646c) {
            rh.p.l(this.f5649f > 0);
            yg.p1.k("Releasing 1 reference for JS Engine");
            this.f5649f--;
            i();
        }
    }

    public final void h() {
        synchronized (this.f5646c) {
            rh.p.l(this.f5649f >= 0);
            yg.p1.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f5648e = true;
            i();
        }
    }

    public final void i() {
        synchronized (this.f5646c) {
            rh.p.l(this.f5649f >= 0);
            if (this.f5648e && this.f5649f == 0) {
                yg.p1.k("No reference is left (including root). Cleaning up engine.");
                b(new i70(this), new pk0());
            } else {
                yg.p1.k("There are still references to the engine. Not destroying.");
            }
        }
    }
}
