package zo;

import java.util.Objects;
import zo.h0;

/* loaded from: classes4.dex */
public final class i0<S extends h0<S>> {
    public static <S extends h0<S>> Object a(Object obj) {
        return obj;
    }

    public static final S b(Object obj) {
        k0 k0Var;
        k0Var = g.f63288a;
        if (obj != k0Var) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean c(Object obj) {
        k0 k0Var;
        k0Var = g.f63288a;
        return obj == k0Var;
    }
}
