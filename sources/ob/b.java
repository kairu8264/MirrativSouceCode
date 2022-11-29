package ob;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.t;
import io.l;
import jo.p;
import wn.v;

/* loaded from: classes2.dex */
public final class b extends t<c, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public l<? super String, v> f44594c;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<c> {
        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(c cVar, c cVar2) {
            p.h(cVar, "oldItem");
            p.h(cVar2, "newItem");
            return p.c(cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(c cVar, c cVar2) {
            p.h(cVar, "oldItem");
            p.h(cVar2, "newItem");
            return cVar.d() == cVar2.d() && cVar.h() == cVar2.h() && cVar.i() == cVar2.i();
        }
    }

    public b() {
        super(new a());
    }

    public static final void h(b bVar, c cVar, View view) {
        p.h(bVar, "this$0");
        p.h(cVar, "$bindModel");
        l<? super String, v> lVar = bVar.f44594c;
        if (lVar != null) {
            lVar.invoke(cVar.c());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final void i(l<? super String, v> lVar) {
        this.f44594c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        p.h(e0Var, "holder");
        if (e0Var instanceof d) {
            c b10 = b(i10);
            p.f(b10, "null cannot be cast to non-null type com.dena.mirrativ.player.giftranking.PlayerGiftRankingUserRankBindModel");
            final c cVar = b10;
            ((d) e0Var).b(cVar);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: ob.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.h(b.this, cVar, view);
                }
            });
            return;
        }
        throw new IllegalArgumentException("unknown ViewHolder type " + e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        p.h(viewGroup, "parent");
        return d.f44599x.a(viewGroup);
    }
}
