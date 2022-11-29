package ai;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class sy0 implements rn3<l71> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f10024a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<vh.f> f10025b;

    public sy0(eo3<ScheduledExecutorService> eo3Var, eo3<vh.f> eo3Var2) {
        this.f10024a = eo3Var;
        this.f10025b = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final l71 zzb() {
        return new l71(this.f10024a.zzb(), this.f10025b.zzb());
    }
}
