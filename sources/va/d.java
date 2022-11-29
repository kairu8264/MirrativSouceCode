package va;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.notice.YourNotice;
import io.l;
import java.util.List;
import jo.p;
import wn.v;
import xn.s;

/* loaded from: classes2.dex */
public final class d extends RecyclerView.h<k> {

    /* renamed from: a  reason: collision with root package name */
    public final l<YourNotice, v> f57210a;

    /* renamed from: b  reason: collision with root package name */
    public List<YourNotice> f57211b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(l<? super YourNotice, v> lVar) {
        p.h(lVar, "itemClickListener");
        this.f57210a = lVar;
        this.f57211b = s.k();
    }

    public static final void c(d dVar, int i10, View view) {
        p.h(dVar, "this$0");
        dVar.f57210a.invoke(dVar.f57211b.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(k kVar, final int i10) {
        p.h(kVar, "holder");
        kVar.a(this.f57211b.get(i10));
        kVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: va.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.c(d.this, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public k onCreateViewHolder(ViewGroup viewGroup, int i10) {
        p.h(viewGroup, "parent");
        return k.f57266b.a(viewGroup);
    }

    public final void f(List<YourNotice> list) {
        p.h(list, "value");
        this.f57211b = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f57211b.size();
    }
}
