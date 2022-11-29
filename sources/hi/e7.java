package hi;

import hi.d7;
import hi.e7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class e7<MessageType extends e7<MessageType, BuilderType>, BuilderType extends d7<MessageType, BuilderType>> implements w9 {
    public int zzb = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void c(Iterable<T> iterable, List<? super T> list) {
        b9.e(iterable);
        if (iterable instanceof f9) {
            List<?> e10 = ((f9) iterable).e();
            f9 f9Var = (f9) list;
            int size = list.size();
            for (Object obj : e10) {
                if (obj == null) {
                    int size2 = f9Var.size();
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Element at index ");
                    sb2.append(size2 - size);
                    sb2.append(" is null.");
                    String sb3 = sb2.toString();
                    int size3 = f9Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        f9Var.remove(size3);
                    }
                    throw new NullPointerException(sb3);
                } else if (obj instanceof u7) {
                    f9Var.k1((u7) obj);
                } else {
                    f9Var.add((String) obj);
                }
            }
        } else if (!(iterable instanceof da)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
            }
            int size4 = list.size();
            for (T t10 : iterable) {
                if (t10 == 0) {
                    int size5 = list.size();
                    StringBuilder sb4 = new StringBuilder(37);
                    sb4.append("Element at index ");
                    sb4.append(size5 - size4);
                    sb4.append(" is null.");
                    String sb5 = sb4.toString();
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb5);
                }
                list.add(t10);
            }
        } else {
            list.addAll(iterable);
        }
    }

    public int a() {
        throw null;
    }

    public void d(int i10) {
        throw null;
    }

    public final byte[] e() {
        try {
            byte[] bArr = new byte[z0()];
            b8 c10 = b8.c(bArr);
            t0(c10);
            c10.d();
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

    @Override // hi.w9
    public final u7 s0() {
        try {
            int z02 = z0();
            u7 u7Var = u7.f36014x;
            byte[] bArr = new byte[z02];
            b8 c10 = b8.c(bArr);
            t0(c10);
            c10.d();
            return new s7(bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }
}
