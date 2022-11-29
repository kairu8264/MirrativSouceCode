package u1;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import jo.p;

/* loaded from: classes.dex */
public final class c implements ActionMode.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final d f54269a;

    public c(d dVar) {
        p.h(dVar, "callback");
        this.f54269a = dVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f54269a.d(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f54269a.e(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f54269a.f();
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f54269a.g(actionMode, menu);
    }
}
