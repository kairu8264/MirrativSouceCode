package e4;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.m;

/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f30228a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile Editable.Factory f30229b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f30230c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f30230c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f30229b == null) {
            synchronized (f30228a) {
                if (f30229b == null) {
                    f30229b = new b();
                }
            }
        }
        return f30229b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f30230c;
        if (cls != null) {
            return m.c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
