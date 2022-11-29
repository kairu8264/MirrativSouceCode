package hb;

import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import hb.c;

/* loaded from: classes2.dex */
public final class b implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f34705w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f34706x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f34707y;

    @co.f(c = "com.dena.mirrativ.player.EmomoWipeActionCreator$fetchClosetAvatar$1", f = "EmomoWipeActionCreator.kt", l = {17}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f34708w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f34710y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f34710y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f34710y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f34708w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = b.this.f34706x;
                    String str = this.f34710y;
                    this.f34708w = 1;
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
                a10.g(this.f34710y);
                b.this.f34705w.a(new c.a(this.f34710y, a10));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    public b(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f34705w = aVar;
        this.f34706x = mRRequest;
        this.f34707y = new da.b();
    }

    public final void c(String str) {
        jo.p.h(str, "userId");
        uo.l.d(this, null, null, new a(str, null), 3, null);
    }

    public final void d(boolean z10) {
        this.f34705w.a(new c.b(z10));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f34707y.getCoroutineContext();
    }
}
