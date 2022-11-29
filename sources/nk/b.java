package nk;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class b extends Number {

    /* renamed from: w  reason: collision with root package name */
    public transient AtomicLong f43700w;

    public b(double d10) {
        this.f43700w = new AtomicLong(Double.doubleToRawLongBits(d10));
    }

    public final double a() {
        return Double.longBitsToDouble(this.f43700w.get());
    }

    public final void b(double d10) {
        this.f43700w.set(Double.doubleToRawLongBits(d10));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return a();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) a();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) a();
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) a();
    }

    public String toString() {
        return Double.toString(a());
    }
}
