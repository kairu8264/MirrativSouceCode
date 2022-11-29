package pe;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import qf.h3;

/* loaded from: classes2.dex */
public final class e extends RecyclerView.h<h3> {

    /* renamed from: a  reason: collision with root package name */
    public final List<UrgeUser> f47451a;

    public e(List<UrgeUser> list) {
        p.h(list, "mItems");
        this.f47451a = list;
    }

    public static final void c(e eVar, int i10, h3 h3Var, View view) {
        p.h(eVar, "this$0");
        p.h(h3Var, "$holder");
        UrgeUser urgeUser = eVar.f47451a.get(i10);
        urgeUser.setRequestFollow(!urgeUser.getRequestFollow());
        eVar.f47451a.set(i10, urgeUser);
        h3Var.b(urgeUser.getRequestFollow());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(final h3 h3Var, final int i10) {
        p.h(h3Var, "holder");
        h3Var.a(this.f47451a.get(i10));
        h3Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: pe.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.c(e.this, i10, h3Var, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public h3 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        p.h(viewGroup, "parent");
        return h3.f49207b.a(viewGroup);
    }

    public final List<String> f() {
        ArrayList arrayList = new ArrayList();
        int size = this.f47451a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f47451a.get(i10).getRequestFollow()) {
                arrayList.add(this.f47451a.get(i10).getUserId());
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f47451a.size();
    }
}
