package gi;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final x f33602a;

    static {
        w wVar = new w();
        d.f33601a.a(wVar);
        f33602a = wVar.b();
    }

    public static byte[] b(Object obj) {
        x xVar = f33602a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            xVar.a(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public abstract fm.b a();
}
