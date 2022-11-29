package lc;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.FavoriteLiveSettingResponse;
import com.dena.mirrorman.net.api.response.FavoriteLiveSettingsResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import lc.f;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class e implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f39847w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f39848x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ q0 f39849y;

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.FavoriteLiveSettingsActionCreator$reload$1", f = "FavoriteLiveSettingsActionCreator.kt", l = {18}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f39850w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f39852y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f39852y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f39852y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f39850w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = e.this.f39848x;
                    String str = this.f39852y;
                    this.f39850w = 1;
                    obj = mRRequest.getFavoriteLiveSettings(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f39847w.a(new f.b(((FavoriteLiveSettingsResponse) obj).getSettings()));
            } catch (Throwable th2) {
                e.this.f39847w.a(new f.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.liveprepare.mainsettings.FavoriteLiveSettingsActionCreator$updateFavoriteLiveSettings$1", f = "FavoriteLiveSettingsActionCreator.kt", l = {37}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;
        public final /* synthetic */ String D;

        /* renamed from: w  reason: collision with root package name */
        public int f39853w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f39855y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f39856z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i10, String str2, String str3, String str4, String str5, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f39855y = str;
            this.f39856z = i10;
            this.A = str2;
            this.B = str3;
            this.C = str4;
            this.D = str5;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f39855y, this.f39856z, this.A, this.B, this.C, this.D, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f39853w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = e.this.f39848x;
                    String str = this.f39855y;
                    int i11 = this.f39856z;
                    String str2 = this.A;
                    String str3 = this.B;
                    String str4 = this.C;
                    String str5 = this.D;
                    this.f39853w = 1;
                    obj = mRRequest.postUpdateFavoriteLiveSetting(str, i11, str2, str3, str4, str5, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                e.this.f39847w.a(new f.e(((FavoriteLiveSettingResponse) obj).getSetting()));
            } catch (Throwable th2) {
                e.this.f39847w.a(new f.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public e(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f39847w = aVar;
        this.f39848x = mRRequest;
        this.f39849y = r0.b();
    }

    public final void c(String str) {
        jo.p.h(str, "referer");
        this.f39847w.a(f.c.f39860a);
        uo.l.d(this, null, null, new a(str, null), 3, null);
    }

    public final void d(String str, int i10, String str2, String str3, String str4, String str5) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "title");
        jo.p.h(str3, "memo");
        jo.p.h(str4, "appId");
        jo.p.h(str5, "thumbnailImageUrl");
        this.f39847w.a(f.C0574f.f39864a);
        uo.l.d(this, null, null, new b(str, i10, str2, str4, str3, str5, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f39849y.getCoroutineContext();
    }
}
