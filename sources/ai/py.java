package ai;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class py implements rn3<oy> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f8731a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f8732b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<qy> f8733c;

    public py(eo3<Context> eo3Var, eo3<ScheduledExecutorService> eo3Var2, eo3<qy> eo3Var3) {
        this.f8731a = eo3Var;
        this.f8732b = eo3Var2;
        this.f8733c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new oy(((cn2) this.f8731a).a(), this.f8732b.zzb(), new qy(), null);
    }
}
