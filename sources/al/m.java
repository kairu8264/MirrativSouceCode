package al;

import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f13856a;

    /* renamed from: b  reason: collision with root package name */
    public final fl.f f13857b;

    public m(String str, fl.f fVar) {
        this.f13856a = str;
        this.f13857b = fVar;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            xk.f f10 = xk.f.f();
            f10.e("Error creating marker: " + this.f13856a, e10);
            return false;
        }
    }

    public final File b() {
        return this.f13857b.d(this.f13856a);
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
