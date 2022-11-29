package hc;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ud.h1;
import ud.j1;
import ud.k1;

/* loaded from: classes2.dex */
public final class f extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends h1> f35086a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public a f35087b;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b(String str);

        void e();
    }

    public static final void d(f fVar, View view) {
        jo.p.h(fVar, "this$0");
        a aVar = fVar.f35087b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public static final void f(f fVar, View view) {
        jo.p.h(fVar, "this$0");
        a aVar = fVar.f35087b;
        if (aVar != null) {
            aVar.e();
        }
    }

    public static final void g(f fVar, k1 k1Var, View view) {
        jo.p.h(fVar, "this$0");
        jo.p.h(k1Var, "$bindModel");
        a aVar = fVar.f35087b;
        if (aVar != null) {
            aVar.b(k1Var.a());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f35086a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f35086a.get(i10).getType().ordinal();
    }

    public final void h(List<? extends h1> list) {
        jo.p.h(list, "value");
        this.f35086a = list;
        notifyDataSetChanged();
    }

    public final void i(a aVar) {
        this.f35087b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof g) {
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: hc.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.d(f.this, view);
                }
            });
        } else if (e0Var instanceof h) {
            h1 h1Var = this.f35086a.get(i10);
            jo.p.f(h1Var, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GroupShotBackgroundSettingGalleryImageBindModel");
            ((h) e0Var).a((j1) h1Var);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: hc.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.f(f.this, view);
                }
            });
        } else if (e0Var instanceof i) {
            h1 h1Var2 = this.f35086a.get(i10);
            jo.p.f(h1Var2, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GroupShotBackgroundSettingImageBindModel");
            final k1 k1Var = (k1) h1Var2;
            ((i) e0Var).a(k1Var);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: hc.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.g(f.this, k1Var, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == h1.a.SELECT_FROM_GALLERY.ordinal()) {
            return g.f35113a.a(viewGroup);
        }
        if (i10 == h1.a.GALLERY_IMAGE.ordinal()) {
            return h.f35117b.a(viewGroup);
        }
        if (i10 == h1.a.IMAGE.ordinal()) {
            return i.f35192b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }
}
