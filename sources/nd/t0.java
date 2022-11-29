package nd;

import androidx.lifecycle.LiveData;

/* loaded from: classes2.dex */
public final class t0 {

    /* loaded from: classes2.dex */
    public static final class a<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveData<LIVE1> f42214a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData<LIVE2> f42215b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0<wn.k<LIVE1, LIVE2>> f42216c;

        public a(LiveData<LIVE1> liveData, LiveData<LIVE2> liveData2, androidx.lifecycle.c0<wn.k<LIVE1, LIVE2>> c0Var) {
            this.f42214a = liveData;
            this.f42215b = liveData2;
            this.f42216c = c0Var;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            Object f10 = this.f42214a.f();
            Object f11 = this.f42215b.f();
            if (f10 == null || f11 == null) {
                return;
            }
            this.f42216c.p(new wn.k(f10, f11));
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements androidx.lifecycle.f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveData<LIVE1> f42217a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData<LIVE2> f42218b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ LiveData<LIVE3> f42219c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.c0<wn.p<LIVE1, LIVE2, LIVE3>> f42220d;

        public b(LiveData<LIVE1> liveData, LiveData<LIVE2> liveData2, LiveData<LIVE3> liveData3, androidx.lifecycle.c0<wn.p<LIVE1, LIVE2, LIVE3>> c0Var) {
            this.f42217a = liveData;
            this.f42218b = liveData2;
            this.f42219c = liveData3;
            this.f42220d = c0Var;
        }

        @Override // androidx.lifecycle.f0
        public final void d(Object obj) {
            Object f10 = this.f42217a.f();
            Object f11 = this.f42218b.f();
            Object f12 = this.f42219c.f();
            if (f10 == null || f11 == null || f12 == null) {
                return;
            }
            this.f42220d.p(new wn.p(f10, f11, f12));
        }
    }

    public static final <LIVE1, LIVE2> LiveData<wn.k<LIVE1, LIVE2>> a(LiveData<LIVE1> liveData, LiveData<LIVE2> liveData2) {
        jo.p.h(liveData, "liveData1");
        jo.p.h(liveData2, "liveData2");
        androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0();
        for (LiveData liveData3 : xn.s.m(liveData, liveData2)) {
            c0Var.q(liveData3, new a(liveData, liveData2, c0Var));
        }
        LiveData<wn.k<LIVE1, LIVE2>> a10 = androidx.lifecycle.p0.a(c0Var);
        jo.p.g(a10, "distinctUntilChanged(this)");
        return a10;
    }

    public static final <LIVE1, LIVE2, LIVE3> LiveData<wn.p<LIVE1, LIVE2, LIVE3>> b(LiveData<LIVE1> liveData, LiveData<LIVE2> liveData2, LiveData<LIVE3> liveData3) {
        jo.p.h(liveData, "liveData1");
        jo.p.h(liveData2, "liveData2");
        jo.p.h(liveData3, "liveData3");
        androidx.lifecycle.c0 c0Var = new androidx.lifecycle.c0();
        for (LiveData liveData4 : xn.s.m(liveData, liveData2, liveData3)) {
            c0Var.q(liveData4, new b(liveData, liveData2, liveData3, c0Var));
        }
        LiveData<wn.p<LIVE1, LIVE2, LIVE3>> a10 = androidx.lifecycle.p0.a(c0Var);
        jo.p.g(a10, "distinctUntilChanged(this)");
        return a10;
    }
}
