package z9;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ud.a;

/* loaded from: classes.dex */
public final class t extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public List<u> f62899a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.l<? super Integer, wn.v> f62900b;

    public static final void b(t tVar, int i10, View view) {
        jo.p.h(tVar, "this$0");
        io.l<? super Integer, wn.v> lVar = tVar.f62900b;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public v onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.GIFT_RANKING_REWARD.ordinal()) {
            return v.f62905c.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }

    public final void d(io.l<? super Integer, wn.v> lVar) {
        this.f62900b = lVar;
    }

    public final void f(List<u> list) {
        jo.p.h(list, "value");
        this.f62899a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f62899a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f62899a.get(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, final int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof v) {
            e0Var.setIsRecyclable(false);
            ((v) e0Var).a(this.f62899a.get(i10));
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: z9.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    t.b(t.this, i10, view);
                }
            });
            return;
        }
        throw new IllegalArgumentException("unknown view holder " + e0Var);
    }
}
