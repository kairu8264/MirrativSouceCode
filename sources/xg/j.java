package xg;

import ai.rp0;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f60271a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup.LayoutParams f60272b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f60273c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f60274d;

    public j(rp0 rp0Var) throws h {
        this.f60272b = rp0Var.getLayoutParams();
        ViewParent parent = rp0Var.getParent();
        this.f60274d = rp0Var.D0();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.f60273c = viewGroup;
            this.f60271a = viewGroup.indexOfChild(rp0Var.G());
            viewGroup.removeView(rp0Var.G());
            rp0Var.t0(true);
            return;
        }
        throw new h("Could not get the parent of the WebView for an overlay.");
    }
}
