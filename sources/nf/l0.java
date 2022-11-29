package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftColorConfig;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftConfigResponse;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftPreset;
import ha.a;
import java.util.List;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import pd.e1;
import uo.r0;

/* loaded from: classes3.dex */
public final class l0 extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<ha.a> A;
    public final LiveData<ha.a> B;
    public final s0<UniqueEmomoGiftConfigResponse> C;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f43007y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f43008z;

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoGiftTypeSelectStore$on$1", f = "UniqueEmomoGiftTypeSelectStore.kt", l = {49}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43009w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e1.c f43011y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e1.c cVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f43011y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f43011y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43009w;
            if (i10 == 0) {
                wn.m.b(obj);
                s0 s0Var = l0.this.C;
                UniqueEmomoGiftConfigResponse a10 = this.f43011y.a();
                this.f43009w = 1;
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

    public l0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f43007y = aVar;
        this.f43008z = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<ha.a> e0Var = new androidx.lifecycle.e0<>(a.d.f34697b);
        this.A = e0Var;
        this.B = e0Var;
        this.C = new s0<>();
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f43007y.c(this);
        super.d();
    }

    public final xo.c<UniqueEmomoGiftConfigResponse> g() {
        return this.C.a();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43008z.getCoroutineContext();
    }

    public final LiveData<ha.a> h() {
        return this.B;
    }

    public final List<UniqueEmomoGiftColorConfig> i() {
        UniqueEmomoGiftConfigResponse b10 = this.C.b();
        if (b10 != null) {
            return b10.getColors();
        }
        return null;
    }

    public final List<UniqueEmomoGiftPreset> j() {
        UniqueEmomoGiftConfigResponse b10 = this.C.b();
        if (b10 != null) {
            return b10.getPresets();
        }
        return null;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(e1.b bVar) {
        jo.p.h(bVar, "event");
        this.A.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(e1.c cVar) {
        jo.p.h(cVar, "event");
        this.A.p(a.d.f34697b);
        uo.l.d(this, null, null, new a(cVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(e1.a aVar) {
        jo.p.h(aVar, "event");
        this.A.p(new a.C0439a(aVar.a()));
    }
}
