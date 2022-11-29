package r9;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public final class q2 extends RecyclerView.h<r2> {

    /* renamed from: a  reason: collision with root package name */
    public List<ud.q> f50475a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.l<? super Integer, wn.v> f50476b;

    public static final void d(q2 q2Var, int i10, View view) {
        jo.p.h(q2Var, "this$0");
        io.l<? super Integer, wn.v> lVar = q2Var.f50476b;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i10));
        }
    }

    public final List<ud.q> b() {
        return this.f50475a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public void onBindViewHolder(r2 r2Var, final int i10) {
        jo.p.h(r2Var, "viewHolder");
        r2Var.a(this.f50475a.get(i10));
        r2Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: r9.p2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q2.d(q2.this, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f */
    public r2 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return r2.f50483b.a(viewGroup);
    }

    public final void g(List<ud.q> list) {
        jo.p.h(list, "value");
        this.f50475a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f50475a.size();
    }

    public final void h(io.l<? super Integer, wn.v> lVar) {
        this.f50476b = lVar;
    }
}
