package ai;

/* loaded from: classes3.dex */
public class ry<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f9623a;

    /* renamed from: b  reason: collision with root package name */
    public final T f9624b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9625c;

    public ry(String str, T t10, int i10) {
        this.f9623a = str;
        this.f9624b = t10;
        this.f9625c = i10;
    }

    public static ry<Boolean> a(String str, boolean z10) {
        return new ry<>(str, Boolean.valueOf(z10), 1);
    }

    public static ry<Long> b(String str, long j10) {
        return new ry<>(str, Long.valueOf(j10), 2);
    }

    public static ry<Double> c(String str, double d10) {
        return new ry<>(str, Double.valueOf(d10), 3);
    }

    public static ry<String> d(String str, String str2) {
        return new ry<>(str, str2, 4);
    }

    public final T e() {
        rz a10 = sz.a();
        if (a10 == null) {
            return this.f9624b;
        }
        int i10 = this.f9625c - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return (T) a10.a(this.f9623a, (String) this.f9624b);
                }
                return (T) a10.c(this.f9623a, ((Double) this.f9624b).doubleValue());
            }
            return (T) a10.b(this.f9623a, ((Long) this.f9624b).longValue());
        }
        return (T) a10.d(this.f9623a, ((Boolean) this.f9624b).booleanValue());
    }
}
