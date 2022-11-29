package dc;

import ac.z1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import fa.b;
import jo.f0;
import oq.a;
import yd.g1;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class h extends FrameLayout implements fa.b, oq.a {

    /* renamed from: x  reason: collision with root package name */
    public static final c f29398x = new c(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f29399y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final wn.f f29400w;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            h.this.getFloatViewManager().c(h.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements qe.f {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f29403b;

        public b(Context context) {
            this.f29403b = context;
        }

        @Override // qe.f
        public void a() {
            fa.c floatViewManager = h.this.getFloatViewManager();
            Context context = this.f29403b;
            String string = h.this.getResources().getString(xb.r.f60077g2);
            jo.p.g(string, "resources.getString(R.string.text_report_posted)");
            floatViewManager.a(new fa.a(context, string, false));
        }

        @Override // qe.f
        public void b(Throwable th2) {
            jo.p.h(th2, i7.e.f36387u);
            fa.c floatViewManager = h.this.getFloatViewManager();
            Context context = this.f29403b;
            String message = MRErrorKt.convertMRException(th2).getError().getMessage();
            if (message == null) {
                message = this.f29403b.getString(xb.r.f60070c);
                jo.p.g(message, "context.getString(R.string.error_access)");
            }
            floatViewManager.a(new fa.a(context, message, false));
        }

        @Override // qe.f
        public void onClose() {
            h.this.getFloatViewManager().c(h.this);
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
        public final /* synthetic */ oq.a f29404w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29405x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29406y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29404w = aVar;
            this.f29405x = aVar2;
            this.f29406y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f29404w;
            vq.a aVar2 = this.f29405x;
            io.a<? extends uq.a> aVar3 = this.f29406y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, qe.a aVar) {
        super(context);
        jo.p.h(context, "context");
        jo.p.h(aVar, "arguments");
        this.f29400w = wn.g.b(cr.a.f28611a.b(), new d(this, null, null));
        z1 z1Var = (z1) androidx.databinding.f.e(LayoutInflater.from(context), xb.p.floating_report_dialog, this, true);
        g1.a(this, new a());
        z1Var.B.setArguments(aVar);
        z1Var.B.setListener(new b(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f29400w.getValue();
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
        return "FloatReportDialog";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
