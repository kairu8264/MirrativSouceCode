package lg;

import com.google.auto.value.AutoValue;
import lg.a;

@AutoValue
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f40151a = a().f(10485760).d(200).b(10000).c(604800000).e(81920).a();

    @AutoValue.Builder
    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract e a();

        public abstract a b(int i10);

        public abstract a c(long j10);

        public abstract a d(int i10);

        public abstract a e(int i10);

        public abstract a f(long j10);
    }

    public static a a() {
        return new a.b();
    }

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract int e();

    public abstract long f();
}
