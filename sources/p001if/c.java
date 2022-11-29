package p001if;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import jo.h;
import jo.p;

/* renamed from: if.c  reason: invalid package */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.o {

    /* renamed from: g  reason: collision with root package name */
    public static final a f36810g = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final int f36811a;

    /* renamed from: b  reason: collision with root package name */
    public final int f36812b;

    /* renamed from: c  reason: collision with root package name */
    public final int f36813c;

    /* renamed from: d  reason: collision with root package name */
    public final int f36814d;

    /* renamed from: e  reason: collision with root package name */
    public final int f36815e;

    /* renamed from: f  reason: collision with root package name */
    public final int f36816f;

    /* renamed from: if.c$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ c(int r5, int r6, int r7, int r8, int r9, int r10, int r11, jo.h r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L5
            r5 = 0
        L5:
            r12 = r11 & 2
            if (r12 == 0) goto Lb
            r12 = r5
            goto Lc
        Lb:
            r12 = r6
        Lc:
            r6 = r11 & 4
            if (r6 == 0) goto L12
            r0 = r5
            goto L13
        L12:
            r0 = r7
        L13:
            r6 = r11 & 8
            if (r6 == 0) goto L19
            r1 = r5
            goto L1a
        L19:
            r1 = r8
        L1a:
            r6 = r11 & 16
            if (r6 == 0) goto L20
            r2 = r5
            goto L21
        L20:
            r2 = r9
        L21:
            r6 = r11 & 32
            if (r6 == 0) goto L26
            r10 = 1
        L26:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p001if.c.<init>(int, int, int, int, int, int, int, jo.h):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        p.h(rect, "outRect");
        p.h(view, "view");
        p.h(recyclerView, "parent");
        p.h(b0Var, "state");
        super.g(rect, view, recyclerView, b0Var);
        int i10 = this.f36816f;
        if (i10 == 0) {
            rect.top = this.f36813c;
            rect.bottom = this.f36815e;
            if (m(view, recyclerView) && n(view, recyclerView)) {
                rect.left = this.f36812b;
                rect.right = this.f36814d;
            } else if (m(view, recyclerView)) {
                rect.left = this.f36812b;
                rect.right = this.f36811a / 2;
            } else if (n(view, recyclerView)) {
                rect.left = this.f36811a / 2;
                rect.right = this.f36814d;
            } else {
                int i11 = this.f36811a;
                rect.left = i11 / 2;
                rect.right = i11 / 2;
            }
        } else if (i10 != 1) {
        } else {
            rect.left = this.f36812b;
            rect.right = this.f36814d;
            if (m(view, recyclerView) && n(view, recyclerView)) {
                rect.top = this.f36813c;
                rect.bottom = this.f36815e;
            } else if (m(view, recyclerView)) {
                rect.top = this.f36813c;
                rect.bottom = this.f36811a / 2;
            } else if (n(view, recyclerView)) {
                rect.top = this.f36811a / 2;
                rect.bottom = this.f36815e;
            } else {
                int i12 = this.f36811a;
                rect.top = i12 / 2;
                rect.bottom = i12 / 2;
            }
        }
    }

    public final int l(RecyclerView recyclerView) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).f3();
        }
        return 1;
    }

    public final boolean m(View view, RecyclerView recyclerView) {
        return recyclerView.f0(view) < l(recyclerView);
    }

    public final boolean n(View view, RecyclerView recyclerView) {
        int itemCount;
        RecyclerView.h adapter = recyclerView.getAdapter();
        p.e(adapter);
        if (adapter.getItemCount() % l(recyclerView) == 0) {
            itemCount = l(recyclerView);
        } else {
            RecyclerView.h adapter2 = recyclerView.getAdapter();
            p.e(adapter2);
            itemCount = adapter2.getItemCount() % l(recyclerView);
        }
        int f02 = recyclerView.f0(view);
        RecyclerView.h adapter3 = recyclerView.getAdapter();
        p.e(adapter3);
        return f02 >= adapter3.getItemCount() - itemCount;
    }

    public c(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f36811a = i10;
        this.f36812b = i11;
        this.f36813c = i12;
        this.f36814d = i13;
        this.f36815e = i14;
        this.f36816f = i15;
    }
}
