package dg;

import com.google.auto.value.AutoValue;
import dg.a;

@AutoValue
/* loaded from: classes3.dex */
public abstract class f {

    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract f a();

        public abstract a b(Iterable<cg.i> iterable);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new a.b();
    }

    public abstract Iterable<cg.i> b();

    public abstract byte[] c();
}
