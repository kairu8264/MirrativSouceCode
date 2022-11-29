package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import j.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f36997a;

    /* renamed from: b  reason: collision with root package name */
    public final b f36998b;

    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f36999a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f37000b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<f> f37001c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final s.g<Menu, Menu> f37002d = new s.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f37000b = context;
            this.f36999a = callback;
        }

        @Override // j.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f36999a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // j.b.a
        public void b(b bVar) {
            this.f36999a.onDestroyActionMode(e(bVar));
        }

        @Override // j.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f36999a.onActionItemClicked(e(bVar), new k.c(this.f37000b, (h3.b) menuItem));
        }

        @Override // j.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f36999a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f37001c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f37001c.get(i10);
                if (fVar != null && fVar.f36998b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f37000b, bVar);
            this.f37001c.add(fVar2);
            return fVar2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = this.f37002d.get(menu);
            if (menu2 == null) {
                k.e eVar = new k.e(this.f37000b, (h3.a) menu);
                this.f37002d.put(menu, eVar);
                return eVar;
            }
            return menu2;
        }
    }

    public f(Context context, b bVar) {
        this.f36997a = context;
        this.f36998b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f36998b.a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f36998b.b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new k.e(this.f36997a, (h3.a) this.f36998b.c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f36998b.d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f36998b.e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f36998b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f36998b.g();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f36998b.h();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f36998b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f36998b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f36998b.k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f36998b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f36998b.n(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f36998b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f36998b.q(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f36998b.l(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f36998b.o(i10);
    }
}
