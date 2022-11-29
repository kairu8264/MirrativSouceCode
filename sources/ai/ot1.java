package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ot1 implements rn3<String> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f7907a;

    public ot1(eo3<Context> eo3Var) {
        this.f7907a = eo3Var;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final String zzb() {
        String packageName = ((cn2) this.f7907a).a().getPackageName();
        zn3.b(packageName);
        return packageName;
    }
}
