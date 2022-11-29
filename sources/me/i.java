package me;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;

/* loaded from: classes2.dex */
public final class i extends androidx.recyclerview.widget.t<String, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public j f41049c;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<String> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(String str, String str2) {
            jo.p.h(str, "oldItem");
            jo.p.h(str2, "newItem");
            return jo.p.c(str, str2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(String str, String str2) {
            jo.p.h(str, "oldItem");
            jo.p.h(str2, "newItem");
            return str == str2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements l {
        public b() {
        }

        @Override // me.l
        public void a(int i10) {
            j g10 = i.this.g();
            if (g10 != null) {
                g10.a(i10);
            }
        }
    }

    public i() {
        super(new a());
    }

    public final j g() {
        return this.f41049c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h */
    public k onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return k.f41051b.a(viewGroup);
    }

    public final void i(j jVar) {
        this.f41049c = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof k) {
            String b10 = b(i10);
            jo.p.g(b10, "getItem(position)");
            ((k) e0Var).a(i10, b10, new b());
            return;
        }
        throw new IllegalArgumentException("unknown viewHolder");
    }
}
