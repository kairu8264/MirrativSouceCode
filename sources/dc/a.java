package dc;

import ac.g1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import fa.b;
import jo.f0;
import oq.a;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class a extends FrameLayout implements fa.b, oq.a {

    /* renamed from: x  reason: collision with root package name */
    public static final d f29342x = new d(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f29343y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final wn.f f29344w;

    /* renamed from: dc.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0278a extends jo.q implements io.l<View, wn.v> {
        public C0278a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            a.this.getFloatViewManager().c(a.this);
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
            a.this.getFloatViewManager().c(a.this);
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
            a.this.getFloatViewManager().c(a.this);
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
        public final /* synthetic */ oq.a f29348w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29349x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29350y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29348w = aVar;
            this.f29349x = aVar2;
            this.f29350y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f29348w;
            vq.a aVar2 = this.f29349x;
            io.a<? extends uq.a> aVar3 = this.f29350y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, String str2) {
        super(context);
        jo.p.h(context, "context");
        jo.p.h(str, "moderatorName");
        jo.p.h(str2, "moderatorProfileImageUrl");
        this.f29344w = wn.g.b(cr.a.f28611a.b(), new e(this, null, null));
        g1 T = g1.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n            Lay…           true\n        )");
        yd.g1.a(this, new C0278a());
        T.C.setText(str);
        AppCompatImageView appCompatImageView = T.D;
        jo.p.g(appCompatImageView, "binding.moderatorProfileImageView");
        td.a.i(appCompatImageView, str2);
        AppCompatButton appCompatButton = T.F;
        jo.p.g(appCompatButton, "binding.okButton");
        yd.g1.a(appCompatButton, new b());
        ConstraintLayout constraintLayout = T.G;
        jo.p.g(constraintLayout, "binding.rootContainer");
        yd.g1.a(constraintLayout, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f29344w.getValue();
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
        return "FloatAddModeratorResultDialog";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
