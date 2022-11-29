package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.CollabMatchingStartResponse;
import com.dena.mirrorman.net.api.response.live.AcceptedMatchedCollabResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import pd.i;

/* loaded from: classes2.dex */
public final class g implements uo.q0 {

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44878w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f44879x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ da.b f44880y;

    @co.f(c = "com.dena.mirrorman.actioncreator.CollabMatchingActionCreator$acceptMatching$1", f = "CollabMatchingActionCreator.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44881w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44883y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44884z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44883y = str;
            this.f44884z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44883y, this.f44884z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44881w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = g.this.f44879x;
                    String str = this.f44883y;
                    String str2 = this.f44884z;
                    this.f44881w = 1;
                    obj = mRRequest.postCollabMatchingAccept(str, str2, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                g.this.f44878w.a(new i.a((AcceptedMatchedCollabResponse) obj));
            } catch (Exception e10) {
                g.this.f44878w.a(new i.b(MRErrorKt.convertMRException(e10).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CollabMatchingActionCreator$cancelMatching$1", f = "CollabMatchingActionCreator.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ boolean A;

        /* renamed from: w  reason: collision with root package name */
        public int f44885w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44887y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44888z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, boolean z10, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f44887y = str;
            this.f44888z = str2;
            this.A = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f44887y, this.f44888z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44885w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = g.this.f44879x;
                    String str = this.f44887y;
                    String str2 = this.f44888z;
                    int i11 = this.A ? 1 : 0;
                    this.f44885w = 1;
                    if (mRRequest.postCollabMatchingCancel(str, str2, i11, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                g.this.f44878w.a(i.e.f46916a);
            } catch (Exception unused) {
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.CollabMatchingActionCreator$startMatching$1", f = "CollabMatchingActionCreator.kt", l = {22, 31}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ boolean A;

        /* renamed from: w  reason: collision with root package name */
        public int f44889w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44891y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f44892z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, boolean z10, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f44891y = str;
            this.f44892z = str2;
            this.A = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f44891y, this.f44892z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44889w;
            int i11 = 1;
            try {
                try {
                } catch (Exception e10) {
                    g9.a.c(e10);
                }
            } catch (Exception e11) {
                g.this.f44878w.a(new i.c(MRErrorKt.convertMRException(e11).getError()));
            }
            if (i10 == 0) {
                wn.m.b(obj);
                g.this.f44878w.a(i.d.f46915a);
                MRRequest mRRequest = g.this.f44879x;
                String str = this.f44891y;
                String str2 = this.f44892z;
                this.f44889w = 1;
                if (mRRequest.postCollabMatchingCancel(str, str2, 1, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                g.this.f44878w.a(new i.f((CollabMatchingStartResponse) obj));
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            MRRequest mRRequest2 = g.this.f44879x;
            String str3 = this.f44891y;
            String str4 = this.f44892z;
            if (!this.A) {
                i11 = 0;
            }
            this.f44889w = 2;
            obj = mRRequest2.postCollabMatchingStart(str3, str4, i11, this);
            if (obj == c10) {
                return c10;
            }
            g.this.f44878w.a(new i.f((CollabMatchingStartResponse) obj));
            return wn.v.f59242a;
        }
    }

    public g(q8.a aVar, MRRequest mRRequest) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        this.f44878w = aVar;
        this.f44879x = mRRequest;
        this.f44880y = new da.b();
    }

    public final void a(String str, String str2) {
        jo.p.h(str, "referer");
        jo.p.h(str2, TtmlNode.ATTR_ID);
        uo.l.d(this, null, null, new a(str, str2, null), 3, null);
    }

    public final void d(String str, String str2, boolean z10) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        uo.l.d(this, null, null, new b(str, str2, z10, null), 3, null);
    }

    public final void e(String str, String str2, boolean z10) {
        jo.p.h(str, "referer");
        jo.p.h(str2, "liveId");
        uo.l.d(this, null, null, new c(str, str2, z10, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f44880y.getCoroutineContext();
    }
}
