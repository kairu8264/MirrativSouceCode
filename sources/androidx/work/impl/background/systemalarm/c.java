package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import java.util.Collections;
import java.util.List;
import k5.j;
import t5.p;
import u5.n;

/* loaded from: classes.dex */
public class c implements p5.c, l5.b, n.b {
    public static final String F = j.f("DelayMetCommandHandler");
    public final p5.d A;
    public PowerManager.WakeLock D;

    /* renamed from: w  reason: collision with root package name */
    public final Context f16599w;

    /* renamed from: x  reason: collision with root package name */
    public final int f16600x;

    /* renamed from: y  reason: collision with root package name */
    public final String f16601y;

    /* renamed from: z  reason: collision with root package name */
    public final d f16602z;
    public boolean E = false;
    public int C = 0;
    public final Object B = new Object();

    public c(Context context, int i10, String str, d dVar) {
        this.f16599w = context;
        this.f16600x = i10;
        this.f16602z = dVar;
        this.f16601y = str;
        this.A = new p5.d(context, dVar.f(), this);
    }

    @Override // u5.n.b
    public void a(String str) {
        j.c().a(F, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // p5.c
    public void b(List<String> list) {
        g();
    }

    public final void c() {
        synchronized (this.B) {
            this.A.e();
            this.f16602z.h().c(this.f16601y);
            PowerManager.WakeLock wakeLock = this.D;
            if (wakeLock != null && wakeLock.isHeld()) {
                j.c().a(F, String.format("Releasing wakelock %s for WorkSpec %s", this.D, this.f16601y), new Throwable[0]);
                this.D.release();
            }
        }
    }

    @Override // l5.b
    public void d(String str, boolean z10) {
        j.c().a(F, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        c();
        if (z10) {
            Intent f10 = a.f(this.f16599w, this.f16601y);
            d dVar = this.f16602z;
            dVar.k(new d.b(dVar, f10, this.f16600x));
        }
        if (this.E) {
            Intent a10 = a.a(this.f16599w);
            d dVar2 = this.f16602z;
            dVar2.k(new d.b(dVar2, a10, this.f16600x));
        }
    }

    public void e() {
        this.D = u5.j.b(this.f16599w, String.format("%s (%s)", this.f16601y, Integer.valueOf(this.f16600x)));
        j c10 = j.c();
        String str = F;
        c10.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.D, this.f16601y), new Throwable[0]);
        this.D.acquire();
        p g10 = this.f16602z.g().o().L().g(this.f16601y);
        if (g10 == null) {
            g();
            return;
        }
        boolean b10 = g10.b();
        this.E = b10;
        if (!b10) {
            j.c().a(str, String.format("No constraints for %s", this.f16601y), new Throwable[0]);
            f(Collections.singletonList(this.f16601y));
            return;
        }
        this.A.d(Collections.singletonList(g10));
    }

    @Override // p5.c
    public void f(List<String> list) {
        if (list.contains(this.f16601y)) {
            synchronized (this.B) {
                if (this.C == 0) {
                    this.C = 1;
                    j.c().a(F, String.format("onAllConstraintsMet for %s", this.f16601y), new Throwable[0]);
                    if (this.f16602z.e().j(this.f16601y)) {
                        this.f16602z.h().b(this.f16601y, 600000L, this);
                    } else {
                        c();
                    }
                } else {
                    j.c().a(F, String.format("Already started work for %s", this.f16601y), new Throwable[0]);
                }
            }
        }
    }

    public final void g() {
        synchronized (this.B) {
            if (this.C < 2) {
                this.C = 2;
                j c10 = j.c();
                String str = F;
                c10.a(str, String.format("Stopping work for WorkSpec %s", this.f16601y), new Throwable[0]);
                Intent g10 = a.g(this.f16599w, this.f16601y);
                d dVar = this.f16602z;
                dVar.k(new d.b(dVar, g10, this.f16600x));
                if (this.f16602z.e().g(this.f16601y)) {
                    j.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f16601y), new Throwable[0]);
                    Intent f10 = a.f(this.f16599w, this.f16601y);
                    d dVar2 = this.f16602z;
                    dVar2.k(new d.b(dVar2, f10, this.f16600x));
                } else {
                    j.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f16601y), new Throwable[0]);
                }
            } else {
                j.c().a(F, String.format("Already stopped work for %s", this.f16601y), new Throwable[0]);
            }
        }
    }
}
