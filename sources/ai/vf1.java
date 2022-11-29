package ai;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class vf1 implements rn3<ic1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f11074a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<fl2> f11075b;

    public vf1(eo3<Context> eo3Var, eo3<fl2> eo3Var2) {
        this.f11074a = eo3Var;
        this.f11075b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ic1(this.f11074a.zzb(), new HashSet(), ((k11) this.f11075b).a());
    }
}
