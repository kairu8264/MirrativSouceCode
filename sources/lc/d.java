package lc;

import ac.r5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class d extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39841b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f39842c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final r5 f39843a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), xb.p.view_holder_favorite_live_setting, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new d((r5) e10, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f39845x;

        public b(io.a<wn.v> aVar) {
            this.f39845x = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            d.this.f39843a.u().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f39845x.invoke();
        }
    }

    public d(r5 r5Var) {
        super(r5Var.u());
        this.f39843a = r5Var;
        r5Var.E.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: lc.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                d.b(d.this, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
    }

    public /* synthetic */ d(r5 r5Var, jo.h hVar) {
        this(r5Var);
    }

    public static final void b(d dVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        jo.p.h(dVar, "this$0");
        int floor = (int) Math.floor(dVar.f39843a.E.getHeight() / (dVar.f39843a.E.getLineHeight() + dVar.f39843a.E.getPaint().getFontMetrics().bottom));
        if (dVar.f39843a.E.getMaxLines() != floor) {
            dVar.f39843a.E.setMaxLines(floor);
            AppCompatTextView appCompatTextView = dVar.f39843a.E;
            appCompatTextView.setText(appCompatTextView.getText());
        }
    }

    public final void d(lc.b bVar, io.a<wn.v> aVar) {
        jo.p.h(bVar, "bindModel");
        jo.p.h(aVar, "onGlobalLayoutListener");
        this.f39843a.T(bVar);
        this.f39843a.u().getViewTreeObserver().addOnGlobalLayoutListener(new b(aVar));
    }
}
