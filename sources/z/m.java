package z;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final io.l<Integer, Object> f62302a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<Integer, Object> f62303b;

    /* renamed from: c  reason: collision with root package name */
    public final io.r<h, Integer, l0.i, Integer, wn.v> f62304c;

    /* JADX WARN: Multi-variable type inference failed */
    public m(io.l<? super Integer, ? extends Object> lVar, io.l<? super Integer, ? extends Object> lVar2, io.r<? super h, ? super Integer, ? super l0.i, ? super Integer, wn.v> rVar) {
        jo.p.h(lVar2, "type");
        jo.p.h(rVar, "item");
        this.f62302a = lVar;
        this.f62303b = lVar2;
        this.f62304c = rVar;
    }

    public final io.r<h, Integer, l0.i, Integer, wn.v> a() {
        return this.f62304c;
    }

    public final io.l<Integer, Object> b() {
        return this.f62302a;
    }

    public final io.l<Integer, Object> c() {
        return this.f62303b;
    }
}
