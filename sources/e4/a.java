package e4;

import android.os.Build;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f30223a;

    /* renamed from: b  reason: collision with root package name */
    public int f30224b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f30225c = 0;

    /* renamed from: e4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0298a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f30226a;

        /* renamed from: b  reason: collision with root package name */
        public final g f30227b;

        public C0298a(EditText editText, boolean z10) {
            this.f30226a = editText;
            g gVar = new g(editText, z10);
            this.f30227b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(e4.b.getInstance());
        }

        @Override // e4.a.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return new e(keyListener);
        }

        @Override // e4.a.b
        public boolean b() {
            return this.f30227b.b();
        }

        @Override // e4.a.b
        public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f30226a, inputConnection, editorInfo);
        }

        @Override // e4.a.b
        public void d(boolean z10) {
            this.f30227b.d(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public KeyListener a(KeyListener keyListener) {
            return keyListener;
        }

        public boolean b() {
            return false;
        }

        public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        public void d(boolean z10) {
        }
    }

    public a(EditText editText, boolean z10) {
        n3.h.h(editText, "editText cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f30223a = new b();
        } else {
            this.f30223a = new C0298a(editText, z10);
        }
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f30223a.a(keyListener);
    }

    public boolean b() {
        return this.f30223a.b();
    }

    public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f30223a.c(inputConnection, editorInfo);
    }

    public void d(boolean z10) {
        this.f30223a.d(z10);
    }
}
