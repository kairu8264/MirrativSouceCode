package ai;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class f54 extends bn3 {
    public static final in3 E = in3.b(f54.class);

    public f54(cn3 cn3Var, e54 e54Var) throws IOException {
        h(cn3Var, cn3Var.zzb(), e54Var);
    }

    @Override // ai.bn3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // ai.bn3
    public final String toString() {
        String obj = this.f2419x.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 7);
        sb2.append("model(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
