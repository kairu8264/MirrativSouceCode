package za;

import android.view.ViewGroup;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jo.p;
import ud.a;
import wn.v;
import xn.s;

/* loaded from: classes2.dex */
public final class a extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public final u f62918a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends ud.a> f62919b;

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super Integer, v> f62920c;

    public a(u uVar) {
        p.h(uVar, "lifecycleOwner");
        this.f62918a = uVar;
        this.f62919b = s.k();
    }

    public final void a(List<? extends ud.a> list) {
        p.h(list, "value");
        this.f62919b = list;
        notifyDataSetChanged();
    }

    public final void b(io.l<? super Integer, v> lVar) {
        this.f62920c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f62919b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f62919b.get(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        p.h(e0Var, "holder");
        io.l<? super Integer, v> lVar = this.f62920c;
        if (lVar == null) {
            return;
        }
        if (e0Var instanceof l) {
            ud.a aVar = this.f62919b.get(i10);
            p.f(aVar, "null cannot be cast to non-null type com.dena.mirrativ.otherfeature.campaign.mission.CampaignMissionProgressBarBindModel");
            ((l) e0Var).d((h) aVar, lVar, this.f62918a);
        } else if (e0Var instanceof g) {
            ud.a aVar2 = this.f62919b.get(i10);
            p.f(aVar2, "null cannot be cast to non-null type com.dena.mirrativ.otherfeature.campaign.mission.CampaignMissionDateBindModel");
            ((g) e0Var).d((c) aVar2, lVar, this.f62918a);
        } else {
            throw new IllegalArgumentException("unknown view holder " + e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.CAMPAIGN_MISSION_PROGRESS_BAR.ordinal()) {
            return l.f62942b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.CAMPAIGN_MISSION_DATE.ordinal()) {
            return g.f62930b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }
}
