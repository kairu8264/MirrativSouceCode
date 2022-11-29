package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ud.w0;

/* loaded from: classes2.dex */
public final class d0 extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ud.w0> f51109a;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(List<? extends ud.w0> list) {
        jo.p.h(list, "items");
        this.f51109a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51109a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f51109a.get(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof qf.w0) {
            ud.w0 w0Var = this.f51109a.get(i10);
            jo.p.f(w0Var, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GiftItemDetailEmomoQuestBindModel");
            ((qf.w0) e0Var).a((ud.v0) w0Var);
        } else if (e0Var instanceof qf.x0) {
            ud.w0 w0Var2 = this.f51109a.get(i10);
            jo.p.f(w0Var2, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GiftItemDetailBindModel");
            ((qf.x0) e0Var).a((ud.u0) w0Var2);
        } else {
            throw new IllegalArgumentException("unknown ViewHolder " + e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == w0.a.EMOMO_QUEST.ordinal()) {
            return qf.w0.f49414b.a(viewGroup);
        }
        if (i10 == w0.a.DEFAULT.ordinal()) {
            return qf.x0.f49429b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown viewType " + i10);
    }
}
