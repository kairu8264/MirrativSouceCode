package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.live.GroupShotGalleryResponse;
import com.dena.mirrorman.net.api.response.live.PhotoCampaignStatusResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import pd.t;

/* loaded from: classes2.dex */
public final class q implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f45144w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f45145x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f45146y;

    @co.f(c = "com.dena.mirrorman.actioncreator.GroupShotGalleryActionCreator$fetchCampaignStatus$1", f = "GroupShotGalleryActionCreator.kt", l = {44, 46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f45147w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f45148x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45149y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ q f45150z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, q qVar, String str3, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f45148x = str;
            this.f45149y = str2;
            this.f45150z = qVar;
            this.A = str3;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f45148x, this.f45149y, this.f45150z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            PhotoCampaignStatusResponse photoCampaignStatusResponse;
            Object c10 = bo.c.c();
            int i10 = this.f45147w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    if (this.f45148x == null || this.f45149y == null) {
                        MRRequest mRRequest = this.f45150z.f45145x;
                        String str = this.A;
                        this.f45147w = 2;
                        obj = mRRequest.getCurrentPhotoCampaignStatus(str, this);
                        if (obj == c10) {
                            return c10;
                        }
                        photoCampaignStatusResponse = (PhotoCampaignStatusResponse) obj;
                    } else {
                        MRRequest mRRequest2 = this.f45150z.f45145x;
                        String str2 = this.A;
                        String str3 = this.f45148x;
                        String str4 = this.f45149y;
                        this.f45147w = 1;
                        obj = mRRequest2.getPhotoCampaignStatus(str2, str3, str4, this);
                        if (obj == c10) {
                            return c10;
                        }
                        photoCampaignStatusResponse = (PhotoCampaignStatusResponse) obj;
                    }
                } else if (i10 == 1) {
                    wn.m.b(obj);
                    photoCampaignStatusResponse = (PhotoCampaignStatusResponse) obj;
                } else if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    photoCampaignStatusResponse = (PhotoCampaignStatusResponse) obj;
                }
                this.f45150z.f45144w.a(new t.c(photoCampaignStatusResponse.getPhotoCampaign()));
            } catch (Throwable th2) {
                this.f45150z.f45144w.a(new t.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.GroupShotGalleryActionCreator$loadNext$1", f = "GroupShotGalleryActionCreator.kt", l = {31}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45151w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45153y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f45154z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f45153y = str;
            this.f45154z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f45153y, this.f45154z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45151w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = q.this.f45145x;
                    String str = this.f45153y;
                    int i11 = this.f45154z;
                    this.f45151w = 1;
                    obj = mRRequest.getGroupShotGallery(str, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                q.this.f45144w.a(new t.e((GroupShotGalleryResponse) obj));
            } catch (Throwable th2) {
                q.this.f45144w.a(new t.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.GroupShotGalleryActionCreator$reload$1", f = "GroupShotGalleryActionCreator.kt", l = {19}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45155w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45157y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f45157y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f45157y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45155w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = q.this.f45145x;
                    String str = this.f45157y;
                    this.f45155w = 1;
                    obj = MRRequest.DefaultImpls.getGroupShotGallery$default(mRRequest, str, 0, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                q.this.f45144w.a(new t.e((GroupShotGalleryResponse) obj));
            } catch (Throwable th2) {
                q.this.f45144w.a(new t.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public q(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f45144w = aVar;
        this.f45145x = mRRequest;
        this.f45146y = new da.b();
    }

    public final void c(String str, String str2, String str3) {
        jo.p.h(str, "referer");
        this.f45144w.a(t.b.f47262a);
        uo.l.d(this, null, null, new a(str2, str3, this, str, null), 3, null);
    }

    public final void d(String str, int i10) {
        jo.p.h(str, "referer");
        this.f45144w.a(t.f.f47266a);
        uo.l.d(this, null, null, new b(str, i10, null), 3, null);
    }

    public final void e(String str) {
        jo.p.h(str, "referer");
        this.f45144w.a(t.g.f47267a);
        uo.l.d(this, null, null, new c(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f45146y.getCoroutineContext();
    }
}
