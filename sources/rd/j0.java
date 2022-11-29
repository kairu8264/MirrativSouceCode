package rd;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import kotlin.NoWhenBranchMatchedException;
import qf.g1;
import qf.i1;
import qf.j1;
import qf.k1;
import qf.l1;
import ud.x1;

/* loaded from: classes2.dex */
public final class j0 extends androidx.recyclerview.widget.t<x1, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super x1.e, wn.v> f51160c;

    /* renamed from: d  reason: collision with root package name */
    public io.l<? super x1.a, wn.v> f51161d;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<x1> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f51162a = new a();

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(x1 x1Var, x1 x1Var2) {
            jo.p.h(x1Var, "oldItem");
            jo.p.h(x1Var2, "newItem");
            return jo.p.c(x1Var, x1Var2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(x1 x1Var, x1 x1Var2) {
            jo.p.h(x1Var, "oldItem");
            jo.p.h(x1Var2, "newItem");
            return x1Var == x1Var2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x1 f51164x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x1 x1Var) {
            super(1);
            this.f51164x = x1Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [ud.x1, java.lang.Object] */
        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<x1.e, wn.v> g10 = j0.this.g();
            ?? r02 = this.f51164x;
            jo.p.g(r02, "bindModel");
            g10.invoke(r02);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x1 f51166x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x1 x1Var) {
            super(0);
            this.f51166x = x1Var;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [ud.x1, java.lang.Object] */
        public final void a() {
            io.l<x1.a, wn.v> h10 = j0.this.h();
            ?? r12 = this.f51166x;
            jo.p.g(r12, "bindModel");
            h10.invoke(r12);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<x1.e, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final d f51167w = new d();

        public d() {
            super(1);
        }

        public final void a(x1.e eVar) {
            jo.p.h(eVar, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(x1.e eVar) {
            a(eVar);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<x1.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final e f51168w = new e();

        public e() {
            super(1);
        }

        public final void a(x1.a aVar) {
            jo.p.h(aVar, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(x1.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public j0() {
        super(a.f51162a);
        this.f51160c = d.f51167w;
        this.f51161d = e.f51168w;
    }

    public final io.l<x1.e, wn.v> g() {
        return this.f51160c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        x1 b10 = b(i10);
        if (b10 instanceof x1.d) {
            return 1;
        }
        if (b10 instanceof x1.e) {
            return 4;
        }
        if (b10 instanceof x1.b) {
            return 2;
        }
        if (b10 instanceof x1.c) {
            return 3;
        }
        if (b10 instanceof x1.a) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final io.l<x1.a, wn.v> h() {
        return this.f51161d;
    }

    public final void i(io.l<? super x1.e, wn.v> lVar) {
        jo.p.h(lVar, "<set-?>");
        this.f51160c = lVar;
    }

    public final void j(io.l<? super x1.a, wn.v> lVar) {
        jo.p.h(lVar, "<set-?>");
        this.f51161d = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        x1 b10 = b(i10);
        if (e0Var instanceof j1) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.LiveGiftCheerUsersBindModel.Rank");
            ((j1) e0Var).a((x1.d) b10);
        } else if (e0Var instanceof g1) {
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.LiveGiftCheerUsersBindModel.User");
            ((g1) e0Var).a((x1.e) b10);
            View view = e0Var.itemView;
            jo.p.g(view, "holder.itemView");
            yd.g1.a(view, new b(b10));
        } else if (e0Var instanceof i1) {
            i1 i1Var = (i1) e0Var;
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.LiveGiftCheerUsersBindModel.Banner");
            i1Var.a((x1.a) b10);
            i1Var.d(new c(b10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return g1.f49159b.a(viewGroup);
                        }
                        throw new IllegalArgumentException("unknown view type " + i10);
                    }
                    return l1.f49283b.a(viewGroup);
                }
                return k1.f49261b.a(viewGroup);
            }
            return j1.f49240b.a(viewGroup);
        }
        return i1.f49217c.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.e0 e0Var) {
        jo.p.h(e0Var, "holder");
        super.onViewRecycled(e0Var);
        if (e0Var instanceof j1) {
            ((j1) e0Var).b().e();
        } else if (e0Var instanceof i1) {
            ((i1) e0Var).b().e();
        }
    }
}
