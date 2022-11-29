package rd;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.mirrativapi.common.EventBannerResponse;
import java.util.List;

/* loaded from: classes2.dex */
public final class r extends RecyclerView.h<qf.j0> {

    /* renamed from: a  reason: collision with root package name */
    public final List<EventBannerResponse> f51218a;

    /* renamed from: b  reason: collision with root package name */
    public s f51219b;

    public r(List<EventBannerResponse> list) {
        jo.p.h(list, "eventBanners");
        this.f51218a = list;
    }

    public static final void c(r rVar, int i10, View view) {
        jo.p.h(rVar, "this$0");
        s sVar = rVar.f51219b;
        if (sVar != null) {
            sVar.a(rVar.f51218a.get(i10), i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(qf.j0 j0Var, final int i10) {
        jo.p.h(j0Var, "holder");
        j0Var.a(this.f51218a.get(i10));
        s sVar = this.f51219b;
        if (sVar != null) {
            sVar.b(this.f51218a.get(i10), i10);
        }
        j0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: rd.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.c(r.this, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public qf.j0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return qf.j0.f49237b.a(viewGroup);
    }

    public final void f(s sVar) {
        this.f51219b = sVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51218a.size();
    }
}
