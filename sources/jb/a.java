package jb;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.LiveDetailResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import hf.v0;
import jb.b;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.k0;
import uo.q0;
import wn.v;

/* loaded from: classes2.dex */
public final class a implements q0 {
    public final ao.g A;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f37440w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f37441x;

    /* renamed from: y  reason: collision with root package name */
    public final v0 f37442y;

    /* renamed from: z  reason: collision with root package name */
    public final ef.a f37443z;

    @co.f(c = "com.dena.mirrativ.player.archive.ArchivePlayerActionCreator$loadPlayRequestParams$1", f = "ArchivePlayerActionCreator.kt", l = {30}, m = "invokeSuspend")
    /* renamed from: jb.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0504a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37444w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f37446y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0504a(String str, ao.d<? super C0504a> dVar) {
            super(2, dVar);
            this.f37446y = str;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new C0504a(this.f37446y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((C0504a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37444w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f37441x;
                    String str = this.f37446y;
                    this.f37444w = 1;
                    obj = mRRequest.getLiveDetail(Referer.LIVE_VIEW, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                LiveDetailResponse liveDetailResponse = (LiveDetailResponse) obj;
                a.this.f37440w.a(new b.d(a.this.f37442y.i(liveDetailResponse.getOwner().getUserId())));
                a.this.f37440w.a(new b.e(te.c.M.b(liveDetailResponse)));
            } catch (Throwable th2) {
                a.this.f37440w.a(new b.c(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    public a(q8.a aVar, MRRequest mRRequest, v0 v0Var, ef.a aVar2) {
        b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(aVar2, "tutorialManager");
        this.f37440w = aVar;
        this.f37441x = mRRequest;
        this.f37442y = v0Var;
        this.f37443z = aVar2;
        k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.A = b11.plus(b10);
    }

    public final void d(String str) {
        jo.p.h(str, "liveId");
        this.f37443z.g();
        uo.l.d(this, null, null, new C0504a(str, null), 3, null);
    }

    public final void e(te.a aVar) {
        jo.p.h(aVar, "status");
        this.f37440w.a(new b.C0505b(aVar));
    }

    public final void f(float f10) {
        this.f37440w.a(new b.a(f10));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A;
    }
}
