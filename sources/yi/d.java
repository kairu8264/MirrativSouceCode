package yi;

import android.view.View;
import o3.c0;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final View f62028a;

    /* renamed from: b  reason: collision with root package name */
    public int f62029b;

    /* renamed from: c  reason: collision with root package name */
    public int f62030c;

    /* renamed from: d  reason: collision with root package name */
    public int f62031d;

    /* renamed from: e  reason: collision with root package name */
    public int f62032e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f62033f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f62034g = true;

    public d(View view) {
        this.f62028a = view;
    }

    public void a() {
        View view = this.f62028a;
        c0.c0(view, this.f62031d - (view.getTop() - this.f62029b));
        View view2 = this.f62028a;
        c0.b0(view2, this.f62032e - (view2.getLeft() - this.f62030c));
    }

    public int b() {
        return this.f62029b;
    }

    public int c() {
        return this.f62031d;
    }

    public void d() {
        this.f62029b = this.f62028a.getTop();
        this.f62030c = this.f62028a.getLeft();
    }

    public boolean e(int i10) {
        if (!this.f62034g || this.f62032e == i10) {
            return false;
        }
        this.f62032e = i10;
        a();
        return true;
    }

    public boolean f(int i10) {
        if (!this.f62033f || this.f62031d == i10) {
            return false;
        }
        this.f62031d = i10;
        a();
        return true;
    }
}
