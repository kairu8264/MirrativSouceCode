package uo;

/* loaded from: classes4.dex */
public final class c1 extends RuntimeException {

    /* renamed from: w  reason: collision with root package name */
    public final ao.g f55996w;

    public c1(ao.g gVar) {
        this.f55996w = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f55996w.toString();
    }
}
