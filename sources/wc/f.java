package wc;

import androidx.lifecycle.q0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import ha.a;
import io.p;
import l0.c2;
import l0.s0;
import l0.z1;
import org.greenrobot.eventbus.ThreadMode;
import uo.r0;
import wc.b;
import wn.m;
import wn.v;
import xo.r;
import xo.w;
import xo.y;

/* loaded from: classes2.dex */
public final class f extends q0 implements uo.q0 {
    public final s0<wc.c> A;
    public final c2<wc.c> B;
    public final r<v> C;
    public final w<v> D;
    public final r<MRError> E;
    public final w<MRError> F;
    public final r<v> G;
    public final w<v> H;
    public final r<MRError> I;
    public final w<MRError> J;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f58628y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f58629z;

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.agreement.ChatConfirmationAgreementStore$on$1", f = "ChatConfirmationAgreementStore.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58630w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58630w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = f.this.C;
                v vVar = v.f59242a;
                this.f58630w = 1;
                if (rVar.emit(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.agreement.ChatConfirmationAgreementStore$on$2", f = "ChatConfirmationAgreementStore.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58632w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.a f58634y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b.a aVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f58634y = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f58634y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58632w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = f.this.E;
                MRError a10 = this.f58634y.a();
                this.f58632w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.agreement.ChatConfirmationAgreementStore$on$3", f = "ChatConfirmationAgreementStore.kt", l = {75}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58635w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58635w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = f.this.G;
                v vVar = v.f59242a;
                this.f58635w = 1;
                if (rVar.emit(vVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.agreement.ChatConfirmationAgreementStore$on$4", f = "ChatConfirmationAgreementStore.kt", l = {82}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f58637w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ b.d f58639y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b.d dVar, ao.d<? super d> dVar2) {
            super(2, dVar2);
            this.f58639y = dVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f58639y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f58637w;
            if (i10 == 0) {
                m.b(obj);
                r rVar = f.this.I;
                MRError a10 = this.f58639y.a();
                this.f58637w = 1;
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

    public f(q8.a aVar) {
        s0<wc.c> e10;
        jo.p.h(aVar, "dispatcher");
        this.f58628y = aVar;
        this.f58629z = r0.b();
        aVar.b(this);
        e10 = z1.e(new wc.c(a.d.f34697b), null, 2, null);
        this.A = e10;
        this.B = e10;
        r<v> b10 = y.b(0, 0, null, 7, null);
        this.C = b10;
        this.D = b10;
        r<MRError> b11 = y.b(0, 0, null, 7, null);
        this.E = b11;
        this.F = b11;
        r<v> b12 = y.b(0, 0, null, 7, null);
        this.G = b12;
        this.H = b12;
        r<MRError> b13 = y.b(0, 0, null, 7, null);
        this.I = b13;
        this.J = b13;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f58628y.c(this);
        super.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && jo.p.c(this.f58628y, ((f) obj).f58628y);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f58629z.getCoroutineContext();
    }

    public int hashCode() {
        return this.f58628y.hashCode();
    }

    public final w<MRError> j() {
        return this.F;
    }

    public final w<v> k() {
        return this.D;
    }

    public final c2<wc.c> l() {
        return this.B;
    }

    public final w<MRError> m() {
        return this.J;
    }

    public final w<v> n() {
        return this.H;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.c cVar) {
        jo.p.h(cVar, "event");
        s0<wc.c> s0Var = this.A;
        s0Var.setValue(s0Var.getValue().a(a.b.f34695b));
    }

    public String toString() {
        return "ChatConfirmationAgreementStore(dispatcher=" + this.f58628y + ')';
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.C0973b c0973b) {
        jo.p.h(c0973b, "event");
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.a aVar) {
        jo.p.h(aVar, "event");
        s0<wc.c> s0Var = this.A;
        s0Var.setValue(s0Var.getValue().a(a.d.f34697b));
        uo.l.d(this, null, null, new b(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(b.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(this, null, null, new d(dVar, null), 3, null);
    }
}
