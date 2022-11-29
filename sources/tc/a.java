package tc;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrorman.net.api.response.ChatThreadMessages;
import com.dena.mirrorman.net.retrofit.MRRequest;
import tc.b;

/* loaded from: classes2.dex */
public final class a implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f53426w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f53427x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f53428y;

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatActionCreator$addChatMessageFromDeeplinkHash$1", f = "ChatActionCreator.kt", l = {82}, m = "invokeSuspend")
    /* renamed from: tc.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0830a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53429w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f53431y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f53432z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0830a(String str, String str2, ao.d<? super C0830a> dVar) {
            super(2, dVar);
            this.f53431y = str;
            this.f53432z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new C0830a(this.f53431y, this.f53432z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((C0830a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53429w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f53429w = 1;
                    obj = a.this.f53427x.getChatMessageFromDeeplinkHash(this.f53431y, "/api/chat/message/" + this.f53432z, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f53426w.a(new b.C0831b((ChatThreadMessages) obj));
            } catch (Throwable th2) {
                a.this.f53426w.a(new b.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatActionCreator$addChatThread$1", f = "ChatActionCreator.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ Long A;
        public final /* synthetic */ Long B;

        /* renamed from: w  reason: collision with root package name */
        public int f53433w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f53435y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ge.j f53436z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ge.j jVar, Long l10, Long l11, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f53435y = str;
            this.f53436z = jVar;
            this.A = l10;
            this.B = l11;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f53435y, this.f53436z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53433w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f53427x;
                    String str = this.f53435y;
                    String m10 = this.f53436z.m();
                    String f10 = this.f53436z.f();
                    Long l10 = this.A;
                    Long l11 = this.B;
                    this.f53433w = 1;
                    obj = mRRequest.getChatThread(str, m10, f10, l10, l11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f53426w.a(new b.C0831b((ChatThreadMessages) obj));
            } catch (Throwable th2) {
                a.this.f53426w.a(new b.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatActionCreator$initChatMessageFromDeeplinkHash$1", f = "ChatActionCreator.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53437w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f53439y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f53440z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f53439y = str;
            this.f53440z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f53439y, this.f53440z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53437w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f53437w = 1;
                    obj = a.this.f53427x.getChatMessageFromDeeplinkHash(this.f53439y, "/api/chat/message/" + this.f53440z, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f53426w.a(new b.e((ChatThreadMessages) obj));
            } catch (Throwable th2) {
                a.this.f53426w.a(new b.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatActionCreator$initChatThread$1", f = "ChatActionCreator.kt", l = {35}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ Long A;
        public final /* synthetic */ Long B;

        /* renamed from: w  reason: collision with root package name */
        public int f53441w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f53443y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ge.j f53444z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, ge.j jVar, Long l10, Long l11, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f53443y = str;
            this.f53444z = jVar;
            this.A = l10;
            this.B = l11;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f53443y, this.f53444z, this.A, this.B, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53441w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f53427x;
                    String str = this.f53443y;
                    String m10 = this.f53444z.m();
                    String f10 = this.f53444z.f();
                    Long l10 = this.A;
                    Long l11 = this.B;
                    this.f53441w = 1;
                    obj = mRRequest.getChatThread(str, m10, f10, l10, l11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                a.this.f53426w.a(new b.e((ChatThreadMessages) obj));
            } catch (Throwable th2) {
                a.this.f53426w.a(new b.d(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatActionCreator$postChatBadReport$1", f = "ChatActionCreator.kt", l = {18}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f53445w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f53447y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f53447y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f53447y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f53445w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = a.this.f53427x;
                    String str = this.f53447y;
                    this.f53445w = 1;
                    obj = MRRequest.DefaultImpls.postChatBadReport$default(mRRequest, str, false, this, 2, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                StatusResponse statusResponse = (StatusResponse) obj;
                a.this.f53426w.a(b.g.f53459a);
            } catch (Throwable th2) {
                a.this.f53426w.a(new b.f(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public a(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f53426w = aVar;
        this.f53427x = mRRequest;
        this.f53428y = new da.b();
    }

    public final void c(String str, String str2) {
        jo.p.h(str, "referer");
        this.f53426w.a(b.c.f53454a);
        uo.l.d(this, null, null, new C0830a(str, str2, null), 3, null);
    }

    public final void d(String str, ge.j jVar, Long l10, Long l11) {
        jo.p.h(str, "referer");
        jo.p.h(jVar, "thread");
        this.f53426w.a(b.c.f53454a);
        uo.l.d(this, null, null, new b(str, jVar, l10, l11, null), 3, null);
    }

    public final void e(String str, String str2) {
        jo.p.h(str, "referer");
        this.f53426w.a(b.c.f53454a);
        uo.l.d(this, null, null, new c(str, str2, null), 3, null);
    }

    public final void f(String str, ge.j jVar, Long l10, Long l11) {
        jo.p.h(str, "referer");
        jo.p.h(jVar, "thread");
        this.f53426w.a(b.c.f53454a);
        uo.l.d(this, null, null, new d(str, jVar, l10, l11, null), 3, null);
    }

    public final void g(String str) {
        jo.p.h(str, "threadMessageId");
        uo.l.d(this, null, null, new e(str, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f53428y.getCoroutineContext();
    }
}
