package ai;

/* loaded from: classes3.dex */
public final class e70 extends tk0<l70> {

    /* renamed from: c  reason: collision with root package name */
    public final Object f3574c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final j70 f3575d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3576e;

    public e70(j70 j70Var) {
        this.f3575d = j70Var;
    }

    public final void g() {
        synchronized (this.f3574c) {
            if (this.f3576e) {
                return;
            }
            this.f3576e = true;
            b(new b70(this), new pk0());
            b(new c70(this), new d70(this));
        }
    }
}
