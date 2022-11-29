package yl;

import com.google.auto.value.AutoValue;
import yl.a;

@AutoValue
/* loaded from: classes4.dex */
public abstract class j {

    @AutoValue.Builder
    /* loaded from: classes4.dex */
    public static abstract class a {
        public abstract j a();

        public abstract a b(String str);

        public abstract a c(long j10);

        public abstract a d(long j10);
    }

    public static a a() {
        return new a.b();
    }

    public abstract String b();

    public abstract long c();

    public abstract long d();
}
