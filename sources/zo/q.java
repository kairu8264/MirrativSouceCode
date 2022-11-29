package zo;

import uo.a1;
import uo.i1;
import uo.x0;

/* loaded from: classes4.dex */
public final class q extends uo.k0 implements Runnable, a1 {
    public final w<Runnable> A;
    public final Object B;
    private volatile int runningWorkers;

    /* renamed from: x  reason: collision with root package name */
    public final uo.k0 f63319x;

    /* renamed from: y  reason: collision with root package name */
    public final int f63320y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ a1 f63321z;

    public q(uo.k0 k0Var, int i10) {
        this.f63319x = k0Var;
        this.f63320y = i10;
        a1 a1Var = k0Var instanceof a1 ? (a1) k0Var : null;
        this.f63321z = a1Var == null ? x0.a() : a1Var;
        this.A = new w<>(false);
        this.B = new Object();
    }

    @Override // uo.a1
    public void S(long j10, uo.p<? super wn.v> pVar) {
        this.f63321z.S(j10, pVar);
    }

    @Override // uo.k0
    public void X(ao.g gVar, Runnable runnable) {
        if (!h0(runnable) && i0()) {
            this.f63319x.X(this, this);
        }
    }

    @Override // uo.k0
    public void Y(ao.g gVar, Runnable runnable) {
        if (!h0(runnable) && i0()) {
            this.f63319x.Y(this, this);
        }
    }

    @Override // uo.a1
    public i1 d(long j10, Runnable runnable, ao.g gVar) {
        return this.f63321z.d(j10, runnable, gVar);
    }

    @Override // uo.k0
    public uo.k0 d0(int i10) {
        r.a(i10);
        return i10 >= this.f63320y ? this : super.d0(i10);
    }

    public final boolean h0(Runnable runnable) {
        this.A.a(runnable);
        return this.runningWorkers >= this.f63320y;
    }

    public final boolean i0() {
        synchronized (this.B) {
            if (this.runningWorkers >= this.f63320y) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        r1 = r4.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4.A.c() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r4.runningWorkers++;
        r2 = wn.v.f59242a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            zo.w<java.lang.Runnable> r2 = r4.A
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            ao.h r3 = ao.h.f16651w
            uo.n0.a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            uo.k0 r2 = r4.f63319x
            boolean r2 = r2.c0(r4)
            if (r2 == 0) goto L2
            uo.k0 r0 = r4.f63319x
            r0.X(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.B
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            zo.w<java.lang.Runnable> r2 = r4.A     // Catch: java.lang.Throwable -> L47
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            wn.v r2 = wn.v.f59242a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zo.q.run():void");
    }
}
