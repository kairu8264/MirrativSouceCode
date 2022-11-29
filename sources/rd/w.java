package rd;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class w extends RecyclerView.h<yd.r> {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.u f51242a;

    /* renamed from: b  reason: collision with root package name */
    public final ud.h0 f51243b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f51244c;

    /* renamed from: d  reason: collision with root package name */
    public long f51245d;

    public /* synthetic */ w(androidx.lifecycle.u uVar, ud.h0 h0Var, boolean z10, int i10, jo.h hVar) {
        this(uVar, h0Var, (i10 & 4) != 0 ? false : z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public void onBindViewHolder(yd.r rVar, int i10) {
        jo.p.h(rVar, "holder");
        rVar.b(this.f51242a, this.f51243b);
        if (!this.f51244c || System.currentTimeMillis() >= this.f51245d) {
            return;
        }
        View view = rVar.itemView;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200L);
        view.startAnimation(alphaAnimation);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public yd.r onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        viewGroup.setClipChildren(false);
        return yd.r.f61784b.a(viewGroup);
    }

    public final void c(long j10) {
        this.f51245d = j10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 1;
    }

    public w(androidx.lifecycle.u uVar, ud.h0 h0Var, boolean z10) {
        jo.p.h(uVar, "lifecycleOwner");
        jo.p.h(h0Var, "bindModel");
        this.f51242a = uVar;
        this.f51243b = h0Var;
        this.f51244c = z10;
    }
}
