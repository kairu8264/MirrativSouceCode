package ba;

import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarResponse;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.emomo.EmomoApi;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunEventResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunOpenGiftGachaResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunScoreResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.unity.MiniGameStateType;
import pd.k;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.k0;

/* loaded from: classes.dex */
public final class a extends q0 implements uo.q0 {
    public static final C0104a C = new C0104a(null);
    public static final int D = 8;
    public final EmomoApi A;
    public final ao.g B;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f17103y;

    /* renamed from: z  reason: collision with root package name */
    public final MRRequest f17104z;

    /* renamed from: ba.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0104a {
        public C0104a() {
        }

        public /* synthetic */ C0104a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActionCreator$fetchEmomoRunEvent$1", f = "EmomoRunActionCreator.kt", l = {28}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17105w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17107y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f17108z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f17107y = str;
            this.f17108z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f17107y, this.f17108z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17105w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = a.this.A;
                    String str = this.f17107y;
                    int i11 = this.f17108z;
                    this.f17105w = 1;
                    obj = emomoApi.getEmomoRunEvent(str, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f17103y.a(new k.g((EmomoRunEventResponse) obj));
            } catch (Throwable th2) {
                a.this.f17103y.a(new k.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActionCreator$fetchOpenGiftGacha$1", f = "EmomoRunActionCreator.kt", l = {187}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17109w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17111y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f17112z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i10, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f17111y = str;
            this.f17112z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f17111y, this.f17112z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17109w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = a.this.A;
                    String str = this.f17111y;
                    int i11 = this.f17112z;
                    this.f17109w = 1;
                    obj = emomoApi.postEmomoRunOpenGiftGacha(str, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f17103y.a(new k.e((EmomoRunOpenGiftGachaResponse) obj));
            } catch (Throwable th2) {
                a.this.f17103y.a(new k.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActionCreator$gameEnd$1", f = "EmomoRunActionCreator.kt", l = {139}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ float C;
        public final /* synthetic */ float D;
        public final /* synthetic */ float E;
        public final /* synthetic */ int F;
        public final /* synthetic */ long G;
        public final /* synthetic */ String H;

        /* renamed from: w  reason: collision with root package name */
        public int f17113w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17115y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f17116z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, int i10, int i11, int i12, float f10, float f11, float f12, int i13, long j10, String str2, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f17115y = str;
            this.f17116z = i10;
            this.A = i11;
            this.B = i12;
            this.C = f10;
            this.D = f11;
            this.E = f12;
            this.F = i13;
            this.G = j10;
            this.H = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f17115y, this.f17116z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object postEmomoRunGameEnd;
            Object c10 = bo.c.c();
            int i10 = this.f17113w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = a.this.A;
                    String str = this.f17115y;
                    int i11 = this.f17116z;
                    int i12 = this.A;
                    int i13 = this.B;
                    float f10 = this.C;
                    float f11 = this.D;
                    float f12 = this.E;
                    int i14 = this.F;
                    long j10 = this.G;
                    String str2 = this.H;
                    this.f17113w = 1;
                    postEmomoRunGameEnd = emomoApi.postEmomoRunGameEnd(str, i11, i12, i13, f10, f11, f12, i14, j10, str2, this);
                    if (postEmomoRunGameEnd == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    postEmomoRunGameEnd = obj;
                }
                a.this.f17103y.a(new k.C0718k((EmomoRunGameResponse) postEmomoRunGameEnd));
            } catch (Throwable th2) {
                a.this.f17103y.a(new k.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActionCreator$gameGiftConsume$1", f = "EmomoRunActionCreator.kt", l = {165}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public int f17117w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17119y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f17120z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, int i10, int i11, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f17119y = str;
            this.f17120z = i10;
            this.A = i11;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f17119y, this.f17120z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17117w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = a.this.A;
                    String str = this.f17119y;
                    int i11 = this.f17120z;
                    int i12 = this.A;
                    this.f17117w = 1;
                    if (emomoApi.postEmomoRunGameGiftConsume(str, i11, i12, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f17103y.a(new k.b(this.A));
            } catch (Throwable th2) {
                a.this.f17103y.a(new k.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActionCreator$gameHeartbeat$1", f = "EmomoRunActionCreator.kt", l = {106}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ float C;
        public final /* synthetic */ float D;
        public final /* synthetic */ float E;
        public final /* synthetic */ int F;
        public final /* synthetic */ long G;
        public final /* synthetic */ String H;

        /* renamed from: w  reason: collision with root package name */
        public int f17121w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17123y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f17124z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, int i10, int i11, int i12, float f10, float f11, float f12, int i13, long j10, String str2, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f17123y = str;
            this.f17124z = i10;
            this.A = i11;
            this.B = i12;
            this.C = f10;
            this.D = f11;
            this.E = f12;
            this.F = i13;
            this.G = j10;
            this.H = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f17123y, this.f17124z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object postEmomoRunGameHeartbeat;
            Object c10 = bo.c.c();
            int i10 = this.f17121w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = a.this.A;
                    String str = this.f17123y;
                    int i11 = this.f17124z;
                    int i12 = this.A;
                    int i13 = this.B;
                    float f10 = this.C;
                    float f11 = this.D;
                    float f12 = this.E;
                    int i14 = this.F;
                    long j10 = this.G;
                    String str2 = this.H;
                    this.f17121w = 1;
                    postEmomoRunGameHeartbeat = emomoApi.postEmomoRunGameHeartbeat(str, i11, i12, i13, f10, f11, f12, i14, j10, str2, this);
                    if (postEmomoRunGameHeartbeat == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                    postEmomoRunGameHeartbeat = obj;
                }
                a.this.f17103y.a(new k.C0718k((EmomoRunGameResponse) postEmomoRunGameHeartbeat));
            } catch (Throwable th2) {
                a.this.f17103y.a(new k.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActionCreator$gameStart$1", f = "EmomoRunActionCreator.kt", l = {84}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ long A;

        /* renamed from: w  reason: collision with root package name */
        public int f17125w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17127y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f17128z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, int i10, long j10, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f17127y = str;
            this.f17128z = i10;
            this.A = j10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f17127y, this.f17128z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17125w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = a.this.A;
                    String str = this.f17127y;
                    int i11 = this.f17128z;
                    long j10 = this.A;
                    this.f17125w = 1;
                    obj = emomoApi.postEmomoRunGameStart(str, i11, j10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f17103y.a(new k.C0718k((EmomoRunGameResponse) obj));
            } catch (Throwable th2) {
                a.this.f17103y.a(new k.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActionCreator$getScore$1", f = "EmomoRunActionCreator.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17129w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17131y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f17132z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, int i10, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f17131y = str;
            this.f17132z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f17131y, this.f17132z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17129w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = a.this.A;
                    String str = this.f17131y;
                    int i11 = this.f17132z;
                    Integer d10 = co.b.d(1);
                    this.f17129w = 1;
                    obj = emomoApi.getEmomoRunScore(str, i11, d10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f17103y.a(new k.h((EmomoRunScoreResponse) obj));
            } catch (Throwable th2) {
                a.this.f17103y.a(new k.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActionCreator$loadAvatar$1", f = "EmomoRunActionCreator.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17133w;

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17133w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f17104z;
                    this.f17133w = 1;
                    obj = MRRequest.DefaultImpls.requestClosetAvatar$default(mRRequest, null, null, this, 3, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                jf.c a10 = jf.c.f37906y.a(((ClosetAvatarResponse) obj).getAvatar().clone());
                a10.g("EMOMO_RUN_AVATAR");
                a.this.f17103y.a(new k.f(a10));
            } catch (Throwable th2) {
                a.this.f17103y.a(new k.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActionCreator$requestSendLotteryBot$1", f = "EmomoRunActionCreator.kt", l = {176}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class j extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public int f17135w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17137y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f17138z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, int i10, int i11, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f17137y = str;
            this.f17138z = i10;
            this.A = i11;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f17137y, this.f17138z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17135w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = a.this.A;
                    String str = this.f17137y;
                    int i11 = this.f17138z;
                    int i12 = this.A;
                    this.f17135w = 1;
                    if (emomoApi.postEmomoRunSendLotteryBot(str, i11, i12, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Throwable th2) {
                a.this.f17103y.a(new k.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.emomo.run.EmomoRunActionCreator$updateState$1", f = "EmomoRunActionCreator.kt", l = {70}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class k extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ boolean A;

        /* renamed from: w  reason: collision with root package name */
        public int f17139w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f17141y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f17142z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, int i10, boolean z10, ao.d<? super k> dVar) {
            super(2, dVar);
            this.f17141y = str;
            this.f17142z = i10;
            this.A = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new k(this.f17141y, this.f17142z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((k) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17139w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    EmomoApi emomoApi = a.this.A;
                    String str = this.f17141y;
                    int i11 = this.f17142z;
                    int i12 = this.A ? 1 : 0;
                    this.f17139w = 1;
                    if (emomoApi.postEmomoRunGameState(str, i11, i12, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
            } catch (Throwable th2) {
                a.this.f17103y.a(new k.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public a(q8.a aVar, MRRequest mRRequest, EmomoApi emomoApi) {
        b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(emomoApi, "emomoApi");
        this.f17103y = aVar;
        this.f17104z = mRRequest;
        this.A = emomoApi;
        k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.B = b11.plus(b10);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.B;
    }

    public final void i(boolean z10) {
        this.f17103y.a(new k.j(z10));
    }

    public final void j(String str, int i10) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new b(str, i10, null), 3, null);
    }

    public final void k(String str, int i10) {
        jo.p.h(str, "referer");
        this.f17103y.a(k.c.f47038a);
        uo.l.d(this, null, null, new c(str, i10, null), 3, null);
    }

    public final void l(String str, int i10, int i11, int i12, float f10, float f11, float f12, int i13, long j10, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "hash");
        uo.l.d(this, null, null, new d(str, i10, i11, i12, f10, f11, f12, i13, j10, str2, null), 3, null);
    }

    public final void m(String str, int i10, int i11) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new e(str, i10, i11, null), 3, null);
    }

    public final void n(String str, int i10, int i11, int i12, float f10, float f11, float f12, int i13, long j10, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "hash");
        uo.l.d(this, null, null, new f(str, i10, i11, i12, f10, f11, f12, i13, j10, str2, null), 3, null);
    }

    public final void o(String str, int i10, long j10) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new g(str, i10, j10, null), 3, null);
    }

    public final void p(String str, int i10) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new h(str, i10, null), 3, null);
    }

    public final void q() {
        uo.l.d(this, null, null, new i(null), 3, null);
    }

    public final void r() {
        this.f17103y.a(k.i.f47044a);
    }

    public final void s(String str, int i10, int i11) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new j(str, i10, i11, null), 3, null);
    }

    public final void t(MiniGameStateType miniGameStateType) {
        jo.p.h(miniGameStateType, "state");
        this.f17103y.a(new k.l(miniGameStateType));
    }

    public final void u(String str, int i10, boolean z10) {
        jo.p.h(str, "referer");
        uo.l.d(this, null, null, new k(str, i10, z10, null), 3, null);
    }
}
