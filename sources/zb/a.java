package zb;

import android.view.ViewGroup;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.t;
import io.l;
import jo.p;
import wn.v;

/* loaded from: classes2.dex */
public final class a extends t<b, c> {

    /* renamed from: c  reason: collision with root package name */
    public final u f62952c;

    /* renamed from: d  reason: collision with root package name */
    public final l<String, v> f62953d;

    /* renamed from: zb.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1088a extends j.f<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1088a f62954a = new C1088a();

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(b bVar, b bVar2) {
            p.h(bVar, "oldItem");
            p.h(bVar2, "newItem");
            return p.c(bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(b bVar, b bVar2) {
            p.h(bVar, "oldItem");
            p.h(bVar2, "newItem");
            return bVar.e() == bVar2.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(u uVar, l<? super String, v> lVar) {
        super(C1088a.f62954a);
        p.h(uVar, "viewLifecycleOwner");
        p.h(lVar, "onClickInvite");
        this.f62952c = uVar;
        this.f62953d = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g */
    public void onBindViewHolder(c cVar, int i10) {
        p.h(cVar, "holder");
        u uVar = this.f62952c;
        b b10 = b(i10);
        p.g(b10, "getItem(position)");
        cVar.a(uVar, b10, this.f62953d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h */
    public c onCreateViewHolder(ViewGroup viewGroup, int i10) {
        p.h(viewGroup, "parent");
        return c.f62966b.a(viewGroup);
    }
}
