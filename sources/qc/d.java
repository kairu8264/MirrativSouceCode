package qc;

import androidx.lifecycle.q0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.otherfeatures.OtherFeaturesApi;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.request.PurchaseAvatarsRequest;
import com.dena.mirrorman.net.api.response.EventNoticeResponse;
import com.dena.mirrorman.net.api.response.PurchaseAvatarsResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import io.p;
import pd.w;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.k0;
import wn.l;
import wn.m;
import wn.v;
import xn.r;

/* loaded from: classes2.dex */
public final class d extends q0 implements uo.q0 {
    public final MRRequest A;
    public final OtherFeaturesApi B;
    public final ao.g C;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f48952y;

    /* renamed from: z  reason: collision with root package name */
    public final MRLogger f48953z;

    @co.f(c = "com.dena.mirrativ.user.emomo.HomeEmomoActionCreator$getEventNotice$1", f = "HomeEmomoActionCreator.kt", l = {29}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f48954w;

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
            int i10 = this.f48954w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest mRRequest = d.this.A;
                    this.f48954w = 1;
                    obj = MRRequest.DefaultImpls.getEventNotice$default(mRRequest, 3, null, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                d.this.f48952y.a(new w.b((EventNoticeResponse) obj));
            } catch (Throwable unused) {
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.emomo.HomeEmomoActionCreator$getRemainingCoins$1", f = "HomeEmomoActionCreator.kt", l = {40}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f48956w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f48958y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f48958y = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f48958y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f48956w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    OtherFeaturesApi otherFeaturesApi = d.this.B;
                    String str = this.f48958y;
                    this.f48956w = 1;
                    if (otherFeaturesApi.oldCoinProductsRequest(str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
            } catch (Throwable th2) {
                new w.a(MRErrorKt.convertMRException(th2).getError());
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.emomo.HomeEmomoActionCreator$postPurchaseAvatars$1", f = "HomeEmomoActionCreator.kt", l = {53}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements p<uo.q0, ao.d<? super v>, Object> {
        public final /* synthetic */ ke.a A;

        /* renamed from: w  reason: collision with root package name */
        public int f48959w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f48960x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f48962z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, ke.a aVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f48962z = str;
            this.A = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(this.f48962z, this.A, dVar);
            cVar.f48960x = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object a10;
            Object c10 = bo.c.c();
            int i10 = this.f48959w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    uo.q0 q0Var = (uo.q0) this.f48960x;
                    d dVar = d.this;
                    String str = this.f48962z;
                    ke.a aVar = this.A;
                    l.a aVar2 = wn.l.f59224w;
                    MRRequest mRRequest = dVar.A;
                    PurchaseAvatarsRequest b10 = aVar.b();
                    this.f48959w = 1;
                    obj = mRRequest.postPurchaseAvatars(str, b10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                a10 = wn.l.a((PurchaseAvatarsResponse) obj);
            } catch (Throwable th2) {
                l.a aVar3 = wn.l.f59224w;
                a10 = wn.l.a(m.a(th2));
            }
            d dVar2 = d.this;
            ke.a aVar4 = this.A;
            Throwable b11 = wn.l.b(a10);
            if (b11 == null) {
                MRLogger mRLogger = dVar2.f48953z;
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COIN_CONSUME);
                builder.setTargetType("avatar_shop");
                builder.setPayload(r.d(companion.purchaseItemIds(aVar4)));
                mRLogger.sendLog(builder.build());
                dVar2.f48952y.a(new w.d((PurchaseAvatarsResponse) a10));
            } else {
                dVar2.f48952y.a(new w.c(MRErrorKt.convertMRException(b11).getError()));
            }
            return v.f59242a;
        }
    }

    public d(q8.a aVar, MRLogger mRLogger, MRRequest mRRequest, OtherFeaturesApi otherFeaturesApi) {
        b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRLogger, "logger");
        jo.p.h(mRRequest, "request");
        jo.p.h(otherFeaturesApi, "otherFeaturesApi");
        this.f48952y = aVar;
        this.f48953z = mRLogger;
        this.A = mRRequest;
        this.B = otherFeaturesApi;
        k0 a10 = g1.a();
        b10 = i2.b(null, 1, null);
        this.C = a10.plus(b10);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.C;
    }

    public final void j() {
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    public final void k(String str) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new b(str, null), 3, null);
    }

    public final void l(String str, ke.a aVar) {
        jo.p.h(str, "referer");
        jo.p.h(aVar, "equipAvatars");
        uo.l.d(this, null, null, new c(str, aVar, null), 3, null);
    }
}
