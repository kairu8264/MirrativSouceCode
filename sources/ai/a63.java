package ai;

import ai.xj3;
import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class a63<KeyProtoT extends xj3> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<KeyProtoT> f1756a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, z53<?, KeyProtoT>> f1757b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<?> f1758c;

    @SafeVarargs
    public a63(Class<KeyProtoT> cls, z53<?, KeyProtoT>... z53VarArr) {
        this.f1756a = cls;
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 <= 0; i10++) {
            z53<?, KeyProtoT> z53Var = z53VarArr[i10];
            if (hashMap.containsKey(z53Var.a())) {
                String valueOf = String.valueOf(z53Var.a().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            hashMap.put(z53Var.a(), z53Var);
        }
        this.f1758c = z53VarArr[0].a();
        this.f1757b = Collections.unmodifiableMap(hashMap);
    }

    public final Class<KeyProtoT> a() {
        return this.f1756a;
    }

    public abstract String b();

    public abstract KeyProtoT c(oh3 oh3Var) throws zzggm;

    public abstract void d(KeyProtoT keyprotot) throws GeneralSecurityException;

    public final <P> P e(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        z53<?, KeyProtoT> z53Var = this.f1757b.get(cls);
        if (z53Var != null) {
            return (P) z53Var.b(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb2.append("Requested primitive class ");
        sb2.append(canonicalName);
        sb2.append(" not supported.");
        throw new IllegalArgumentException(sb2.toString());
    }

    public final Set<Class<?>> f() {
        return this.f1757b.keySet();
    }

    public final Class<?> g() {
        return this.f1758c;
    }

    public y53<?, KeyProtoT> h() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract int i();

    public int j() {
        return 1;
    }
}
