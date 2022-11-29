package ai;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class fx2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f4242a;

    /* renamed from: b  reason: collision with root package name */
    public final ex2 f4243b;

    /* renamed from: c  reason: collision with root package name */
    public ex2 f4244c;

    public /* synthetic */ fx2(String str, dx2 dx2Var) {
        ex2 ex2Var = new ex2(null);
        this.f4243b = ex2Var;
        this.f4244c = ex2Var;
        Objects.requireNonNull(str);
        this.f4242a = str;
    }

    public final fx2 a(Object obj) {
        ex2 ex2Var = new ex2(null);
        this.f4244c.f3810b = ex2Var;
        this.f4244c = ex2Var;
        ex2Var.f3809a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f4242a);
        sb2.append('{');
        ex2 ex2Var = this.f4243b.f3810b;
        String str = "";
        while (ex2Var != null) {
            Object obj = ex2Var.f3809a;
            sb2.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb2.append(obj);
            }
            ex2Var = ex2Var.f3810b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
