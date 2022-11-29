package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class j72 implements xc2 {

    /* renamed from: a  reason: collision with root package name */
    public final s43<String> f5650a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f5651b;

    public j72(s43<String> s43Var, Executor executor) {
        this.f5650a = s43Var;
        this.f5651b = executor;
    }

    @Override // ai.xc2
    public final s43 zza() {
        return j43.i(this.f5650a, h72.f4769a, this.f5651b);
    }
}
