package ai;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class sx2 implements Iterable<String> {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ CharSequence f10018w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ vx2 f10019x;

    public sx2(vx2 vx2Var, CharSequence charSequence) {
        this.f10019x = vx2Var;
        this.f10018w = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        Iterator<String> g10;
        g10 = this.f10019x.g(this.f10018w);
        return g10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator<String> it = iterator();
        try {
            if (it.hasNext()) {
                sb2.append(cx2.a(it.next(), ", "));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ", ");
                    sb2.append(cx2.a(it.next(), ", "));
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
