package qf;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import androidx.recyclerview.widget.RecyclerView;
import ud.c4;

/* loaded from: classes3.dex */
public final class a3 extends RecyclerView.e0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f49040d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f49041e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ComposeView f49042a;

    /* renamed from: b  reason: collision with root package name */
    public io.a<wn.v> f49043b;

    /* renamed from: c  reason: collision with root package name */
    public io.a<wn.v> f49044c;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final a3 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            Context context = viewGroup.getContext();
            jo.p.g(context, "parent.context");
            return new a3(new ComposeView(context, null, 0, 6, null), null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c4 f49045w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a3 f49046x;

        /* loaded from: classes3.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a3 f49047w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a3 a3Var) {
                super(0);
                this.f49047w = a3Var;
            }

            public final void a() {
                this.f49047w.d().invoke();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* renamed from: qf.a3$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0742b extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a3 f49048w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0742b(a3 a3Var) {
                super(0);
                this.f49048w = a3Var;
            }

            public final void a() {
                this.f49048w.c().invoke();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c4 c4Var, a3 a3Var) {
            super(2);
            this.f49045w = c4Var;
            this.f49046x = a3Var;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                yd.l1.a(this.f49045w, new a(this.f49046x), new C0742b(this.f49046x), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f49049w = new c();

        public c() {
            super(0);
        }

        public final void a() {
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f49050w = new d();

        public d() {
            super(0);
        }

        public final void a() {
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public a3(ComposeView composeView) {
        super(composeView);
        this.f49042a = composeView;
        this.f49043b = d.f49050w;
        this.f49044c = c.f49049w;
        g9.a.f32826a.i("StreamCommentCheerLevelUpViewHolder create");
        composeView.setViewCompositionStrategy(d2.c.f14419b);
    }

    public /* synthetic */ a3(ComposeView composeView, jo.h hVar) {
        this(composeView);
    }

    public final void a(c4 c4Var) {
        jo.p.h(c4Var, "bindModel");
        this.f49042a.setContent(s0.c.c(-319499709, true, new b(c4Var, this)));
    }

    public final ComposeView b() {
        return this.f49042a;
    }

    public final io.a<wn.v> c() {
        return this.f49044c;
    }

    public final io.a<wn.v> d() {
        return this.f49043b;
    }

    public final void f(io.a<wn.v> aVar) {
        jo.p.h(aVar, "<set-?>");
        this.f49044c = aVar;
    }

    public final void g(io.a<wn.v> aVar) {
        jo.p.h(aVar, "<set-?>");
        this.f49043b = aVar;
    }
}
