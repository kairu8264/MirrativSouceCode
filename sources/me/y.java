package me;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import qf.o2;
import qf.x2;
import qf.z2;
import ud.a;
import ud.a4;
import ud.i3;
import ud.z3;

/* loaded from: classes2.dex */
public final class y extends androidx.recyclerview.widget.t<ud.a, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super a4, wn.v> f41126c;

    /* renamed from: d  reason: collision with root package name */
    public io.l<? super z3, wn.v> f41127d;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<ud.a> {
        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(ud.a aVar, ud.a aVar2) {
            jo.p.h(aVar, "oldItem");
            jo.p.h(aVar2, "newItem");
            if ((aVar instanceof a4) && (aVar2 instanceof a4)) {
                return jo.p.c(aVar, aVar2);
            }
            if ((aVar instanceof z3) && (aVar2 instanceof z3)) {
                return jo.p.c(aVar, aVar2);
            }
            if ((aVar instanceof i3) && (aVar2 instanceof i3)) {
                return jo.p.c(aVar, aVar2);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(ud.a aVar, ud.a aVar2) {
            jo.p.h(aVar, "oldItem");
            jo.p.h(aVar2, "newItem");
            if ((aVar instanceof a4) && (aVar2 instanceof a4)) {
                if (((a4) aVar).b() == ((a4) aVar2).b()) {
                    return true;
                }
            } else if ((aVar instanceof z3) && (aVar2 instanceof z3)) {
                z3 z3Var = (z3) aVar;
                z3 z3Var2 = (z3) aVar2;
                if (z3Var.b() == z3Var2.b() && jo.p.c(z3Var.c(), z3Var2.c())) {
                    return true;
                }
            } else if ((aVar instanceof i3) && (aVar2 instanceof i3)) {
                return jo.p.c(aVar, aVar2);
            }
            return false;
        }
    }

    public y() {
        super(new a());
    }

    public final void g(io.l<? super z3, wn.v> lVar) {
        this.f41127d = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final void h(io.l<? super a4, wn.v> lVar) {
        this.f41126c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof z2) {
            ud.a b10 = b(i10);
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StampGiftTextAlignBindModel");
            ((z2) e0Var).a((a4) b10, this.f41126c);
        } else if (!(e0Var instanceof x2)) {
            if (!(e0Var instanceof o2)) {
                throw new IllegalArgumentException("unknown viewHolder");
            }
        } else {
            ud.a b11 = b(i10);
            jo.p.f(b11, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.StampGiftColorPaletteBindModel");
            ((x2) e0Var).a((z3) b11, this.f41127d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.STAMP_GIFT_TEXT_ALIGN.ordinal()) {
            return z2.f49466b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.STAMP_GIFT_COLOR_PALETTE.ordinal()) {
            return x2.f49435b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.SEPARATOR.ordinal()) {
            return o2.f49317a.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown viewType = " + i10);
    }
}
