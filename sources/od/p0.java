package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftConfigResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import pd.e1;

/* loaded from: classes2.dex */
public final class p0 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f45138w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f45139x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f45140y;

    @co.f(c = "com.dena.mirrorman.actioncreator.UniqueEmomoGiftTypeSelectActionCreator$fetchUniqueEmomoGiftConfig$1", f = "UniqueEmomoGiftTypeSelectActionCreator.kt", l = {19}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45141w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45143y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f45143y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f45143y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45141w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = p0.this.f45139x;
                    String str = this.f45143y;
                    this.f45141w = 1;
                    obj = mRRequest.getUniqueEmomoGiftConfig(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                p0.this.f45138w.a(new e1.c((UniqueEmomoGiftConfigResponse) obj));
            } catch (Throwable th2) {
                p0.this.f45138w.a(new e1.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public p0(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f45138w = aVar;
        this.f45139x = mRRequest;
        this.f45140y = uo.r0.b();
    }

    public final void c(String str) {
        jo.p.h(str, "referer");
        this.f45138w.a(e1.b.f46730a);
        uo.l.d(this, null, null, new a(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f45140y.getCoroutineContext();
    }
}
