package r9;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.mirrativapi.closet.Closet;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 extends RecyclerView.h<d0> {

    /* renamed from: a  reason: collision with root package name */
    public List<Closet> f50131a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<Closet, wn.v> f50132b;

    /* renamed from: c  reason: collision with root package name */
    public final io.l<Closet, wn.v> f50133c;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(List<Closet> list, io.l<? super Closet, wn.v> lVar, io.l<? super Closet, wn.v> lVar2) {
        jo.p.h(list, "closets");
        jo.p.h(lVar, "onClickListener");
        jo.p.h(lVar2, "onStartNameEditListener");
        this.f50131a = list;
        this.f50132b = lVar;
        this.f50133c = lVar2;
    }

    public static final void c(b0 b0Var, int i10, View view) {
        jo.p.h(b0Var, "this$0");
        b0Var.f50132b.invoke(b0Var.f50131a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(d0 d0Var, final int i10) {
        jo.p.h(d0Var, "holder");
        d0Var.b(this.f50131a.get(i10));
        d0Var.f(this.f50133c);
        d0Var.d().H.setOnClickListener(new View.OnClickListener() { // from class: r9.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b0.c(b0.this, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public d0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return d0.f50144c.a(viewGroup);
    }

    public final void f(List<Closet> list) {
        jo.p.h(list, "<set-?>");
        this.f50131a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f50131a.size();
    }
}
