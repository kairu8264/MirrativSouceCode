package fa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import ao.d;
import co.l;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import da.j;
import fa.b;
import io.p;
import jo.f0;
import jo.h;
import jo.q;
import oq.a;
import uo.b1;
import uo.q0;
import uo.r0;
import wn.f;
import wn.g;
import wn.m;
import wn.v;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class a extends FrameLayout implements fa.b, oq.a, q0 {
    public static final C0348a A = new C0348a(null);
    public static final int B = 8;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f31884w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ j f31885x;

    /* renamed from: y  reason: collision with root package name */
    public final f f31886y;

    /* renamed from: z  reason: collision with root package name */
    public final ea.a f31887z;

    /* renamed from: fa.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0348a {
        public C0348a() {
        }

        public /* synthetic */ C0348a(h hVar) {
            this();
        }
    }

    @co.f(c = "com.dena.mirrativ.featurecommon.floatview.FloatToastView$onAttachedToWindow$1", f = "FloatToastView.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<q0, d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f31888w;

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f31888w;
            if (i10 == 0) {
                m.b(obj);
                long j10 = a.this.f31884w ? 6000L : PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS;
                this.f31888w = 1;
                if (b1.a(j10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            a.this.getFloatViewManager().c(a.this);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f31890w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f31891x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f31892y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f31890w = aVar;
            this.f31891x = aVar2;
            this.f31892y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f31890w;
            vq.a aVar2 = this.f31891x;
            io.a<? extends uq.a> aVar3 = this.f31892y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, boolean z10) {
        super(context);
        jo.p.h(context, "context");
        jo.p.h(str, "message");
        this.f31884w = z10;
        this.f31885x = new j();
        this.f31886y = g.b(cr.a.f28611a.b(), new c(this, null, null));
        ea.a T = ea.a.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f31887z = T;
        T.B.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f31886y.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f31885x.getCoroutineContext();
    }

    @Override // fa.b
    public View getFloatViewContentView() {
        return this;
    }

    @Override // fa.b
    public int getFloatViewGravity() {
        return b.a.a(this);
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
        return -2;
    }

    @Override // fa.b
    public String getFloatViewTag() {
        return "FloatToastView_" + hashCode();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        r0.d(this, null, 1, null);
        super.onDetachedFromWindow();
    }
}
