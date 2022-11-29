package u6;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<s> f54469a = new ArrayList();

    public void a(s sVar) {
        this.f54469a.add(sVar);
    }

    public void b(Path path) {
        for (int size = this.f54469a.size() - 1; size >= 0; size--) {
            f7.h.b(path, this.f54469a.get(size));
        }
    }
}
