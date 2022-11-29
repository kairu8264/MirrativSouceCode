package ai;

import ai.wg3;
import ai.xg3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class xg3<MessageType extends xg3<MessageType, BuilderType>, BuilderType extends wg3<MessageType, BuilderType>> implements xj3 {
    public int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void h(Iterable<T> iterable, List<? super T> list) {
        bj3.a(iterable);
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (T t10 : iterable) {
            if (t10 == 0) {
                int size2 = list.size();
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size2 - size);
                sb2.append(" is null.");
                String sb3 = sb2.toString();
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        break;
                    }
                    list.remove(size3);
                }
                throw new NullPointerException(sb3);
            }
            list.add(t10);
        }
    }

    @Override // ai.xj3
    public final byte[] L() {
        try {
            byte[] bArr = new byte[b()];
            yh3 y10 = yh3.y(bArr);
            f(y10);
            y10.d();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    @Override // ai.xj3
    public final oh3 T() {
        try {
            int b10 = b();
            oh3 oh3Var = oh3.f7807x;
            byte[] bArr = new byte[b10];
            yh3 y10 = yh3.y(bArr);
            f(y10);
            y10.d();
            return new kh3(bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    public int a() {
        throw null;
    }

    public void d(int i10) {
        throw null;
    }
}
