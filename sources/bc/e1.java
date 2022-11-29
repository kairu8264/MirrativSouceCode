package bc;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes2.dex */
public final class e1 extends RecyclerView.h<f1> {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f17297a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<String, wn.v> f17298b;

    /* renamed from: c  reason: collision with root package name */
    public final io.l<String, wn.v> f17299c;

    /* JADX WARN: Multi-variable type inference failed */
    public e1(List<String> list, io.l<? super String, wn.v> lVar, io.l<? super String, wn.v> lVar2) {
        jo.p.h(list, "historyList");
        jo.p.h(lVar, "onClickKeyword");
        jo.p.h(lVar2, "onClickClose");
        this.f17297a = list;
        this.f17298b = lVar;
        this.f17299c = lVar2;
    }

    public static final void d(e1 e1Var, String str, View view) {
        jo.p.h(e1Var, "this$0");
        jo.p.h(str, "$keyword");
        e1Var.f17299c.invoke(str);
    }

    public static final void f(e1 e1Var, String str, View view) {
        jo.p.h(e1Var, "this$0");
        jo.p.h(str, "$keyword");
        e1Var.f17298b.invoke(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public void onBindViewHolder(f1 f1Var, int i10) {
        jo.p.h(f1Var, "holder");
        final String str = this.f17297a.get(i10);
        f1Var.a(str);
        f1Var.b().B.setOnClickListener(new View.OnClickListener() { // from class: bc.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e1.d(e1.this, str, view);
            }
        });
        f1Var.b().u().setOnClickListener(new View.OnClickListener() { // from class: bc.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e1.f(e1.this, str, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g */
    public f1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return f1.f17311b.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f17297a.size();
    }
}
