package hi;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public final List<n0> f36056a = new ArrayList();

    public abstract q a(String str, u4 u4Var, List<q> list);

    public final q b(String str) {
        if (this.f36056a.contains(v5.e(str))) {
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
