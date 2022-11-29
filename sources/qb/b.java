package qb;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import qf.r1;
import ud.a;
import ud.b2;
import ud.c2;
import ud.d2;
import ud.e2;
import ud.f2;

/* loaded from: classes2.dex */
public final class b extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ud.a> f48891a;

    /* renamed from: b  reason: collision with root package name */
    public io.l<? super String, wn.v> f48892b;

    /* renamed from: c  reason: collision with root package name */
    public io.a<wn.v> f48893c;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {
        public a() {
            super(0);
        }

        public final void a() {
            io.a<wn.v> b10 = b.this.b();
            if (b10 != null) {
                b10.invoke();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends ud.a> list) {
        jo.p.h(list, "items");
        this.f48891a = list;
    }

    public static final void c(b bVar, d2 d2Var, View view) {
        jo.p.h(bVar, "this$0");
        jo.p.h(d2Var, "$bindModel");
        io.l<? super String, wn.v> lVar = bVar.f48892b;
        if (lVar != null) {
            lVar.invoke(d2Var.f());
        }
    }

    public final io.a<wn.v> b() {
        return this.f48893c;
    }

    public final void d(io.a<wn.v> aVar) {
        this.f48893c = aVar;
    }

    public final void f(io.l<? super String, wn.v> lVar) {
        this.f48892b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f48891a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f48891a.get(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof v) {
            ud.a aVar = this.f48891a.get(i10);
            jo.p.f(aVar, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.LiveInfoWithAppBindModel");
            ((v) e0Var).b((c2) aVar, new a());
        } else if (e0Var instanceof t) {
            ud.a aVar2 = this.f48891a.get(i10);
            jo.p.f(aVar2, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.LiveInfoNoAppBindModel");
            ((t) e0Var).a((b2) aVar2);
        } else if (e0Var instanceof x) {
            ud.a aVar3 = this.f48891a.get(i10);
            jo.p.f(aVar3, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.LiveViewersInfoBindModel");
            ((x) e0Var).a((e2) aVar3);
        } else if (e0Var instanceof w) {
            ud.a aVar4 = this.f48891a.get(i10);
            jo.p.f(aVar4, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.LiveViewerBindModel");
            final d2 d2Var = (d2) aVar4;
            ((w) e0Var).a(d2Var);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: qb.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.c(b.this, d2Var, view);
                }
            });
        } else if (e0Var instanceof r1) {
            ud.a aVar5 = this.f48891a.get(i10);
            jo.p.f(aVar5, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.LoadingBindModel");
            ((r1) e0Var).a((f2) aVar5);
        } else {
            throw new IllegalArgumentException("unknown view holder " + e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.LIVE_INFO_WITH_APP.ordinal()) {
            return v.f48942b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.LIVE_INFO_NO_APP.ordinal()) {
            return t.f48938b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.LIVE_VIEWERS_INFO.ordinal()) {
            return x.f48948b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.LIVE_VIEWER.ordinal()) {
            return w.f48945b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.LOADING.ordinal()) {
            return r1.f49361b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }
}
