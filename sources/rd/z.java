package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes2.dex */
public final class z extends RecyclerView.h<qf.q0> {

    /* renamed from: a  reason: collision with root package name */
    public final int f51302a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ud.q0> f51303b;

    /* renamed from: c  reason: collision with root package name */
    public io.a<wn.v> f51304c;

    public z(int i10, List<ud.q0> list) {
        jo.p.h(list, "giftGachaUserBindModels");
        this.f51302a = i10;
        this.f51303b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public void onBindViewHolder(qf.q0 q0Var, int i10) {
        jo.p.h(q0Var, "holder");
        q0Var.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public qf.q0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return qf.q0.f49339f.a(viewGroup, this.f51302a, this.f51303b, this.f51304c);
    }

    public final void c(io.a<wn.v> aVar) {
        this.f51304c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 1;
    }
}
