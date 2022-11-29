package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public final m<?> f15363a;

    public k(m<?> mVar) {
        this.f15363a = mVar;
    }

    public static k b(m<?> mVar) {
        return new k((m) n3.h.h(mVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        m<?> mVar = this.f15363a;
        mVar.A.i(mVar, mVar, fragment);
    }

    public void c() {
        this.f15363a.A.u();
    }

    public void d(Configuration configuration) {
        this.f15363a.A.w(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f15363a.A.x(menuItem);
    }

    public void f() {
        this.f15363a.A.y();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f15363a.A.z(menu, menuInflater);
    }

    public void h() {
        this.f15363a.A.A();
    }

    public void i() {
        this.f15363a.A.C();
    }

    public void j(boolean z10) {
        this.f15363a.A.D(z10);
    }

    public boolean k(MenuItem menuItem) {
        return this.f15363a.A.G(menuItem);
    }

    public void l(Menu menu) {
        this.f15363a.A.H(menu);
    }

    public void m() {
        this.f15363a.A.J();
    }

    public void n(boolean z10) {
        this.f15363a.A.K(z10);
    }

    public boolean o(Menu menu) {
        return this.f15363a.A.L(menu);
    }

    public void p() {
        this.f15363a.A.N();
    }

    public void q() {
        this.f15363a.A.O();
    }

    public void r() {
        this.f15363a.A.Q();
    }

    public boolean s() {
        return this.f15363a.A.X(true);
    }

    public FragmentManager t() {
        return this.f15363a.A;
    }

    public void u() {
        this.f15363a.A.O0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f15363a.A.r0().onCreateView(view, str, context, attributeSet);
    }
}
