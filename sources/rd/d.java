package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ud.a;

/* loaded from: classes2.dex */
public final class d extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.u f51103a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<String, wn.v> f51104b;

    /* renamed from: c  reason: collision with root package name */
    public final io.l<String, wn.v> f51105c;

    /* renamed from: d  reason: collision with root package name */
    public final io.a<wn.v> f51106d;

    /* renamed from: e  reason: collision with root package name */
    public List<? extends ud.a> f51107e;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {
        public a() {
            super(0);
        }

        public final void a() {
            d.this.f51106d.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(androidx.lifecycle.u uVar, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2, io.a<wn.v> aVar) {
        jo.p.h(uVar, "lifecycleOwner");
        jo.p.h(lVar, "onItemClick");
        jo.p.h(lVar2, "onCampaignDetailClick");
        jo.p.h(aVar, "onFooterLinkClick");
        this.f51103a = uVar;
        this.f51104b = lVar;
        this.f51105c = lVar2;
        this.f51106d = aVar;
        this.f51107e = xn.s.k();
    }

    public final List<ud.a> b() {
        return this.f51107e;
    }

    public final void c(List<? extends ud.a> list) {
        jo.p.h(list, "value");
        this.f51107e = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51107e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f51107e.get(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof qf.c) {
            ud.a aVar = this.f51107e.get(i10);
            jo.p.f(aVar, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.AppSettingBindModel");
            ((qf.c) e0Var).a((ud.f) aVar, this.f51104b, this.f51105c);
        } else if (e0Var instanceof qf.b) {
            ((qf.b) e0Var).a(new a());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.APP_SETTING.ordinal()) {
            return qf.c.f49075b.a(this.f51103a, viewGroup);
        }
        if (i10 == a.EnumC0862a.APP_SETTING_FOOTER.ordinal()) {
            return qf.b.f49051b.a(viewGroup);
        }
        throw new IllegalStateException("invalid view holder");
    }
}
