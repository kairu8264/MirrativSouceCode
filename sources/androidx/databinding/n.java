package androidx.databinding;

import androidx.lifecycle.u;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class n<T> extends WeakReference<ViewDataBinding> {

    /* renamed from: a  reason: collision with root package name */
    public final k<T> f15029a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15030b;

    /* renamed from: c  reason: collision with root package name */
    public T f15031c;

    public n(ViewDataBinding viewDataBinding, int i10, k<T> kVar, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f15030b = i10;
        this.f15029a = kVar;
    }

    public ViewDataBinding a() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            e();
        }
        return viewDataBinding;
    }

    public T b() {
        return this.f15031c;
    }

    public void c(u uVar) {
        this.f15029a.a(uVar);
    }

    public void d(T t10) {
        e();
        this.f15031c = t10;
        if (t10 != null) {
            this.f15029a.c(t10);
        }
    }

    public boolean e() {
        boolean z10;
        T t10 = this.f15031c;
        if (t10 != null) {
            this.f15029a.b(t10);
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15031c = null;
        return z10;
    }
}
