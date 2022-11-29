package bc;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.Karaoke;
import java.util.List;

/* loaded from: classes2.dex */
public final class b0 extends RecyclerView.h<c0> {

    /* renamed from: a  reason: collision with root package name */
    public final List<Karaoke> f17264a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<Karaoke, wn.v> f17265b;

    /* renamed from: c  reason: collision with root package name */
    public final io.l<Karaoke, wn.v> f17266c;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(List<Karaoke> list, io.l<? super Karaoke, wn.v> lVar, io.l<? super Karaoke, wn.v> lVar2) {
        jo.p.h(list, "songs");
        jo.p.h(lVar, "selectSongListener");
        jo.p.h(lVar2, "onClickSetting");
        this.f17264a = list;
        this.f17265b = lVar;
        this.f17266c = lVar2;
    }

    public static final void f(b0 b0Var, int i10, View view) {
        jo.p.h(b0Var, "this$0");
        b0Var.f17265b.invoke(b0Var.f17264a.get(i10));
    }

    public static final void g(b0 b0Var, int i10, View view) {
        jo.p.h(b0Var, "this$0");
        b0Var.f17266c.invoke(b0Var.f17264a.get(i10));
    }

    public final void c(List<Karaoke> list) {
        jo.p.h(list, "items");
        for (Karaoke karaoke : list) {
            this.f17264a.add(karaoke);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public void onBindViewHolder(c0 c0Var, final int i10) {
        jo.p.h(c0Var, "holder");
        c0Var.a(this.f17264a.get(i10));
        c0Var.b().u().setOnClickListener(new View.OnClickListener() { // from class: bc.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b0.f(b0.this, i10, view);
            }
        });
        c0Var.b().B.setOnClickListener(new View.OnClickListener() { // from class: bc.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b0.g(b0.this, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f17264a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h */
    public c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return c0.f17278y.a(viewGroup);
    }
}
