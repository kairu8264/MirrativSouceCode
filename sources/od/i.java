package od;

import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import pd.l;

/* loaded from: classes2.dex */
public final class i extends androidx.lifecycle.q0 implements uo.q0 {
    public final /* synthetic */ da.b A;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f44925y;

    /* renamed from: z  reason: collision with root package name */
    public final MRRequest f44926z;

    @co.f(c = "com.dena.mirrorman.actioncreator.EmomoUserActionCreator$fetchClosetAvatar$1", f = "EmomoUserActionCreator.kt", l = {19}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44927w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44929y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44929y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44929y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44927w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = i.this.f44926z;
                    String str = this.f44929y;
                    this.f44927w = 1;
                    obj = MRRequest.DefaultImpls.requestClosetAvatar$default(mRRequest, null, str, this, 1, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                jf.c a10 = jf.c.f37906y.a(((ClosetAvatarResponse) obj).getAvatar().clone());
                a10.g(this.f44929y);
                i.this.f44925y.a(new l.a(this.f44929y, a10));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    public i(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f44925y = aVar;
        this.f44926z = mRRequest;
        this.A = new da.b();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }

    public final void h(String str) {
        jo.p.h(str, "userId");
        uo.l.d(this, null, null, new a(str, null), 3, null);
    }

    public final void i(String str, int i10) {
        jo.p.h(str, "userId");
        this.f44925y.a(new l.b(str, i10));
    }
}
