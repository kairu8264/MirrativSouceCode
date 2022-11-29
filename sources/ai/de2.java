package ai;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class de2 implements xc2<ee2> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3229a;

    /* renamed from: b  reason: collision with root package name */
    public final fj0 f3230b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f3231c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f3232d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3233e;

    /* renamed from: f  reason: collision with root package name */
    public final wi0 f3234f;

    public de2(wi0 wi0Var, int i10, Context context, fj0 fj0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.f3234f = wi0Var;
        this.f3229a = context;
        this.f3230b = fj0Var;
        this.f3231c = scheduledExecutorService;
        this.f3232d = executor;
        this.f3233e = str;
    }

    public final /* synthetic */ ee2 a(Exception exc) {
        this.f3230b.k(exc, "AttestationTokenSignal");
        return null;
    }

    @Override // ai.xc2
    public final s43<ee2> zza() {
        return j43.f((z33) j43.h(j43.j(z33.E(j43.e(new o33(this) { // from class: ai.zd2

            /* renamed from: a  reason: collision with root package name */
            public final de2 f12942a;

            {
                this.f12942a = this;
            }

            @Override // ai.o33
            public final s43 zza() {
                return j43.a(null);
            }
        }, this.f3232d)), be2.f2299a, this.f3232d), ((Long) ft.c().c(ox.G0)).longValue(), TimeUnit.MILLISECONDS, this.f3231c), Exception.class, new bx2(this) { // from class: ai.ce2

            /* renamed from: a  reason: collision with root package name */
            public final de2 f2800a;

            {
                this.f2800a = this;
            }

            @Override // ai.bx2
            public final Object apply(Object obj) {
                this.f2800a.a((Exception) obj);
                return null;
            }
        }, z43.a());
    }
}
