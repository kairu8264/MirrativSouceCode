package b3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.k0;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import o3.g;

/* loaded from: classes.dex */
public class f extends Activity implements u, g.a {

    /* renamed from: w  reason: collision with root package name */
    public s.g<Class<Object>, Object> f16794w = new s.g<>();

    /* renamed from: x  reason: collision with root package name */
    public w f16795x = new w(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !o3.g.d(decorView, keyEvent)) {
            return o3.g.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !o3.g.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public androidx.lifecycle.o g() {
        return this.f16795x;
    }

    @Override // o3.g.a
    public boolean k0(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k0.g(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f16795x.j(o.c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
