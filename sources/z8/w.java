package z8;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.dena.mirrativ.catalog.mission.SpecialMissionViewHolder;

/* loaded from: classes.dex */
public final class w extends androidx.recyclerview.widget.t<a0, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.u f62779c;

    /* renamed from: d  reason: collision with root package name */
    public final io.l<Integer, wn.v> f62780d;

    /* renamed from: e  reason: collision with root package name */
    public final io.l<g, wn.v> f62781e;

    /* loaded from: classes.dex */
    public static final class a extends j.f<a0> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(a0 a0Var, a0 a0Var2) {
            jo.p.h(a0Var, "oldItem");
            jo.p.h(a0Var2, "newItem");
            return jo.p.c(a0Var, a0Var2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(a0 a0Var, a0 a0Var2) {
            jo.p.h(a0Var, "oldItem");
            jo.p.h(a0Var2, "newItem");
            return a0Var.d() == a0Var2.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(androidx.lifecycle.u uVar, io.l<? super Integer, wn.v> lVar, io.l<? super g, wn.v> lVar2) {
        super(new a());
        jo.p.h(uVar, "lifecycleOwner");
        jo.p.h(lVar, "onClickSpecialMissionButton");
        jo.p.h(lVar2, "onClickRewardDetail");
        this.f62779c = uVar;
        this.f62780d = lVar;
        this.f62781e = lVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof SpecialMissionViewHolder) {
            a0 b10 = b(i10);
            jo.p.g(b10, "getItem(position)");
            ((SpecialMissionViewHolder) e0Var).d(b10, this.f62779c, this.f62780d, this.f62781e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        SpecialMissionViewHolder a10 = SpecialMissionViewHolder.A.a(viewGroup);
        View view = a10.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = ((viewGroup.getMeasuredWidth() - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd()) - de.m.a(a10, 48);
        view.setLayoutParams(layoutParams);
        return a10;
    }
}
