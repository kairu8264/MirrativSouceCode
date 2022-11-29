package gc;

import ac.j2;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import fa.b;
import oq.a;
import yd.g1;

/* loaded from: classes2.dex */
public final class n0 extends FrameLayout implements fa.b, oq.a {

    /* renamed from: y  reason: collision with root package name */
    public static final c f33056y = new c(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f33057z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final wn.f f33058w;

    /* renamed from: x  reason: collision with root package name */
    public final j2 f33059x;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            n0.this.getFloatViewManager().c(n0.this);
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
            n0.this.getFloatViewManager().c(n0.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f33062w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33063x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33064y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f33062w = aVar;
            this.f33063x = aVar2;
            this.f33064y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f33062w;
            vq.a aVar2 = this.f33063x;
            io.a<? extends uq.a> aVar3 = this.f33064y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Context context) {
        super(context);
        jo.p.h(context, "context");
        this.f33058w = wn.g.b(cr.a.f28611a.b(), new d(this, null, null));
        j2 T = j2.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f33059x = T;
        g1.a(this, new a());
        FrameLayout frameLayout = T.B;
        jo.p.g(frameLayout, "binding.okButtonView");
        g1.a(frameLayout, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f33058w.getValue();
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
        return "FloatTutorialLiveLinkDialog";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
