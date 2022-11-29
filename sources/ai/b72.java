package ai;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class b72 implements xc2<c72> {

    /* renamed from: a  reason: collision with root package name */
    public final t43 f2260a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2261b;

    /* renamed from: c  reason: collision with root package name */
    public final yl2 f2262c;

    /* renamed from: d  reason: collision with root package name */
    public final View f2263d;

    public b72(t43 t43Var, Context context, yl2 yl2Var, ViewGroup viewGroup) {
        this.f2260a = t43Var;
        this.f2261b = context;
        this.f2262c = yl2Var;
        this.f2263d = viewGroup;
    }

    public final /* synthetic */ c72 a() throws Exception {
        Context context = this.f2261b;
        fs fsVar = this.f2262c.f12651e;
        ArrayList arrayList = new ArrayList();
        View view = this.f2263d;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new c72(context, fsVar, arrayList);
    }

    @Override // ai.xc2
    public final s43<c72> zza() {
        return this.f2260a.h(new Callable(this) { // from class: ai.a72

            /* renamed from: a  reason: collision with root package name */
            public final b72 f1775a;

            {
                this.f1775a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f1775a.a();
            }
        });
    }
}
