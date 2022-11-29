package ai;

import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes3.dex */
public final class q63 implements s63 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n63 f8840a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a63 f8841b;

    public q63(n63 n63Var, a63 a63Var) {
        this.f8840a = n63Var;
        this.f8841b = a63Var;
    }

    @Override // ai.s63
    public final <Q> s53<Q> a(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new m63(this.f8840a, this.f8841b, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // ai.s63
    public final Class<?> b() {
        return this.f8840a.getClass();
    }

    @Override // ai.s63
    public final Class<?> c() {
        return this.f8841b.getClass();
    }

    @Override // ai.s63
    public final Set<Class<?>> d() {
        return this.f8840a.f();
    }

    @Override // ai.s63
    public final s53<?> zzb() {
        n63 n63Var = this.f8840a;
        return new m63(n63Var, this.f8841b, n63Var.g());
    }
}
