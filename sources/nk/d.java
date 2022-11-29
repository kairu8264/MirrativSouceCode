package nk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import nk.a;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class d<V> extends a.j<V> {
    public static <V> d<V> D() {
        return new d<>();
    }

    @Override // nk.a
    @CanIgnoreReturnValue
    public boolean A(@NullableDecl V v10) {
        return super.A(v10);
    }

    @Override // nk.a
    @CanIgnoreReturnValue
    public boolean B(Throwable th2) {
        return super.B(th2);
    }
}
