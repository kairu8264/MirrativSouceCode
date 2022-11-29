package co;

/* loaded from: classes4.dex */
public final class c implements ao.d<Object> {

    /* renamed from: w  reason: collision with root package name */
    public static final c f20012w = new c();

    @Override // ao.d
    public ao.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // ao.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
