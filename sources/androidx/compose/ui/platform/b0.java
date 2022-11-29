package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ActionMode;
import android.view.View;

/* loaded from: classes.dex */
public final class b0 implements x1 {

    /* renamed from: a  reason: collision with root package name */
    public final View f14381a;

    /* renamed from: b  reason: collision with root package name */
    public ActionMode f14382b;

    /* renamed from: c  reason: collision with root package name */
    public final u1.d f14383c;

    /* renamed from: d  reason: collision with root package name */
    public z1 f14384d;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<wn.v> {
        public a() {
            super(0);
        }

        public final void a() {
            b0.this.f14382b = null;
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public b0(View view) {
        jo.p.h(view, "view");
        this.f14381a = view;
        this.f14383c = new u1.d(new a(), null, null, null, null, null, 62, null);
        this.f14384d = z1.Hidden;
    }

    @Override // androidx.compose.ui.platform.x1
    public void a() {
        this.f14384d = z1.Hidden;
        ActionMode actionMode = this.f14382b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f14382b = null;
    }

    @Override // androidx.compose.ui.platform.x1
    public z1 d() {
        return this.f14384d;
    }

    @Override // androidx.compose.ui.platform.x1
    public void e(b1.h hVar, io.a<wn.v> aVar, io.a<wn.v> aVar2, io.a<wn.v> aVar3, io.a<wn.v> aVar4) {
        ActionMode startActionMode;
        jo.p.h(hVar, "rect");
        this.f14383c.l(hVar);
        this.f14383c.h(aVar);
        this.f14383c.i(aVar3);
        this.f14383c.j(aVar2);
        this.f14383c.k(aVar4);
        ActionMode actionMode = this.f14382b;
        if (actionMode != null) {
            if (actionMode != null) {
                actionMode.invalidate();
                return;
            }
            return;
        }
        this.f14384d = z1.Shown;
        if (Build.VERSION.SDK_INT >= 23) {
            startActionMode = y1.f14686a.b(this.f14381a, new u1.a(this.f14383c), 1);
        } else {
            startActionMode = this.f14381a.startActionMode(new u1.c(this.f14383c));
        }
        this.f14382b = startActionMode;
    }
}
