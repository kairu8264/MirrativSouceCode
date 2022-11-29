package r9;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import ud.r3;
import ud.s3;
import ud.t3;
import ud.u3;

/* loaded from: classes.dex */
public final class l2 extends androidx.recyclerview.widget.t<r3, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super t3, wn.v> f50246c;

    /* loaded from: classes.dex */
    public static final class a extends j.f<r3> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f50247a = new a();

        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(r3 r3Var, r3 r3Var2) {
            jo.p.h(r3Var, "oldItem");
            jo.p.h(r3Var2, "newItem");
            if ((r3Var instanceof u3) && (r3Var2 instanceof u3)) {
                return jo.p.c(r3Var, r3Var2);
            }
            if ((r3Var instanceof s3) && (r3Var2 instanceof s3)) {
                return jo.p.c(r3Var, r3Var2);
            }
            if ((r3Var instanceof t3) && (r3Var2 instanceof t3)) {
                return jo.p.c(r3Var, r3Var2);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(r3 r3Var, r3 r3Var2) {
            jo.p.h(r3Var, "oldItem");
            jo.p.h(r3Var2, "newItem");
            return ((r3Var instanceof u3) && (r3Var2 instanceof u3)) ? jo.p.c(r3Var, r3Var2) : ((r3Var instanceof s3) && (r3Var2 instanceof s3)) ? jo.p.c(r3Var, r3Var2) : (r3Var instanceof t3) && (r3Var2 instanceof t3) && ((t3) r3Var).c() == ((t3) r3Var2).c();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ t3 f50249x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t3 t3Var) {
            super(1);
            this.f50249x = t3Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<t3, wn.v> g10 = l2.this.g();
            if (g10 != null) {
                g10.invoke(this.f50249x);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public l2() {
        super(a.f50247a);
    }

    public final io.l<t3, wn.v> g() {
        return this.f50246c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final void h(io.l<? super t3, wn.v> lVar) {
        this.f50246c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "viewHolder");
        if (e0Var instanceof o2) {
            r3 b10 = b(i10);
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.ShooterPartsCategoryTitleBindModel");
            ((o2) e0Var).a((u3) b10);
        } else if (e0Var instanceof n2) {
            r3 b11 = b(i10);
            jo.p.f(b11, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.ShooterPartsCategoryItemBindModel");
            t3 t3Var = (t3) b11;
            ((n2) e0Var).a(t3Var);
            View view = e0Var.itemView;
            jo.p.g(view, "viewHolder.itemView");
            yd.g1.a(view, new b(t3Var));
        } else {
            boolean z10 = e0Var instanceof m2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == r3.b.TITLE.ordinal()) {
            return o2.f50441b.a(viewGroup);
        }
        if (i10 == r3.b.CATEGORY.ordinal()) {
            return n2.f50435b.a(viewGroup);
        }
        if (i10 == r3.b.DIVIDER.ordinal()) {
            return m2.f50257a.a(viewGroup);
        }
        throw new IllegalStateException("存在しないitemViewTypeです");
    }
}
