package od;

import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.net.api.response.notice.NoticePresentBoxResponse;
import com.dena.mirrorman.net.api.response.notice.PresentBox;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.util.List;
import pd.o0;
import uo.g1;
import uo.i2;

/* loaded from: classes2.dex */
public final class e0 implements uo.q0 {
    public final ao.g A;

    /* renamed from: w  reason: collision with root package name */
    public final q8.a f44834w;

    /* renamed from: x  reason: collision with root package name */
    public final MRRequest f44835x;

    /* renamed from: y  reason: collision with root package name */
    public final kf.p f44836y;

    /* renamed from: z  reason: collision with root package name */
    public final hf.h0 f44837z;

    @co.f(c = "com.dena.mirrorman.actioncreator.NoticePresentBoxActionCreator$loadNext$1", f = "NoticePresentBoxActionCreator.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44838w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f44840y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ long f44841z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, long j10, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f44840y = str;
            this.f44841z = j10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f44840y, this.f44841z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44838w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = e0.this.f44835x;
                    String str = this.f44840y;
                    this.f44838w = 1;
                    obj = mRRequest.getNoticePresentBox(str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                NoticePresentBoxResponse noticePresentBoxResponse = (NoticePresentBoxResponse) obj;
                List<PresentBox> presentBoxes = noticePresentBoxResponse.getPresentBoxes();
                long j10 = this.f44841z;
                for (PresentBox presentBox : presentBoxes) {
                    presentBox.setNew(presentBox.getCreatedAt() > j10);
                }
                e0.this.f44834w.a(new o0.b(noticePresentBoxResponse));
            } catch (Throwable th2) {
                e0.this.f44834w.a(new o0.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.actioncreator.NoticePresentBoxActionCreator$reload$1", f = "NoticePresentBoxActionCreator.kt", l = {28}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f44842w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f44842w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest mRRequest = e0.this.f44835x;
                    this.f44842w = 1;
                    obj = MRRequest.DefaultImpls.getNoticePresentBox$default(mRRequest, null, this, 1, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                NoticePresentBoxResponse noticePresentBoxResponse = (NoticePresentBoxResponse) obj;
                List<PresentBox> presentBoxes = noticePresentBoxResponse.getPresentBoxes();
                e0 e0Var = e0.this;
                for (PresentBox presentBox : presentBoxes) {
                    presentBox.setNew(presentBox.getCreatedAt() > e0Var.f44836y.f3());
                }
                PresentBox presentBox2 = (PresentBox) xn.a0.Z(noticePresentBoxResponse.getPresentBoxes());
                if (presentBox2 != null) {
                    e0.this.f44834w.a(new o0.e(presentBox2.getCreatedAt()));
                }
                e0.this.f44834w.a(new o0.b(noticePresentBoxResponse));
            } catch (Throwable th2) {
                e0.this.f44834w.a(new o0.a(MRErrorKt.convertMRException(th2).getError()));
            }
            return wn.v.f59242a;
        }
    }

    public e0(q8.a aVar, MRRequest mRRequest, kf.p pVar, hf.h0 h0Var) {
        uo.b0 b10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(mRRequest, "request");
        jo.p.h(pVar, "noticePreference");
        jo.p.h(h0Var, "noticeRepository");
        this.f44834w = aVar;
        this.f44835x = mRRequest;
        this.f44836y = pVar;
        this.f44837z = h0Var;
        uo.k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.A = b11.plus(b10);
    }

    public final void d(long j10) {
        this.f44837z.h(j10);
    }

    public final void e(String str, long j10) {
        jo.p.h(str, "nextCursor");
        this.f44834w.a(o0.c.f47097a);
        uo.l.d(this, null, null, new a(str, j10, null), 3, null);
    }

    public final void f() {
        this.f44834w.a(new o0.d(this.f44836y.f3()));
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    public final void g(int i10) {
        this.f44834w.a(new o0.f(i10));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.A;
    }
}
