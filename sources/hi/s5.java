package hi;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class s5 extends o6 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f35985a;

    /* renamed from: b  reason: collision with root package name */
    public final y6<v6<e6>> f35986b;

    public s5(Context context, y6<v6<e6>> y6Var) {
        Objects.requireNonNull(context, "Null context");
        this.f35985a = context;
        this.f35986b = y6Var;
    }

    @Override // hi.o6
    public final Context a() {
        return this.f35985a;
    }

    @Override // hi.o6
    public final y6<v6<e6>> b() {
        return this.f35986b;
    }

    public final boolean equals(Object obj) {
        y6<v6<e6>> y6Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o6) {
            o6 o6Var = (o6) obj;
            if (this.f35985a.equals(o6Var.a()) && ((y6Var = this.f35986b) != null ? y6Var.equals(o6Var.b()) : o6Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f35985a.hashCode() ^ 1000003) * 1000003;
        y6<v6<e6>> y6Var = this.f35986b;
        return hashCode ^ (y6Var == null ? 0 : y6Var.hashCode());
    }

    public final String toString() {
        String obj = this.f35985a.toString();
        String valueOf = String.valueOf(this.f35986b);
        StringBuilder sb2 = new StringBuilder(obj.length() + 46 + valueOf.length());
        sb2.append("FlagsContext{context=");
        sb2.append(obj);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
