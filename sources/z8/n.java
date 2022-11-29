package z8;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: g  reason: collision with root package name */
    public static final a f62715g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f62716h = 8;

    /* renamed from: a  reason: collision with root package name */
    public final j f62717a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.u f62718b;

    /* renamed from: c  reason: collision with root package name */
    public final io.l<Integer, wn.v> f62719c;

    /* renamed from: d  reason: collision with root package name */
    public final io.l<Integer, wn.v> f62720d;

    /* renamed from: e  reason: collision with root package name */
    public final io.l<g, wn.v> f62721e;

    /* renamed from: f  reason: collision with root package name */
    public List<t> f62722f;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(j jVar, androidx.lifecycle.u uVar, io.l<? super Integer, wn.v> lVar, io.l<? super Integer, wn.v> lVar2, io.l<? super g, wn.v> lVar3) {
        jo.p.h(jVar, "period");
        jo.p.h(uVar, "lifecycleOwner");
        jo.p.h(lVar, "onClickFirstMissionGetButton");
        jo.p.h(lVar2, "onClickSpecialMissionButton");
        jo.p.h(lVar3, "onClickRewardDetail");
        this.f62717a = jVar;
        this.f62718b = uVar;
        this.f62719c = lVar;
        this.f62720d = lVar2;
        this.f62721e = lVar3;
        this.f62722f = xn.s.k();
    }

    public final List<t> a() {
        return this.f62722f;
    }

    public final void b(List<t> list) {
        jo.p.h(list, "missionTabList");
        this.f62722f = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f62722f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return i10 == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof s) {
            ((s) e0Var).f(this.f62717a, this.f62722f.get(i10), this.f62718b, this.f62719c, this.f62720d, this.f62721e);
        } else if (e0Var instanceof u) {
            ((u) e0Var).a(this.f62722f.get(i10), this.f62718b, this.f62719c, this.f62721e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == 0) {
            return s.f62756d.a(viewGroup);
        }
        return u.f62774b.a(viewGroup);
    }
}
