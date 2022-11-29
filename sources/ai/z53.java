package ai;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class z53<PrimitiveT, KeyT> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<PrimitiveT> f12890a;

    public z53(Class<PrimitiveT> cls) {
        this.f12890a = cls;
    }

    public final Class<PrimitiveT> a() {
        return this.f12890a;
    }

    public abstract PrimitiveT b(KeyT keyt) throws GeneralSecurityException;
}
