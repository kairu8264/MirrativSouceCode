package bp;

import uo.v0;

/* loaded from: classes4.dex */
public final class k extends h {

    /* renamed from: y  reason: collision with root package name */
    public final Runnable f18572y;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.f18572y = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f18572y.run();
        } finally {
            this.f18570x.a();
        }
    }

    public String toString() {
        return "Task[" + v0.a(this.f18572y) + '@' + v0.b(this.f18572y) + ", " + this.f18569w + ", " + this.f18570x + ']';
    }
}
