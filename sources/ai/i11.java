package ai;

import com.google.android.gms.internal.ads.zzdym;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class i11 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f5075a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f5076b;

    /* renamed from: c  reason: collision with root package name */
    public final s43<b11> f5077c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f5078d = true;

    public i11(Executor executor, ScheduledExecutorService scheduledExecutorService, s43<b11> s43Var) {
        this.f5075a = executor;
        this.f5076b = scheduledExecutorService;
        this.f5077c = s43Var;
    }

    public static /* synthetic */ void b(final i11 i11Var, List list, final e43 e43Var) {
        if (list != null && !list.isEmpty()) {
            s43 a10 = j43.a(null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final s43 s43Var = (s43) it.next();
                a10 = j43.i(j43.g(a10, Throwable.class, new p33(e43Var) { // from class: ai.d11

                    /* renamed from: a  reason: collision with root package name */
                    public final e43 f3100a;

                    {
                        this.f3100a = e43Var;
                    }

                    @Override // ai.p33
                    public final s43 a(Object obj) {
                        this.f3100a.a((Throwable) obj);
                        return j43.a(null);
                    }
                }, i11Var.f5075a), new p33(i11Var, e43Var, s43Var) { // from class: ai.e11

                    /* renamed from: a  reason: collision with root package name */
                    public final i11 f3495a;

                    /* renamed from: b  reason: collision with root package name */
                    public final e43 f3496b;

                    /* renamed from: c  reason: collision with root package name */
                    public final s43 f3497c;

                    {
                        this.f3495a = i11Var;
                        this.f3496b = e43Var;
                        this.f3497c = s43Var;
                    }

                    @Override // ai.p33
                    public final s43 a(Object obj) {
                        return this.f3495a.f(this.f3496b, this.f3497c, (u01) obj);
                    }
                }, i11Var.f5075a);
            }
            j43.p(a10, new h11(i11Var, e43Var), i11Var.f5075a);
            return;
        }
        i11Var.f5075a.execute(new Runnable(e43Var) { // from class: ai.c11

            /* renamed from: w  reason: collision with root package name */
            public final e43 f2655w;

            {
                this.f2655w = e43Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f2655w.a(new zzdym(3));
            }
        });
    }

    public final void a(e43<u01> e43Var) {
        j43.p(this.f5077c, new g11(this, e43Var), this.f5075a);
    }

    public final boolean c() {
        return this.f5078d;
    }

    public final /* synthetic */ void e() {
        this.f5078d = false;
    }

    public final /* synthetic */ s43 f(e43 e43Var, s43 s43Var, u01 u01Var) throws Exception {
        if (u01Var != null) {
            e43Var.b(u01Var);
        }
        return j43.h(s43Var, oz.f8174b.e().longValue(), TimeUnit.MILLISECONDS, this.f5076b);
    }
}
