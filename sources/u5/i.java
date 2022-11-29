package u5;

import androidx.work.impl.WorkDatabase;
import k5.s;
import t5.q;

/* loaded from: classes.dex */
public class i implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public static final String f54411z = k5.j.f("StopWorkRunnable");

    /* renamed from: w  reason: collision with root package name */
    public final l5.i f54412w;

    /* renamed from: x  reason: collision with root package name */
    public final String f54413x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f54414y;

    public i(l5.i iVar, String str, boolean z10) {
        this.f54412w = iVar;
        this.f54413x = str;
        this.f54414y = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean o10;
        WorkDatabase o11 = this.f54412w.o();
        l5.d m10 = this.f54412w.m();
        q L = o11.L();
        o11.e();
        try {
            boolean h10 = m10.h(this.f54413x);
            if (this.f54414y) {
                o10 = this.f54412w.m().n(this.f54413x);
            } else {
                if (!h10 && L.f(this.f54413x) == s.a.RUNNING) {
                    L.c(s.a.ENQUEUED, this.f54413x);
                }
                o10 = this.f54412w.m().o(this.f54413x);
            }
            k5.j.c().a(f54411z, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f54413x, Boolean.valueOf(o10)), new Throwable[0]);
            o11.A();
        } finally {
            o11.i();
        }
    }
}
