package lj;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final View f40222a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f40223b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f40224c = 0;

    public b(a aVar) {
        this.f40222a = (View) aVar;
    }

    public final void a() {
        ViewParent parent = this.f40222a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f40222a);
        }
    }

    public int b() {
        return this.f40224c;
    }

    public boolean c() {
        return this.f40223b;
    }

    public void d(Bundle bundle) {
        this.f40223b = bundle.getBoolean("expanded", false);
        this.f40224c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f40223b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f40223b);
        bundle.putInt("expandedComponentIdHint", this.f40224c);
        return bundle;
    }

    public void f(int i10) {
        this.f40224c = i10;
    }
}
