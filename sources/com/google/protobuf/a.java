package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.a.AbstractC0255a;
import com.google.protobuf.d0;
import com.google.protobuf.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0255a<MessageType, BuilderType>> implements d0 {
    public int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0255a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0255a<MessageType, BuilderType>> implements d0.a {
        public static <T> void s(Iterable<T> iterable, List<? super T> list) {
            t.a(iterable);
            if (iterable instanceof fn.i) {
                List<?> X = ((fn.i) iterable).X();
                fn.i iVar = (fn.i) list;
                int size = list.size();
                for (Object obj : X) {
                    if (obj == null) {
                        String str = "Element at index " + (iVar.size() - size) + " is null.";
                        for (int size2 = iVar.size() - 1; size2 >= size; size2--) {
                            iVar.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (obj instanceof f) {
                        iVar.I((f) obj);
                    } else {
                        iVar.add((String) obj);
                    }
                }
            } else if (iterable instanceof fn.r) {
                list.addAll((Collection) iterable);
            } else {
                t(iterable, list);
            }
        }

        public static <T> void t(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        public static UninitializedMessageException w(d0 d0Var) {
            return new UninitializedMessageException(d0Var);
        }

        public abstract BuilderType u(MessageType messagetype);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.d0.a
        /* renamed from: v */
        public BuilderType k0(d0 d0Var) {
            if (k().getClass().isInstance(d0Var)) {
                return (BuilderType) u((a) d0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public static <T> void d(Iterable<T> iterable, List<? super T> list) {
        AbstractC0255a.s(iterable, list);
    }

    @Override // com.google.protobuf.d0
    public f e() {
        try {
            f.h t10 = f.t(h());
            l(t10.b());
            return t10.a();
        } catch (IOException e10) {
            throw new RuntimeException(s("ByteString"), e10);
        }
    }

    public int j() {
        throw new UnsupportedOperationException();
    }

    public int p(fn.v vVar) {
        int j10 = j();
        if (j10 == -1) {
            int e10 = vVar.e(this);
            u(e10);
            return e10;
        }
        return j10;
    }

    public final String s(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public UninitializedMessageException t() {
        return new UninitializedMessageException(this);
    }

    public void u(int i10) {
        throw new UnsupportedOperationException();
    }

    public byte[] v() {
        try {
            byte[] bArr = new byte[h()];
            CodedOutputStream d02 = CodedOutputStream.d0(bArr);
            l(d02);
            d02.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(s("byte array"), e10);
        }
    }
}
