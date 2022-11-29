package v8;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.t;
import v8.l;

/* loaded from: classes.dex */
public final class d extends t<l, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public final int f56924c;

    /* renamed from: d  reason: collision with root package name */
    public final float f56925d;

    /* renamed from: e  reason: collision with root package name */
    public e f56926e;

    /* loaded from: classes.dex */
    public static final class a extends j.f<l> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(l lVar, l lVar2) {
            jo.p.h(lVar, "oldItem");
            jo.p.h(lVar2, "newItem");
            return jo.p.c(lVar, lVar2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(l lVar, l lVar2) {
            jo.p.h(lVar, "oldItem");
            jo.p.h(lVar2, "newItem");
            return jo.p.c(lVar.getId(), lVar2.getId());
        }
    }

    public d(int i10, float f10) {
        super(new a());
        this.f56924c = i10;
        this.f56925d = f10;
    }

    public final void g(e eVar) {
        this.f56926e = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).f().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof m) {
            l b10 = b(i10);
            jo.p.g(b10, "getItem(position)");
            ((m) e0Var).b(b10, this.f56926e);
        } else if (e0Var instanceof p) {
            l b11 = b(i10);
            jo.p.g(b11, "getItem(position)");
            ((p) e0Var).b(b11, this.f56926e);
        } else if (e0Var instanceof n) {
            l b12 = b(i10);
            jo.p.g(b12, "getItem(position)");
            ((n) e0Var).b(b12, this.f56926e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        RecyclerView.e0 a10;
        jo.p.h(viewGroup, "parent");
        if (i10 == l.b.LARGE.ordinal()) {
            a10 = m.f56943b.a(viewGroup);
        } else if (i10 == l.b.VERTICAL.ordinal()) {
            a10 = p.f56965b.a(viewGroup);
        } else if (i10 == l.b.SMALL.ordinal()) {
            a10 = n.f56951b.a(viewGroup);
        } else if (i10 != l.b.EMPTY.ordinal()) {
            throw new IllegalArgumentException("unknown view type " + i10);
        } else {
            a10 = h.f56933a.a(viewGroup);
        }
        View view = a10.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int measuredWidth = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd();
        layoutParams.width = (measuredWidth / this.f56924c) - (((int) (measuredWidth * this.f56925d)) / 2);
        view.setLayoutParams(layoutParams);
        return a10;
    }
}
