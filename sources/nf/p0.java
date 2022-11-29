package nf;

import org.greenrobot.eventbus.ThreadMode;
import pd.h1;
import uo.r0;

/* loaded from: classes3.dex */
public final class p0 implements uo.q0 {
    public static final a A = new a(null);
    public static final int B = 8;
    public static p0 C;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f43163w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ da.j f43164x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f43165y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f43166z;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p0 a(q8.a aVar, kf.x xVar) {
            jo.p.h(aVar, "dispatcher");
            jo.p.h(xVar, "userPreference");
            p0 p0Var = p0.C;
            if (p0Var != null) {
                p0Var.d();
            }
            p0 p0Var2 = new p0(aVar, xVar, null);
            p0.C = p0Var2;
            return p0Var2;
        }
    }

    public p0(q8.a aVar, kf.x xVar) {
        this.f43163w = aVar;
        this.f43164x = new da.j();
        this.f43165y = new androidx.lifecycle.e0<>(Integer.valueOf(xVar.c()));
        this.f43166z = new androidx.lifecycle.e0<>(Integer.valueOf(xVar.e1()));
        aVar.b(this);
    }

    public /* synthetic */ p0(q8.a aVar, kf.x xVar, jo.h hVar) {
        this(aVar, xVar);
    }

    public final void d() {
        this.f43163w.c(this);
        r0.d(this, null, 1, null);
    }

    public final int e() {
        Integer f10 = this.f43165y.f();
        jo.p.e(f10);
        return f10.intValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43164x.getCoroutineContext();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h1.b bVar) {
        jo.p.h(bVar, "event");
        this.f43165y.p(Integer.valueOf(bVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h1.c cVar) {
        jo.p.h(cVar, "event");
        this.f43166z.p(Integer.valueOf(cVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h1.a aVar) {
        jo.p.h(aVar, "event");
        this.f43165y.p(0);
    }
}
