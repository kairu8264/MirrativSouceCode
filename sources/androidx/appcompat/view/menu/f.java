package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.i;
import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* loaded from: classes.dex */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* renamed from: w  reason: collision with root package name */
    public e f14243w;

    /* renamed from: x  reason: collision with root package name */
    public androidx.appcompat.app.a f14244x;

    /* renamed from: y  reason: collision with root package name */
    public c f14245y;

    /* renamed from: z  reason: collision with root package name */
    public i.a f14246z;

    public f(e eVar) {
        this.f14243w = eVar;
    }

    public void a() {
        androidx.appcompat.app.a aVar = this.f14244x;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        e eVar = this.f14243w;
        a.C0045a c0045a = new a.C0045a(eVar.u());
        c cVar = new c(c0045a.getContext(), d.g.f28751l);
        this.f14245y = cVar;
        cVar.setCallback(this);
        this.f14243w.b(this.f14245y);
        c0045a.a(this.f14245y.a(), this);
        View y10 = eVar.y();
        if (y10 != null) {
            c0045a.c(y10);
        } else {
            c0045a.e(eVar.w()).setTitle(eVar.x());
        }
        c0045a.h(this);
        androidx.appcompat.app.a create = c0045a.create();
        this.f14244x = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f14244x.getWindow().getAttributes();
        attributes.type = AnalyticsListener.EVENT_LOAD_ERROR;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f14244x.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f14243w.L((g) this.f14245y.a().getItem(i10), 0);
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void onCloseMenu(e eVar, boolean z10) {
        if (z10 || eVar == this.f14243w) {
            a();
        }
        i.a aVar = this.f14246z;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, z10);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f14245y.onCloseMenu(this.f14243w, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f14244x.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f14244x.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f14243w.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f14243w.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean onOpenSubMenu(e eVar) {
        i.a aVar = this.f14246z;
        if (aVar != null) {
            return aVar.onOpenSubMenu(eVar);
        }
        return false;
    }
}
