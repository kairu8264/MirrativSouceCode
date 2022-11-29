package hc;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes2.dex */
public final class x extends RecyclerView.h<g0> {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.u f35286a;

    /* renamed from: b  reason: collision with root package name */
    public List<y> f35287b;

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super Integer, wn.v> f35288c;

    public x(androidx.lifecycle.u uVar) {
        jo.p.h(uVar, "lifecycleOwner");
        this.f35286a = uVar;
        this.f35287b = xn.s.k();
    }

    public static final void d(x xVar, int i10, View view) {
        jo.p.h(xVar, "this$0");
        io.l<? super Integer, wn.v> lVar = xVar.f35288c;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i10));
        }
    }

    public final List<y> b() {
        return this.f35287b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public void onBindViewHolder(g0 g0Var, final int i10) {
        jo.p.h(g0Var, "holder");
        g0Var.a(this.f35287b.get(i10));
        g0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: hc.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.d(x.this, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f */
    public g0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return g0.f35114b.a(this.f35286a, viewGroup);
    }

    public final void g(io.l<? super Integer, wn.v> lVar) {
        this.f35288c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f35287b.size();
    }

    public final void h(List<y> list) {
        jo.p.h(list, "value");
        this.f35287b = list;
        notifyDataSetChanged();
    }
}
