package ua;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.notice.PresentBox;
import io.l;
import java.util.List;
import jo.p;
import wn.v;
import xn.s;

/* loaded from: classes2.dex */
public final class b extends RecyclerView.h<i> {

    /* renamed from: a  reason: collision with root package name */
    public final l<PresentBox, v> f54652a;

    /* renamed from: b  reason: collision with root package name */
    public List<PresentBox> f54653b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super PresentBox, v> lVar) {
        p.h(lVar, "itemClickListener");
        this.f54652a = lVar;
        this.f54653b = s.k();
    }

    public static final void c(b bVar, int i10, View view) {
        p.h(bVar, "this$0");
        bVar.f54652a.invoke(bVar.f54653b.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(i iVar, final int i10) {
        p.h(iVar, "holder");
        iVar.a(this.f54653b.get(i10));
        iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: ua.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.c(b.this, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
        p.h(viewGroup, "parent");
        return i.f54709b.a(viewGroup);
    }

    public final void f(List<PresentBox> list) {
        p.h(list, "value");
        this.f54653b = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f54653b.size();
    }
}
