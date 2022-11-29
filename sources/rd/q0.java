package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import qf.t1;

/* loaded from: classes2.dex */
public final class q0 extends androidx.recyclerview.widget.t<String, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public final int f51216c;

    /* renamed from: d  reason: collision with root package name */
    public final int f51217d;

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
            return jo.p.c(str, str2);
        }
    }

    public q0(int i10, int i11) {
        super(new a());
        this.f51216c = i10;
        this.f51217d = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g */
    public t1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return t1.f49387b.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        String b10 = b(i10);
        jo.p.g(b10, "getItem(position)");
        ((t1) e0Var).a(b10, this.f51216c, this.f51217d);
    }
}
