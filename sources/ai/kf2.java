package ai;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class kf2 implements xc2<lf2> {

    /* renamed from: a  reason: collision with root package name */
    public final fj0 f6195a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6196b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f6197c;

    /* renamed from: d  reason: collision with root package name */
    public final t43 f6198d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6199e;

    /* renamed from: f  reason: collision with root package name */
    public final ui0 f6200f;

    public kf2(fj0 fj0Var, boolean z10, ui0 ui0Var, t43 t43Var, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.f6195a = fj0Var;
        this.f6196b = z10;
        this.f6200f = ui0Var;
        this.f6198d = t43Var;
        this.f6199e = str;
        this.f6197c = scheduledExecutorService;
    }

    public final /* synthetic */ lf2 a(Exception exc) {
        this.f6195a.k(exc, "TrustlessTokenSignal");
        return null;
    }

    @Override // ai.xc2
    public final s43<lf2> zza() {
        if (!pz.f8741a.e().booleanValue() && !this.f6196b) {
            return j43.a(null);
        }
        return j43.f(j43.h(j43.j(j43.a(null), if2.f5212a, this.f6198d), pz.f8743c.e().longValue(), TimeUnit.MILLISECONDS, this.f6197c), Exception.class, new bx2(this) { // from class: ai.jf2

            /* renamed from: a  reason: collision with root package name */
            public final kf2 f5766a;

            {
                this.f5766a = this;
            }

            @Override // ai.bx2
            public final Object apply(Object obj) {
                this.f5766a.a((Exception) obj);
                return null;
            }
        }, this.f6198d);
    }
}
