package vp;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0935a f57540a = new C0935a();

    /* renamed from: vp.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0935a implements Serializable {
    }

    @Deprecated
    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    @Deprecated
    public static String b(Object obj) {
        return obj == null ? "" : obj.toString();
    }
}
