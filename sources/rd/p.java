package rd;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ud.a;

/* loaded from: classes2.dex */
public final class p extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public List<ud.d0> f51211a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.l<? super Integer, wn.v> f51212b;

    public static final void b(p pVar, int i10, View view) {
        jo.p.h(pVar, "this$0");
        io.l<? super Integer, wn.v> lVar = pVar.f51212b;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public qf.i0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.EMOMO_RUN_RANKING_REWARD.ordinal()) {
            return qf.i0.f49213b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }

    public final void d(io.l<? super Integer, wn.v> lVar) {
        this.f51212b = lVar;
    }

    public final void f(List<ud.d0> list) {
        jo.p.h(list, "value");
        this.f51211a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51211a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f51211a.get(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, final int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof qf.i0) {
            e0Var.setIsRecyclable(false);
            ((qf.i0) e0Var).a(this.f51211a.get(i10));
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: rd.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p.b(p.this, i10, view);
                }
            });
            return;
        }
        throw new IllegalArgumentException("unknown view holder " + e0Var);
    }
}
