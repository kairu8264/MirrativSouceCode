package bc;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.Singer;
import java.util.List;

/* loaded from: classes2.dex */
public final class s1 extends RecyclerView.h<t1> {

    /* renamed from: a  reason: collision with root package name */
    public List<Singer> f17479a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<Singer, wn.v> f17480b;

    /* JADX WARN: Multi-variable type inference failed */
    public s1(List<Singer> list, io.l<? super Singer, wn.v> lVar) {
        jo.p.h(list, "singers");
        jo.p.h(lVar, "onSelectSinger");
        this.f17479a = list;
        this.f17480b = lVar;
    }

    public static final void c(s1 s1Var, Singer singer, View view) {
        jo.p.h(s1Var, "this$0");
        jo.p.h(singer, "$singer");
        s1Var.f17480b.invoke(singer);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(t1 t1Var, int i10) {
        jo.p.h(t1Var, "holder");
        int itemViewType = getItemViewType(i10);
        if (itemViewType == a3.SINGER.ordinal()) {
            final Singer singer = this.f17479a.get(i10);
            t1Var.a(singer);
            t1Var.d().u().setOnClickListener(new View.OnClickListener() { // from class: bc.r1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s1.c(s1.this, singer, view);
                }
            });
        } else if (itemViewType == a3.TITLE.ordinal()) {
            t1Var.b(this.f17479a.get(i10).getKana());
            t1Var.d().u().setOnClickListener(null);
        } else if (itemViewType == a3.BOTTOM_MARGIN.ordinal()) {
            t1Var.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public t1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return t1.f17486b.a(viewGroup);
    }

    public final void f(List<Singer> list) {
        jo.p.h(list, "singers");
        this.f17479a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f17479a.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (i10 == this.f17479a.size()) {
            return a3.BOTTOM_MARGIN.ordinal();
        }
        if (this.f17479a.get(i10).getName().length() == 0) {
            return a3.TITLE.ordinal();
        }
        return a3.SINGER.ordinal();
    }
}
