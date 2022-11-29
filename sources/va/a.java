package va;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class a extends RecyclerView.h<b> {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f57204a = s.k();

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public void onBindViewHolder(b bVar, int i10) {
        p.h(bVar, "holder");
        bVar.a(this.f57204a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        p.h(viewGroup, "parent");
        return b.f57205b.a(viewGroup);
    }

    public final void c(List<String> list) {
        p.h(list, "value");
        this.f57204a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f57204a.size();
    }
}
