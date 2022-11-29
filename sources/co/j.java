package co;

/* loaded from: classes4.dex */
public abstract class j extends a {
    public j(ao.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == ao.h.f16651w)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // ao.d
    public ao.g getContext() {
        return ao.h.f16651w;
    }
}
