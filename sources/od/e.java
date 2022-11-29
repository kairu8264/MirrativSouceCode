package od;

import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarPartsResponse;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarResponse;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.mirrativapi.closet.ClosetResponse;
import com.dena.mirrativ.mirrativapi.closet.ClosetsResponse;
import com.dena.mirrativ.mirrativapi.closet.UpdateCompanionNameResponse;
import com.dena.mirrativ.mirrativapi.closet.UpdatePartTextResponse;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.request.UpdateClosetAvatarRequest;
import com.dena.mirrorman.net.api.request.UpdateClosetImagesRequest;
import com.dena.mirrorman.net.api.request.UpdateClosetNameRequest;
import com.dena.mirrorman.net.api.response.PurchaseAvatarsResponse;
import com.dena.mirrorman.net.api.response.UserCurrencyResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import hf.v0;
import java.util.List;
import pd.f;
import pd.s;
import uo.l0;
import uo.y0;

/* loaded from: classes2.dex */
public final class e implements uo.q0 {
    public final /* synthetic */ uo.q0 A;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44777w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f44778x;

    /* renamed from: y  reason: collision with root package name */
    public final kf.x f44779y;

    /* renamed from: z  reason: collision with root package name */
    public final v0 f44780z;

    @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$createUserProfile$1", f = "ClosetActionCreator.kt", l = {243}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44781w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44783y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ep.c0 f44784z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ep.c0 c0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44783y = str;
            this.f44784z = c0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44783y, this.f44784z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44781w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = e.this.f44778x;
                    String str = this.f44783y;
                    ep.c0 c0Var = this.f44784z;
                    this.f44781w = 1;
                    if (mRRequest.postUserProfileEdit(str, c0Var, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f44777w.a(f.m0.f46765a);
            } catch (Throwable th2) {
                e.this.f44777w.a(new f.m(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$fetchCloset$1", f = "ClosetActionCreator.kt", l = {65}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44785w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f44787y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f44787y = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f44787y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44785w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    e.this.f44777w.a(new f.d0(this.f44787y));
                    MRRequest mRRequest = e.this.f44778x;
                    Integer d10 = co.b.d(this.f44787y);
                    this.f44785w = 1;
                    obj = MRRequest.DefaultImpls.requestClosetAvatar$default(mRRequest, d10, null, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f44777w.a(new f.n(this.f44787y, (ClosetAvatarResponse) obj));
            } catch (Throwable th2) {
                e.this.f44777w.a(new f.d(this.f44787y, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$fetchClosetParts$1", f = "ClosetActionCreator.kt", l = {82}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44788w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44788w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    e.this.f44777w.a(f.e0.f46742a);
                    MRRequest mRRequest = e.this.f44778x;
                    this.f44788w = 1;
                    obj = mRRequest.requestClosetParts(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                ClosetAvatarPartsResponse closetAvatarPartsResponse = (ClosetAvatarPartsResponse) obj;
                e.this.f44779y.T0(closetAvatarPartsResponse.getUserAvatarPartsNum());
                e.this.f44777w.a(new s.k(false));
                e.this.f44777w.a(new f.o(closetAvatarPartsResponse));
            } catch (Throwable th2) {
                e.this.f44777w.a(new f.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$fetchCurrency$1", f = "ClosetActionCreator.kt", l = {116}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44790w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44790w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = e.this.f44778x;
                    this.f44790w = 1;
                    obj = mRRequest.getUserCurrency(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f44777w.a(new f.p((UserCurrencyResponse) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    /* renamed from: od.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0678e extends ao.a implements uo.l0 {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e f44792w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0678e(l0.a aVar, e eVar) {
            super(aVar);
            this.f44792w = eVar;
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
            this.f44792w.f44777w.a(new f.C0714f(MRErrorKt.convertMRException(th2).getError()));
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$fetchCurrentCloset$2", f = "ClosetActionCreator.kt", l = {45, 46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44793w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f44794x;

        @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$fetchCurrentCloset$2$closetsRequest$1", f = "ClosetActionCreator.kt", l = {43}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super ClosetsResponse>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f44796w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ e f44797x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f44797x = eVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f44797x, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super ClosetsResponse> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f44796w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f44797x.f44778x;
                    this.f44796w = 1;
                    obj = mRRequest.requestClosets(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$fetchCurrentCloset$2$currentClosetRequest$1", f = "ClosetActionCreator.kt", l = {42}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends co.l implements io.p<uo.q0, ao.d<? super ClosetAvatarResponse>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f44798w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ e f44799x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(e eVar, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f44799x = eVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f44799x, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super ClosetAvatarResponse> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f44798w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f44799x.f44778x;
                    this.f44798w = 1;
                    obj = MRRequest.DefaultImpls.requestClosetAvatar$default(mRRequest, null, null, this, 3, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f44794x = obj;
            return fVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            y0 b10;
            y0 b11;
            y0 y0Var;
            ClosetAvatarResponse closetAvatarResponse;
            Object c10 = bo.c.c();
            int i10 = this.f44793w;
            try {
            } catch (Exception e10) {
                e.this.f44777w.a(new f.C0714f(MRErrorKt.convertMRException(e10).getError()));
            }
            if (i10 == 0) {
                wn.m.b(obj);
                uo.q0 q0Var = (uo.q0) this.f44794x;
                e.this.f44777w.a(f.f0.f46744a);
                b10 = uo.l.b(q0Var, null, null, new b(e.this, null), 3, null);
                b11 = uo.l.b(q0Var, null, null, new a(e.this, null), 3, null);
                this.f44794x = b11;
                this.f44793w = 1;
                Object o10 = b10.o(this);
                if (o10 == c10) {
                    return c10;
                }
                y0Var = b11;
                obj = o10;
            } else if (i10 != 1) {
                if (i10 == 2) {
                    closetAvatarResponse = (ClosetAvatarResponse) this.f44794x;
                    wn.m.b(obj);
                    e.this.f44777w.a(new s.k(false));
                    e.this.f44777w.a(new f.q(closetAvatarResponse, (ClosetsResponse) obj));
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y0Var = (y0) this.f44794x;
                wn.m.b(obj);
            }
            ClosetAvatarResponse closetAvatarResponse2 = (ClosetAvatarResponse) obj;
            this.f44794x = closetAvatarResponse2;
            this.f44793w = 2;
            Object o11 = y0Var.o(this);
            if (o11 == c10) {
                return c10;
            }
            closetAvatarResponse = closetAvatarResponse2;
            obj = o11;
            e.this.f44777w.a(new s.k(false));
            e.this.f44777w.a(new f.q(closetAvatarResponse, (ClosetsResponse) obj));
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$updateCloset$1", f = "ClosetActionCreator.kt", l = {127}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44800w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f44802y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ClosetAvatar f44803z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, ClosetAvatar closetAvatar, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f44802y = i10;
            this.f44803z = closetAvatar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f44802y, this.f44803z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44800w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    e.this.f44777w.a(new f.g0(this.f44802y));
                    MRRequest mRRequest = e.this.f44778x;
                    UpdateClosetAvatarRequest convert = UpdateClosetAvatarRequest.Companion.convert(this.f44803z, this.f44802y);
                    this.f44800w = 1;
                    obj = mRRequest.updateClosetAvatar(convert, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f44777w.a(new f.r(this.f44802y, (ClosetAvatarResponse) obj));
            } catch (Throwable th2) {
                e.this.f44777w.a(new f.g(this.f44802y, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends ao.a implements uo.l0 {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e f44804w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f44805x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ UpdateClosetImagesRequest f44806y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(l0.a aVar, e eVar, int i10, UpdateClosetImagesRequest updateClosetImagesRequest) {
            super(aVar);
            this.f44804w = eVar;
            this.f44805x = i10;
            this.f44806y = updateClosetImagesRequest;
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
            this.f44804w.f44777w.a(new f.h(this.f44805x, this.f44806y, MRErrorKt.convertMRException(th2).getError()));
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$updateClosetAndClosetImages$2", f = "ClosetActionCreator.kt", l = {194, 195}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ boolean A;
        public final /* synthetic */ UpdateClosetImagesRequest B;
        public final /* synthetic */ ClosetAvatar C;

        /* renamed from: w  reason: collision with root package name */
        public int f44807w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f44808x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f44810z;

        @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$updateClosetAndClosetImages$2$avatarRequest$1", f = "ClosetActionCreator.kt", l = {185}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super ClosetAvatarResponse>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f44811w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ e f44812x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ ClosetAvatar f44813y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f44814z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, ClosetAvatar closetAvatar, int i10, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f44812x = eVar;
                this.f44813y = closetAvatar;
                this.f44814z = i10;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f44812x, this.f44813y, this.f44814z, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super ClosetAvatarResponse> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f44811w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f44812x.f44778x;
                    UpdateClosetAvatarRequest convert = UpdateClosetAvatarRequest.Companion.convert(this.f44813y, this.f44814z);
                    this.f44811w = 1;
                    obj = mRRequest.updateClosetAvatar(convert, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$updateClosetAndClosetImages$2$closetRequest$1", f = "ClosetActionCreator.kt", l = {193}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends co.l implements io.p<uo.q0, ao.d<? super ClosetResponse>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f44815w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ e f44816x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ UpdateClosetImagesRequest f44817y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(e eVar, UpdateClosetImagesRequest updateClosetImagesRequest, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f44816x = eVar;
                this.f44817y = updateClosetImagesRequest;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f44816x, this.f44817y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super ClosetResponse> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f44815w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f44816x.f44778x;
                    ep.c0 build = this.f44817y.build();
                    this.f44815w = 1;
                    obj = mRRequest.updateClosetImages(build, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i10, boolean z10, UpdateClosetImagesRequest updateClosetImagesRequest, ClosetAvatar closetAvatar, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f44810z = i10;
            this.A = z10;
            this.B = updateClosetImagesRequest;
            this.C = closetAvatar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            i iVar = new i(this.f44810z, this.A, this.B, this.C, dVar);
            iVar.f44808x = obj;
            return iVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            y0 b10;
            y0 b11;
            y0 y0Var;
            ClosetAvatarResponse closetAvatarResponse;
            Object c10 = bo.c.c();
            int i10 = this.f44807w;
            try {
            } catch (Throwable th2) {
                e.this.f44777w.a(new f.h(this.f44810z, this.B, MRErrorKt.convertMRException(th2).getError()));
            }
            if (i10 == 0) {
                wn.m.b(obj);
                uo.q0 q0Var = (uo.q0) this.f44808x;
                e.this.f44777w.a(new f.h0(this.f44810z));
                b10 = uo.l.b(q0Var, null, null, new a(e.this, this.C, this.f44810z, null), 3, null);
                b11 = uo.l.b(q0Var, null, null, new b(e.this, this.B, null), 3, null);
                this.f44808x = b11;
                this.f44807w = 1;
                Object o10 = b10.o(this);
                if (o10 == c10) {
                    return c10;
                }
                y0Var = b11;
                obj = o10;
            } else if (i10 != 1) {
                if (i10 == 2) {
                    closetAvatarResponse = (ClosetAvatarResponse) this.f44808x;
                    wn.m.b(obj);
                    e.this.f44777w.a(new f.s(this.f44810z, closetAvatarResponse, (ClosetResponse) obj, this.A));
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y0Var = (y0) this.f44808x;
                wn.m.b(obj);
            }
            ClosetAvatarResponse closetAvatarResponse2 = (ClosetAvatarResponse) obj;
            this.f44808x = closetAvatarResponse2;
            this.f44807w = 2;
            Object o11 = y0Var.o(this);
            if (o11 == c10) {
                return c10;
            }
            closetAvatarResponse = closetAvatarResponse2;
            obj = o11;
            e.this.f44777w.a(new f.s(this.f44810z, closetAvatarResponse, (ClosetResponse) obj, this.A));
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$updateClosetImages$1", f = "ClosetActionCreator.kt", l = {150}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44818w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f44820y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ UpdateClosetImagesRequest f44821z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i10, UpdateClosetImagesRequest updateClosetImagesRequest, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f44820y = i10;
            this.f44821z = updateClosetImagesRequest;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f44820y, this.f44821z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44818w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    e.this.f44777w.a(new f.i0(this.f44820y));
                    MRRequest mRRequest = e.this.f44778x;
                    ep.c0 build = this.f44821z.build();
                    this.f44818w = 1;
                    obj = mRRequest.updateClosetImages(build, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f44777w.a(new f.t(this.f44820y, (ClosetResponse) obj));
            } catch (Throwable th2) {
                e.this.f44777w.a(new f.i(this.f44820y, this.f44821z, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$updateClosetName$1", f = "ClosetActionCreator.kt", l = {97}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44822w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f44824y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ UpdateClosetNameRequest f44825z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i10, UpdateClosetNameRequest updateClosetNameRequest, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f44824y = i10;
            this.f44825z = updateClosetNameRequest;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f44824y, this.f44825z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44822w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    e.this.f44777w.a(new f.j0(this.f44824y));
                    MRRequest mRRequest = e.this.f44778x;
                    UpdateClosetNameRequest updateClosetNameRequest = this.f44825z;
                    this.f44822w = 1;
                    obj = mRRequest.updateClosetName(updateClosetNameRequest, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f44777w.a(new f.u(this.f44824y, (ClosetResponse) obj));
            } catch (Throwable th2) {
                e.this.f44777w.a(new f.j(this.f44824y, this.f44825z, MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$updateCompanionName$1", f = "ClosetActionCreator.kt", l = {220}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f44826w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44828y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44829z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, String str2, String str3, ao.d<? super l> dVar) {
            super(2, dVar);
            this.f44828y = str;
            this.f44829z = str2;
            this.A = str3;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new l(this.f44828y, this.f44829z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44826w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    e.this.f44777w.a(f.k0.f46761a);
                    MRRequest mRRequest = e.this.f44778x;
                    String str = this.f44828y;
                    String str2 = this.f44829z;
                    String str3 = this.A;
                    this.f44826w = 1;
                    obj = mRRequest.updateCompanionName(str, str2, str3, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f44777w.a(new f.v(this.f44829z, (UpdateCompanionNameResponse) obj));
            } catch (Throwable th2) {
                e.this.f44777w.a(new f.k(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ClosetActionCreator$updatePartText$1", f = "ClosetActionCreator.kt", l = {232}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f44830w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44832y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44833z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, String str2, String str3, ao.d<? super m> dVar) {
            super(2, dVar);
            this.f44832y = str;
            this.f44833z = str2;
            this.A = str3;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m(this.f44832y, this.f44833z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44830w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    e.this.f44777w.a(f.l0.f46763a);
                    MRRequest mRRequest = e.this.f44778x;
                    String str = this.f44832y;
                    String str2 = this.f44833z;
                    String str3 = this.A;
                    this.f44830w = 1;
                    obj = mRRequest.updatePartText(str, str2, str3, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f44777w.a(new f.w(this.f44833z, (UpdatePartTextResponse) obj));
            } catch (Throwable th2) {
                e.this.f44777w.a(new f.l(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public e(q8.a aVar, MRRequest mRRequest, kf.x xVar, v0 v0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(xVar, "userPreference");
        jo.p.h(v0Var, "userHelper");
        this.f44777w = aVar;
        this.f44778x = mRRequest;
        this.f44779y = xVar;
        this.f44780z = v0Var;
        this.A = uo.r0.b();
    }

    public final void A(String str, jf.k0 k0Var) {
        jo.p.h(str, "partId");
        jo.p.h(k0Var, "partsCategory");
        this.f44777w.a(new f.r0(str, k0Var));
    }

    public final void B(jf.k0 k0Var) {
        jo.p.h(k0Var, "partsCategory");
        this.f44777w.a(new f.s0(k0Var));
    }

    public final void C(jf.m0 m0Var) {
        jo.p.h(m0Var, "partsLargeCategory");
        this.f44777w.a(new f.t0(m0Var));
    }

    public final void D(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
        jo.p.h(closetAvatarSimpleValue, "pose");
        this.f44777w.a(new f.u0(closetAvatarSimpleValue));
    }

    public final void E(PurchaseAvatarsResponse purchaseAvatarsResponse) {
        jo.p.h(purchaseAvatarsResponse, "response");
        this.f44777w.a(new f.v0(purchaseAvatarsResponse));
    }

    public final void F(int i10) {
        this.f44777w.a(new f.w0(i10));
    }

    public final void G(List<? extends jf.k0> list) {
        jo.p.h(list, "categories");
        this.f44777w.a(new f.x0(list));
    }

    public final void d() {
        this.f44777w.a(f.b.f46734a);
    }

    public final void e(String str, ep.c0 c0Var) {
        jo.p.h(str, "referer");
        jo.p.h(c0Var, TtmlNode.TAG_BODY);
        uo.l.d(this, null, null, new a(str, c0Var, null), 3, null);
    }

    public final void f() {
        this.f44777w.a(f.c.f46736a);
    }

    public final void g(String str, String str2, boolean z10) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(str2, "iconUrl");
        this.f44780z.a(str2, z10);
        this.f44777w.a(new f.y(str, str2));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A.getCoroutineContext();
    }

    public final void h(int i10) {
        uo.l.d(this, null, null, new b(i10, null), 3, null);
    }

    public final void i() {
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    public final void j() {
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    public final void k() {
        uo.l.d(this, new C0678e(uo.l0.f56050r, this), null, new f(null), 2, null);
    }

    public final void l(String str, String str2, boolean z10) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        jo.p.h(str2, "iconUrl");
        this.f44777w.a(new f.x(str, str2, z10));
    }

    public final void m(ClosetAvatar closetAvatar) {
        jo.p.h(closetAvatar, "closetAvatar");
        this.f44777w.a(new f.z(closetAvatar));
    }

    public final void n() {
        this.f44777w.a(f.a0.f46733a);
    }

    public final void o(jf.c cVar) {
        jo.p.h(cVar, "closetAvatarModel");
        this.f44777w.a(new f.b0(cVar));
    }

    public final void p(ClosetAvatar closetAvatar) {
        jo.p.h(closetAvatar, "closetAvatar");
        this.f44777w.a(new f.c0(closetAvatar));
    }

    public final void q(jf.k0 k0Var) {
        jo.p.h(k0Var, "partsCategory");
        this.f44777w.a(new f.n0(k0Var));
    }

    public final void r(boolean z10) {
        this.f44777w.a(new f.o0(z10));
    }

    public final void s(int i10, ClosetAvatar closetAvatar) {
        jo.p.h(closetAvatar, "closetAvatar");
        uo.l.d(this, null, null, new g(i10, closetAvatar, null), 3, null);
    }

    public final void t(int i10, ClosetAvatar closetAvatar, UpdateClosetImagesRequest updateClosetImagesRequest, boolean z10) {
        jo.p.h(closetAvatar, "closetAvatar");
        jo.p.h(updateClosetImagesRequest, "updateClosetImagesRequest");
        uo.l.d(this, new h(uo.l0.f56050r, this, i10, updateClosetImagesRequest), null, new i(i10, z10, updateClosetImagesRequest, closetAvatar, null), 2, null);
    }

    public final void u(UpdateClosetImagesRequest updateClosetImagesRequest) {
        jo.p.h(updateClosetImagesRequest, "updateClosetImagesRequest");
        uo.l.d(this, null, null, new j(updateClosetImagesRequest.getClosetId(), updateClosetImagesRequest, null), 3, null);
    }

    public final void v(UpdateClosetNameRequest updateClosetNameRequest) {
        jo.p.h(updateClosetNameRequest, "updateClosetNameRequest");
        uo.l.d(this, null, null, new k(updateClosetNameRequest.getClosetId(), updateClosetNameRequest, null), 3, null);
    }

    public final void w(int i10) {
        this.f44777w.a(new f.p0(i10));
    }

    public final void x(float f10, jf.k0 k0Var) {
        jo.p.h(k0Var, "partsCategory");
        this.f44777w.a(new f.q0(f10, k0Var));
    }

    public final void y(String str, String str2, String str3) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "partId");
        jo.p.h(str3, "newPartText");
        uo.l.d(this, null, null, new l(str, str2, str3, null), 3, null);
    }

    public final void z(String str, String str2, String str3) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "partId");
        jo.p.h(str3, "newPartText");
        uo.l.d(this, null, null, new m(str, str2, str3, null), 3, null);
    }
}
