package dd;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class h extends RecyclerView.h<i> {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends ed.b> f29569a = s.k();

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public void onBindViewHolder(i iVar, int i10) {
        p.h(iVar, "holder");
        iVar.a(this.f29569a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
        p.h(viewGroup, "parent");
        return i.f29570b.a(viewGroup);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void c(List<? extends ed.b> list) {
        p.h(list, "value");
        this.f29569a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f29569a.size();
    }
}
