package lc;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes2.dex */
public final class n0 extends RecyclerView.h<p0> {

    /* renamed from: a  reason: collision with root package name */
    public List<o0> f39942a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.l<? super Integer, wn.v> f39943b;

    public static final void c(n0 n0Var, o0 o0Var, View view) {
        jo.p.h(n0Var, "this$0");
        jo.p.h(o0Var, "$bindModel");
        io.l<? super Integer, wn.v> lVar = n0Var.f39943b;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(o0Var.b()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(p0 p0Var, int i10) {
        jo.p.h(p0Var, "holder");
        final o0 o0Var = this.f39942a.get(i10);
        p0Var.a(this.f39942a.get(i10));
        p0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: lc.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.c(n0.this, o0Var, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public p0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return p0.f39950b.a(viewGroup);
    }

    public final void f(List<o0> list) {
        jo.p.h(list, "value");
        this.f39942a = list;
        notifyDataSetChanged();
    }

    public final void g(io.l<? super Integer, wn.v> lVar) {
        this.f39943b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f39942a.size();
    }
}
