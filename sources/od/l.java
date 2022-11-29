package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.GiftCodeSelectionResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import pd.p;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class l implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44993w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f44994x;

    /* renamed from: y  reason: collision with root package name */
    public final ao.g f44995y;

    @co.f(c = "com.dena.mirrorman.actioncreator.GiftCodeSelectionActionCreator$post$1", f = "GiftCodeSelectionActionCreator.kt", l = {38}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44996w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ se.l f44997x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ l f44998y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f44999z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(se.l lVar, l lVar2, int i10, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44997x = lVar;
            this.f44998y = lVar2;
            this.f44999z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44997x, this.f44998y, this.f44999z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44996w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    int i11 = this.f44997x == se.l.ITUNES ? 1 : 2;
                    MRRequest mRRequest = this.f44998y.f44994x;
                    int i12 = this.f44999z;
                    this.f44996w = 1;
                    if (mRRequest.postReceiveGiftCode(Referer.EXCHANGE_DIAMOND_TO_GIFT_CODE, i12, i11, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.f44998y.f44993w.a(new p.d(this.f44997x));
            } catch (Throwable th2) {
                this.f44998y.f44993w.a(new p.c(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.GiftCodeSelectionActionCreator$reload$1", f = "GiftCodeSelectionActionCreator.kt", l = {25}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45000w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f45002y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f45002y = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f45002y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45000w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = l.this.f44994x;
                    int i11 = this.f45002y;
                    this.f45000w = 1;
                    obj = mRRequest.getPresentGiftCode(Referer.GIFT_CODE_SELECTION, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                l.this.f44993w.a(new p.b((GiftCodeSelectionResponse) obj));
            } catch (Throwable th2) {
                l.this.f44993w.a(new p.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public l(q8.a aVar, MRRequest mRRequest) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f44993w = aVar;
        this.f44994x = mRRequest;
        uo.k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.f44995y = b11.plus(b10);
    }

    public final void c(int i10, se.l lVar) {
        jo.p.h(lVar, "giftCodeType");
        this.f44993w.a(p.e.f47105a);
        uo.l.d(this, null, null, new a(lVar, this, i10, null), 3, null);
    }

    public final void d(int i10) {
        this.f44993w.a(p.e.f47105a);
        uo.l.d(this, null, null, new b(i10, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44995y;
    }
}
