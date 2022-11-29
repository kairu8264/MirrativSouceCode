package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.h f16049a;

    public b(RecyclerView.h hVar) {
        this.f16049a = hVar;
    }

    @Override // androidx.recyclerview.widget.u
    public void a(int i10, int i11) {
        this.f16049a.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.u
    public void b(int i10, int i11) {
        this.f16049a.notifyItemRangeRemoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.u
    public void c(int i10, int i11, Object obj) {
        this.f16049a.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // androidx.recyclerview.widget.u
    public void d(int i10, int i11) {
        this.f16049a.notifyItemMoved(i10, i11);
    }
}
