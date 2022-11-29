package zo;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public d<?> f63275a;

    public abstract void a(d<?> dVar, Object obj);

    public final d<?> b() {
        d<?> dVar = this.f63275a;
        if (dVar != null) {
            return dVar;
        }
        jo.p.v("atomicOp");
        return null;
    }

    public abstract Object c(d<?> dVar);

    public final void d(d<?> dVar) {
        this.f63275a = dVar;
    }
}
