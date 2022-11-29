package rh;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: b  reason: collision with root package name */
    public static q f51498b;

    /* renamed from: c  reason: collision with root package name */
    public static final r f51499c = new r(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public r f51500a;

    public static synchronized q b() {
        q qVar;
        synchronized (q.class) {
            if (f51498b == null) {
                f51498b = new q();
            }
            qVar = f51498b;
        }
        return qVar;
    }

    public r a() {
        return this.f51500a;
    }

    public final synchronized void c(r rVar) {
        if (rVar == null) {
            this.f51500a = f51499c;
            return;
        }
        r rVar2 = this.f51500a;
        if (rVar2 == null || rVar2.k0() < rVar.k0()) {
            this.f51500a = rVar;
        }
    }
}
