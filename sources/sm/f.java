package sm;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public long f52753a;

    /* renamed from: b  reason: collision with root package name */
    public long f52754b;

    /* renamed from: c  reason: collision with root package name */
    public TimeUnit f52755c;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f52756a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f52756a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52756a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52756a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(long j10, long j11, TimeUnit timeUnit) {
        this.f52753a = j10;
        this.f52754b = j11;
        this.f52755c = timeUnit;
    }

    public double a() {
        int i10 = a.f52756a[this.f52755c.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return this.f52753a / this.f52755c.toSeconds(this.f52754b);
                }
                return (this.f52753a / this.f52754b) * TimeUnit.SECONDS.toMillis(1L);
            }
            return (this.f52753a / this.f52754b) * TimeUnit.SECONDS.toMicros(1L);
        }
        return (this.f52753a / this.f52754b) * TimeUnit.SECONDS.toNanos(1L);
    }
}
