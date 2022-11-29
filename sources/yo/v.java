package yo;

/* loaded from: classes4.dex */
public final class v<T> implements ao.d<T>, co.e {

    /* renamed from: w  reason: collision with root package name */
    public final ao.d<T> f62140w;

    /* renamed from: x  reason: collision with root package name */
    public final ao.g f62141x;

    /* JADX WARN: Multi-variable type inference failed */
    public v(ao.d<? super T> dVar, ao.g gVar) {
        this.f62140w = dVar;
        this.f62141x = gVar;
    }

    @Override // co.e
    public co.e getCallerFrame() {
        ao.d<T> dVar = this.f62140w;
        if (dVar instanceof co.e) {
            return (co.e) dVar;
        }
        return null;
    }

    @Override // ao.d
    public ao.g getContext() {
        return this.f62141x;
    }

    @Override // co.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // ao.d
    public void resumeWith(Object obj) {
        this.f62140w.resumeWith(obj);
    }
}
