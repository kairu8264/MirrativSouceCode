package ai;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class xe2 implements rn3<ve2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<uc0> f11912a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f11913b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Context> f11914c;

    public xe2(eo3<uc0> eo3Var, eo3<ScheduledExecutorService> eo3Var2, eo3<Context> eo3Var3) {
        this.f11912a = eo3Var;
        this.f11913b = eo3Var2;
        this.f11914c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ve2(new uc0(), this.f11913b.zzb(), ((tr0) this.f11914c).a(), null);
    }
}
