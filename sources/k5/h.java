package k5;

import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f38414a = j.f("InputMerger");

    public static h a(String str) {
        try {
            return (h) Class.forName(str).newInstance();
        } catch (Exception e10) {
            j c10 = j.c();
            String str2 = f38414a;
            c10.b(str2, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    public abstract androidx.work.b b(List<androidx.work.b> list);
}
