package n1;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 implements d0 {

    /* renamed from: w  reason: collision with root package name */
    public io.l<? super MotionEvent, Boolean> f41420w;

    /* renamed from: x  reason: collision with root package name */
    public m0 f41421x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f41422y;

    /* renamed from: z  reason: collision with root package name */
    public final c0 f41423z = new b();

    /* loaded from: classes.dex */
    public enum a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    /* loaded from: classes.dex */
    public static final class b extends c0 {

        /* renamed from: y  reason: collision with root package name */
        public a f41424y = a.Unknown;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<MotionEvent, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ f0 f41426w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f0 f0Var) {
                super(1);
                this.f41426w = f0Var;
            }

            public final void a(MotionEvent motionEvent) {
                jo.p.h(motionEvent, "motionEvent");
                this.f41426w.b().invoke(motionEvent);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return wn.v.f59242a;
            }
        }

        /* renamed from: n1.f0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0611b extends jo.q implements io.l<MotionEvent, wn.v> {

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ f0 f41428x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0611b(f0 f0Var) {
                super(1);
                this.f41428x = f0Var;
            }

            public final void a(MotionEvent motionEvent) {
                a aVar;
                jo.p.h(motionEvent, "motionEvent");
                if (motionEvent.getActionMasked() == 0) {
                    b bVar = b.this;
                    if (this.f41428x.b().invoke(motionEvent).booleanValue()) {
                        aVar = a.Dispatching;
                    } else {
                        aVar = a.NotDispatching;
                    }
                    bVar.f41424y = aVar;
                    return;
                }
                this.f41428x.b().invoke(motionEvent);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends jo.q implements io.l<MotionEvent, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ f0 f41429w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(f0 f0Var) {
                super(1);
                this.f41429w = f0Var;
            }

            public final void a(MotionEvent motionEvent) {
                jo.p.h(motionEvent, "motionEvent");
                this.f41429w.b().invoke(motionEvent);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return wn.v.f59242a;
            }
        }

        public b() {
        }

        @Override // n1.c0
        public void P0() {
            if (this.f41424y == a.Dispatching) {
                h0.a(SystemClock.uptimeMillis(), new c(f0.this));
                j1();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        @Override // n1.c0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void e1(n1.m r6, n1.o r7, long r8) {
            /*
                r5 = this;
                java.lang.String r8 = "pointerEvent"
                jo.p.h(r6, r8)
                java.lang.String r8 = "pass"
                jo.p.h(r7, r8)
                java.util.List r8 = r6.c()
                n1.f0 r9 = n1.f0.this
                boolean r9 = r9.a()
                r0 = 0
                r1 = 1
                if (r9 != 0) goto L42
                int r9 = r8.size()
                r2 = r0
            L1d:
                if (r2 >= r9) goto L3c
                java.lang.Object r3 = r8.get(r2)
                n1.w r3 = (n1.w) r3
                boolean r4 = n1.n.b(r3)
                if (r4 != 0) goto L34
                boolean r3 = n1.n.d(r3)
                if (r3 == 0) goto L32
                goto L34
            L32:
                r3 = r0
                goto L35
            L34:
                r3 = r1
            L35:
                if (r3 == 0) goto L39
                r9 = r1
                goto L3d
            L39:
                int r2 = r2 + 1
                goto L1d
            L3c:
                r9 = r0
            L3d:
                if (r9 == 0) goto L40
                goto L42
            L40:
                r9 = r0
                goto L43
            L42:
                r9 = r1
            L43:
                n1.f0$a r2 = r5.f41424y
                n1.f0$a r3 = n1.f0.a.NotDispatching
                if (r2 == r3) goto L5b
                n1.o r2 = n1.o.Initial
                if (r7 != r2) goto L52
                if (r9 == 0) goto L52
                r5.i1(r6)
            L52:
                n1.o r2 = n1.o.Final
                if (r7 != r2) goto L5b
                if (r9 != 0) goto L5b
                r5.i1(r6)
            L5b:
                n1.o r6 = n1.o.Final
                if (r7 != r6) goto L7c
                int r6 = r8.size()
                r7 = r0
            L64:
                if (r7 >= r6) goto L76
                java.lang.Object r9 = r8.get(r7)
                n1.w r9 = (n1.w) r9
                boolean r9 = n1.n.d(r9)
                if (r9 != 0) goto L73
                goto L77
            L73:
                int r7 = r7 + 1
                goto L64
            L76:
                r0 = r1
            L77:
                if (r0 == 0) goto L7c
                r5.j1()
            L7c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.f0.b.e1(n1.m, n1.o, long):void");
        }

        public final void i1(m mVar) {
            boolean z10;
            List<w> c10 = mVar.c();
            int size = c10.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                } else if (c10.get(i10).m()) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                if (this.f41424y == a.Dispatching) {
                    q1.q F = F();
                    if (F != null) {
                        h0.b(mVar, F.R(b1.f.f16721b.c()), new a(f0.this));
                    } else {
                        throw new IllegalStateException("layoutCoordinates not set".toString());
                    }
                }
                this.f41424y = a.NotDispatching;
                return;
            }
            q1.q F2 = F();
            if (F2 != null) {
                h0.c(mVar, F2.R(b1.f.f16721b.c()), new C0611b(f0.this));
                if (this.f41424y == a.Dispatching) {
                    int size2 = c10.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        c10.get(i11).a();
                    }
                    g d10 = mVar.d();
                    if (d10 == null) {
                        return;
                    }
                    d10.e(!f0.this.a());
                    return;
                }
                return;
            }
            throw new IllegalStateException("layoutCoordinates not set".toString());
        }

        public final void j1() {
            this.f41424y = a.Unknown;
            f0.this.c(false);
        }

        @Override // n1.c0
        public boolean m0() {
            return true;
        }
    }

    public final boolean a() {
        return this.f41422y;
    }

    public final io.l<MotionEvent, Boolean> b() {
        io.l lVar = this.f41420w;
        if (lVar != null) {
            return lVar;
        }
        jo.p.v("onTouchEvent");
        return null;
    }

    public final void c(boolean z10) {
        this.f41422y = z10;
    }

    public final void f(io.l<? super MotionEvent, Boolean> lVar) {
        jo.p.h(lVar, "<set-?>");
        this.f41420w = lVar;
    }

    public final void g(m0 m0Var) {
        m0 m0Var2 = this.f41421x;
        if (m0Var2 != null) {
            m0Var2.b(null);
        }
        this.f41421x = m0Var;
        if (m0Var == null) {
            return;
        }
        m0Var.b(this);
    }

    @Override // n1.d0
    public c0 z0() {
        return this.f41423z;
    }
}
