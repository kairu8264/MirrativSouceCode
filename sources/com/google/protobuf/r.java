package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.d0;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.r;
import com.google.protobuf.r.a;
import com.google.protobuf.t;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public abstract class r<MessageType extends r<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, r<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public n0 unknownFields = n0.c();
    public int memoizedSerializedSize = -1;

    /* loaded from: classes4.dex */
    public static abstract class a<MessageType extends r<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0255a<MessageType, BuilderType> {

        /* renamed from: w  reason: collision with root package name */
        public final MessageType f28202w;

        /* renamed from: x  reason: collision with root package name */
        public MessageType f28203x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f28204y = false;

        public a(MessageType messagetype) {
            this.f28202w = messagetype;
            this.f28203x = (MessageType) messagetype.y(f.NEW_MUTABLE_INSTANCE);
        }

        public final void A() {
            if (this.f28204y) {
                B();
                this.f28204y = false;
            }
        }

        public void B() {
            MessageType messagetype = (MessageType) this.f28203x.y(f.NEW_MUTABLE_INSTANCE);
            F(messagetype, this.f28203x);
            this.f28203x = messagetype;
        }

        @Override // fn.n
        /* renamed from: C */
        public MessageType k() {
            return this.f28202w;
        }

        @Override // com.google.protobuf.a.AbstractC0255a
        /* renamed from: D */
        public BuilderType u(MessageType messagetype) {
            return E(messagetype);
        }

        public BuilderType E(MessageType messagetype) {
            A();
            F(this.f28203x, messagetype);
            return this;
        }

        public final void F(MessageType messagetype, MessageType messagetype2) {
            fn.t.a().e(messagetype).a(messagetype, messagetype2);
        }

        @Override // com.google.protobuf.d0.a
        /* renamed from: x */
        public final MessageType a() {
            MessageType r02 = r0();
            if (r02.r()) {
                return r02;
            }
            throw a.AbstractC0255a.w(r02);
        }

        @Override // com.google.protobuf.d0.a
        /* renamed from: y */
        public MessageType r0() {
            if (this.f28204y) {
                return this.f28203x;
            }
            this.f28203x.H();
            this.f28204y = true;
            return this.f28203x;
        }

        /* renamed from: z */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) k().i();
            buildertype.E(r0());
            return buildertype;
        }
    }

    /* loaded from: classes4.dex */
    public static class b<T extends r<T, ?>> extends com.google.protobuf.b<T> {

        /* renamed from: b  reason: collision with root package name */
        public final T f28205b;

        public b(T t10) {
            this.f28205b = t10;
        }

        @Override // fn.q
        /* renamed from: g */
        public T b(g gVar, l lVar) throws InvalidProtocolBufferException {
            return (T) r.M(this.f28205b, gVar, lVar);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends r<MessageType, BuilderType> implements fn.n {
        public p<d> extensions = p.h();

        public p<d> P() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.protobuf.r, com.google.protobuf.d0
        public /* bridge */ /* synthetic */ d0.a c() {
            return super.c();
        }

        @Override // com.google.protobuf.r, com.google.protobuf.d0
        public /* bridge */ /* synthetic */ d0.a i() {
            return super.i();
        }

        @Override // com.google.protobuf.r, fn.n
        public /* bridge */ /* synthetic */ d0 k() {
            return super.k();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements p.b<d> {
        public final boolean A;

        /* renamed from: w  reason: collision with root package name */
        public final t.d<?> f28206w;

        /* renamed from: x  reason: collision with root package name */
        public final int f28207x;

        /* renamed from: y  reason: collision with root package name */
        public final p0.b f28208y;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f28209z;

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.f28207x - dVar.f28207x;
        }

        public t.d<?> c() {
            return this.f28206w;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.p.b
        public d0.a d(d0.a aVar, d0 d0Var) {
            return ((a) aVar).E((r) d0Var);
        }

        @Override // com.google.protobuf.p.b
        public boolean f() {
            return this.f28209z;
        }

        @Override // com.google.protobuf.p.b
        public p0.b g() {
            return this.f28208y;
        }

        @Override // com.google.protobuf.p.b
        public int getNumber() {
            return this.f28207x;
        }

        @Override // com.google.protobuf.p.b
        public p0.c j() {
            return this.f28208y.a();
        }

        @Override // com.google.protobuf.p.b
        public boolean k() {
            return this.A;
        }
    }

    /* loaded from: classes4.dex */
    public static class e<ContainingType extends d0, Type> extends k<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        public final d0 f28210a;

        /* renamed from: b  reason: collision with root package name */
        public final d f28211b;

        public p0.b a() {
            return this.f28211b.g();
        }

        public d0 b() {
            return this.f28210a;
        }

        public int c() {
            return this.f28211b.getNumber();
        }

        public boolean d() {
            return this.f28211b.f28209z;
        }
    }

    /* loaded from: classes4.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static t.g B() {
        return s.k();
    }

    public static <E> t.i<E> C() {
        return i0.g();
    }

    public static <T extends r<?, ?>> T D(Class<T> cls) {
        r<?, ?> rVar = defaultInstanceMap.get(cls);
        if (rVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                rVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (rVar == null) {
            rVar = (T) ((r) fn.b0.i(cls)).k();
            if (rVar != null) {
                defaultInstanceMap.put(cls, rVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) rVar;
    }

    public static Object F(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final <T extends r<T, ?>> boolean G(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.y(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d10 = fn.t.a().e(t10).d(t10);
        if (z10) {
            t10.z(f.SET_MEMOIZED_IS_INITIALIZED, d10 ? t10 : null);
        }
        return d10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.t$g] */
    public static t.g I(t.g gVar) {
        int size = gVar.size();
        return gVar.o(size == 0 ? 10 : size * 2);
    }

    public static <E> t.i<E> J(t.i<E> iVar) {
        int size = iVar.size();
        return iVar.o(size == 0 ? 10 : size * 2);
    }

    public static Object L(d0 d0Var, String str, Object[] objArr) {
        return new fn.u(d0Var, str, objArr);
    }

    public static <T extends r<T, ?>> T M(T t10, g gVar, l lVar) throws InvalidProtocolBufferException {
        T t11 = (T) t10.y(f.NEW_MUTABLE_INSTANCE);
        try {
            fn.v e10 = fn.t.a().e(t11);
            e10.h(t11, h.P(gVar), lVar);
            e10.c(t11);
            return t11;
        } catch (IOException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw new InvalidProtocolBufferException(e11.getMessage()).i(t11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw e12;
        }
    }

    public static <T extends r<?, ?>> void N(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    public abstract Object A(f fVar, Object obj, Object obj2);

    @Override // fn.n
    /* renamed from: E */
    public final MessageType k() {
        return (MessageType) y(f.GET_DEFAULT_INSTANCE);
    }

    public void H() {
        fn.t.a().e(this).c(this);
    }

    @Override // com.google.protobuf.d0
    /* renamed from: K */
    public final BuilderType i() {
        return (BuilderType) y(f.NEW_BUILDER);
    }

    @Override // com.google.protobuf.d0
    /* renamed from: O */
    public final BuilderType c() {
        BuilderType buildertype = (BuilderType) y(f.NEW_BUILDER);
        buildertype.E(this);
        return buildertype;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return fn.t.a().e(this).i(this, (r) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.d0
    public int h() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = fn.t.a().e(this).e(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int g10 = fn.t.a().e(this).g(this);
        this.memoizedHashCode = g10;
        return g10;
    }

    @Override // com.google.protobuf.a
    public int j() {
        return this.memoizedSerializedSize;
    }

    @Override // com.google.protobuf.d0
    public void l(CodedOutputStream codedOutputStream) throws IOException {
        fn.t.a().e(this).b(this, i.P(codedOutputStream));
    }

    @Override // com.google.protobuf.d0
    public final fn.q<MessageType> q() {
        return (fn.q) y(f.GET_PARSER);
    }

    @Override // fn.n
    public final boolean r() {
        return G(this, true);
    }

    public String toString() {
        return e0.e(this, super.toString());
    }

    @Override // com.google.protobuf.a
    public void u(int i10) {
        this.memoizedSerializedSize = i10;
    }

    public Object w() throws Exception {
        return y(f.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends r<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType x() {
        return (BuilderType) y(f.NEW_BUILDER);
    }

    public Object y(f fVar) {
        return A(fVar, null, null);
    }

    public Object z(f fVar, Object obj) {
        return A(fVar, obj, null);
    }
}
