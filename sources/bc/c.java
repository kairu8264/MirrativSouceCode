package bc;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.Singer;
import java.util.List;

/* loaded from: classes2.dex */
public final class c extends RecyclerView.h<a> {

    /* renamed from: a  reason: collision with root package name */
    public final List<Singer> f17276a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<Singer, wn.v> f17277b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<Singer> list, io.l<? super Singer, wn.v> lVar) {
        jo.p.h(list, "singers");
        jo.p.h(lVar, "onClickSinger");
        this.f17276a = list;
        this.f17277b = lVar;
    }

    public static final void c(c cVar, int i10, View view) {
        jo.p.h(cVar, "this$0");
        cVar.f17277b.invoke(cVar.f17276a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(a aVar, final int i10) {
        jo.p.h(aVar, "holder");
        if (i10 == 0) {
            aVar.b(this.f17276a.get(i10));
        } else if (i10 == this.f17276a.size() - 1) {
            aVar.c(this.f17276a.get(i10));
        } else {
            aVar.a(this.f17276a.get(i10));
        }
        aVar.d().u().setOnClickListener(new View.OnClickListener() { // from class: bc.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.c(c.this, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return a.f17249b.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f17276a.size();
    }
}
