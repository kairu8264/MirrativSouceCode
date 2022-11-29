package w1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final io.a<Float> f57903a;

    /* renamed from: b  reason: collision with root package name */
    public final io.a<Float> f57904b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f57905c;

    public i(io.a<Float> aVar, io.a<Float> aVar2, boolean z10) {
        jo.p.h(aVar, "value");
        jo.p.h(aVar2, "maxValue");
        this.f57903a = aVar;
        this.f57904b = aVar2;
        this.f57905c = z10;
    }

    public final io.a<Float> a() {
        return this.f57904b;
    }

    public final boolean b() {
        return this.f57905c;
    }

    public final io.a<Float> c() {
        return this.f57903a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.f57903a.invoke().floatValue() + ", maxValue=" + this.f57904b.invoke().floatValue() + ", reverseScrolling=" + this.f57905c + ')';
    }
}
