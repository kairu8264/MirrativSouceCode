package c4;

import android.os.Build;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final C0137b f18813a;

    /* renamed from: b  reason: collision with root package name */
    public int f18814b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f18815c = 0;

    /* loaded from: classes.dex */
    public static class a extends C0137b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f18816a;

        /* renamed from: b  reason: collision with root package name */
        public final g f18817b;

        public a(EditText editText) {
            this.f18816a = editText;
            g gVar = new g(editText);
            this.f18817b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(c.getInstance());
        }

        @Override // c4.b.C0137b
        public KeyListener a(KeyListener keyListener) {
            return keyListener instanceof f ? keyListener : new f(keyListener);
        }

        @Override // c4.b.C0137b
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof d ? inputConnection : new d(this.f18816a, inputConnection, editorInfo);
        }

        @Override // c4.b.C0137b
        public void c(int i10) {
            this.f18817b.b(i10);
        }

        @Override // c4.b.C0137b
        public void d(int i10) {
            this.f18817b.c(i10);
        }
    }

    /* renamed from: c4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0137b {
        public KeyListener a(KeyListener keyListener) {
            return keyListener;
        }

        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        public void c(int i10) {
        }

        public void d(int i10) {
        }
    }

    public b(EditText editText) {
        n3.h.h(editText, "editText cannot be null");
        this.f18813a = Build.VERSION.SDK_INT >= 19 ? new a(editText) : new C0137b();
    }

    public int a() {
        return this.f18815c;
    }

    public KeyListener b(KeyListener keyListener) {
        n3.h.h(keyListener, "keyListener cannot be null");
        return this.f18813a.a(keyListener);
    }

    public int c() {
        return this.f18814b;
    }

    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f18813a.b(inputConnection, editorInfo);
    }

    public void e(int i10) {
        this.f18815c = i10;
        this.f18813a.c(i10);
    }

    public void f(int i10) {
        n3.h.e(i10, "maxEmojiCount should be greater than 0");
        this.f18814b = i10;
        this.f18813a.d(i10);
    }
}
