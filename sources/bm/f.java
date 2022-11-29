package bm;

import bm.b;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes4.dex */
public abstract class f {

    @AutoValue.Builder
    /* loaded from: classes4.dex */
    public static abstract class a {
        public abstract f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j10);
    }

    /* loaded from: classes4.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new b.C0131b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
