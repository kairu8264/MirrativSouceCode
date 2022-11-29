package re;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import io.l;
import io.p;
import java.util.List;
import jo.q;
import qf.l0;
import wn.v;
import xn.s;

/* loaded from: classes2.dex */
public final class e extends RecyclerView.h<l0> {

    /* renamed from: a  reason: collision with root package name */
    public final l<UrgeUser, v> f51315a;

    /* renamed from: b  reason: collision with root package name */
    public final p<UrgeUser, Boolean, v> f51316b;

    /* renamed from: c  reason: collision with root package name */
    public List<UrgeUser> f51317c;

    /* loaded from: classes2.dex */
    public static final class a extends q implements l<Boolean, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f51319x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(1);
            this.f51319x = i10;
        }

        public final void a(boolean z10) {
            e.this.f51316b.invoke(e.this.c().get(this.f51319x), Boolean.valueOf(z10));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Boolean bool) {
            a(bool.booleanValue());
            return v.f59242a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(l<? super UrgeUser, v> lVar, p<? super UrgeUser, ? super Boolean, v> pVar) {
        jo.p.h(lVar, "itemClickListener");
        jo.p.h(pVar, "onCheckedChangeListener");
        this.f51315a = lVar;
        this.f51316b = pVar;
        this.f51317c = s.k();
    }

    public static final void f(e eVar, int i10, View view) {
        jo.p.h(eVar, "this$0");
        eVar.f51315a.invoke(eVar.f51317c.get(i10));
    }

    public final List<UrgeUser> c() {
        return this.f51317c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public void onBindViewHolder(l0 l0Var, final int i10) {
        jo.p.h(l0Var, "holder");
        l0Var.b(this.f51317c.get(i10), new a(i10));
        l0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: re.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.f(e.this, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g */
    public l0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return l0.f49280b.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51317c.size();
    }

    public final void h(List<UrgeUser> list) {
        jo.p.h(list, "value");
        this.f51317c = list;
        notifyDataSetChanged();
    }
}
