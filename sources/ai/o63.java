package ai;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class o63 implements s63 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s53 f7672a;

    public o63(s53 s53Var) {
        this.f7672a = s53Var;
    }

    @Override // ai.s63
    public final <Q> s53<Q> a(Class<Q> cls) throws GeneralSecurityException {
        if (this.f7672a.c().equals(cls)) {
            return this.f7672a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // ai.s63
    public final Class<?> b() {
        return this.f7672a.getClass();
    }

    @Override // ai.s63
    public final Class<?> c() {
        return null;
    }

    @Override // ai.s63
    public final Set<Class<?>> d() {
        return Collections.singleton(this.f7672a.c());
    }

    @Override // ai.s63
    public final s53<?> zzb() {
        return this.f7672a;
    }
}
