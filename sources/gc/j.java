package gc;

import ac.i1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import fa.b;
import oq.a;
import uo.b1;
import uo.q0;

/* loaded from: classes2.dex */
public final class j extends FrameLayout implements fa.b, oq.a, q0 {

    /* renamed from: y  reason: collision with root package name */
    public static final b f32964y = new b(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f32965z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ da.j f32966w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f32967x;

    @co.f(c = "com.dena.mirrativ.streaming.floating.setting.FloatingCollabConnectedMessageView$1", f = "FloatingCollabConnectedMessageView.kt", l = {40}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f32968w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f32968w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f32968w = 1;
                if (b1.a(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            j.this.getFloatViewManager().c(j.this);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f32970w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f32971x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f32972y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f32970w = aVar;
            this.f32971x = aVar2;
            this.f32972y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f32970w;
            vq.a aVar2 = this.f32971x;
            io.a<? extends uq.a> aVar3 = this.f32972y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context);
        jo.p.h(context, "context");
        this.f32966w = new da.j();
        this.f32967x = wn.g.b(cr.a.f28611a.b(), new c(this, null, null));
        i1 T = i1.T(LayoutInflater.from(getContext()), this, true);
        jo.p.g(T, "inflate(\n            Lay…           true\n        )");
        T.B.d(PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS);
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f32967x.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f32966w.getCoroutineContext();
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
        return "FloatCollabConnectedMessageView";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
