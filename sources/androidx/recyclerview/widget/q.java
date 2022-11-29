package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class q {

    /* renamed from: b  reason: collision with root package name */
    public int f16318b;

    /* renamed from: c  reason: collision with root package name */
    public int f16319c;

    /* renamed from: d  reason: collision with root package name */
    public int f16320d;

    /* renamed from: e  reason: collision with root package name */
    public int f16321e;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16324h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f16325i;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16317a = true;

    /* renamed from: f  reason: collision with root package name */
    public int f16322f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f16323g = 0;

    public boolean a(RecyclerView.b0 b0Var) {
        int i10 = this.f16319c;
        return i10 >= 0 && i10 < b0Var.b();
    }

    public View b(RecyclerView.w wVar) {
        View o10 = wVar.o(this.f16319c);
        this.f16319c += this.f16320d;
        return o10;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f16318b + ", mCurrentPosition=" + this.f16319c + ", mItemDirection=" + this.f16320d + ", mLayoutDirection=" + this.f16321e + ", mStartLine=" + this.f16322f + ", mEndLine=" + this.f16323g + '}';
    }
}
