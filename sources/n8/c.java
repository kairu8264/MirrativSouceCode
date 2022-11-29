package n8;

import com.cookpad.puree.PureeLogger;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: w  reason: collision with root package name */
    public a f41618w;

    /* renamed from: x  reason: collision with root package name */
    public o8.c f41619x;

    /* renamed from: y  reason: collision with root package name */
    public List<k8.b> f41620y = new ArrayList();

    public String a(String str) {
        for (k8.b bVar : this.f41620y) {
            str = bVar.a(str);
            if (str == null) {
                return null;
            }
        }
        return str;
    }

    public abstract a b(a aVar);

    public abstract void c(String str);

    public void d() {
    }

    public List<k8.b> f() {
        return this.f41620y;
    }

    public void g(PureeLogger pureeLogger) {
        this.f41619x = pureeLogger.f();
        this.f41618w = b(new a());
    }

    public void h(String str) {
        String a10 = a(str);
        if (a10 == null) {
            return;
        }
        c(a10);
    }

    public abstract String i();
}
