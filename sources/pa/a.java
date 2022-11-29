package pa;

import ao.d;
import ao.g;
import co.f;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.live.LiveDetailResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import io.p;
import pa.b;
import uo.b0;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;

/* loaded from: classes.dex */
public final class a implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f46318w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f46319x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f46320y;

    /* renamed from: z  reason: collision with root package name */
    public d2 f46321z;

    @f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewActionCreator$endGame$1", f = "LiveGameWebViewActionCreator.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: pa.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0702a extends l implements p<q0, d<? super v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f46322w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f46324y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f46325z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0702a(String str, String str2, String str3, d<? super C0702a> dVar) {
            super(2, dVar);
            this.f46324y = str;
            this.f46325z = str2;
            this.A = str3;
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new C0702a(this.f46324y, this.f46325z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((C0702a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f46322w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest mRRequest = a.this.f46319x;
                    String str = this.f46324y;
                    String str2 = this.f46325z;
                    String str3 = this.A;
                    this.f46322w = 1;
                    if (mRRequest.postLiveGameEnd(str, str2, str3, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
            } catch (Throwable th2) {
                g9.a.c(th2);
            }
            return v.f59242a;
        }
    }

    @f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewActionCreator$fetchLiveDetail$1", f = "LiveGameWebViewActionCreator.kt", l = {24}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<q0, d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f46326w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f46328y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f46329z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, d<? super b> dVar) {
            super(2, dVar);
            this.f46328y = str;
            this.f46329z = str2;
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new b(this.f46328y, this.f46329z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f46326w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest mRRequest = a.this.f46319x;
                    String str = this.f46328y;
                    String str2 = this.f46329z;
                    this.f46326w = 1;
                    obj = mRRequest.getLiveDetail(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                a.this.f46318w.a(new b.c((LiveDetailResponse) obj));
            } catch (Throwable th2) {
                a.this.f46318w.a(new b.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return v.f59242a;
        }
    }

    @f(c = "com.dena.mirrativ.livegame.webview.LiveGameWebViewActionCreator$startPing$1", f = "LiveGameWebViewActionCreator.kt", l = {37, 38}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends l implements p<q0, d<? super v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f46330w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f46332y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f46333z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, d<? super c> dVar) {
            super(2, dVar);
            this.f46332y = str;
            this.f46333z = str2;
            this.A = str3;
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new c(this.f46332y, this.f46333z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0032 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000e, B:23:0x004c, B:25:0x0054, B:16:0x002a, B:19:0x0033, B:10:0x001c), top: B:29:0x0008 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0048 -> B:23:0x004c). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f46330w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L21
                r1 = r0
                r0 = r8
                goto L4c
            L14:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L21
                r9 = r8
                goto L33
            L21:
                r9 = move-exception
                goto L62
            L23:
                wn.m.b(r9)
                r9 = r8
            L27:
                r4 = 60000(0xea60, double:2.9644E-319)
                r9.f46330w = r3     // Catch: java.lang.Throwable -> L21
                java.lang.Object r1 = uo.b1.a(r4, r9)     // Catch: java.lang.Throwable -> L21
                if (r1 != r0) goto L33
                return r0
            L33:
                pa.a r1 = pa.a.this     // Catch: java.lang.Throwable -> L21
                com.dena.mirrorman.net.retrofit.MRRequest r1 = pa.a.b(r1)     // Catch: java.lang.Throwable -> L21
                java.lang.String r4 = r9.f46332y     // Catch: java.lang.Throwable -> L21
                java.lang.String r5 = r9.f46333z     // Catch: java.lang.Throwable -> L21
                java.lang.String r6 = r9.A     // Catch: java.lang.Throwable -> L21
                r9.f46330w = r2     // Catch: java.lang.Throwable -> L21
                java.lang.Object r1 = r1.postLiveGamePing(r4, r5, r6, r9)     // Catch: java.lang.Throwable -> L21
                if (r1 != r0) goto L48
                return r0
            L48:
                r7 = r0
                r0 = r9
                r9 = r1
                r1 = r7
            L4c:
                com.dena.mirrorman.net.api.response.livegame.LiveGamePingResponse r9 = (com.dena.mirrorman.net.api.response.livegame.LiveGamePingResponse) r9     // Catch: java.lang.Throwable -> L21
                boolean r9 = r9.isPlaying()     // Catch: java.lang.Throwable -> L21
                if (r9 != 0) goto L5f
                pa.a r9 = pa.a.this     // Catch: java.lang.Throwable -> L21
                q8.a r9 = pa.a.a(r9)     // Catch: java.lang.Throwable -> L21
                pa.b$d r4 = pa.b.d.f46338a     // Catch: java.lang.Throwable -> L21
                r9.a(r4)     // Catch: java.lang.Throwable -> L21
            L5f:
                r9 = r0
                r0 = r1
                goto L27
            L62:
                g9.a.c(r9)
                wn.v r9 = wn.v.f59242a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: pa.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(q8.a aVar, MRRequest mRRequest) {
        b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f46318w = aVar;
        this.f46319x = mRRequest;
        this.f46320y = new da.b();
        b10 = i2.b(null, 1, null);
        this.f46321z = b10;
    }

    public final void c(String str, String str2, String str3) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "playId");
        uo.l.d(this, null, null, new C0702a(str, str2, str3, null), 3, null);
    }

    public final void d(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        this.f46318w.a(b.C0703b.f46335a);
        uo.l.d(this, null, null, new b(str, str2, null), 3, null);
    }

    public final void e() {
        this.f46318w.a(b.e.f46339a);
    }

    public final void f(String str, String str2, String str3) {
        d2 d10;
        jo.p.h(str, "referer");
        jo.p.h(str2, "playId");
        d2.a.a(this.f46321z, null, 1, null);
        d10 = uo.l.d(r0.a(g1.b()), null, null, new c(str, str2, str3, null), 3, null);
        this.f46321z = d10;
    }

    public final void g() {
        d2.a.a(this.f46321z, null, 1, null);
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.f46320y.getCoroutineContext();
    }
}
