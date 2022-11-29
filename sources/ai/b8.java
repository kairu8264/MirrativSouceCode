package ai;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class b8 {

    /* renamed from: a  reason: collision with root package name */
    public final ByteArrayOutputStream f2264a;

    /* renamed from: b  reason: collision with root package name */
    public final DataOutputStream f2265b;

    public b8() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f2264a = byteArrayOutputStream;
        this.f2265b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] a(z7 z7Var) {
        this.f2264a.reset();
        try {
            b(this.f2265b, z7Var.f12900w);
            String str = z7Var.f12901x;
            if (str == null) {
                str = "";
            }
            b(this.f2265b, str);
            this.f2265b.writeLong(z7Var.f12902y);
            this.f2265b.writeLong(z7Var.f12903z);
            this.f2265b.write(z7Var.A);
            this.f2265b.flush();
            return this.f2264a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
