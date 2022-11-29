package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class y extends RecyclerView.h<yd.s> {

    /* renamed from: a  reason: collision with root package name */
    public final ud.k0 f51298a;

    public y(ud.k0 k0Var) {
        jo.p.h(k0Var, "bindModel");
        this.f51298a = k0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public void onBindViewHolder(yd.s sVar, int i10) {
        jo.p.h(sVar, "holder");
        sVar.a(this.f51298a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public yd.s onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return yd.s.f61790b.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 1;
    }
}
