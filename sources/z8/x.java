package z8;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import yd.g1;

/* loaded from: classes.dex */
public final class x extends androidx.recyclerview.widget.t<y, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public final io.l<Integer, wn.v> f62782c;

    /* loaded from: classes.dex */
    public static final class a extends j.f<y> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(y yVar, y yVar2) {
            jo.p.h(yVar, "oldItem");
            jo.p.h(yVar2, "newItem");
            return jo.p.c(yVar, yVar2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(y yVar, y yVar2) {
            jo.p.h(yVar, "oldItem");
            jo.p.h(yVar2, "newItem");
            return jo.p.c(yVar.a(), yVar2.a());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f62784x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(1);
            this.f62784x = i10;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            x.this.f62782c.invoke(Integer.valueOf(this.f62784x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(io.l<? super Integer, wn.v> lVar) {
        super(new a());
        jo.p.h(lVar, "onClickApp");
        this.f62782c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof z) {
            y b10 = b(i10);
            jo.p.g(b10, "getItem(position)");
            ((z) e0Var).a(b10);
            View view = e0Var.itemView;
            jo.p.g(view, "holder.itemView");
            g1.a(view, new b(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return z.f62788b.a(viewGroup);
    }
}
