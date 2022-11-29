package v4;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f56733a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final q0 f56734b;

    /* renamed from: c  reason: collision with root package name */
    public volatile z4.k f56735c;

    public w0(q0 q0Var) {
        this.f56734b = q0Var;
    }

    public z4.k a() {
        b();
        return e(this.f56733a.compareAndSet(false, true));
    }

    public void b() {
        this.f56734b.c();
    }

    public final z4.k c() {
        return this.f56734b.f(d());
    }

    public abstract String d();

    public final z4.k e(boolean z10) {
        if (z10) {
            if (this.f56735c == null) {
                this.f56735c = c();
            }
            return this.f56735c;
        }
        return c();
    }

    public void f(z4.k kVar) {
        if (kVar == this.f56735c) {
            this.f56733a.set(false);
        }
    }
}
