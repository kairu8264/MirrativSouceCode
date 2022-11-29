package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes2.dex */
public final class g extends RecyclerView.h<qf.f> {

    /* renamed from: a  reason: collision with root package name */
    public List<ud.s> f51144a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public qf.g f51145b;

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public void onBindViewHolder(qf.f fVar, int i10) {
        jo.p.h(fVar, "holder");
        fVar.b(this.f51144a.get(i10));
        qf.g gVar = this.f51145b;
        if (gVar != null) {
            fVar.c(gVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public qf.f onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return qf.f.f49126c.a(viewGroup);
    }

    public final void c(qf.g gVar) {
        this.f51145b = gVar;
    }

    public final void d(List<ud.s> list) {
        jo.p.h(list, "value");
        this.f51144a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51144a.size();
    }
}
