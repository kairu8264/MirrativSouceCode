package ta;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.notice.NewsNotice;
import io.l;
import java.util.List;
import jo.p;
import wn.v;
import xn.s;

/* loaded from: classes2.dex */
public final class b extends RecyclerView.h<i> {

    /* renamed from: a  reason: collision with root package name */
    public final l<NewsNotice, v> f53363a;

    /* renamed from: b  reason: collision with root package name */
    public List<NewsNotice> f53364b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super NewsNotice, v> lVar) {
        p.h(lVar, "itemClickListener");
        this.f53363a = lVar;
        this.f53364b = s.k();
    }

    public static final void c(b bVar, int i10, View view) {
        p.h(bVar, "this$0");
        bVar.f53363a.invoke(bVar.f53364b.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(i iVar, final int i10) {
        p.h(iVar, "holder");
        iVar.a(this.f53364b.get(i10));
        iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: ta.a
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
        return i.f53419b.a(viewGroup);
    }

    public final void f(List<NewsNotice> list) {
        p.h(list, "value");
        this.f53364b = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f53364b.size();
    }
}
