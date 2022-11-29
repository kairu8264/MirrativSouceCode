package od;

import android.util.Base64;
import ce.t;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.event.DiarkisAuthInfoResponse;
import com.dena.mirrorman.net.api.response.event.ShooterEventResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMemberAvatarsResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMemberStatus;
import com.dena.mirrorman.net.api.response.event.ShooterTeamResultResponse;
import com.dena.mirrorman.net.api.response.event.ShooterTeamStatus;
import com.dena.mirrorman.net.api.response.event.ShooterUpdateMemberResponse;
import com.dena.mirrorman.net.api.response.event.ShooterUpdateTeamResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.unity.MiniGameStateType;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.nio.charset.Charset;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import pd.y0;

/* loaded from: classes2.dex */
public final class k0 implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44963w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f44964x;

    /* renamed from: y  reason: collision with root package name */
    public final kf.x f44965y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f44966z;

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterGameActionCreator$fetchDiarkisAuthInfoResponse$1", f = "ShooterGameActionCreator.kt", l = {112}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44967w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44967w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = k0.this.f44964x;
                    this.f44967w = 1;
                    obj = mRRequest.getDiarkisAuthInfo(this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                k0.this.f44963w.a(new y0.b((DiarkisAuthInfoResponse) obj));
            } catch (Throwable th2) {
                k0.this.f44963w.a(new y0.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterGameActionCreator$fetchEvent$1", f = "ShooterGameActionCreator.kt", l = {30}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44969w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44971y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f44972z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f44971y = str;
            this.f44972z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f44971y, this.f44972z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44969w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = k0.this.f44964x;
                    String str = this.f44971y;
                    int i11 = this.f44972z;
                    this.f44969w = 1;
                    obj = MRRequest.DefaultImpls.getShooterEvent$default(mRRequest, str, i11, 1, null, this, 8, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                k0.this.f44963w.a(new y0.d((ShooterEventResponse) obj));
            } catch (Throwable th2) {
                k0.this.f44963w.a(new y0.c(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterGameActionCreator$fetchGetMemberAvatars$1", f = "ShooterGameActionCreator.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public int f44973w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f44975y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f44976z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, int i11, int i12, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f44975y = i10;
            this.f44976z = i11;
            this.A = i12;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f44975y, this.f44976z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44973w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = k0.this.f44964x;
                    int i11 = this.f44975y;
                    int i12 = this.f44976z;
                    int i13 = this.A;
                    this.f44973w = 1;
                    obj = mRRequest.getShooterMemberAvatars(i11, i12, i13, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                k0.this.f44963w.a(new y0.f((ShooterMemberAvatarsResponse) obj));
            } catch (Throwable th2) {
                k0.this.f44963w.a(new y0.e(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterGameActionCreator$fetchTeamResult$1", f = "ShooterGameActionCreator.kt", l = {151}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;

        /* renamed from: w  reason: collision with root package name */
        public int f44977w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44979y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f44980z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, int i10, int i11, int i12, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f44979y = str;
            this.f44980z = i10;
            this.A = i11;
            this.B = i12;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f44979y, this.f44980z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44977w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = k0.this.f44964x;
                    String str = this.f44979y;
                    int i11 = this.f44980z;
                    int i12 = this.A;
                    int i13 = this.B;
                    this.f44977w = 1;
                    obj = mRRequest.getShooterTeamResult(str, i11, i12, i13, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                k0.this.f44963w.a(new y0.g((ShooterTeamResultResponse) obj));
            } catch (Throwable unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterGameActionCreator$postComment$1", f = "ShooterGameActionCreator.kt", l = {171}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ String B;

        /* renamed from: w  reason: collision with root package name */
        public int f44981w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44983y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44984z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, int i10, String str3, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f44983y = str;
            this.f44984z = str2;
            this.A = i10;
            this.B = str3;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f44983y, this.f44984z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            e eVar;
            Object c10 = bo.c.c();
            int i10 = this.f44981w;
            if (i10 == 0) {
                wn.m.b(obj);
                try {
                    MRRequest mRRequest = k0.this.f44964x;
                    String str = this.f44983y;
                    String str2 = this.f44984z;
                    int i11 = this.A;
                    String str3 = this.B;
                    this.f44981w = 1;
                    if (MRRequest.DefaultImpls.postLiveComment$default(mRRequest, str, str2, i11, str3, null, null, null, null, null, null, null, this, 2032, null) == c10) {
                        return c10;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    eVar = this;
                    k0.this.f44963w.a(new y0.h(MRErrorKt.convertMRException(th).getError()));
                    return wn.v.f59242a;
                }
            } else if (i10 == 1) {
                try {
                    wn.m.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    eVar = this;
                    k0.this.f44963w.a(new y0.h(MRErrorKt.convertMRException(th).getError()));
                    return wn.v.f59242a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterGameActionCreator$updateMemberStatus$1", f = "ShooterGameActionCreator.kt", l = {86}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ Integer A;
        public final /* synthetic */ Integer B;
        public final /* synthetic */ Integer C;
        public final /* synthetic */ Integer D;
        public final /* synthetic */ k0 E;
        public final /* synthetic */ ShooterMemberStatus F;
        public final /* synthetic */ int G;
        public final /* synthetic */ int H;
        public final /* synthetic */ int I;

        /* renamed from: w  reason: collision with root package name */
        public int f44985w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Integer f44986x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Integer f44987y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Integer f44988z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, k0 k0Var, ShooterMemberStatus shooterMemberStatus, int i10, int i11, int i12, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f44986x = num;
            this.f44987y = num2;
            this.f44988z = num3;
            this.A = num4;
            this.B = num5;
            this.C = num6;
            this.D = num7;
            this.E = k0Var;
            this.F = shooterMemberStatus;
            this.G = i10;
            this.H = i11;
            this.I = i12;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f44986x, this.f44987y, this.f44988z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            f fVar;
            Object updateShooterMemberStatus;
            Object c10 = bo.c.c();
            int i10 = this.f44985w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    Mac mac = Mac.getInstance("HmacSHA256");
                    String str = "shooter:" + this.G + ':' + this.I + ':' + this.H + ':' + currentTimeMillis;
                    Charset charset = so.c.f52772b;
                    byte[] bytes = str.getBytes(charset);
                    jo.p.g(bytes, "this as java.lang.String).getBytes(charset)");
                    mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
                    StringBuilder sb2 = new StringBuilder();
                    Integer num = this.f44986x;
                    sb2.append(num != null ? num.intValue() : 0);
                    sb2.append(':');
                    Integer num2 = this.f44987y;
                    sb2.append(num2 != null ? num2.intValue() : 0);
                    sb2.append(':');
                    Integer num3 = this.f44988z;
                    sb2.append(num3 != null ? num3.intValue() : 0);
                    sb2.append(':');
                    Integer num4 = this.A;
                    sb2.append(num4 != null ? num4.intValue() : 0);
                    sb2.append(':');
                    Integer num5 = this.B;
                    sb2.append(num5 != null ? num5.intValue() : 0);
                    sb2.append(':');
                    Integer num6 = this.C;
                    sb2.append(num6 != null ? num6.intValue() : 0);
                    sb2.append(':');
                    Integer num7 = this.D;
                    sb2.append(num7 != null ? num7.intValue() : 0);
                    byte[] bytes2 = sb2.toString().getBytes(charset);
                    jo.p.g(bytes2, "this as java.lang.String).getBytes(charset)");
                    String encodeToString = Base64.encodeToString(mac.doFinal(bytes2), 3);
                    MRRequest mRRequest = this.E.f44964x;
                    String T4 = this.E.f44965y.T4();
                    int rawValue = this.F.getRawValue();
                    int i11 = this.G;
                    int i12 = this.H;
                    Integer d10 = co.b.d(currentTimeMillis);
                    Integer d11 = co.b.d(this.I);
                    Integer num8 = this.f44986x;
                    Integer num9 = this.f44987y;
                    Integer num10 = this.f44988z;
                    Integer num11 = this.C;
                    Integer num12 = this.D;
                    Integer num13 = this.A;
                    Integer num14 = this.B;
                    this.f44985w = 1;
                    try {
                        updateShooterMemberStatus = mRRequest.updateShooterMemberStatus(i11, i12, T4, rawValue, d10, encodeToString, d11, num8, num9, num10, num11, num12, num13, num14, this);
                        if (updateShooterMemberStatus == c10) {
                            return c10;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fVar = this;
                        fVar.E.f44963w.a(new y0.k(MRErrorKt.convertMRException(th).getError()));
                        return wn.v.f59242a;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    updateShooterMemberStatus = obj;
                }
                fVar = this;
                try {
                    fVar.E.f44963w.a(new y0.l((ShooterUpdateMemberResponse) updateShooterMemberStatus));
                } catch (Throwable th3) {
                    th = th3;
                    fVar.E.f44963w.a(new y0.k(MRErrorKt.convertMRException(th).getError()));
                    return wn.v.f59242a;
                }
            } catch (Throwable th4) {
                th = th4;
                fVar = this;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.ShooterGameActionCreator$updateTeamStatus$1", f = "ShooterGameActionCreator.kt", l = {TsExtractor.TS_STREAM_TYPE_AC3}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ ShooterTeamStatus A;
        public final /* synthetic */ int B;
        public final /* synthetic */ String C;

        /* renamed from: w  reason: collision with root package name */
        public int f44989w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f44991y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f44992z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, int i11, ShooterTeamStatus shooterTeamStatus, int i12, String str, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f44991y = i10;
            this.f44992z = i11;
            this.A = shooterTeamStatus;
            this.B = i12;
            this.C = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f44991y, this.f44992z, this.A, this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44989w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = k0.this.f44964x;
                    int i11 = this.f44991y;
                    int i12 = this.f44992z;
                    int rawValue = this.A.getRawValue();
                    Integer d10 = co.b.d(this.B);
                    String str = this.C;
                    this.f44989w = 1;
                    obj = mRRequest.updateShooterTeamStatus(i11, i12, rawValue, d10, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                k0.this.f44963w.a(new y0.n((ShooterUpdateTeamResponse) obj));
            } catch (Throwable th2) {
                k0.this.f44963w.a(new y0.m(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public k0(q8.a aVar, MRRequest mRRequest, kf.x xVar) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(xVar, "userPreference");
        this.f44963w = aVar;
        this.f44964x = mRRequest;
        this.f44965y = xVar;
        this.f44966z = uo.r0.b();
    }

    public final void d() {
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    public final void e(String str, int i10) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new b(str, i10, null), 3, null);
    }

    public final void f(int i10, int i11, int i12) {
        uo.l.d(this, null, null, new c(i10, i11, i12, null), 3, null);
    }

    public final void g(String str, int i10, int i11, int i12) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new d(str, i10, i11, i12, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44966z.getCoroutineContext();
    }

    public final void h() {
        this.f44963w.a(t.j.f19481a);
    }

    public final void i(String str) {
        jo.p.h(str, "roomId");
        this.f44963w.a(new y0.i(str));
    }

    public final void j(String str, String str2, int i10, String str3) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        jo.p.h(str3, "comment");
        uo.l.d(this, null, null, new e(str, str2, i10, str3, null), 3, null);
    }

    public final void k() {
        this.f44963w.a(t.k.f19482a);
    }

    public final void l(MiniGameStateType miniGameStateType) {
        jo.p.h(miniGameStateType, "gameState");
        this.f44963w.a(new y0.j(miniGameStateType));
    }

    public final void m(int i10, int i11, int i12, ShooterMemberStatus shooterMemberStatus, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        jo.p.h(shooterMemberStatus, "memberStatus");
        uo.l.d(this, null, null, new f(num, num2, num3, num6, num7, num4, num5, this, shooterMemberStatus, i10, i12, i11, null), 3, null);
    }

    public final void o(int i10, int i11, int i12, String str, ShooterTeamStatus shooterTeamStatus) {
        jo.p.h(str, "roomId");
        jo.p.h(shooterTeamStatus, "teamStatus");
        uo.l.d(this, null, null, new g(i10, i12, shooterTeamStatus, i11, str, null), 3, null);
    }
}
