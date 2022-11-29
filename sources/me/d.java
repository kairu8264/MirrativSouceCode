package me;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ud.a;
import ud.w4;

/* loaded from: classes2.dex */
public final class d extends androidx.recyclerview.widget.t<w4, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public e f41042c;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<w4> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(w4 w4Var, w4 w4Var2) {
            jo.p.h(w4Var, "oldItem");
            jo.p.h(w4Var2, "newItem");
            return jo.p.c(w4Var, w4Var2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(w4 w4Var, w4 w4Var2) {
            jo.p.h(w4Var, "oldItem");
            jo.p.h(w4Var2, "newItem");
            return w4Var == w4Var2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements n {
        public b() {
        }

        @Override // me.n
        public void a(String str) {
            jo.p.h(str, TtmlNode.ATTR_ID);
            e g10 = d.this.g();
            if (g10 != null) {
                g10.a(str);
            }
        }
    }

    public d() {
        super(new a());
    }

    public final e g() {
        return this.f41042c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final void h(e eVar) {
        this.f41042c = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof m) {
            w4 b10 = b(i10);
            jo.p.g(b10, "getItem(position)");
            ((m) e0Var).a(b10, new b());
            return;
        }
        throw new IllegalArgumentException("unknown viewHolder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.UNIQUE_EMOMO_RICH_GIFT_PRESET.ordinal()) {
            return m.f41056b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown viewType = " + i10);
    }
}
