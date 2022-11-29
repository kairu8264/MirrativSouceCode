package fn;

import com.google.protobuf.c0;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final com.google.protobuf.b0 f32094a = c();

    /* renamed from: b  reason: collision with root package name */
    public static final com.google.protobuf.b0 f32095b = new c0();

    public static com.google.protobuf.b0 a() {
        return f32094a;
    }

    public static com.google.protobuf.b0 b() {
        return f32095b;
    }

    public static com.google.protobuf.b0 c() {
        try {
            return (com.google.protobuf.b0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
