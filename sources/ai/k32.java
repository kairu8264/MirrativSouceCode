package ai;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class k32 implements rn3<j32> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f6069a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f6070b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<hm1> f6071c;

    public k32(eo3<Context> eo3Var, eo3<Executor> eo3Var2, eo3<hm1> eo3Var3) {
        this.f6069a = eo3Var;
        this.f6070b = eo3Var2;
        this.f6071c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new j32(this.f6069a.zzb(), this.f6070b.zzb(), this.f6071c.zzb());
    }
}
