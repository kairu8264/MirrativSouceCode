package dq;

/* loaded from: classes4.dex */
public class a implements Runnable, k {

    /* renamed from: w  reason: collision with root package name */
    public final j f29777w = new j();

    /* renamed from: x  reason: collision with root package name */
    public final c f29778x;

    public a(c cVar) {
        this.f29778x = cVar;
    }

    @Override // dq.k
    public void a(p pVar, Object obj) {
        this.f29777w.a(i.a(pVar, obj));
        this.f29778x.d().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        i b10 = this.f29777w.b();
        if (b10 != null) {
            this.f29778x.g(b10);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
