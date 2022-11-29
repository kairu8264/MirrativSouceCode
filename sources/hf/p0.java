package hf;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import ie.b;
import jf.t0;
import nd.f1;
import oq.a;

/* loaded from: classes2.dex */
public final class p0 implements oq.a {

    /* renamed from: w  reason: collision with root package name */
    public final Context f35588w;

    /* renamed from: x  reason: collision with root package name */
    public final FragmentManager f35589x;

    /* renamed from: y  reason: collision with root package name */
    public final jf.t0 f35590y;

    /* renamed from: z  reason: collision with root package name */
    public final wn.f f35591z;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f35592w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35593x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35594y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f35592w = aVar;
            this.f35593x = aVar2;
            this.f35594y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            xq.a b10;
            oq.a aVar = this.f35592w;
            vq.a aVar2 = this.f35593x;
            io.a<? extends uq.a> aVar3 = this.f35594y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(tb.c.class), aVar2, aVar3);
        }
    }

    public p0(Context context, FragmentManager fragmentManager, jf.t0 t0Var) {
        jo.p.h(context, "context");
        jo.p.h(fragmentManager, "fragmentManager");
        jo.p.h(t0Var, "resultViewsState");
        this.f35588w = context;
        this.f35589x = fragmentManager;
        this.f35590y = t0Var;
        this.f35591z = wn.g.b(cr.a.f28611a.b(), new a(this, null, null));
    }

    public final void a() {
        jf.t0 t0Var = this.f35590y;
        if (t0Var instanceof t0.a.b) {
            b.a aVar = ie.b.P0;
            String string = this.f35588w.getString(f1.text_dialog_pass_code_locking);
            jo.p.g(string, "context.getString(R.stri…dialog_pass_code_locking)");
            aVar.a(string, this.f35588w.getString(f1.F1), this.f35588w.getString(f1.C3)).z3(this.f35589x, "locking");
        } else if (t0Var instanceof t0.a.c) {
            t0.a.c cVar = (t0.a.c) t0Var;
            tb.a B = b().B(cVar.a(), cVar.b(), false);
            B.a().z3(this.f35589x, B.b());
        } else if (t0Var instanceof t0.a.C0528a) {
            t0.a.C0528a c0528a = (t0.a.C0528a) t0Var;
            gf.c0.Q0.a(c0528a.a(), c0528a.b()).z3(this.f35589x, "FollowOfficialTwitterAccountDialog");
        } else if (t0Var instanceof t0.c.a) {
            of.n.f45411a.B(this.f35588w, ((t0.c.a) t0Var).a(), false);
        } else {
            boolean z10 = t0Var instanceof t0.b;
        }
    }

    public final tb.c b() {
        return (tb.c) this.f35591z.getValue();
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
