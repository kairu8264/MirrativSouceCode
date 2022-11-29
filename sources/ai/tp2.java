package ai;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class tp2<O> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10369a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10370b;

    /* renamed from: c  reason: collision with root package name */
    public final s43<?> f10371c;

    /* renamed from: d  reason: collision with root package name */
    public final List<s43<?>> f10372d;

    /* renamed from: e  reason: collision with root package name */
    public final s43<O> f10373e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ up2 f10374f;

    public tp2(up2 up2Var, up2 up2Var2, String str, s43 s43Var, List<s43> list, s43<O> s43Var2) {
        this.f10374f = up2Var;
        this.f10369a = up2Var2;
        this.f10370b = str;
        this.f10371c = s43Var;
        this.f10372d = list;
        this.f10373e = s43Var2;
    }

    public final tp2<O> a(String str) {
        return new tp2<>(this.f10374f, this.f10369a, str, this.f10371c, this.f10372d, this.f10373e);
    }

    public final <O2> tp2<O2> b(final fp2<O, O2> fp2Var) {
        return c(new p33(fp2Var) { // from class: ai.op2

            /* renamed from: a  reason: collision with root package name */
            public final fp2 f7878a;

            {
                this.f7878a = fp2Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return j43.a(this.f7878a.a(obj));
            }
        });
    }

    public final <O2> tp2<O2> c(p33<O, O2> p33Var) {
        t43 t43Var;
        t43Var = this.f10374f.f10790a;
        return d(p33Var, t43Var);
    }

    public final <O2> tp2<O2> d(p33<O, O2> p33Var, Executor executor) {
        return new tp2<>(this.f10374f, this.f10369a, this.f10370b, this.f10371c, this.f10372d, j43.i(this.f10373e, p33Var, executor));
    }

    public final <O2> tp2<O2> e(final s43<O2> s43Var) {
        return d(new p33(s43Var) { // from class: ai.pp2

            /* renamed from: a  reason: collision with root package name */
            public final s43 f8495a;

            {
                this.f8495a = s43Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f8495a;
            }
        }, hk0.f4883f);
    }

    public final <T extends Throwable> tp2<O> f(Class<T> cls, final fp2<T, O> fp2Var) {
        return g(cls, new p33(fp2Var) { // from class: ai.qp2

            /* renamed from: a  reason: collision with root package name */
            public final fp2 f9047a;

            {
                this.f9047a = fp2Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                Exception exc = (Exception) ((Throwable) obj);
                return j43.a("");
            }
        });
    }

    public final <T extends Throwable> tp2<O> g(Class<T> cls, p33<T, O> p33Var) {
        t43 t43Var;
        up2 up2Var = this.f10374f;
        Object obj = this.f10369a;
        String str = this.f10370b;
        s43<?> s43Var = this.f10371c;
        List<s43<?>> list = this.f10372d;
        s43<O> s43Var2 = this.f10373e;
        t43Var = up2Var.f10790a;
        return new tp2<>(up2Var, obj, str, s43Var, list, j43.g(s43Var2, cls, p33Var, t43Var));
    }

    public final tp2<O> h(long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        up2 up2Var = this.f10374f;
        Object obj = this.f10369a;
        String str = this.f10370b;
        s43<?> s43Var = this.f10371c;
        List<s43<?>> list = this.f10372d;
        s43<O> s43Var2 = this.f10373e;
        scheduledExecutorService = up2Var.f10791b;
        return new tp2<>(up2Var, obj, str, s43Var, list, j43.h(s43Var2, j10, timeUnit, scheduledExecutorService));
    }

    public final hp2 i() {
        vp2 vp2Var;
        Object obj = this.f10369a;
        String str = this.f10370b;
        if (str == null) {
            str = this.f10374f.g(obj);
        }
        final hp2 hp2Var = new hp2(obj, str, this.f10373e);
        vp2Var = this.f10374f.f10792c;
        vp2Var.K(hp2Var);
        s43<?> s43Var = this.f10371c;
        Runnable runnable = new Runnable(this, hp2Var) { // from class: ai.rp2

            /* renamed from: w  reason: collision with root package name */
            public final tp2 f9534w;

            /* renamed from: x  reason: collision with root package name */
            public final hp2 f9535x;

            {
                this.f9534w = this;
                this.f9535x = hp2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                vp2 vp2Var2;
                tp2 tp2Var = this.f9534w;
                hp2 hp2Var2 = this.f9535x;
                vp2Var2 = tp2Var.f10374f.f10792c;
                vp2Var2.N(hp2Var2);
            }
        };
        t43 t43Var = hk0.f4883f;
        s43Var.c(runnable, t43Var);
        j43.p(hp2Var, new sp2(this, hp2Var), t43Var);
        return hp2Var;
    }

    public final tp2<O> j(Object obj) {
        return this.f10374f.e(obj, i());
    }
}
