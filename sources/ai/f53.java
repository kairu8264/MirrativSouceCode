package ai;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class f53 extends r43<s43> {

    /* renamed from: y  reason: collision with root package name */
    public final o33 f3950y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ i53 f3951z;

    public f53(i53 i53Var, o33 o33Var) {
        this.f3951z = i53Var;
        Objects.requireNonNull(o33Var);
        this.f3950y = o33Var;
    }

    @Override // ai.r43
    public final /* bridge */ /* synthetic */ s43 a() throws Exception {
        s43 zza = this.f3950y.zza();
        lx2.d(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f3950y);
        return zza;
    }

    @Override // ai.r43
    public final String c() {
        return this.f3950y.toString();
    }

    @Override // ai.r43
    public final boolean d() {
        return this.f3951z.isDone();
    }

    @Override // ai.r43
    public final /* bridge */ /* synthetic */ void e(s43 s43Var) {
        this.f3951z.w(s43Var);
    }

    @Override // ai.r43
    public final void f(Throwable th2) {
        this.f3951z.v(th2);
    }
}
