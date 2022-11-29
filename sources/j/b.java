package j;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: w  reason: collision with root package name */
    public Object f36988w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f36989x;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(b bVar, Menu menu);

        void b(b bVar);

        boolean c(b bVar, MenuItem menuItem);

        boolean d(b bVar, Menu menu);
    }

    public abstract void a();

    public abstract View b();

    public abstract Menu c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public Object f() {
        return this.f36988w;
    }

    public abstract CharSequence g();

    public boolean h() {
        return this.f36989x;
    }

    public abstract void i();

    public abstract boolean j();

    public abstract void k(View view);

    public abstract void l(int i10);

    public abstract void m(CharSequence charSequence);

    public void n(Object obj) {
        this.f36988w = obj;
    }

    public abstract void o(int i10);

    public abstract void p(CharSequence charSequence);

    public void q(boolean z10) {
        this.f36989x = z10;
    }
}
