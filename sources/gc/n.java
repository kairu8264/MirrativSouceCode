package gc;

import ac.k1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import fa.b;
import oq.a;
import ud.m4;
import yd.g1;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class n extends FrameLayout implements fa.b, oq.a {

    /* renamed from: w  reason: collision with root package name */
    public final m4 f33047w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f33048x;

    /* renamed from: y  reason: collision with root package name */
    public final k1 f33049y;

    /* renamed from: z  reason: collision with root package name */
    public static final d f33046z = new d(null);
    public static final int A = 8;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            n.this.getFloatViewManager().c(n.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            dq.c.c().l(new ce.q(n.this.f33047w, n.this.f33049y.D.isChecked()));
            n.this.getFloatViewManager().c(n.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            n.this.getFloatViewManager().c(n.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33053w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33054x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33055y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33053w = aVar;
            this.f33054x = aVar2;
            this.f33055y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f33053w;
            vq.a aVar2 = this.f33054x;
            io.a<? extends uq.a> aVar3 = this.f33055y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, m4 m4Var) {
        super(context);
        jo.p.h(context, "context");
        jo.p.h(m4Var, "comment");
        this.f33047w = m4Var;
        this.f33048x = wn.g.b(cr.a.f28611a.b(), new e(this, null, null));
        k1 T = k1.T(LayoutInflater.from(getContext()), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f33049y = T;
        g1.a(this, new a());
        AppCompatButton appCompatButton = T.E;
        jo.p.g(appCompatButton, "binding.reject");
        g1.a(appCompatButton, new b());
        AppCompatButton appCompatButton2 = T.B;
        jo.p.g(appCompatButton2, "binding.cancel");
        g1.a(appCompatButton2, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f33048x.getValue();
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
        return b.a.b(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutHeight() {
        return b.a.c(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutWidth() {
        return b.a.d(this);
    }

    @Override // fa.b
    public String getFloatViewTag() {
        return "FloatCollabRejectDialog";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
