package ai;

import ai.xj3;
import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public class u53<PrimitiveT, KeyProtoT extends xj3> implements s53<PrimitiveT> {

    /* renamed from: a  reason: collision with root package name */
    public final a63<KeyProtoT> f10612a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<PrimitiveT> f10613b;

    public u53(a63<KeyProtoT> a63Var, Class<PrimitiveT> cls) {
        if (!a63Var.f().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", a63Var.toString(), cls.getName()));
        }
        this.f10612a = a63Var;
        this.f10613b = cls;
    }

    public final PrimitiveT a(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (!Void.class.equals(this.f10613b)) {
            this.f10612a.d(keyprotot);
            return (PrimitiveT) this.f10612a.e(keyprotot, (Class<PrimitiveT>) this.f10613b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final t53<?, KeyProtoT> b() {
        return new t53<>(this.f10612a.h());
    }

    @Override // ai.s53
    public final Class<PrimitiveT> c() {
        return this.f10613b;
    }

    @Override // ai.s53
    public final String d() {
        return this.f10612a.b();
    }

    @Override // ai.s53
    public final ed3 q(oh3 oh3Var) throws GeneralSecurityException {
        try {
            KeyProtoT a10 = b().a(oh3Var);
            dd3 D = ed3.D();
            D.r(this.f10612a.b());
            D.s(a10.T());
            D.t(this.f10612a.i());
            return D.n();
        } catch (zzggm e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.s53
    public final PrimitiveT r(xj3 xj3Var) throws GeneralSecurityException {
        String name = this.f10612a.a().getName();
        String concat = name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type ");
        if (this.f10612a.a().isInstance(xj3Var)) {
            return a(xj3Var);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // ai.s53
    public final PrimitiveT s(oh3 oh3Var) throws GeneralSecurityException {
        try {
            return a(this.f10612a.c(oh3Var));
        } catch (zzggm e10) {
            String name = this.f10612a.a().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e10);
        }
    }

    @Override // ai.s53
    public final xj3 t(oh3 oh3Var) throws GeneralSecurityException {
        try {
            return b().a(oh3Var);
        } catch (zzggm e10) {
            String name = this.f10612a.h().a().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e10);
        }
    }
}
