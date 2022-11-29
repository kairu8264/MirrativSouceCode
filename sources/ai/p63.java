package ai;

import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes3.dex */
public final class p63 implements s63 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a63 f8321a;

    public p63(a63 a63Var) {
        this.f8321a = a63Var;
    }

    @Override // ai.s63
    public final <Q> s53<Q> a(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new u53(this.f8321a, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // ai.s63
    public final Class<?> b() {
        return this.f8321a.getClass();
    }

    @Override // ai.s63
    public final Class<?> c() {
        return null;
    }

    @Override // ai.s63
    public final Set<Class<?>> d() {
        return this.f8321a.f();
    }

    @Override // ai.s63
    public final s53<?> zzb() {
        a63 a63Var = this.f8321a;
        return new u53(a63Var, a63Var.g());
    }
}
