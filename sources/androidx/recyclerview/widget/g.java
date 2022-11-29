package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public final h f16111a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f16112c = new a(true, EnumC0074a.NO_STABLE_IDS);

        /* renamed from: a  reason: collision with root package name */
        public final boolean f16113a;

        /* renamed from: b  reason: collision with root package name */
        public final EnumC0074a f16114b;

        /* renamed from: androidx.recyclerview.widget.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0074a {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        public a(boolean z10, EnumC0074a enumC0074a) {
            this.f16113a = z10;
            this.f16114b = enumC0074a;
        }
    }

    @SafeVarargs
    public g(RecyclerView.h<? extends RecyclerView.e0>... hVarArr) {
        this(a.f16112c, hVarArr);
    }

    public boolean a(RecyclerView.h<? extends RecyclerView.e0> hVar) {
        return this.f16111a.h(hVar);
    }

    public List<? extends RecyclerView.h<? extends RecyclerView.e0>> b() {
        return Collections.unmodifiableList(this.f16111a.n());
    }

    public void c(RecyclerView.h.a aVar) {
        super.setStateRestorationPolicy(aVar);
    }

    public boolean d(RecyclerView.h<? extends RecyclerView.e0> hVar) {
        return this.f16111a.F(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int findRelativeAdapterPositionIn(RecyclerView.h<? extends RecyclerView.e0> hVar, RecyclerView.e0 e0Var, int i10) {
        return this.f16111a.q(hVar, e0Var, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f16111a.r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f16111a.o(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f16111a.p(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f16111a.w(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        this.f16111a.x(e0Var, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return this.f16111a.y(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f16111a.z(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean onFailedToRecycleView(RecyclerView.e0 e0Var) {
        return this.f16111a.A(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
        this.f16111a.B(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        this.f16111a.C(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.e0 e0Var) {
        this.f16111a.D(e0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setStateRestorationPolicy(RecyclerView.h.a aVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @SafeVarargs
    public g(a aVar, RecyclerView.h<? extends RecyclerView.e0>... hVarArr) {
        this(aVar, Arrays.asList(hVarArr));
    }

    public g(a aVar, List<? extends RecyclerView.h<? extends RecyclerView.e0>> list) {
        this.f16111a = new h(this, aVar);
        for (RecyclerView.h<? extends RecyclerView.e0> hVar : list) {
            a(hVar);
        }
        super.setHasStableIds(this.f16111a.t());
    }
}
