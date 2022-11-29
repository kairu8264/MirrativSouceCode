package hc;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes2.dex */
public final class b1 extends RecyclerView.h<d1> {

    /* renamed from: a  reason: collision with root package name */
    public List<c1> f35069a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.l<? super RecyclerView.e0, wn.v> f35070b;

    public static final boolean f(b1 b1Var, d1 d1Var, View view, MotionEvent motionEvent) {
        io.l<? super RecyclerView.e0, wn.v> lVar;
        jo.p.h(b1Var, "this$0");
        jo.p.h(d1Var, "$holder");
        if (motionEvent.getActionMasked() != 0 || (lVar = b1Var.f35070b) == null) {
            return true;
        }
        lVar.invoke(d1Var);
        return true;
    }

    public final List<c1> b() {
        return this.f35069a;
    }

    public final void c(int i10, int i11) {
        List D0 = xn.a0.D0(this.f35069a);
        D0.add(i11, D0.remove(i10));
        this.f35069a = xn.a0.B0(D0);
        notifyItemMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public void onBindViewHolder(final d1 d1Var, int i10) {
        jo.p.h(d1Var, "holder");
        d1Var.a(this.f35069a.get(i10));
        d1Var.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: hc.a1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean f10;
                f10 = b1.f(b1.this, d1Var, view, motionEvent);
                return f10;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g */
    public d1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return d1.f35080b.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f35069a.size();
    }

    public final void h(List<c1> list) {
        jo.p.h(list, "<set-?>");
        this.f35069a = list;
    }

    public final void i(io.l<? super RecyclerView.e0, wn.v> lVar) {
        this.f35070b = lVar;
    }
}
