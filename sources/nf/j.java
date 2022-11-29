package nf;

import androidx.lifecycle.LiveData;
import com.dena.mirrorman.unity.UnityActionEvent;
import org.greenrobot.eventbus.ThreadMode;
import pd.l;
import uo.r0;

/* loaded from: classes3.dex */
public final class j extends androidx.lifecycle.q0 implements uo.q0 {
    public final /* synthetic */ uo.q0 A;
    public final xo.r<jf.c> B;
    public final xo.w<jf.c> C;
    public xo.s<jf.c> D;
    public final xo.g0<jf.c> E;
    public final androidx.lifecycle.e0<Integer> F;
    public final LiveData<Integer> G;
    public final androidx.lifecycle.e0<Boolean> H;
    public final LiveData<Boolean> I;

    /* renamed from: y  reason: collision with root package name */
    public final String f42970y;

    /* renamed from: z  reason: collision with root package name */
    public final q8.a f42971z;

    @co.f(c = "com.dena.mirrorman.store.EmomoUserViewStore$on$1", f = "EmomoUserViewStore.kt", l = {53}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f42972w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l.a f42974y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l.a aVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f42974y = aVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f42974y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f42972w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = j.this.B;
                jf.c a10 = this.f42974y.a();
                this.f42972w = 1;
                if (rVar.emit(a10, this) == c10) {
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

    public j(String str, q8.a aVar) {
        jo.p.h(str, "userId");
        jo.p.h(aVar, "dispatcher");
        this.f42970y = str;
        this.f42971z = aVar;
        this.A = r0.b();
        aVar.b(this);
        xo.r<jf.c> b10 = xo.y.b(0, 0, null, 6, null);
        this.B = b10;
        this.C = b10;
        xo.s<jf.c> a10 = xo.i0.a(null);
        this.D = a10;
        this.E = a10;
        androidx.lifecycle.e0<Integer> e0Var = new androidx.lifecycle.e0<>(0);
        this.F = e0Var;
        this.G = e0Var;
        androidx.lifecycle.e0<Boolean> e0Var2 = new androidx.lifecycle.e0<>(Boolean.FALSE);
        this.H = e0Var2;
        this.I = e0Var2;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f42971z.c(this);
        super.d();
    }

    public final xo.g0<jf.c> g() {
        return this.E;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }

    public final xo.w<jf.c> h() {
        return this.C;
    }

    public final LiveData<Integer> i() {
        return this.G;
    }

    public final LiveData<Boolean> j() {
        return this.I;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.a aVar) {
        jo.p.h(aVar, "event");
        if (jo.p.c(aVar.b(), this.f42970y)) {
            this.D.setValue(aVar.a());
            uo.l.d(this, null, null, new a(aVar, null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.b bVar) {
        jo.p.h(bVar, "event");
        if (jo.p.c(bVar.b(), this.f42970y)) {
            this.F.p(Integer.valueOf(bVar.a()));
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.LoadAvatarModelCompleted loadAvatarModelCompleted) {
        jo.p.h(loadAvatarModelCompleted, "event");
        this.H.p(Boolean.valueOf(jo.p.c(this.f42970y, loadAvatarModelCompleted.getLoadAvatarModel().getKey())));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.FinishMiniGame finishMiniGame) {
        jo.p.h(finishMiniGame, "event");
        this.H.p(Boolean.FALSE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.UnloadAvatarSlot unloadAvatarSlot) {
        jo.p.h(unloadAvatarSlot, "event");
        this.H.p(Boolean.FALSE);
    }
}
