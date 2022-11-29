package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 extends uo.k0 {
    public static final c H = new c(null);
    public static final int I = 8;
    public static final wn.f<ao.g> J = wn.g.a(a.f14397w);
    public static final ThreadLocal<ao.g> K = new b();
    public final xn.k<Runnable> A;
    public List<Choreographer.FrameCallback> B;
    public List<Choreographer.FrameCallback> C;
    public boolean D;
    public boolean E;
    public final d F;
    public final l0.n0 G;

    /* renamed from: x  reason: collision with root package name */
    public final Choreographer f14394x;

    /* renamed from: y  reason: collision with root package name */
    public final Handler f14395y;

    /* renamed from: z  reason: collision with root package name */
    public final Object f14396z;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<ao.g> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f14397w = new a();

        @co.f(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.platform.c0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0051a extends co.l implements io.p<uo.q0, ao.d<? super Choreographer>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f14398w;

            public C0051a(ao.d<? super C0051a> dVar) {
                super(2, dVar);
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new C0051a(dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super Choreographer> dVar) {
                return ((C0051a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                bo.c.c();
                if (this.f14398w == 0) {
                    wn.m.b(obj);
                    return Choreographer.getInstance();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final ao.g invoke() {
            boolean b10;
            b10 = d0.b();
            Choreographer choreographer = b10 ? Choreographer.getInstance() : (Choreographer) uo.j.e(uo.g1.c(), new C0051a(null));
            jo.p.g(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler a10 = k3.e.a(Looper.getMainLooper());
            jo.p.g(a10, "createAsync(Looper.getMainLooper())");
            c0 c0Var = new c0(choreographer, a10, null);
            return c0Var.plus(c0Var.A0());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ThreadLocal<ao.g> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ao.g initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            jo.p.g(choreographer, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler a10 = k3.e.a(myLooper);
                jo.p.g(a10, "createAsync(\n           …d\")\n                    )");
                c0 c0Var = new c0(choreographer, a10, null);
                return c0Var.plus(c0Var.A0());
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }

        public final ao.g a() {
            boolean b10;
            b10 = d0.b();
            if (b10) {
                return b();
            }
            ao.g gVar = (ao.g) c0.K.get();
            if (gVar != null) {
                return gVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        public final ao.g b() {
            return (ao.g) c0.J.getValue();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Choreographer.FrameCallback, Runnable {
        public d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            c0.this.f14395y.removeCallbacks(this);
            c0.this.E0();
            c0.this.D0(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.E0();
            Object obj = c0.this.f14396z;
            c0 c0Var = c0.this;
            synchronized (obj) {
                if (c0Var.B.isEmpty()) {
                    c0Var.x0().removeFrameCallback(this);
                    c0Var.E = false;
                }
                wn.v vVar = wn.v.f59242a;
            }
        }
    }

    public c0(Choreographer choreographer, Handler handler) {
        this.f14394x = choreographer;
        this.f14395y = handler;
        this.f14396z = new Object();
        this.A = new xn.k<>();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.F = new d();
        this.G = new e0(choreographer);
    }

    public /* synthetic */ c0(Choreographer choreographer, Handler handler, jo.h hVar) {
        this(choreographer, handler);
    }

    public final l0.n0 A0() {
        return this.G;
    }

    public final Runnable B0() {
        Runnable y10;
        synchronized (this.f14396z) {
            y10 = this.A.y();
        }
        return y10;
    }

    public final void D0(long j10) {
        synchronized (this.f14396z) {
            if (this.E) {
                this.E = false;
                List<Choreographer.FrameCallback> list = this.B;
                this.B = this.C;
                this.C = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).doFrame(j10);
                }
                list.clear();
            }
        }
    }

    public final void E0() {
        boolean z10;
        do {
            Runnable B0 = B0();
            while (B0 != null) {
                B0.run();
                B0 = B0();
            }
            synchronized (this.f14396z) {
                z10 = false;
                if (this.A.isEmpty()) {
                    this.D = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    public final void F0(Choreographer.FrameCallback frameCallback) {
        jo.p.h(frameCallback, "callback");
        synchronized (this.f14396z) {
            this.B.add(frameCallback);
            if (!this.E) {
                this.E = true;
                this.f14394x.postFrameCallback(this.F);
            }
            wn.v vVar = wn.v.f59242a;
        }
    }

    public final void L0(Choreographer.FrameCallback frameCallback) {
        jo.p.h(frameCallback, "callback");
        synchronized (this.f14396z) {
            this.B.remove(frameCallback);
        }
    }

    @Override // uo.k0
    public void X(ao.g gVar, Runnable runnable) {
        jo.p.h(gVar, "context");
        jo.p.h(runnable, "block");
        synchronized (this.f14396z) {
            this.A.j(runnable);
            if (!this.D) {
                this.D = true;
                this.f14395y.post(this.F);
                if (!this.E) {
                    this.E = true;
                    this.f14394x.postFrameCallback(this.F);
                }
            }
            wn.v vVar = wn.v.f59242a;
        }
    }

    public final Choreographer x0() {
        return this.f14394x;
    }
}
