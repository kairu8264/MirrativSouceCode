package ai;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class y23 extends m23 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f12427a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f12428b;

    /* renamed from: c  reason: collision with root package name */
    public static final long f12429c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f12430d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f12431e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f12432f;

    /* loaded from: classes3.dex */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static final Unsafe a() throws Exception {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return a();
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f12429c = unsafe.objectFieldOffset(a33.class.getDeclaredField("y"));
                f12428b = unsafe.objectFieldOffset(a33.class.getDeclaredField("x"));
                f12430d = unsafe.objectFieldOffset(a33.class.getDeclaredField("w"));
                f12431e = unsafe.objectFieldOffset(z23.class.getDeclaredField(TopicConstant.EXTEND_LIPMETA_A));
                f12432f = unsafe.objectFieldOffset(z23.class.getDeclaredField("b"));
                f12427a = unsafe;
            } catch (Exception e10) {
                zx2.a(e10);
                throw new RuntimeException(e10);
            }
        } catch (PrivilegedActionException e11) {
            throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
        }
    }

    public /* synthetic */ y23(q23 q23Var) {
        super(null);
    }

    @Override // ai.m23
    public final void a(z23 z23Var, Thread thread) {
        f12427a.putObject(z23Var, f12431e, thread);
    }

    @Override // ai.m23
    public final void b(z23 z23Var, z23 z23Var2) {
        f12427a.putObject(z23Var, f12432f, z23Var2);
    }

    @Override // ai.m23
    public final boolean c(a33<?> a33Var, z23 z23Var, z23 z23Var2) {
        return x23.a(f12427a, a33Var, f12429c, z23Var, z23Var2);
    }

    @Override // ai.m23
    public final boolean d(a33<?> a33Var, p23 p23Var, p23 p23Var2) {
        return x23.a(f12427a, a33Var, f12428b, p23Var, p23Var2);
    }

    @Override // ai.m23
    public final boolean e(a33<?> a33Var, Object obj, Object obj2) {
        return x23.a(f12427a, a33Var, f12430d, obj, obj2);
    }
}
