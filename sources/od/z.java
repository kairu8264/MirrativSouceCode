package od;

import android.app.Application;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.LiveEndLiveParam;
import com.dena.mirrorman.net.api.response.live.LiveEndResponse;
import com.dena.mirrorman.net.api.response.user.UserMe;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.firebase.messaging.FirebaseMessaging;
import hf.a0;
import hf.v0;
import nd.f1;
import nd.i1;
import pd.i0;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class z extends androidx.lifecycle.b implements uo.q0 {
    public final MRRequest A;
    public final i1 B;
    public final v0 C;
    public final hf.r D;
    public final ef.a E;
    public final hf.d0 F;
    public final kf.x G;
    public final nf.o H;
    public final hf.a0 I;
    public final hf.m0 J;
    public uo.b0 K;
    public final ao.g L;

    /* renamed from: z  reason: collision with root package name */
    public final q8.a f45366z;

    @co.f(c = "com.dena.mirrorman.actioncreator.MainActionCreator$postLiveEnd$1", f = "MainActionCreator.kt", l = {108, 116}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45367w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45369y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f45369y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f45369y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45367w;
            try {
            } catch (Throwable th2) {
                g9.a aVar = g9.a.f32826a;
                aVar.b("liveend failed " + this.f45369y + " : " + th2.getMessage(), new Object[0]);
            }
            if (i10 == 0) {
                wn.m.b(obj);
                MRRequest mRRequest = z.this.A;
                String str = this.f45369y;
                Integer d10 = co.b.d(0);
                int i11 = z.this.J.c() ? 1 : 0;
                this.f45367w = 1;
                obj = mRRequest.postLiveEnd(Referer.Broadcast.POWERSAVE, str, d10, i11, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                z.this.C.v((UserMe) obj);
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            LiveEndResponse liveEndResponse = (LiveEndResponse) obj;
            LiveEndLiveParam live = liveEndResponse.getLive();
            if (!(live != null && z.this.G.u() == live.getCurrentLiveContinuousRecord())) {
                kf.x xVar = z.this.G;
                LiveEndLiveParam live2 = liveEndResponse.getLive();
                xVar.j2(live2 != null ? live2.getCurrentLiveContinuousRecord() : 0);
            }
            z.this.F.a();
            z.this.F.f(liveEndResponse);
            hf.a0 a0Var = z.this.I;
            this.f45367w = 2;
            obj = a0Var.a(Referer.HOME, true, this);
            if (obj == c10) {
                return c10;
            }
            z.this.C.v((UserMe) obj);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.MainActionCreator$refreshFirebaseCloudMessagingToken$1$1", f = "MainActionCreator.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45370w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f45372y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f45372y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f45372y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f45370w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = z.this.A;
                    String str = this.f45372y;
                    jo.p.g(str, "token");
                    this.f45370w = 1;
                    if (mRRequest.notificationRegisterTokenRequest(Referer.HOME, "jp.dena.mirrorman", str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                if (z.this.G.T4().length() > 0) {
                    z.this.G.m1(true);
                }
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.MainActionCreator$startLive$1", f = "MainActionCreator.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45373w;

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
            Object obj2;
            bo.c.c();
            if (this.f45373w == 0) {
                wn.m.b(obj);
                try {
                    q8.a aVar = z.this.f45366z;
                    if (z.this.C.h()) {
                        obj2 = i0.b.f46919a;
                    } else {
                        obj2 = i0.c.f46920a;
                    }
                    aVar.a(obj2);
                } catch (Throwable th2) {
                    g9.a.c(th2);
                    z.this.f45366z.a(new i0.a(MRError.Network.INSTANCE));
                }
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.MainActionCreator$updateUserMe$1", f = "MainActionCreator.kt", l = {93}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f45375w;

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
            int i10 = this.f45375w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    hf.a0 a0Var = z.this.I;
                    this.f45375w = 1;
                    obj = a0.a.a(a0Var, Referer.HOME, false, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                UserMe userMe = (UserMe) obj;
                z.this.f45366z.a(new i0.k(userMe));
                z.this.C.v(userMe);
                z.this.D.t(userMe.getCapabilities());
            } catch (Throwable th2) {
                z.this.f45366z.a(new i0.j(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Application application, q8.a aVar, MRRequest mRRequest, i1 i1Var, v0 v0Var, hf.r rVar, ef.a aVar2, hf.d0 d0Var, kf.x xVar, nf.o oVar, hf.a0 a0Var, hf.m0 m0Var) {
        super(application);
        uo.b0 b10;
        jo.p.h(application, MimeTypes.BASE_TYPE_APPLICATION);
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(i1Var, "sharedApplicationModel");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(rVar, "featureHelper");
        jo.p.h(aVar2, "tutorialManager");
        jo.p.h(d0Var, "liveHelper");
        jo.p.h(xVar, "userPreference");
        jo.p.h(oVar, "globalStore");
        jo.p.h(a0Var, "getUserMeRepository");
        jo.p.h(m0Var, "settingHelper");
        this.f45366z = aVar;
        this.A = mRRequest;
        this.B = i1Var;
        this.C = v0Var;
        this.D = rVar;
        this.E = aVar2;
        this.F = d0Var;
        this.G = xVar;
        this.H = oVar;
        this.I = a0Var;
        this.J = m0Var;
        b10 = i2.b(null, 1, null);
        this.K = b10;
        this.L = g1.b().plus(this.K);
    }

    public static final void r(z zVar, vi.g gVar) {
        jo.p.h(zVar, "this$0");
        jo.p.h(gVar, "task");
        if (gVar.s()) {
            uo.l.d(zVar, null, null, new b((String) gVar.o(), null), 3, null);
        } else {
            g9.a.g("Error! token task failed");
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.L;
    }

    public final void p(String str) {
        jo.p.h(str, "liveId");
        uo.l.d(this, null, null, new a(str, null), 3, null);
    }

    public final void q() {
        if (this.G.w2()) {
            return;
        }
        FirebaseMessaging.f().i().c(new vi.c() { // from class: od.y
            @Override // vi.c
            public final void a(vi.g gVar) {
                z.r(z.this, gVar);
            }
        });
    }

    public final void s(boolean z10, Integer num) {
        if (of.d.f45388a.c()) {
            q8.a aVar = this.f45366z;
            String string = f().getApplicationContext().getResources().getString(f1.f41975i);
            jo.p.g(string, "getApplication<Applicati…ng(R.string.error_unable)");
            aVar.a(new i0.g(string));
        } else if (jo.p.c(this.H.H().f(), Boolean.TRUE)) {
            q8.a aVar2 = this.f45366z;
            String string2 = f().getApplicationContext().getResources().getString(f1.f41991t3);
            jo.p.g(string2, "getApplication<Applicati…available_with_live_play)");
            aVar2.a(new i0.g(string2));
        } else if (!this.C.l()) {
            this.f45366z.a(new i0.e(true));
        } else {
            of.n nVar = of.n.f45411a;
            Application f10 = f();
            jo.p.g(f10, "getApplication()");
            if (nVar.m(f10)) {
                this.f45366z.a(i0.i.f46926a);
            } else if (this.B.a().f()) {
                this.f45366z.a(i0.h.f46925a);
            } else if (this.B.a().c()) {
                uo.l.d(this, null, null, new c(null), 3, null);
            } else {
                this.f45366z.a(new i0.d(z10));
                this.E.e();
            }
        }
    }

    public final void t() {
        this.f45366z.a(new i0.f(this.G.u2()));
    }

    public final void u() {
        uo.l.d(this, null, null, new d(null), 3, null);
    }
}
