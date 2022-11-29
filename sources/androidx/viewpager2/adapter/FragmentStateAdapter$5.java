package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.u;

/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements r {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Handler f16508w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Runnable f16509x;

    @Override // androidx.lifecycle.r
    public void i(u uVar, o.b bVar) {
        if (bVar == o.b.ON_DESTROY) {
            this.f16508w.removeCallbacks(this.f16509x);
            uVar.g().c(this);
        }
    }
}
