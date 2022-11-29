package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a  reason: collision with root package name */
    public static final y1 f14686a = new y1();

    public final void a(ActionMode actionMode) {
        jo.p.h(actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(View view, ActionMode.Callback callback, int i10) {
        jo.p.h(view, "view");
        jo.p.h(callback, "actionModeCallback");
        return view.startActionMode(callback, i10);
    }
}
