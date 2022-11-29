package tc;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class v0 extends RecyclerView.h<y0> {

    /* renamed from: a  reason: collision with root package name */
    public final w0 f53579a;

    /* renamed from: b  reason: collision with root package name */
    public final List<UserBasicParams> f53580b;

    public v0(w0 w0Var) {
        jo.p.h(w0Var, "listener");
        this.f53579a = w0Var;
        this.f53580b = new ArrayList();
    }

    public final void a(UserBasicParams userBasicParams) {
        jo.p.h(userBasicParams, "item");
        this.f53580b.add(0, userBasicParams);
    }

    public final List<UserBasicParams> b() {
        return this.f53580b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public void onBindViewHolder(y0 y0Var, int i10) {
        jo.p.h(y0Var, "holder");
        if (this.f53580b.size() <= i10) {
            return;
        }
        y0Var.b(this.f53580b.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public y0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return y0.f53586c.a(viewGroup, this.f53579a);
    }

    public final void f(UserBasicParams userBasicParams) {
        jo.p.h(userBasicParams, "item");
        this.f53580b.remove(userBasicParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f53580b.size();
    }
}
