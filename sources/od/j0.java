package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.event.ShooterEventResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import pd.x0;

/* loaded from: classes2.dex */
public final class j0 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44943w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f44944x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f44945y;

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterEventActionCreator$fetchShooterEvent$1", f = "ShooterEventActionCreator.kt", l = {18}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ String B;

        /* renamed from: w  reason: collision with root package name */
        public int f44946w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44948y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f44949z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i10, boolean z10, String str2, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44948y = str;
            this.f44949z = i10;
            this.A = z10;
            this.B = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44948y, this.f44949z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44946w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = j0.this.f44944x;
                    String str = this.f44948y;
                    int i11 = this.f44949z;
                    int i12 = this.A ? 1 : 0;
                    String str2 = this.B;
                    this.f44946w = 1;
                    obj = mRRequest.getShooterEvent(str, i11, i12, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                j0.this.f44943w.a(new x0.b((ShooterEventResponse) obj));
            } catch (Throwable th2) {
                j0.this.f44943w.a(new x0.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public j0(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f44943w = aVar;
        this.f44944x = mRRequest;
        this.f44945y = uo.r0.b();
    }

    public final void c(String str, int i10, boolean z10, String str2) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new a(str, i10, z10, str2, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44945y.getCoroutineContext();
    }
}
