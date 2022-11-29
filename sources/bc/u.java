package bc;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.Genre;
import java.util.List;

/* loaded from: classes2.dex */
public final class u extends RecyclerView.h<v> {

    /* renamed from: a  reason: collision with root package name */
    public final List<Genre> f17490a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<Genre, wn.v> f17491b;

    /* JADX WARN: Multi-variable type inference failed */
    public u(List<Genre> list, io.l<? super Genre, wn.v> lVar) {
        jo.p.h(list, "genres");
        jo.p.h(lVar, "onSelectGenre");
        this.f17490a = list;
        this.f17491b = lVar;
    }

    public static final void c(u uVar, int i10, View view) {
        jo.p.h(uVar, "this$0");
        uVar.f17491b.invoke(uVar.f17490a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(v vVar, final int i10) {
        jo.p.h(vVar, "holder");
        vVar.a(this.f17490a.get(i10));
        vVar.b().u().setOnClickListener(new View.OnClickListener() { // from class: bc.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.c(u.this, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public v onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return v.f17495b.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f17490a.size();
    }
}
