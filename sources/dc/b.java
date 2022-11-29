package dc;

import ac.o1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import fa.b;
import jo.f0;
import oq.a;
import yd.g1;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class b extends FrameLayout implements fa.b, oq.a {

    /* renamed from: y  reason: collision with root package name */
    public static final d f29351y = new d(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f29352z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final io.a<wn.v> f29353w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f29354x;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b.this.f29353w.invoke();
            b.this.getFloatViewManager().c(b.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* renamed from: dc.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0279b extends jo.q implements io.l<View, wn.v> {
        public C0279b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b.this.getFloatViewManager().c(b.this);
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
            b.this.getFloatViewManager().c(b.this);
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
        public final /* synthetic */ oq.a f29358w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29359x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29360y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29358w = aVar;
            this.f29359x = aVar2;
            this.f29360y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f29358w;
            vq.a aVar2 = this.f29359x;
            io.a<? extends uq.a> aVar3 = this.f29360y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, io.a<wn.v> aVar) {
        super(context);
        jo.p.h(context, "context");
        jo.p.h(aVar, "onConfirm");
        this.f29353w = aVar;
        this.f29354x = wn.g.b(cr.a.f28611a.b(), new e(this, null, null));
        o1 T = o1.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n            Lay…           true\n        )");
        T.B.E.setText(getResources().getText(xb.r.text_confirm_nominate_moderator));
        T.B.F.setText(getResources().getText(xb.r.text_warning_changing_moderator));
        T.B.C.setText(getResources().getText(xb.r.text_nominate));
        AppCompatButton appCompatButton = T.B.C;
        jo.p.g(appCompatButton, "binding.dialog.confirmButton");
        g1.a(appCompatButton, new a());
        AppCompatButton appCompatButton2 = T.B.B;
        jo.p.g(appCompatButton2, "binding.dialog.cancelButton");
        g1.a(appCompatButton2, new C0279b());
        g1.a(this, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f29354x.getValue();
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
        return "FloatConfirmModeratorDialog";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
