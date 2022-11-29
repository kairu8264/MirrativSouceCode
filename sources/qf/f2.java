package qf;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class f2 extends RecyclerView.e0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f49142d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f49143e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final ComposeView f49144a;

    /* renamed from: b  reason: collision with root package name */
    public io.a<wn.v> f49145b;

    /* renamed from: c  reason: collision with root package name */
    public io.a<wn.v> f49146c;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            Context context = viewGroup.getContext();
            jo.p.g(context, "parent.context");
            return new f2(new ComposeView(context, null, 0, 6, null), null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ud.q2 f49147w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ f2 f49148x;

        /* loaded from: classes3.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ f2 f49149w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f2 f2Var) {
                super(0);
                this.f49149w = f2Var;
            }

            public final void a() {
                this.f49149w.d().invoke();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* renamed from: qf.f2$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0745b extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ f2 f49150w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0745b(f2 f2Var) {
                super(0);
                this.f49150w = f2Var;
            }

            public final void a() {
                this.f49150w.c().invoke();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ud.q2 q2Var, f2 f2Var) {
            super(2);
            this.f49147w = q2Var;
            this.f49148x = f2Var;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                yd.c1.a(this.f49147w, new a(this.f49148x), new C0745b(this.f49148x), iVar, 0);
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
        public static final c f49151w = new c();

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
        public static final d f49152w = new d();

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

    public f2(ComposeView composeView) {
        super(composeView);
        this.f49144a = composeView;
        this.f49145b = d.f49152w;
        this.f49146c = c.f49151w;
        g9.a.f32826a.i("PlayerCommentCheerLevelUpViewHolder create");
        composeView.setViewCompositionStrategy(d2.c.f14419b);
    }

    public /* synthetic */ f2(ComposeView composeView, jo.h hVar) {
        this(composeView);
    }

    public final void a(ud.q2 q2Var) {
        jo.p.h(q2Var, "bindModel");
        this.f49144a.setContent(s0.c.c(913612834, true, new b(q2Var, this)));
    }

    public final ComposeView b() {
        return this.f49144a;
    }

    public final io.a<wn.v> c() {
        return this.f49146c;
    }

    public final io.a<wn.v> d() {
        return this.f49145b;
    }

    public final void f(io.a<wn.v> aVar) {
        jo.p.h(aVar, "<set-?>");
        this.f49146c = aVar;
    }

    public final void g(io.a<wn.v> aVar) {
        jo.p.h(aVar, "<set-?>");
        this.f49145b = aVar;
    }
}
