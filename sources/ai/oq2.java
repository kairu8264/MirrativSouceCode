package ai;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class oq2 implements rn3<nq2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<tq2> f7883a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<ar2> f7884b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f7885c;

    public oq2(eo3<tq2> eo3Var, eo3<ar2> eo3Var2, eo3<ScheduledExecutorService> eo3Var3) {
        this.f7883a = eo3Var;
        this.f7884b = eo3Var2;
        this.f7885c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj;
        kn3 b10 = pn3.b(this.f7883a);
        kn3 b11 = pn3.b(this.f7884b);
        ScheduledExecutorService zzb = this.f7885c.zzb();
        if (((Boolean) ft.c().c(ox.f8019j6)).booleanValue()) {
            obj = new qq2((nq2) b10.zzb(), zzb);
        } else {
            obj = (nq2) b11.zzb();
        }
        zn3.b(obj);
        return obj;
    }
}
