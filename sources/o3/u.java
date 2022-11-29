package o3;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    public int f44047a;

    /* renamed from: b  reason: collision with root package name */
    public int f44048b;

    public u(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f44047a | this.f44048b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f44048b = i10;
        } else {
            this.f44047a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f44048b = 0;
        } else {
            this.f44047a = 0;
        }
    }
}
