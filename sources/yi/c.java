package yi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public d f62025a;

    /* renamed from: b  reason: collision with root package name */
    public int f62026b;

    /* renamed from: c  reason: collision with root package name */
    public int f62027c;

    public c() {
        this.f62026b = 0;
        this.f62027c = 0;
    }

    public int E() {
        d dVar = this.f62025a;
        if (dVar != null) {
            return dVar.c();
        }
        return 0;
    }

    public void F(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.C(v10, i10);
    }

    public boolean G(int i10) {
        d dVar = this.f62025a;
        if (dVar != null) {
            return dVar.f(i10);
        }
        this.f62026b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        F(coordinatorLayout, v10, i10);
        if (this.f62025a == null) {
            this.f62025a = new d(v10);
        }
        this.f62025a.d();
        this.f62025a.a();
        int i11 = this.f62026b;
        if (i11 != 0) {
            this.f62025a.f(i11);
            this.f62026b = 0;
        }
        int i12 = this.f62027c;
        if (i12 != 0) {
            this.f62025a.e(i12);
            this.f62027c = 0;
            return true;
        }
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62026b = 0;
        this.f62027c = 0;
    }
}
