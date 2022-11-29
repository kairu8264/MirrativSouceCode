package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import pd.h0;
import uo.r0;

/* loaded from: classes3.dex */
public final class x extends androidx.lifecycle.q0 implements uo.q0 {
    public final String A;
    public final q8.a B;
    public final /* synthetic */ uo.q0 C;
    public final androidx.lifecycle.e0<Boolean> D;
    public final LiveData<Boolean> E;
    public final androidx.lifecycle.e0<String> F;
    public final LiveData<String> G;
    public final s0<Boolean> H;
    public final wo.f<MRError> I;

    /* renamed from: y  reason: collision with root package name */
    public final String f43298y;

    /* renamed from: z  reason: collision with root package name */
    public final int f43299z;

    @co.f(c = "com.dena.mirrorman.store.LiveThumbnailSettingStore$on$1", f = "LiveThumbnailSettingStore.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43300w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43300w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = x.this.H;
                Boolean a10 = co.b.a(true);
                this.f43300w = 1;
                if (s0Var.d(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.store.LiveThumbnailSettingStore$on$2", f = "LiveThumbnailSettingStore.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43302w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ h0.a f43304y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h0.a aVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f43304y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f43304y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43302w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = x.this.I;
                MRError a10 = this.f43304y.a();
                this.f43302w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    public x(String str, int i10, String str2, String str3, q8.a aVar) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        jo.p.h(str3, "defaultThumbnailImageUrl");
        jo.p.h(aVar, "dispatcher");
        this.f43298y = str;
        this.f43299z = i10;
        this.A = str2;
        this.B = aVar;
        this.C = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<Boolean> e0Var = new androidx.lifecycle.e0<>(Boolean.FALSE);
        this.D = e0Var;
        this.E = e0Var;
        androidx.lifecycle.e0<String> e0Var2 = new androidx.lifecycle.e0<>(str3);
        this.F = e0Var2;
        this.G = e0Var2;
        this.H = new s0<>();
        this.I = wo.g.a(-2);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.B.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.C.getCoroutineContext();
    }

    public final int h() {
        return this.f43299z;
    }

    public final String i() {
        return this.A;
    }

    public final String j() {
        return this.f43298y;
    }

    public final LiveData<String> k() {
        return this.G;
    }

    public final boolean l() {
        Boolean b10 = this.H.b();
        if (b10 != null) {
            return b10.booleanValue();
        }
        return false;
    }

    public final LiveData<Boolean> m() {
        return this.E;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h0.c cVar) {
        jo.p.h(cVar, "event");
        this.D.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h0.b bVar) {
        jo.p.h(bVar, "event");
        this.D.p(Boolean.FALSE);
        this.F.p(bVar.a());
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(h0.a aVar) {
        jo.p.h(aVar, "event");
        this.D.p(Boolean.FALSE);
        uo.l.d(this, null, null, new b(aVar, null), 3, null);
    }
}
