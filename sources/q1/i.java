package q1;

/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: b  reason: collision with root package name */
    public final float f48586b;

    public i(float f10) {
        this.f48586b = f10;
    }

    @Override // q1.f
    public long a(long j10, long j11) {
        float f10 = this.f48586b;
        return w0.a(f10, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && jo.p.c(Float.valueOf(this.f48586b), Float.valueOf(((i) obj).f48586b));
    }

    public int hashCode() {
        return Float.hashCode(this.f48586b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f48586b + ')';
    }
}
