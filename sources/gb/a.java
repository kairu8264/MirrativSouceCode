package gb;

import co.l;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.RewardAdCompleteResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import gb.b;
import io.p;
import uo.b0;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.k0;
import uo.q0;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public final class a implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f32828w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f32829x;

    /* renamed from: y  reason: collision with root package name */
    public final ao.g f32830y;

    @co.f(c = "com.dena.mirrativ.otherfeature.reward.RewardActionCreator$post$1", f = "RewardActionCreator.kt", l = {22}, m = "invokeSuspend")
    /* renamed from: gb.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0382a extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f32831w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f32833y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0382a(int i10, ao.d<? super C0382a> dVar) {
            super(2, dVar);
            this.f32833y = i10;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0382a(this.f32833y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0382a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f32831w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    a.this.d(true);
                    MRRequest mRRequest = a.this.f32829x;
                    int i11 = this.f32833y;
                    this.f32831w = 1;
                    obj = mRRequest.postRewardAdCoinChallenge(Referer.COIN_CHALLENGE, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                a.this.f32828w.a(new b.C0383b((RewardAdCompleteResponse) obj));
            } catch (Throwable th2) {
                a.this.f32828w.a(new b.a(MRErrorKt.convertMRException(th2).getError()));
            }
            a.this.d(false);
            return v.f59242a;
        }
    }

    public a(q8.a aVar, MRRequest mRRequest) {
        b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f32828w = aVar;
        this.f32829x = mRRequest;
        k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.f32830y = b11.plus(b10);
    }

    public final d2 c(int i10) {
        d2 d10;
        d10 = uo.l.d(this, null, null, new C0382a(i10, null), 3, null);
        return d10;
    }

    public final void d(boolean z10) {
        this.f32828w.a(new b.c(z10));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f32830y;
    }
}
