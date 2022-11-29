package e;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import j.b;
import o3.g;

/* loaded from: classes.dex */
public class f extends Dialog implements c {

    /* renamed from: w  reason: collision with root package name */
    public d f29938w;

    /* renamed from: x  reason: collision with root package name */
    public final g.a f29939x;

    /* loaded from: classes.dex */
    public class a implements g.a {
        public a() {
        }

        @Override // o3.g.a
        public boolean k0(KeyEvent keyEvent) {
            return f.this.c(keyEvent);
        }
    }

    public f(Context context, int i10) {
        super(context, b(context, i10));
        this.f29939x = new a();
        d a10 = a();
        a10.C(b(context, i10));
        a10.o(null);
    }

    public static int b(Context context, int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(d.a.T, typedValue, true);
            return typedValue.resourceId;
        }
        return i10;
    }

    @Override // e.c
    public void H1(j.b bVar) {
    }

    public d a() {
        if (this.f29938w == null) {
            this.f29938w = d.f(this, this);
        }
        return this.f29938w;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i10) {
        return a().x(i10);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().p();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return o3.g.e(this.f29939x, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) a().g(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().m();
    }

    @Override // e.c
    public void n2(j.b bVar) {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().l();
        super.onCreate(bundle);
        a().o(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        a().u();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        a().y(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().D(charSequence);
    }

    @Override // e.c
    public j.b w2(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().z(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().A(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        a().D(getContext().getString(i10));
    }
}
