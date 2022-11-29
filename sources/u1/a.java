package u1;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import b1.h;
import jo.p;

/* loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {

    /* renamed from: a  reason: collision with root package name */
    public final d f54266a;

    public a(d dVar) {
        p.h(dVar, "callback");
        this.f54266a = dVar;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f54266a.d(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f54266a.e(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f54266a.f();
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        h c10 = this.f54266a.c();
        if (rect != null) {
            rect.set((int) c10.i(), (int) c10.l(), (int) c10.j(), (int) c10.e());
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f54266a.g(actionMode, menu);
    }
}
