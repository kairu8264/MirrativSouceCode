package y8;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import io.l;
import java.util.List;
import jo.p;
import jo.q;
import ud.i2;
import ud.j2;
import wn.v;
import xn.s;
import yd.g1;

/* loaded from: classes.dex */
public final class e extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public final l<String, v> f61291a;

    /* renamed from: b  reason: collision with root package name */
    public final io.a<v> f61292b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends j2> f61293c;

    /* loaded from: classes.dex */
    public static final class a extends q implements l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g f61295x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar) {
            super(1);
            this.f61295x = gVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            e.this.f61291a.invoke(this.f61295x.a());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<View, v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            e.this.f61292b.invoke();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(l<? super String, v> lVar, io.a<v> aVar) {
        p.h(lVar, "onClickApp");
        p.h(aVar, "onClickAdd");
        this.f61291a = lVar;
        this.f61292b = aVar;
        this.f61293c = s.k();
    }

    public final void c(List<? extends j2> list) {
        p.h(list, "value");
        this.f61293c = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f61293c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f61293c.get(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        p.h(e0Var, "holder");
        if (e0Var instanceof h) {
            j2 j2Var = this.f61293c.get(i10);
            p.f(j2Var, "null cannot be cast to non-null type com.dena.mirrativ.catalog.home.app.MyAppHasOutlineBindModel");
            g gVar = (g) j2Var;
            ((h) e0Var).a(gVar);
            View view = e0Var.itemView;
            p.g(view, "holder.itemView");
            g1.a(view, new a(gVar));
        } else if (e0Var instanceof f) {
            j2 j2Var2 = this.f61293c.get(i10);
            p.f(j2Var2, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.MyAppAddHasOutlineBindModel");
            ((f) e0Var).a((i2) j2Var2);
            View view2 = e0Var.itemView;
            p.g(view2, "holder.itemView");
            g1.a(view2, new b());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        p.h(viewGroup, "parent");
        viewGroup.setClipChildren(false);
        if (i10 == j2.a.APP.ordinal()) {
            return h.f61307b.a(viewGroup);
        }
        if (i10 == j2.a.ADD.ordinal()) {
            return f.f61297b.a(viewGroup);
        }
        throw new IllegalStateException("存在しないitemViewTypeです");
    }
}
