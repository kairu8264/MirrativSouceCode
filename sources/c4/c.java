package c4;

import android.annotation.SuppressLint;
import android.text.Editable;

/* loaded from: classes.dex */
public final class c extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f18818a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile Editable.Factory f18819b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f18820c;

    @SuppressLint({"PrivateApi"})
    public c() {
        try {
            f18820c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f18819b == null) {
            synchronized (f18818a) {
                if (f18819b == null) {
                    f18819b = new c();
                }
            }
        }
        return f18819b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f18820c;
        if (cls != null) {
            return h.c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
