package dq;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public i f29835a;

    /* renamed from: b  reason: collision with root package name */
    public i f29836b;

    public synchronized void a(i iVar) {
        try {
            if (iVar != null) {
                i iVar2 = this.f29836b;
                if (iVar2 != null) {
                    iVar2.f29834c = iVar;
                    this.f29836b = iVar;
                } else if (this.f29835a == null) {
                    this.f29836b = iVar;
                    this.f29835a = iVar;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } else {
                throw new NullPointerException("null cannot be enqueued");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized i b() {
        i iVar;
        iVar = this.f29835a;
        if (iVar != null) {
            i iVar2 = iVar.f29834c;
            this.f29835a = iVar2;
            if (iVar2 == null) {
                this.f29836b = null;
            }
        }
        return iVar;
    }

    public synchronized i c(int i10) throws InterruptedException {
        if (this.f29835a == null) {
            wait(i10);
        }
        return b();
    }
}
