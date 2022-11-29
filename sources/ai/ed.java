package ai;

/* loaded from: classes3.dex */
public final class ed implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ oc f3611w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ id f3612x;

    public ed(id idVar, oc ocVar) {
        this.f3612x = idVar;
        this.f3611w = ocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jd jdVar;
        jdVar = this.f3612x.f5187b;
        jdVar.p(this.f3611w);
    }
}
