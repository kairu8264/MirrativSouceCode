package ai;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes3.dex */
public final class up1 extends wp1 {

    /* renamed from: g  reason: collision with root package name */
    public final vq2 f10788g;

    public up1(Executor executor, yj0 yj0Var, vq2 vq2Var, xq2 xq2Var) {
        super(executor, yj0Var, xq2Var);
        this.f10788g = vq2Var;
        vq2Var.a(this.f11709b);
    }

    public final Map<String, String> c() {
        return new HashMap(this.f11709b);
    }
}
