package gc;

import ac.h2;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import fa.b;
import oq.a;
import uo.b1;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class m0 extends FrameLayout implements fa.b, oq.a, q0 {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ da.j f33037w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f33038x;

    /* renamed from: y  reason: collision with root package name */
    public final h2 f33039y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f33036z = new a(null);
    public static final int A = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.floating.setting.FloatingTopToastMessageView$bind$1", f = "FloatingTopToastMessageView.kt", l = {56}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f33040w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f33041x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ m0 f33042y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, m0 m0Var, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f33041x = j10;
            this.f33042y = m0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f33041x, this.f33042y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f33040w;
            if (i10 == 0) {
                wn.m.b(obj);
                long j10 = this.f33041x;
                this.f33040w = 1;
                if (b1.a(j10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.f33042y.getFloatViewManager().c(this.f33042y);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33043w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33044x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33045y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33043w = aVar;
            this.f33044x = aVar2;
            this.f33045y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f33043w;
            vq.a aVar2 = this.f33044x;
            io.a<? extends uq.a> aVar3 = this.f33045y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Context context) {
        super(context);
        jo.p.h(context, "context");
        this.f33037w = new da.j();
        this.f33038x = wn.g.b(cr.a.f28611a.b(), new c(this, null, null));
        h2 T = h2.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f33039y = T;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f33038x.getValue();
    }

    public final m0 b(int i10, String str, String str2, boolean z10) {
        jo.p.h(str, "title");
        jo.p.h(str2, "message");
        this.f33039y.C.setBackgroundResource(i10);
        this.f33039y.B.setTitle(str);
        this.f33039y.B.setMessage(str2);
        long j10 = z10 ? 6000 : 3000;
        this.f33039y.B.d(j10);
        uo.l.d(this, null, null, new b(j10, this, null), 3, null);
        return this;
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f33037w.getCoroutineContext();
    }

    @Override // fa.b
    public View getFloatViewContentView() {
        return this;
    }

    @Override // fa.b
    public int getFloatViewGravity() {
        return 48;
    }

    @Override // fa.b
    public int getFloatViewLayoutFlags() {
        return 24;
    }

    @Override // fa.b
    public int getFloatViewLayoutHeight() {
        return -2;
    }

    @Override // fa.b
    public int getFloatViewLayoutWidth() {
        return b.a.d(this);
    }

    @Override // fa.b
    public String getFloatViewTag() {
        return "FloatLoadingView";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        r0.d(this, null, 1, null);
        super.onDetachedFromWindow();
    }
}
