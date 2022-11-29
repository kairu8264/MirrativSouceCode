package ai;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ve2 implements xc2<we2> {

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f11042a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f11043b;

    /* renamed from: c  reason: collision with root package name */
    public final uc0 f11044c;

    public ve2(uc0 uc0Var, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.f11044c = uc0Var;
        this.f11042a = scheduledExecutorService;
        this.f11043b = context;
    }

    @Override // ai.xc2
    public final s43<we2> zza() {
        return j43.j(j43.h(j43.a(new Bundle()), ((Long) ft.c().c(ox.f8135y2)).longValue(), TimeUnit.MILLISECONDS, this.f11042a), ue2.f10685a, hk0.f4878a);
    }
}
