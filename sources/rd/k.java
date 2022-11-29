package rd;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.j;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;

/* loaded from: classes2.dex */
public final class k extends androidx.recyclerview.widget.t<wn.k<? extends ClosetAvatarSimpleValue, ? extends Boolean>, qf.f0> {

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super Integer, wn.v> f51169c;

    /* renamed from: d  reason: collision with root package name */
    public int f51170d;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<wn.k<? extends ClosetAvatarSimpleValue, ? extends Boolean>> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(wn.k<ClosetAvatarSimpleValue, Boolean> kVar, wn.k<ClosetAvatarSimpleValue, Boolean> kVar2) {
            jo.p.h(kVar, "oldItem");
            jo.p.h(kVar2, "newItem");
            return jo.p.c(kVar.c(), kVar2.c()) && kVar.d().booleanValue() == kVar2.d().booleanValue();
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(wn.k<ClosetAvatarSimpleValue, Boolean> kVar, wn.k<ClosetAvatarSimpleValue, Boolean> kVar2) {
            jo.p.h(kVar, "oldItem");
            jo.p.h(kVar2, "newItem");
            return jo.p.c(kVar.c().getId(), kVar2.c().getId());
        }
    }

    public k() {
        super(new a());
    }

    public static final void j(k kVar, int i10, View view) {
        jo.p.h(kVar, "this$0");
        kVar.m(i10);
    }

    public final int h() {
        return this.f51170d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: i */
    public void onBindViewHolder(qf.f0 f0Var, final int i10) {
        jo.p.h(f0Var, "holder");
        wn.k<? extends ClosetAvatarSimpleValue, ? extends Boolean> b10 = b(i10);
        f0Var.a(b10.a().getIconUrl(), b10.b().booleanValue());
        f0Var.b().u().setOnClickListener(new View.OnClickListener() { // from class: rd.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.j(k.this, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: k */
    public qf.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return qf.f0.f49136b.a(viewGroup);
    }

    public final void l(io.l<? super Integer, wn.v> lVar) {
        this.f51169c = lVar;
    }

    public final void m(int i10) {
        this.f51170d = i10;
        io.l<? super Integer, wn.v> lVar = this.f51169c;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i10));
        }
    }
}
