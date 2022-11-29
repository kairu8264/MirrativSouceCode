package fn;

import com.google.protobuf.h0;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final o f32096a = c();

    /* renamed from: b  reason: collision with root package name */
    public static final o f32097b = new h0();

    public static o a() {
        return f32096a;
    }

    public static o b() {
        return f32097b;
    }

    public static o c() {
        try {
            return (o) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
