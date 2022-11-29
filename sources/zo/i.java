package zo;

/* loaded from: classes4.dex */
public final class i implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final ao.g f63294w;

    public i(ao.g gVar) {
        this.f63294w = gVar;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f63294w;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
