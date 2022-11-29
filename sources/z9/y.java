package z9;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import ud.a;

/* loaded from: classes.dex */
public final class y extends androidx.recyclerview.widget.t<z, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super Integer, wn.v> f62913c;

    /* loaded from: classes.dex */
    public static final class a extends j.f<z> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(z zVar, z zVar2) {
            jo.p.h(zVar, "oldItem");
            jo.p.h(zVar2, "newItem");
            return jo.p.c(zVar, zVar2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(z zVar, z zVar2) {
            jo.p.h(zVar, "oldItem");
            jo.p.h(zVar2, "newItem");
            return jo.p.c(zVar.f(), zVar2.f()) && jo.p.c(zVar.d(), zVar2.d());
        }
    }

    public y() {
        super(new a());
    }

    public static final void h(y yVar, int i10, View view) {
        jo.p.h(yVar, "this$0");
        io.l<? super Integer, wn.v> lVar = yVar.f62913c;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: i */
    public a0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.GIFT_RANKING_TERM.ordinal()) {
            return a0.f62800b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }

    public final void j(io.l<? super Integer, wn.v> lVar) {
        this.f62913c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, final int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof a0) {
            z b10 = b(i10);
            jo.p.g(b10, "getItem(position)");
            ((a0) e0Var).a(b10);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: z9.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y.h(y.this, i10, view);
                }
            });
            return;
        }
        throw new IllegalArgumentException("unknown view holder " + e0Var);
    }
}
