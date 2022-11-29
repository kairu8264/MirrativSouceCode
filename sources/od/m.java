package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.GiftboxGachaExecuteResponse;
import com.dena.mirrorman.net.api.response.GiftboxGachaResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import pd.r;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class m extends androidx.lifecycle.q0 implements uo.q0 {
    public final ao.g A;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f45035y;

    /* renamed from: z  reason: collision with root package name */
    public final MRRequest f45036z;

    @co.f(c = "com.dena.mirrorman.actioncreator.GiftboxGachaActionCreator$executeGiftboxGacha$1", f = "GiftboxGachaActionCreator.kt", l = {35}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45037w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45039y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45040z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f45039y = str;
            this.f45040z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f45039y, this.f45040z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45037w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = m.this.f45036z;
                    String str = this.f45039y;
                    String str2 = this.f45040z;
                    this.f45037w = 1;
                    obj = mRRequest.postExecuteGiftboxGacha(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                m.this.f45035y.a(new r.e((GiftboxGachaExecuteResponse) obj));
            } catch (Throwable th2) {
                m.this.f45035y.a(new r.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.GiftboxGachaActionCreator$getGiftboxGacha$1", f = "GiftboxGachaActionCreator.kt", l = {23}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45041w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45043y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f45043y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f45043y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45041w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = m.this.f45036z;
                    String str = this.f45043y;
                    this.f45041w = 1;
                    obj = mRRequest.getGiftboxGacha("", str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                m.this.f45035y.a(new r.f((GiftboxGachaResponse) obj));
            } catch (Throwable th2) {
                m.this.f45035y.a(new r.c(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.GiftboxGachaActionCreator$tweet$1", f = "GiftboxGachaActionCreator.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45044w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45046y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f45047z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f45046y = str;
            this.f45047z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f45046y, this.f45047z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45044w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = m.this.f45036z;
                    String str = this.f45046y;
                    String str2 = this.f45047z;
                    this.f45044w = 1;
                    if (mRRequest.postTweet(str, str2, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                m.this.f45035y.a(r.g.f47213a);
            } catch (Throwable th2) {
                m.this.f45035y.a(new r.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public m(q8.a aVar, MRRequest mRRequest) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f45035y = aVar;
        this.f45036z = mRRequest;
        uo.k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.A = b11.plus(b10);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A;
    }

    public final void h(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "userGiftboxGachaId");
        this.f45035y.a(r.a.f47207a);
        uo.l.d(this, null, null, new a(str, str2, null), 3, null);
    }

    public final void i(String str) {
        jo.p.h(str, "userGiftboxGachaId");
        uo.l.d(this, null, null, new b(str, null), 3, null);
    }

    public final void j(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "text");
        uo.l.d(this, null, null, new c(str, str2, null), 3, null);
    }
}
