package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;

/* loaded from: classes2.dex */
public final class l extends androidx.recyclerview.widget.t<wn.k<? extends ClosetAvatarSimpleValue, ? extends Boolean>, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public m f51175c;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<wn.k<? extends ClosetAvatarSimpleValue, ? extends Boolean>> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(wn.k<ClosetAvatarSimpleValue, Boolean> kVar, wn.k<ClosetAvatarSimpleValue, Boolean> kVar2) {
            jo.p.h(kVar, "oldItem");
            jo.p.h(kVar2, "newItem");
            return jo.p.c(kVar, kVar2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(wn.k<ClosetAvatarSimpleValue, Boolean> kVar, wn.k<ClosetAvatarSimpleValue, Boolean> kVar2) {
            jo.p.h(kVar, "oldItem");
            jo.p.h(kVar2, "newItem");
            return jo.p.c(kVar.c().getId(), kVar2.c().getId());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements qf.e0 {
        public b() {
        }

        @Override // qf.e0
        public void a(String str) {
            jo.p.h(str, "poseId");
            m g10 = l.this.g();
            if (g10 != null) {
                g10.a(str);
            }
        }
    }

    public l() {
        super(new a());
    }

    public final m g() {
        return this.f51175c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h */
    public qf.d0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return qf.d0.f49097b.a(viewGroup);
    }

    public final void i(m mVar) {
        this.f51175c = mVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        wn.k<? extends ClosetAvatarSimpleValue, ? extends Boolean> b10 = b(i10);
        ClosetAvatarSimpleValue a10 = b10.a();
        boolean booleanValue = b10.b().booleanValue();
        if (e0Var instanceof qf.d0) {
            ((qf.d0) e0Var).a(a10.getId(), a10.getIconUrl(), a10.getPartTitle(), booleanValue, new b());
        }
    }
}
