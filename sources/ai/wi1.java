package ai;

import java.util.concurrent.Executor;
import rg.u;

/* loaded from: classes3.dex */
public final class wi1 implements rn3<gc1<u.a>> {

    /* renamed from: a  reason: collision with root package name */
    public final pi1 f11635a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<xl1> f11636b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f11637c;

    public wi1(pi1 pi1Var, eo3<xl1> eo3Var, eo3<Executor> eo3Var2) {
        this.f11635a = pi1Var;
        this.f11636b = eo3Var;
        this.f11637c = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new gc1(((yl1) this.f11636b).zzb(), this.f11637c.zzb());
    }
}
