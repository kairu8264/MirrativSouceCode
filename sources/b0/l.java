package b0;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import b0.k;
import java.util.concurrent.TimeUnit;
import l0.k1;
import q1.y0;
import wn.v;

/* loaded from: classes.dex */
public final class l implements k1, k.b, Runnable, Choreographer.FrameCallback {
    public static final a G = new a(null);
    public static long H;
    public final m0.e<b> A;
    public long B;
    public long C;
    public boolean D;
    public final Choreographer E;
    public boolean F;

    /* renamed from: w  reason: collision with root package name */
    public final k f16697w;

    /* renamed from: x  reason: collision with root package name */
    public final y0 f16698x;

    /* renamed from: y  reason: collision with root package name */
    public final e f16699y;

    /* renamed from: z  reason: collision with root package name */
    public final View f16700z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final void b(View view) {
            if (l.H == 0) {
                Display display = view.getDisplay();
                float f10 = 60.0f;
                if (!view.isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                l.H = 1000000000 / f10;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements k.a {

        /* renamed from: a  reason: collision with root package name */
        public final int f16701a;

        /* renamed from: b  reason: collision with root package name */
        public final long f16702b;

        /* renamed from: c  reason: collision with root package name */
        public y0.a f16703c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f16704d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f16705e;

        public b(int i10, long j10) {
            this.f16701a = i10;
            this.f16702b = j10;
        }

        public /* synthetic */ b(int i10, long j10, jo.h hVar) {
            this(i10, j10);
        }

        public final boolean a() {
            return this.f16704d;
        }

        public final long b() {
            return this.f16702b;
        }

        public final int c() {
            return this.f16701a;
        }

        @Override // b0.k.a
        public void cancel() {
            if (this.f16704d) {
                return;
            }
            this.f16704d = true;
            y0.a aVar = this.f16703c;
            if (aVar != null) {
                aVar.dispose();
            }
            this.f16703c = null;
        }

        public final boolean d() {
            return this.f16705e;
        }

        public final y0.a e() {
            return this.f16703c;
        }

        public final void f(y0.a aVar) {
            this.f16703c = aVar;
        }
    }

    public l(k kVar, y0 y0Var, e eVar, View view) {
        jo.p.h(kVar, "prefetchState");
        jo.p.h(y0Var, "subcomposeLayoutState");
        jo.p.h(eVar, "itemContentFactory");
        jo.p.h(view, "view");
        this.f16697w = kVar;
        this.f16698x = y0Var;
        this.f16699y = eVar;
        this.f16700z = view;
        this.A = new m0.e<>(new b[16], 0);
        this.E = Choreographer.getInstance();
        G.b(view);
    }

    @Override // l0.k1
    public void a() {
        this.f16697w.c(this);
        this.F = true;
    }

    @Override // l0.k1
    public void b() {
    }

    @Override // l0.k1
    public void c() {
        this.F = false;
        this.f16697w.c(null);
        this.f16700z.removeCallbacks(this);
        this.E.removeFrameCallback(this);
    }

    @Override // b0.k.b
    public k.a d(int i10, long j10) {
        b bVar = new b(i10, j10, null);
        this.A.c(bVar);
        if (!this.D) {
            this.D = true;
            this.f16700z.post(this);
        }
        return bVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        if (this.F) {
            this.f16700z.post(this);
        }
    }

    public final long g(long j10, long j11) {
        if (j11 == 0) {
            return j10;
        }
        long j12 = 4;
        return (j10 / j12) + ((j11 / j12) * 3);
    }

    public final boolean h(long j10, long j11, long j12) {
        return j10 > j11 || j10 + j12 < j11;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.A.r() && this.D && this.F && this.f16700z.getWindowVisibility() == 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(this.f16700z.getDrawingTime()) + H;
            boolean z10 = false;
            while (this.A.s() && !z10) {
                b bVar = this.A.n()[0];
                f invoke = this.f16699y.d().invoke();
                if (!bVar.a()) {
                    int d10 = invoke.d();
                    int c10 = bVar.c();
                    if (c10 >= 0 && c10 < d10) {
                        if (bVar.e() == null) {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                long nanoTime = System.nanoTime();
                                if (h(nanoTime, nanos, this.B)) {
                                    Object e10 = invoke.e(bVar.c());
                                    bVar.f(this.f16698x.j(e10, this.f16699y.b(bVar.c(), e10)));
                                    this.B = g(System.nanoTime() - nanoTime, this.B);
                                } else {
                                    z10 = true;
                                }
                                v vVar = v.f59242a;
                            } finally {
                            }
                        } else if (!bVar.d()) {
                            Trace.beginSection("compose:lazylist:prefetch:measure");
                            try {
                                long nanoTime2 = System.nanoTime();
                                if (h(nanoTime2, nanos, this.C)) {
                                    y0.a e11 = bVar.e();
                                    jo.p.e(e11);
                                    int a10 = e11.a();
                                    for (int i10 = 0; i10 < a10; i10++) {
                                        e11.b(i10, bVar.b());
                                    }
                                    this.C = g(System.nanoTime() - nanoTime2, this.C);
                                    this.A.y(0);
                                } else {
                                    v vVar2 = v.f59242a;
                                    z10 = true;
                                }
                            } finally {
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                }
                this.A.y(0);
            }
            if (z10) {
                this.E.postFrameCallback(this);
                return;
            } else {
                this.D = false;
                return;
            }
        }
        this.D = false;
    }
}
