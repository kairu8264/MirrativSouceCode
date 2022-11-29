package l1;

import android.view.KeyEvent;
import jo.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final KeyEvent f39490a;

    public /* synthetic */ b(KeyEvent keyEvent) {
        this.f39490a = keyEvent;
    }

    public static final /* synthetic */ b a(KeyEvent keyEvent) {
        return new b(keyEvent);
    }

    public static KeyEvent b(KeyEvent keyEvent) {
        p.h(keyEvent, "nativeKeyEvent");
        return keyEvent;
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof b) && p.c(keyEvent, ((b) obj).f());
    }

    public static int d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f39490a, obj);
    }

    public final /* synthetic */ KeyEvent f() {
        return this.f39490a;
    }

    public int hashCode() {
        return d(this.f39490a);
    }

    public String toString() {
        return e(this.f39490a);
    }
}
