package ai;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class k71 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final WeakReference<l71> f6114w;

    public /* synthetic */ k71(l71 l71Var, j71 j71Var) {
        this.f6114w = new WeakReference<>(l71Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        l71 l71Var = this.f6114w.get();
        if (l71Var != null) {
            l71Var.C0(i71.f5130a);
        }
    }
}
