package ai;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class l02 implements ry1<ty0> {

    /* renamed from: a  reason: collision with root package name */
    public final rz0 f6433a;

    /* renamed from: b  reason: collision with root package name */
    public final sz1 f6434b;

    /* renamed from: c  reason: collision with root package name */
    public final t43 f6435c;

    /* renamed from: d  reason: collision with root package name */
    public final x41 f6436d;

    /* renamed from: e  reason: collision with root package name */
    public final ScheduledExecutorService f6437e;

    public l02(rz0 rz0Var, sz1 sz1Var, x41 x41Var, ScheduledExecutorService scheduledExecutorService, t43 t43Var) {
        this.f6433a = rz0Var;
        this.f6434b = sz1Var;
        this.f6436d = x41Var;
        this.f6437e = scheduledExecutorService;
        this.f6435c = t43Var;
    }

    @Override // ai.ry1
    public final s43<ty0> a(final sl2 sl2Var, final fl2 fl2Var) {
        return this.f6435c.h(new Callable(this, sl2Var, fl2Var) { // from class: ai.i02

            /* renamed from: a  reason: collision with root package name */
            public final l02 f5063a;

            /* renamed from: b  reason: collision with root package name */
            public final sl2 f5064b;

            /* renamed from: c  reason: collision with root package name */
            public final fl2 f5065c;

            {
                this.f5063a = this;
                this.f5064b = sl2Var;
                this.f5065c = fl2Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5063a.e(this.f5064b, this.f5065c);
            }
        });
    }

    @Override // ai.ry1
    public final boolean b(sl2 sl2Var, fl2 fl2Var) {
        return sl2Var.f9875a.f8473a.a() != null && this.f6434b.b(sl2Var, fl2Var);
    }

    public final /* synthetic */ ty0 e(final sl2 sl2Var, final fl2 fl2Var) throws Exception {
        return this.f6433a.e(new j11(sl2Var, fl2Var, null), new e01(sl2Var.f9875a.f8473a.a(), new Runnable(this, sl2Var, fl2Var) { // from class: ai.j02

            /* renamed from: w  reason: collision with root package name */
            public final l02 f5572w;

            /* renamed from: x  reason: collision with root package name */
            public final sl2 f5573x;

            /* renamed from: y  reason: collision with root package name */
            public final fl2 f5574y;

            {
                this.f5572w = this;
                this.f5573x = sl2Var;
                this.f5574y = fl2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5572w.f(this.f5573x, this.f5574y);
            }
        })).zza();
    }

    public final /* synthetic */ void f(sl2 sl2Var, fl2 fl2Var) {
        j43.p(j43.h(this.f6434b.a(sl2Var, fl2Var), fl2Var.N, TimeUnit.SECONDS, this.f6437e), new k02(this), this.f6435c);
    }
}
