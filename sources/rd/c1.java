package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import qf.i3;

/* loaded from: classes2.dex */
public final class c1 extends RecyclerView.h<i3> {

    /* renamed from: a  reason: collision with root package name */
    public final int f51102a;

    public c1(int i10) {
        this.f51102a = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public void onBindViewHolder(i3 i3Var, int i10) {
        jo.p.h(i3Var, "holder");
        i3Var.a(this.f51102a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public i3 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return i3.f49231b.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 1;
    }
}
