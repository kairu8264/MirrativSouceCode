package rc;

import androidx.appcompat.widget.ActivityChooserModel;
import androidx.fragment.app.FragmentManager;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.BroadcastSettings;
import com.dena.mirrorman.net.api.response.live.LiveAnnouncementResponse;
import com.dena.mirrorman.net.api.response.user.UserMe;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import hf.a0;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import pd.y;
import uo.b3;
import uo.l0;

/* loaded from: classes2.dex */
public final class t extends androidx.lifecycle.q0 implements uo.q0 {
    public final kf.t A;
    public final hf.v0 B;
    public final hf.o0 C;
    public final hf.a0 D;
    public final /* synthetic */ da.j E;
    public final ao.g F;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f50983y;

    /* renamed from: z  reason: collision with root package name */
    public final MRRequest f50984z;

    /* loaded from: classes2.dex */
    public static final class a extends RuntimeException {

        /* renamed from: w  reason: collision with root package name */
        public final pd.y f50985w;

        public final pd.y a() {
            return this.f50985w;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends ao.a implements uo.l0 {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ t f50986w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.a aVar, t tVar) {
            super(aVar);
            this.f50986w = tVar;
        }

        @Override // uo.l0
        public void handleException(ao.g gVar, Throwable th2) {
            this.f50986w.q(th2, new y.a(MRError.Network.INSTANCE));
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.LiveAnnouncementActionCreator$getUserMeAndBroadcastSetting$2", f = "LiveAnnouncementActionCreator.kt", l = {52, 53}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50987w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f50988x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f50990z;

        @co.f(c = "com.dena.mirrativ.user.mypage.LiveAnnouncementActionCreator$getUserMeAndBroadcastSetting$2$getBroadcastSettingJob$1", f = "LiveAnnouncementActionCreator.kt", l = {50}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super BroadcastSettings>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f50991w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ t f50992x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f50993y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t tVar, String str, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f50992x = tVar;
                this.f50993y = str;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f50992x, this.f50993y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super BroadcastSettings> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f50991w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = this.f50992x.f50984z;
                    String str = this.f50993y;
                    this.f50991w = 1;
                    obj = mRRequest.getUserBroadcastSettings(str, this);
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

        @co.f(c = "com.dena.mirrativ.user.mypage.LiveAnnouncementActionCreator$getUserMeAndBroadcastSetting$2$userMeJob$1", f = "LiveAnnouncementActionCreator.kt", l = {49}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends co.l implements io.p<uo.q0, ao.d<? super UserMe>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f50994w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ t f50995x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f50996y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t tVar, String str, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f50995x = tVar;
                this.f50996y = str;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f50995x, this.f50996y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super UserMe> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f50994w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    hf.a0 a0Var = this.f50995x.D;
                    String str = this.f50996y;
                    this.f50994w = 1;
                    obj = a0.a.a(a0Var, str, false, this, 2, null);
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
        public c(String str, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f50990z = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(this.f50990z, dVar);
            cVar.f50988x = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[Catch: all -> 0x00dd, TryCatch #0 {all -> 0x00dd, blocks: (B:7:0x0013, B:23:0x006f, B:27:0x0081, B:31:0x0092, B:33:0x00a9, B:34:0x00b1, B:36:0x00d1, B:38:0x00d7, B:12:0x0023, B:19:0x0060, B:15:0x0030), top: B:44:0x0009 }] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: rc.t.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.LiveAnnouncementActionCreator$postBroadcastSetting$1", f = "LiveAnnouncementActionCreator.kt", l = {99}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50997w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f50998x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ t f50999y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f51000z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, t tVar, String str, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f50998x = z10;
            this.f50999y = tVar;
            this.f51000z = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f50998x, this.f50999y, this.f51000z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50997w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    int i11 = this.f50998x ? 1 : 0;
                    MRRequest mRRequest = this.f50999y.f50984z;
                    String str = this.f51000z;
                    Integer d10 = co.b.d(i11);
                    this.f50997w = 1;
                    obj = mRRequest.postUserBroadcastSettings(str, null, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.f50999y.A.z0(this.f50998x);
                this.f50999y.f50983y.a(new y.f((BroadcastSettings) obj));
            } catch (Throwable th2) {
                this.f50999y.q(th2, new y.b(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.LiveAnnouncementActionCreator$postNextAnnounce$1", f = "LiveAnnouncementActionCreator.kt", l = {86, 88}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ String A;
        public final /* synthetic */ String B;
        public final /* synthetic */ String C;

        /* renamed from: w  reason: collision with root package name */
        public int f51001w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f51003y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ boolean f51004z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, boolean z10, String str, String str2, String str3, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f51003y = i10;
            this.f51004z = z10;
            this.A = str;
            this.B = str2;
            this.C = str3;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f51003y, this.f51004z, this.A, this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f51001w;
            try {
            } catch (Throwable th2) {
                t.this.f50983y.a(new y.c(MRErrorKt.convertMRException(th2).getError()));
            }
            if (i10 == 0) {
                wn.m.b(obj);
                t.this.f50983y.a(y.i.f47341a);
                int i11 = this.f51003y;
                Integer d10 = i11 == 0 ? null : co.b.d(i11);
                int i12 = this.f51004z ? 1 : 0;
                MRRequest mRRequest = t.this.f50984z;
                String str = this.A;
                String str2 = this.B;
                String str3 = this.C;
                this.f51001w = 1;
                obj = mRRequest.postUserPostLiveAnnouncement(str, str2, d10, i12, str3, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            t.this.f50983y.a(new y.g(((LiveAnnouncementResponse) obj).getLiveAnnouncement()));
            hf.a0 a0Var = t.this.D;
            String str4 = this.A;
            this.f51001w = 2;
            if (a0Var.a(str4, true, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.LiveAnnouncementActionCreator$switchTwitterAutoPostEnabled$1", f = "LiveAnnouncementActionCreator.kt", l = {142, 151}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ androidx.fragment.app.h A;
        public final /* synthetic */ FragmentManager B;

        /* renamed from: w  reason: collision with root package name */
        public int f51005w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f51007y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f51008z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z10, String str, androidx.fragment.app.h hVar, FragmentManager fragmentManager, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f51007y = z10;
            this.f51008z = str;
            this.A = hVar;
            this.B = fragmentManager;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f51007y, this.f51008z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r7.f51005w
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r2) goto L14
                wn.m.b(r8)
                goto L95
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                wn.m.b(r8)
                goto L64
            L20:
                wn.m.b(r8)
                rc.t r8 = rc.t.this
                q8.a r8 = rc.t.g(r8)
                pd.y$j r1 = pd.y.j.f47342a
                r8.a(r1)
                rc.t r8 = rc.t.this
                hf.v0 r8 = rc.t.l(r8)
                boolean r8 = r8.p()
                if (r8 == 0) goto L4b
                rc.t r8 = rc.t.this
                boolean r1 = r7.f51007y
                rc.t.o(r8, r1)
                rc.t r8 = rc.t.this
                java.lang.String r1 = r7.f51008z
                boolean r3 = r7.f51007y
                rc.t.m(r8, r1, r3)
                goto L8a
            L4b:
                boolean r8 = r7.f51007y
                if (r8 == 0) goto L7e
                rc.t r8 = rc.t.this
                hf.o0 r8 = rc.t.k(r8)
                androidx.fragment.app.h r1 = r7.A
                androidx.fragment.app.FragmentManager r5 = r7.B
                java.lang.String r6 = r7.f51008z
                r7.f51005w = r4
                java.lang.Object r8 = r8.j(r1, r5, r6, r7)
                if (r8 != r0) goto L64
                return r0
            L64:
                wn.p r8 = (wn.p) r8
                java.lang.Object r8 = r8.a()
                hf.o0$b r8 = (hf.o0.b) r8
                hf.o0$b r1 = hf.o0.b.Success
                if (r8 != r1) goto L71
                r3 = r4
            L71:
                rc.t r8 = rc.t.this
                java.lang.String r1 = r7.f51008z
                rc.t.m(r8, r1, r3)
                rc.t r8 = rc.t.this
                rc.t.o(r8, r3)
                goto L8a
            L7e:
                rc.t r8 = rc.t.this
                rc.t.o(r8, r3)
                rc.t r8 = rc.t.this
                java.lang.String r1 = r7.f51008z
                rc.t.m(r8, r1, r3)
            L8a:
                r3 = 1000(0x3e8, double:4.94E-321)
                r7.f51005w = r2
                java.lang.Object r8 = uo.b1.a(r3, r7)
                if (r8 != r0) goto L95
                return r0
            L95:
                rc.t r8 = rc.t.this
                q8.a r8 = rc.t.g(r8)
                pd.y$d r0 = pd.y.d.f47335a
                r8.a(r0)
                wn.v r8 = wn.v.f59242a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: rc.t.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public t(q8.a aVar, MRRequest mRRequest, kf.t tVar, hf.v0 v0Var, hf.o0 o0Var, hf.a0 a0Var) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(tVar, "settingPreference");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(o0Var, "twitterHelper");
        jo.p.h(a0Var, "getUserMeRepository");
        this.f50983y = aVar;
        this.f50984z = mRRequest;
        this.A = tVar;
        this.B = v0Var;
        this.C = o0Var;
        this.D = a0Var;
        this.E = new da.j();
        this.F = uo.g1.b().plus(b3.b(null, 1, null));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.F;
    }

    public final void p(jf.w wVar) {
        this.f50983y.a(new y.k(wVar));
    }

    public final void q(Throwable th2, pd.y yVar) {
        if (th2 instanceof IOException) {
            this.f50983y.a(yVar);
        } else if (th2 instanceof a) {
            this.f50983y.a(((a) th2).a());
        } else {
            g9.a.c(th2);
            this.f50983y.a(yVar);
        }
    }

    public final void r(String str) {
        jo.p.h(str, "referer");
        this.f50983y.a(y.h.f47340a);
        uo.l.d(this, new b(uo.l0.f56050r, this), null, new c(str, null), 2, null);
    }

    public final void s(String str, boolean z10) {
        uo.l.d(this, null, null, new d(z10, this, str, null), 3, null);
    }

    public final void t(String str, String str2, int i10, boolean z10, String str3) {
        jo.p.h(str, "referer");
        if ((str2 == null || str2.length() == 0) && i10 == 0) {
            return;
        }
        uo.l.d(this, null, null, new e(i10, z10, str, str2 == null ? "" : str2, str3, null), 3, null);
    }

    public final void u() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"), Locale.JAPAN);
        calendar.clear(13);
        calendar.clear(14);
        calendar.add(12, 15);
        x((int) (calendar.getTimeInMillis() / 1000));
    }

    public final void v(boolean z10, androidx.fragment.app.h hVar, FragmentManager fragmentManager, String str) {
        jo.p.h(hVar, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        jo.p.h(fragmentManager, "fragmentManager");
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new f(z10, str, hVar, fragmentManager, null), 3, null);
    }

    public final void w(String str) {
        jo.p.h(str, TtmlNode.TAG_BODY);
        this.f50983y.a(new y.l(str));
    }

    public final void x(int i10) {
        this.f50983y.a(new y.m(i10));
    }

    public final void y(boolean z10) {
        this.f50983y.a(new y.n(z10));
    }
}
