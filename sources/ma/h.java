package ma;

import androidx.lifecycle.q0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import io.p;
import l0.c2;
import l0.s0;
import l0.z1;
import ma.b;
import org.greenrobot.eventbus.ThreadMode;
import uo.r0;
import wn.m;
import wn.v;
import xo.r;
import xo.w;
import xo.y;

/* loaded from: classes.dex */
public final class h extends q0 implements uo.q0 {
    public final s0<c> A;
    public final c2<c> B;
    public final r<MRError> C;
    public final w<MRError> D;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f40676y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f40677z;

    @co.f(c = "com.dena.mirrativ.livegame.gifthelp.LiveGameGiftHelpStore$on$1", f = "LiveGameGiftHelpStore.kt", l = {44}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40678w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.a f40680y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b.a aVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f40680y = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f40680y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40678w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = h.this.C;
                MRError a10 = this.f40680y.a();
                this.f40678w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    public h(q8.a aVar) {
        s0<c> e10;
        jo.p.h(aVar, "dispatcher");
        this.f40676y = aVar;
        this.f40677z = r0.b();
        aVar.b(this);
        e10 = z1.e(null, null, 2, null);
        this.A = e10;
        this.B = e10;
        r<MRError> b10 = y.b(0, 0, null, 7, null);
        this.C = b10;
        this.D = b10;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f40676y.c(this);
        super.d();
    }

    public final w<MRError> g() {
        return this.D;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f40677z.getCoroutineContext();
    }

    public final c2<c> h() {
        return this.B;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0594b c0594b) {
        jo.p.h(c0594b, "event");
        this.A.setValue(c.f40637d.a(c0594b.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(this, null, null, new a(aVar, null), 3, null);
    }
}
